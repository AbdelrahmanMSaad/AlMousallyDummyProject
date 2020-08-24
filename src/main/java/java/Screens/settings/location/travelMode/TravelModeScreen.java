package java.Screens.settings.location.travelMode;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class TravelModeScreen extends Base {
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement screenTitle_Text;

    @AndroidFindBy(id = "com.moslay:id/on_off_switch")
    private AndroidElement onOff_Switch;

    @AndroidFindBy(id = "com.moslay:id/tv_loc_period")
    private AndroidElement updateLocationInterval_Btn;

    @AndroidFindBy(id = "com.moslay:id/tv_settings")
    private AndroidElement goToPhoneSettings_Btn;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return the screen's title as a string
     *
     * @return home page screen
     */
    public String getScreenTitleText() {
        return screenTitle_Text.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the travel mode switch
     */
    public void clickOnTravelModeSwitch() {
        onOff_Switch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on update location according to a time interval
     *
     * @return TravelMode_IntervalsScreen
     */
    public TravelMode_IntervalsScreen clickOnUpdateLocationTimeIntervalButton() {
        updateLocationInterval_Btn.click();
        return new TravelMode_IntervalsScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the settigns button which directs the user to the phone location settings
     */
    public void clickOnGoToPhoneSettingsButton() {
        goToPhoneSettings_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
