package java.screens.settings.generalSettings;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.screens.settings.SettingsScreen;
import java.base.Base;

public class EnableBackgroudActivationScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/warning_cancel")
    private AndroidElement close_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement screenTitle_Text;

    @AndroidFindBy(id = "com.moslay:id/warning_ok")
    private AndroidElement goToSettings_Btn;

    @AndroidFindBy(id = "com.moslay:id/checkbox")
    private AndroidElement doNotShowThisAgain_Btn;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on close button
     *
     * @return SettingsScreen
     */
    public SettingsScreen clickOnCloseButton() {
        close_Btn.click();
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
        return screenTitle_Text.getText();
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
        goToSettings_Btn.click();
        return new SettingsScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on do not show this again check box
     */
    public void clickOnDoNotShowThisAgainButton() {
        doNotShowThisAgain_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
