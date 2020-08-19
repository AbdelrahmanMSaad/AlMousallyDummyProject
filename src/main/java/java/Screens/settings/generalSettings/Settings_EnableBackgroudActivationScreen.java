package java.Screens.settings.generalSettings;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.Screens.settings.SettingsScreen;
import java.base.Base;
import java.utilities.TestUtils;

public class Settings_EnableBackgroudActivationScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/warning_cancel")
    private AndroidElement closeButton_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement screenTitleTxt_Text;

    @AndroidFindBy(id = "com.moslay:id/warning_ok")
    private AndroidElement goToSettingsBtn_Btn;

    @AndroidFindBy(id = "com.moslay:id/checkbox")
    private AndroidElement doNotShowThisAgainBtn_Btn;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on close button
     *
     * @return SettingsScreen
     */
    public SettingsScreen clickOnCloseButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, closeButton_Btn);
        closeButton_Btn.click();
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
    public String returnScreenTitle() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, screenTitleTxt_Text);
        return screenTitleTxt_Text.getText();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, goToSettingsBtn_Btn);
        goToSettingsBtn_Btn.click();
        return new SettingsScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on do not show this again check box
     */
    public void clickOnDoNotShowThisAgainButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, doNotShowThisAgainBtn_Btn);
        doNotShowThisAgainBtn_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
