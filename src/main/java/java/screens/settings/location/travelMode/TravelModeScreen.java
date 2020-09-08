package java.screens.settings.location.travelMode;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class TravelModeScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/on_off_switch")
    private AndroidElement onOffSwitch;
    @AndroidFindBy(id = "com.moslay:id/tv_loc_period")
    private AndroidElement updateLocationIntervalButton;
    @AndroidFindBy(id = "com.moslay:id/tv_settings")
    private AndroidElement goToPhoneSettingsButton;
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return the screen's title as a string
     *
     * @return home page screen
     */
    public String getScreenTitleText() {
        wait.until(ExpectedConditions.visibilityOf(screenTitleText));
        return screenTitleText.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the travel mode switch
     */
    public void clickOnTravelModeSwitch() {
        wait.until(ExpectedConditions.visibilityOf(onOffSwitch));
        onOffSwitch.click();
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
        wait.until(ExpectedConditions.visibilityOf(updateLocationIntervalButton));
        updateLocationIntervalButton.click();
        return new TravelMode_IntervalsScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the settigns button which directs the user to the phone location settings
     */
    public void clickOnGoToPhoneSettingsButton() {
        wait.until(ExpectedConditions.visibilityOf(goToPhoneSettingsButton));
        goToPhoneSettingsButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
