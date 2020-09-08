package java.screens.settings.notifications.azkarNotifications;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class AzkarNotificationsSettingsScreen extends Base {
    Wait wait = new WebDriverWait(driver, 10);
    @AndroidFindBy(id = "com.moslay:id/Azkar_menu_Header")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/on_off_alert")
    private AndroidElement allNotificationsOnOffSwitchElement;
    @AndroidFindBy(id = "com.moslay:id/azkar_Settings_day_on_off")
    private AndroidElement morningAzkarOnOffSwitchElement;
    @AndroidFindBy(id = "com.moslay:id/azkar_day_picker")
    private AndroidElement hoursAfterFajrElement;
    @AndroidFindBy(id = "com.moslay:id/azkar_Settings_evening_on_off")
    private AndroidElement eveningAzkarOnOffSwitchElement;
    @AndroidFindBy(id = "com.moslay:id/azkar_Settings_radio_asr")
    private AndroidElement asrRadioButton;
    @AndroidFindBy(id = "com.moslay:id/azkar_Settings_maghrib")
    private AndroidElement maghrebRadioButton;
    @AndroidFindBy(id = "com.moslay:id/azkar_Settings_sleep_on_off")
    private AndroidElement sleepingAzkarOnOffSwitchElement;
    @AndroidFindBy(id = "com.moslay:id/tv_azkar_sleep_time")
    private AndroidElement sleepingAzkarTimeButton;
    @AndroidFindBy(id = "com.moslay:id/open_azkar_sala")
    private AndroidElement openAzkarDuringPrayerOnOffSwitchElement;
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return screen title as string
     *
     * @return screen title string
     */
    public String getScreenTitle() {
        wait.until(ExpectedConditions.visibilityOf(screenTitleText));
        return screenTitleText.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on all notifications switch
     */
    public void clickOnAllNotificationsSwitch() {
        wait.until(ExpectedConditions.visibilityOf(allNotificationsOnOffSwitchElement));
        allNotificationsOnOffSwitchElement.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on morning azkar switch
     */
    public void clickOnMorningAzkarSwitch() {
        wait.until(ExpectedConditions.visibilityOf(morningAzkarOnOffSwitchElement));
        AndroidElement morningAzkarSwitch = (AndroidElement) morningAzkarOnOffSwitchElement.findElementById("com.moslay:id/on_off_switch");
        morningAzkarSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on hours after fajr minus button
     */
    public void clickOnHoursAfterFajrMinusButton() {
        wait.until(ExpectedConditions.visibilityOf(hoursAfterFajrElement));
        AndroidElement hoursAfterFajrMinusButton = (AndroidElement) hoursAfterFajrElement.findElementById("com.moslay:id/im_minus");
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
        wait.until(ExpectedConditions.visibilityOf(hoursAfterFajrElement));
        AndroidElement hoursAfterFajrTextview = (AndroidElement) hoursAfterFajrElement.findElementById("com.moslay:id/et_number");
        hoursAfterFajrTextview.sendKeys(number);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on hours after fajr plus button
     */
    public void clickOnHoursAfterFajrPlusButton() {
        wait.until(ExpectedConditions.visibilityOf(hoursAfterFajrElement));
        AndroidElement hoursAfterFajrPlusButton = (AndroidElement) hoursAfterFajrElement.findElementById("com.moslay:id/im_plus");
        hoursAfterFajrPlusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on evening azkar switch
     */
    public void clickOnEveningAzkarSwitch() {
        wait.until(ExpectedConditions.visibilityOf(eveningAzkarOnOffSwitchElement));
        AndroidElement eveningAzkarSwitch = (AndroidElement) eveningAzkarOnOffSwitchElement.findElementById("com.moslay:id/on_off_switch");
        eveningAzkarSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on asr radio button
     */
    public void clickOnAsrRadioButton() {
        wait.until(ExpectedConditions.visibilityOf(asrRadioButton));
        asrRadioButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on maghrib radio button
     */
    public void clickOnMaghribRadioButton() {
        wait.until(ExpectedConditions.visibilityOf(maghrebRadioButton));
        maghrebRadioButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on sleep azkar switch
     */
    public void clickOnSleepingAzkarSwitch() {
        wait.until(ExpectedConditions.visibilityOf(sleepingAzkarOnOffSwitchElement));
        AndroidElement sleepingAzkarSwitch = (AndroidElement) sleepingAzkarOnOffSwitchElement.findElementById("com.moslay:id/on_off_switch");
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
        wait.until(ExpectedConditions.visibilityOf(sleepingAzkarOnOffSwitchElement));
        sleepingAzkarTimeButton.click();
        //This method will return clock class with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on open azkar during prayer switch
     */
    public void clickOnOpenAzkarDuringPrayerSwitch() {
        wait.until(ExpectedConditions.visibilityOf(openAzkarDuringPrayerOnOffSwitchElement));
        AndroidElement openAzkarDuringPrayerSwitch = (AndroidElement) openAzkarDuringPrayerOnOffSwitchElement.findElementById("com.moslay:id/on_off_switch");
        openAzkarDuringPrayerSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
