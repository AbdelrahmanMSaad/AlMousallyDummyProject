package java.utilities;


import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.base.Base;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TestUtils extends Base {
    /*
     * This method is used to scroll from a point to a point
     */
    public static void scrollByPoints(PointOption options1, PointOption options2) {
        TouchAction action = new TouchAction(driver);
        action.longPress(options1).moveTo(options2).release().perform();
    }

    /*
     * This method is to scroll to a specific element by its text
     */
    public static MobileElement scrollToASpecificElementByItsText(String elementText) {
        MobileElement requiredElement = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + elementText + "\").instance(0))"));
        return requiredElement;
    }

    /*
    This method is to scroll from an element to an element
     */
    public static void scrollFromAnElementToAnElement(AndroidElement element1, AndroidElement element2) {
        PointOption option1 = new PointOption().withCoordinates(element1.getLocation());
        PointOption option2 = new PointOption().withCoordinates(element2.getLocation());
        TouchAction action = new TouchAction(driver);
        action.longPress(option1).moveTo(option2).release().perform();
    }

    /*
     * This method is used to click on a specific point
     */
    public static void clickOnASpecificPoint(PointOption options1) {
        new TouchAction(driver).press(options1).release().perform();
    }

    /*
     * This method is used to press the device's back button
     */
    public static void backNavigation() {
        driver.navigate().back();
    }

    /*
     * This method is used to take a screenshot and save it
     */
    public static void takeScreenShot(String screenshotName, String folderName) throws IOException {
        screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir") + File.separator + "ScreenShots\\"
                + folderName + "\\" + screenshotName + ".png"));
    }

    /*
     * This method is for turning off Connectivity
     */
    public static void turnOffConnectivity() {
        if (driver.getConnection().isWiFiEnabled()) {
            driver.toggleWifi();
        }
        if (driver.getConnection().isDataEnabled()) {
            driver.toggleData();
        }
    }

    /*
     * This method is for turning on Connectivity
     */
    public static void turnOnConnectivity() {
        if (!driver.getConnection().isWiFiEnabled()) {
            driver.toggleWifi();
        }
        if (!driver.getConnection().isDataEnabled()) {
            driver.toggleData();
        }
    }

    /*
     * This method is to give a fluent wait to a specific element with a specific
     * duration
     */
    public static void fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(int pollingDuration, int duration,
                                                                                 MobileElement element) {
        Wait<AndroidDriver<AndroidElement>> wait = new FluentWait<AndroidDriver<AndroidElement>>(driver)
                .withTimeout(Duration.ofSeconds(duration)).pollingEvery(Duration.ofSeconds(pollingDuration));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /*
     * This method is to give a fluent wait to a specific element with a specific
     * duration
     */
    public static void fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(int pollingDuration, int duration,
                                                                                   MobileElement element) {
        Wait<AndroidDriver<AndroidElement>> wait = new FluentWait<AndroidDriver<AndroidElement>>(driver)
                .withTimeout(Duration.ofSeconds(duration)).pollingEvery(Duration.ofSeconds(pollingDuration));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
