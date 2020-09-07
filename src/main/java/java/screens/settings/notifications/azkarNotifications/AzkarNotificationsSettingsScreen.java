package java.screens.settings.notifications.azkarNotifications;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;

public class AzkarNotificationsSettingsScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/Azkar_menu_Header")
    private AndroidElement screenTitle_Text;

    @AndroidFindBy(id = "com.moslay:id/on_off_alert")
    private AndroidElement allNotificationsOnOffSwitch_Element;

    @AndroidFindBy(id = "com.moslay:id/azkar_Settings_day_on_off")
    private AndroidElement morningAzkarOnOffSwitch_Element;

    @AndroidFindBy(id = "com.moslay:id/azkar_day_picker")
    private AndroidElement hoursAfterFajr_Element;

    @AndroidFindBy(id = "com.moslay:id/azkar_Settings_evening_on_off")
    private AndroidElement eveningAzkarOnOffSwitch_Element;

    @AndroidFindBy(id = "com.moslay:id/azkar_Settings_radio_asr")
    private AndroidElement asrRadioButton;

    @AndroidFindBy(id = "com.moslay:id/azkar_Settings_maghrib")
    private AndroidElement maghrebRadioButton;

    @AndroidFindBy(id = "com.moslay:id/azkar_Settings_sleep_on_off")
    private AndroidElement sleepingAzkarOnOffSwitch_Element;

    @AndroidFindBy(id = "com.moslay:id/tv_azkar_sleep_time")
    private AndroidElement sleepingAzkarTime_Btn;

    @AndroidFindBy(id = "com.moslay:id/open_azkar_sala")
    private AndroidElement openAzkarDuringPrayerOnOffSwitch_Element;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return screen title as string
     *
     * @return screen title string
     */
    public String getScreenTitle() {
        return screenTitle_Text.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on all notifications switch
     */
    public void clickOnAllNotificationsSwitch() {
        allNotificationsOnOffSwitch_Element.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on morning azkar switch
     */
    public void clickOnMorningAzkarSwitch() {
        AndroidElement morningAzkarSwitch = (AndroidElement) morningAzkarOnOffSwitch_Element.findElementById("com.moslay:id/on_off_switch");
        morningAzkarSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on hours after fajr minus button
     */
    public void clickOnHoursAfterFajrMinusButton() {
        AndroidElement hoursAfterFajrMinusButton = (AndroidElement) hoursAfterFajr_Element.findElementById("com.moslay:id/im_minus");
        hoursAfterFajrMinusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send a number to hours after fajr text field
     *
     * @param number --> the hours after fajr to be sent
     */
    public void sendNumberToHoursAfterFajrTextView(String number) {
        AndroidElement hoursAfterFajrTextview = (AndroidElement) hoursAfterFajr_Element.findElementById("com.moslay:id/et_number");
        hoursAfterFajrTextview.sendKeys(number);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on hours after fajr plus button
     */
    public void clickOnHoursAfterFajrPlusButton() {
        AndroidElement hoursAfterFajrPlusButton = (AndroidElement) hoursAfterFajr_Element.findElementById("com.moslay:id/im_plus");
        hoursAfterFajrPlusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on evening azkar switch
     */
    public void clickOnEveningAzkarSwitch() {
        AndroidElement eveningAzkarSwitch = (AndroidElement) eveningAzkarOnOffSwitch_Element.findElementById("com.moslay:id/on_off_switch");
        eveningAzkarSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on asr radio button
     */
    public void clickOnAsrRadioButton() {
        asrRadioButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on maghrib radio button
     */
    public void clickOnMaghribRadioButton() {
        maghrebRadioButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on sleep azkar switch
     */
    public void clickOnSleepingAzkarSwitch() {
        AndroidElement sleepingAzkarSwitch = (AndroidElement) sleepingAzkarOnOffSwitch_Element.findElementById("com.moslay:id/on_off_switch");
        sleepingAzkarSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on sleeping azkar button
     *
     * @returns clock class
     */
    public void clickOnSleepingAzkarTimeButton() {
        sleepingAzkarTime_Btn.click();
        //This method will return clock class with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on open azkar during prayer switch
     */
    public void clickOnOpenAzkarDuringPrayerSwitch() {
        AndroidElement openAzkarDuringPrayerSwitch = (AndroidElement) openAzkarDuringPrayerOnOffSwitch_Element.findElementById("com.moslay:id/on_off_switch");
        openAzkarDuringPrayerSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
