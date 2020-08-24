package java.Screens.settings.generalSettings;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.Screens.settings.SettingsScreen;
import java.base.Base;
import java.utilities.TestUtils;

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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, close_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, screenTitle_Text);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, goToSettings_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, doNotShowThisAgain_Btn);
        doNotShowThisAgain_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
