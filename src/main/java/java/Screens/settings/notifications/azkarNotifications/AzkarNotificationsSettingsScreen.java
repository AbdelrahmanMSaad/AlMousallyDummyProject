package java.Screens.settings.notifications.azkarNotifications;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class AzkarNotificationsSettingsScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/Azkar_menu_Header")
    private AndroidElement screenTitleTxt_Text;

    @AndroidFindBy(id = "com.moslay:id/on_off_alert")
    private AndroidElement allNotificationsOnOffSwitchElement_Element;

    @AndroidFindBy(id = "com.moslay:id/azkar_Settings_day_on_off")
    private AndroidElement morningAzkarOnOffSwitchElement_Element;

    @AndroidFindBy(id = "com.moslay:id/azkar_day_picker")
    private AndroidElement hoursAfterFajrElement_Element;

    @AndroidFindBy(id = "com.moslay:id/azkar_Settings_evening_on_off")
    private AndroidElement eveningAzkarOnOffSwitchElement_Element;

    @AndroidFindBy(id = "com.moslay:id/azkar_Settings_radio_asr")
    private AndroidElement asrRadioButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/azkar_Settings_maghrib")
    private AndroidElement maghrebRadioButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/azkar_Settings_sleep_on_off")
    private AndroidElement sleepingAzkarOnOffSwitchElement_Element;

    @AndroidFindBy(id = "com.moslay:id/tv_azkar_sleep_time")
    private AndroidElement sleepingAzkarTimeButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/open_azkar_sala")
    private AndroidElement openAzkarDuringPrayerOnOffSwitchElement_Element;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return screen title as string
     *
     * @return screen title string
     */
    public String returnScreenTitle() {
        return screenTitleTxt_Text.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on all notifications switch
     */
    public void clickOnAllNotificationsSwitch() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, allNotificationsOnOffSwitchElement_Element);
        allNotificationsOnOffSwitchElement_Element.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on morning azkar switch
     */
    public void clickOnMorningAzkarSwitch() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, morningAzkarOnOffSwitchElement_Element);
        AndroidElement morningAzkarSwitch = (AndroidElement) morningAzkarOnOffSwitchElement_Element.findElementById("com.moslay:id/on_off_switch");
        morningAzkarSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on hours after fajr minus button
     */
    public void clickOnHoursAfterFajrMinusButton() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, hoursAfterFajrElement_Element);
        AndroidElement hoursAfterFajrMinusButton = (AndroidElement) hoursAfterFajrElement_Element.findElementById("com.moslay:id/im_minus");
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
    public void sendNumberToHoursAfterFajrTextField(String number) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, hoursAfterFajrElement_Element);
        AndroidElement hoursAfterFajrTextField = (AndroidElement) hoursAfterFajrElement_Element.findElementById("com.moslay:id/et_number");
        hoursAfterFajrTextField.sendKeys(number);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on hours after fajr plus button
     */
    public void clickOnHoursAfterFajrPlusButton() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, hoursAfterFajrElement_Element);
        AndroidElement hoursAfterFajrPlusButton = (AndroidElement) hoursAfterFajrElement_Element.findElementById("com.moslay:id/im_plus");
        hoursAfterFajrPlusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on evening azkar switch
     */
    public void clickOnEveningAzkarSwitch() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, eveningAzkarOnOffSwitchElement_Element);
        AndroidElement eveningAzkarSwitch = (AndroidElement) eveningAzkarOnOffSwitchElement_Element.findElementById("com.moslay:id/on_off_switch");
        eveningAzkarSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on asr radio button
     */
    public void clickOnAsrRadioButton() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, asrRadioButton_Btn);
        asrRadioButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on maghrib radio button
     */
    public void clickOnMaghribRadioButton() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, maghrebRadioButton_Btn);
        maghrebRadioButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on sleep azkar switch
     */
    public void clickOnSleepingAzkarSwitch() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, sleepingAzkarOnOffSwitchElement_Element);
        AndroidElement sleepingAzkarSwitch = (AndroidElement) sleepingAzkarOnOffSwitchElement_Element.findElementById("com.moslay:id/on_off_switch");
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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, sleepingAzkarTimeButton_Btn);
        sleepingAzkarTimeButton_Btn.click();
        //This method will return clock class with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on open azkar during prayer switch
     */
    public void clickOnOpenAzkarDuringPrayerSwitch() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, openAzkarDuringPrayerOnOffSwitchElement_Element);
        AndroidElement openAzkarDuringPrayerSwitch = (AndroidElement) openAzkarDuringPrayerOnOffSwitchElement_Element.findElementById("com.moslay:id/on_off_switch");
        openAzkarDuringPrayerSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
