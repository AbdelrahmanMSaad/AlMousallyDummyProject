package java.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    protected FileInputStream fileInputStream;
    protected Properties properties;
    public static AndroidDriver driver;
    public static Dimension windowSize;
    public static File screenshot;
    public static ExtentSparkReporter extentSparkReporter;
    public static ExtentReports extentReports;
    public static ExtentTest extentTest;


    public Base() {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void init(String deviceName, String platformName, String platformVersion) throws IOException, InterruptedException {

        File propFile = new File("src\\main\\resources\\Config\\config.properties");
        fileInputStream = new FileInputStream(propFile);
        properties = new Properties();
        properties.load(fileInputStream);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, properties.getProperty("appActivity"));
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, properties.getProperty("appPackage"));
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, properties.getProperty("androidAutomationName"));
        driver = new AndroidDriver<AndroidElement>(new URL(properties.getProperty("appiumServerLink")), capabilities);

        Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        windowSize = driver.manage().window().getSize();

    }

    @Parameters({"deviceName", "platformName", "platformVersion"})
    @BeforeMethod
    public void openApp(String deviceName, String platformName, String platformVersion, Method method) throws IOException, InterruptedException {
        init(deviceName, platformName, platformVersion);
        extentTest = extentReports.createTest(method.getName());
    }


    @BeforeSuite
    public void beforeSuite() {

        extentSparkReporter = new ExtentSparkReporter("Reports/index.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);
        extentSparkReporter.config().setTheme(Theme.DARK);
        extentSparkReporter.config().setDocumentTitle("Nabaa_Report");
        extentSparkReporter.config().setEncoding("UTF-8");
        extentSparkReporter.config().setReportName("Shams");
        extentReports.setSystemInfo("Company","MadarSoft ");

    }

    @AfterMethod
    public void afterMethod(Method method, ITestResult result) throws IOException {
        File image = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(image, new File(System.getProperty("user.dir") + "\\" + "snapshot\\" + result.getMethod().getMethodName() + ".png"));
        String fullPath = System.getProperty("user.dir") + File.separator + "snapshot\\" + result.getMethod().getMethodName() + ".png";
        if (result.getStatus() == ITestResult.SUCCESS) {
            extentTest.log(Status.PASS, "Test is passed because there is no error");
            extentTest.addScreenCaptureFromPath(fullPath);
            extentTest.log(Status.INFO, result.getMethod().getMethodName());
        } else if (result.getStatus() == ITestResult.FAILURE) {
            extentTest.log(Status.FAIL, "Test is Failed");
            extentTest.log(Status.FAIL, result.getThrowable());
            extentTest.addScreenCaptureFromPath(fullPath);
        } else {
            extentTest.log(Status.SKIP, "Test is Skipped");
        }
        extentReports.flush();
        driver.quit();
    }
}