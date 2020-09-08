package java.screens.settings.location.automatic;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.screens.home.HomePageScreen;
import java.screens.settings.location.otherMethods.OtherMethodsScreen;
import java.base.Base;

public class AutomaticScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(id = "com.moslay:id/background_onbaording")
    private AndroidElement backgroundImgLayoutElement;
    @AndroidFindBy(id = "com.moslay:id/loading_image")
    private AndroidElement loadingImg;
    @AndroidFindBy(id = "com.moslay:id/tvCityName")
    private AndroidElement cityNameText;
    @AndroidFindBy(id = "com.moslay:id/txt_next")
    private AndroidElement nextButton;
    @AndroidFindBy(id = "com.moslay:id/detect_other_ways")
    private AndroidElement detectViaOtherWaysButton;
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to check if the background image is displayed
     *
     * @return boolean
     */
    public boolean isBackgroundImageDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(backgroundImgLayoutElement));
        return backgroundImgLayoutElement.isDisplayed();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return city name as a string
     *
     * @return city name as a string
     */
    public String getCityNameAsString() {
        wait.until(ExpectedConditions.visibilityOf(cityNameText));
        return cityNameText.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on next button
     *
     * @return HomePageScreen
     */
    public HomePageScreen clickOnNextButton() {
        wait.until(ExpectedConditions.visibilityOf(nextButton));
        nextButton.click();
        return new HomePageScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on detect via detect via other methods button
     *
     * @return OtherMethodsScreen
     */
    public OtherMethodsScreen clickOnDetectViaOtherMethodsScreen() {
        wait.until(ExpectedConditions.visibilityOf(detectViaOtherWaysButton));
        detectViaOtherWaysButton.click();
        return new OtherMethodsScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
