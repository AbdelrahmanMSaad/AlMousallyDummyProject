package java.Screens.settings.location.travelMode;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class Settings_Location_TravelModeScreen extends Base {
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement screenTitleTxt_Text;

    @AndroidFindBy(id = "com.moslay:id/on_off_switch")
    private AndroidElement onOffSwitch_Btn;

    @AndroidFindBy(id = "com.moslay:id/tv_loc_period")
    private AndroidElement updateLocationIntervalButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/tv_settings")
    private AndroidElement goToPhoneSettingsButton_Btn;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return the screen's title as a string
     *
     * @return home page screen
     */
    public String returnScreenTitleText() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, screenTitleTxt_Text);
        return screenTitleTxt_Text.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the travel mode switch
     */
    public void clickOnTravelModeSwitch(){
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1,60,onOffSwitch_Btn);
        onOffSwitch_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on update location according to a time interval
     * @return  Settings_Location_TravelMode_IntervalsScreen
     */
    public Settings_Location_TravelMode_IntervalsScreen clickOnUpdateLocationTimeIntervalButton(){
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1,60,updateLocationIntervalButton_Btn);
        updateLocationIntervalButton_Btn.click();
        return new Settings_Location_TravelMode_IntervalsScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the settigns button which directs the user to the phone location settings
     */
    public void clickOnGoToPhoneSettingsButton(){
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1,60,goToPhoneSettingsButton_Btn);
        goToPhoneSettingsButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
