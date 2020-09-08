package java.screens.settings.generalSettings;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.screens.settings.SettingsScreen;
import java.base.Base;

public class EnableBackgroudActivationScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(id = "com.moslay:id/warning_cancel")
    private AndroidElement closeButton;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/warning_ok")
    private AndroidElement goToSettingsButton;
    @AndroidFindBy(id = "com.moslay:id/checkbox")
    private AndroidElement doNotShowThisAgainButton;
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on close button
     *
     * @return SettingsScreen
     */
    public SettingsScreen clickOnCloseButton() {
        wait.until(ExpectedConditions.visibilityOf(closeButton));
        closeButton.click();
        return new SettingsScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return the screen title as a text for assertion
     *
     * @return string representing the screen title
     */
    public String getScreenTitle() {
        wait.until(ExpectedConditions.visibilityOf(screenTitleText));
        return screenTitleText.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on settings button
     *
     * @return SettingsScreen
     */
    public SettingsScreen clickOnSettingsButton() {
        wait.until(ExpectedConditions.visibilityOf(goToSettingsButton));
        goToSettingsButton.click();
        return new SettingsScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on do not show this again check box
     */
    public void clickOnDoNotShowThisAgainButton() {
        wait.until(ExpectedConditions.visibilityOf(doNotShowThisAgainButton));
        doNotShowThisAgainButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
