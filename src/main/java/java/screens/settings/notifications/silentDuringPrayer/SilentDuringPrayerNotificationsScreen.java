package java.screens.settings.notifications.silentDuringPrayer;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class SilentDuringPrayerNotificationsScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/onoff_force_sound")
    private AndroidElement enableNotificationsInSilentModeOnOffSwitchElement;
    @AndroidFindBy(id = "com.moslay:id/rl_silence_status")
    private AndroidElement silentModesButton;
    @AndroidFindBy(id = "com.moslay:id/txt_silence_status")
    private AndroidElement silentModeChoiceText;
    @AndroidFindBy(id = "com.moslay:id/radio_silence")
    private AndroidElement silentRadioButton;
    @AndroidFindBy(id = "com.moslay:id/radio_vibrate")
    private AndroidElement vibrateRadioButton;
    @AndroidFindBy(id = "com.moslay:id/on_off_alert")
    private AndroidElement enableSilentDuringPrayerOnOffSwitchElement;
    @AndroidFindBy(id = "com.moslay:id/onoff_apply_for_all")
    private AndroidElement applySettingsForAllPrayersOnOffSwitchElement;
    @AndroidFindBy(id = "com.moslay:id/ll_all_salawat_fragment")
    private AndroidElement allPrayersSectionElement;
    @AndroidFindBy(id = "com.moslay:id/inc_dec_time_after_azan_for_silence")
    private AndroidElement makePhoneSilentAfterAzanForAllPrayersSectionElement;
    @AndroidFindBy(id = "com.moslay:id/inc_dec_silence_duration")
    private AndroidElement periodOfMakingPhoneSilentForAllPrayersSectionElement;
    @AndroidFindBy(id = "com.moslay:id/expand_fajr")
    private AndroidElement expandFajrMenuButton;
    @AndroidFindBy(id = "com.moslay:id/expand_fajr_fragment")
    private AndroidElement fajrMenuElement;
    @AndroidFindBy(id = "com.moslay:id/expand_zohr")
    private AndroidElement expandZohrMenuButton;
    @AndroidFindBy(id = "com.moslay:id/expand_zohr_fragment")
    private AndroidElement zohrMenuElement;
    @AndroidFindBy(id = "com.moslay:id/expand_asr")
    private AndroidElement expandAsrMenuButton;
    @AndroidFindBy(id = "com.moslay:id/expand_asr_fragment")
    private AndroidElement asrMenuElement;
    @AndroidFindBy(id = "com.moslay:id/expand_maghrib")
    private AndroidElement expandMaghribMenuButton;
    @AndroidFindBy(id = "com.moslay:id/expand_maghrib_fragment")
    private AndroidElement maghribMenuElement;
    @AndroidFindBy(id = "com.moslay:id/expand_ishaa")
    private AndroidElement expandIshaaMenuButton;
    @AndroidFindBy(id = "com.moslay:id/expand_ishaa_fragment")
    private AndroidElement ishaaMenuElement;
    @AndroidFindBy(id = "com.moslay:id/ll_silent_gom3aa")
    private AndroidElement silentDurningGomaaPrayerElement;
    @AndroidFindBy(id = "com.moslay:id/ll_silent_traweeh")
    private AndroidElement silentDurningTaraweehPrayerElement;
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return the screen title as a string
     *
     * @return screen title as string
     */
    public String getScreenTitleString() {
        wait.until(ExpectedConditions.visibilityOf(screenTitleText));
        return screenTitleText.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on enable notifications during prayer switch
     */
    public void clickOnEnableNotificationsDuringSilentSwitch() {
        wait.until(ExpectedConditions.visibilityOf(enableNotificationsInSilentModeOnOffSwitchElement));
        AndroidElement enableSilentDuringPrayerOnOffSwitch = (AndroidElement) enableNotificationsInSilentModeOnOffSwitchElement.findElementById("com.moslay:id/on_off_switch");
        enableSilentDuringPrayerOnOffSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on silent modes button to expand the modes options
     */
    public void clickOnSilentModesButton() {
        wait.until(ExpectedConditions.visibilityOf(silentModesButton));
        silentModesButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return the mode choice selected as a string
     *
     * @return the mode choice selected as a string
     */
    public String getSilentModeChoiceString() {
        wait.until(ExpectedConditions.visibilityOf(silentModeChoiceText));
        return silentModeChoiceText.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on silent mode choice radio button
     */
    public void clickOnSilentRadioButton() {
        wait.until(ExpectedConditions.visibilityOf(silentRadioButton));
        silentRadioButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on silent mode choice radio button
     */
    public void clickOnVibrateRadioButton() {
        wait.until(ExpectedConditions.visibilityOf(vibrateRadioButton));
        vibrateRadioButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on enable notifications during prayer switch
     */
    public void clickOnEnableSilentDuringPrayerSwitch() {
        wait.until(ExpectedConditions.visibilityOf(enableSilentDuringPrayerOnOffSwitchElement));
        AndroidElement enableSilentDuringPrayerOnOffSwitch = (AndroidElement) enableSilentDuringPrayerOnOffSwitchElement.findElementById("com.moslay:id/on_off_switch");
        enableSilentDuringPrayerOnOffSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on apply settings for all prayers switch
     */
    public void clickOnApplySettingsForAllPrayersSwitch() {
        wait.until(ExpectedConditions.visibilityOf(applySettingsForAllPrayersOnOffSwitchElement));
        AndroidElement applySettingsForAllPrayersSwitch = (AndroidElement) applySettingsForAllPrayersOnOffSwitchElement.findElementById("com.moslay:id/on_off_switch");
        applySettingsForAllPrayersSwitch.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for all prayers
     * apply settings for all prayers switch must be enabled
     */
    public void clickOnMakePhoneSilentDuringAllPrayersSwitch() {
        wait.until(ExpectedConditions.visibilityOf(allPrayersSectionElement));
        AndroidElement makePhoneSilentDuringPrayerSwitch = (AndroidElement) allPrayersSectionElement.findElementById("com.moslay:id/on_off_switch");
        makePhoneSilentDuringPrayerSwitch.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for all prayers plus button
     * apply settings for all prayers switch must be enabled
     * make phone silent during prayer for all prayers switch is enabled
     */
    public void clickOnPlusButtonForTimeAfterAzanToMakeThePhoneSilentForAllPrayers() {
        wait.until(ExpectedConditions.visibilityOf(makePhoneSilentAfterAzanForAllPrayersSectionElement));
        AndroidElement plusButton = (AndroidElement) makePhoneSilentAfterAzanForAllPrayersSectionElement.findElementById("com.moslay:id/im_plus");
        plusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to send number to make phone silent during prayer for all prayers text field
     * apply settings for all prayers switch must be enabled
     * make phone silent during prayer for all prayers switch is enabled
     */
    public void sendNumberToPeriodAfterAzanToMakeThePhoneSilentForAllPrayers(String number) {
        wait.until(ExpectedConditions.visibilityOf(makePhoneSilentAfterAzanForAllPrayersSectionElement));
        AndroidElement periodAfterAzan = (AndroidElement) makePhoneSilentAfterAzanForAllPrayersSectionElement.findElementById("com.moslay:id/et_number");
        periodAfterAzan.sendKeys(number);
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for all prayers minus button
     * apply settings for all prayers switch must be enabled
     * make phone silent during prayer for all prayers switch is enabled
     */
    public void clickOnMinusButtonForTimeAfterAzanToMakeThePhoneSilentForAllPrayers() {
        wait.until(ExpectedConditions.visibilityOf(makePhoneSilentAfterAzanForAllPrayersSectionElement));
        AndroidElement minusButton = (AndroidElement) makePhoneSilentAfterAzanForAllPrayersSectionElement.findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on period of making phone silent during prayer for all prayers plus button
     * apply settings for all prayers switch must be enabled
     * make phone silent during prayer for all prayers switch is enabled
     */
    public void clickOnPlusButtonForPeriodOfMakingPhoneSilentDuringPrayerForAllPrayers() {
        wait.until(ExpectedConditions.visibilityOf(periodOfMakingPhoneSilentForAllPrayersSectionElement));
        AndroidElement plusButton = (AndroidElement) periodOfMakingPhoneSilentForAllPrayersSectionElement.findElementById("com.moslay:id/im_plus");
        plusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to send number to period of making phone silent during prayer for all prayers text field
     * apply settings for all prayers switch must be enabled
     * make phone silent during prayer for all prayers switch is enabled
     */
    public void sendNumberToPeriodOfMakingPhoneSilentDuringPrayerForAllPrayers(String number) {
        wait.until(ExpectedConditions.visibilityOf(periodOfMakingPhoneSilentForAllPrayersSectionElement));
        AndroidElement periodAfterAzan = (AndroidElement) periodOfMakingPhoneSilentForAllPrayersSectionElement.findElementById("com.moslay:id/et_number");
        periodAfterAzan.sendKeys(number);
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on period of making phone silent during prayer for all prayers minus button
     * apply settings for all prayers switch must be enabled
     * make phone silent during prayer for all prayers switch is enabled
     */
    public void clickOnMinusButtonForPeriodOfMakingPhoneSilentDuringPrayerForAllPrayers() {
        wait.until(ExpectedConditions.visibilityOf(periodOfMakingPhoneSilentForAllPrayersSectionElement));
        AndroidElement minusButton = (AndroidElement) periodOfMakingPhoneSilentForAllPrayersSectionElement.findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the unexpanded fajr section to expand it
     */
    public void clickOnExpandFajrSection() {
        wait.until(ExpectedConditions.visibilityOf(expandFajrMenuButton));
        expandFajrMenuButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for fajr prayer
     * apply settings for all prayers switch must be disabled
     */
    public void clickOnMakePhoneSilentDuringFajrPrayerSwitch() {
        wait.until(ExpectedConditions.visibilityOf(fajrMenuElement));
        AndroidElement makePhoneSilentDuringPrayerSwitch = (AndroidElement) fajrMenuElement.findElementById("com.moslay:id/on_off_switch");
        makePhoneSilentDuringPrayerSwitch.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during fajr prayer plus button
     * apply settings for all prayers switch must be disabled
     * make phone silent during fajr prayer switch is enabled
     */
    public void clickOnPlusButtonForTimeAfterAzanToMakeThePhoneSilentFoFajrPrayer() {
        wait.until(ExpectedConditions.visibilityOf(fajrMenuElement));
        AndroidElement plusButton = (AndroidElement) fajrMenuElement.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_plus");
        plusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to send number to make phone silent during prayer for fajr prayer text field
     * apply settings for all prayers switch must be disabled
     * make phone silent during fajr prayer switch is enabled
     */
    public void sendNumberToPeriodAfterAzanToMakeThePhoneSilentForFajrPrayer(String number) {
        wait.until(ExpectedConditions.visibilityOf(fajrMenuElement));
        AndroidElement periodAfterAzan = (AndroidElement) fajrMenuElement.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/et_number");
        periodAfterAzan.sendKeys(number);
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for fajr prayer minus button
     * apply settings for all prayers switch must be disabled
     * make phone silent during fajr prayer switch is enabled
     */
    public void clickOnMinusButtonForTimeAfterAzanToMakeThePhoneSilentForFajrPrayer() {
        wait.until(ExpectedConditions.visibilityOf(fajrMenuElement));
        AndroidElement minusButton = (AndroidElement) fajrMenuElement.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on period of making phone silent during prayer for fajr prayer plus button
     * apply settings for all prayers switch must be disabled
     * make phone silent during fajr prayer switch is enabled
     */
    public void clickOnPlusButtonForPeriodOfMakingPhoneSilentDuringPrayerForFajrPrayer() {
        wait.until(ExpectedConditions.visibilityOf(fajrMenuElement));
        AndroidElement plusButton = (AndroidElement) fajrMenuElement.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_plus");
        plusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to send number to period of making phone silent during prayer for fajr prayer text field
     * apply settings for all prayers switch must be disabled
     * make phone silent during fajr prayer switch is enabled
     */
    public void sendNumberToPeriodOfMakingPhoneSilentDuringPrayerForFajrPrayer(String number) {
        wait.until(ExpectedConditions.visibilityOf(fajrMenuElement));
        AndroidElement periodAfterAzan = (AndroidElement) fajrMenuElement.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/et_number");
        periodAfterAzan.sendKeys(number);
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on period of making phone silent during prayer for fajr prayer minus button
     * apply settings for all prayers switch must be enabled
     * make phone silent during fajr prayer switch is enabled
     */
    public void clickOnMinusButtonForPeriodOfMakingPhoneSilentDuringPrayerForFajrPrayer() {
        wait.until(ExpectedConditions.visibilityOf(fajrMenuElement));
        AndroidElement minusButton = (AndroidElement) fajrMenuElement.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the unexpanded zohr section to expand it
     */
    public void clickOnExpandZohrSection() {
        wait.until(ExpectedConditions.visibilityOf(expandZohrMenuButton));
        expandZohrMenuButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for zohr prayer
     * apply settings for all prayers switch must be disabled
     */
    public void clickOnMakePhoneSilentDuringZohrPrayerSwitch() {
        wait.until(ExpectedConditions.visibilityOf(zohrMenuElement));
        AndroidElement makePhoneSilentDuringPrayerSwitch = (AndroidElement) zohrMenuElement.findElementById("com.moslay:id/on_off_switch");
        makePhoneSilentDuringPrayerSwitch.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during zohr prayer plus button
     * apply settings for all prayers switch must be disabled
     * make phone silent during zohr prayer switch is enabled
     */
    public void clickOnPlusButtonForTimeAfterAzanToMakeThePhoneSilentFoZohrPrayer() {
        wait.until(ExpectedConditions.visibilityOf(zohrMenuElement));
        AndroidElement plusButton = (AndroidElement) zohrMenuElement.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_plus");
        plusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to send number to make phone silent during prayer for zohr prayer text field
     * apply settings for all prayers switch must be disabled
     * make phone silent during zohr prayer switch is enabled
     */
    public void sendNumberToPeriodAfterAzanToMakeThePhoneSilentForZohrPrayer(String number) {
        wait.until(ExpectedConditions.visibilityOf(zohrMenuElement));
        AndroidElement periodAfterAzan = (AndroidElement) zohrMenuElement.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/et_number");
        periodAfterAzan.sendKeys(number);
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for zohr prayer minus button
     * apply settings for all prayers switch must be disabled
     * make phone silent during zohr prayer switch is enabled
     */
    public void clickOnMinusButtonForTimeAfterAzanToMakeThePhoneSilentForZohrPrayer() {
        wait.until(ExpectedConditions.visibilityOf(zohrMenuElement));
        AndroidElement minusButton = (AndroidElement) zohrMenuElement.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on period of making phone silent during prayer for zohr prayer plus button
     * apply settings for all prayers switch must be disabled
     * make phone silent during zohr prayer switch is enabled
     */
    public void clickOnPlusButtonForPeriodOfMakingPhoneSilentDuringPrayerForZohrPrayer() {
        wait.until(ExpectedConditions.visibilityOf(zohrMenuElement));
        AndroidElement plusButton = (AndroidElement) zohrMenuElement.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_plus");
        plusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to send number to period of making phone silent during prayer for zohr prayer text field
     * apply settings for all prayers switch must be disabled
     * make phone silent during zohr prayer switch is enabled
     */
    public void sendNumberToPeriodOfMakingPhoneSilentDuringPrayerForZohrPrayer(String number) {
        wait.until(ExpectedConditions.visibilityOf(zohrMenuElement));
        AndroidElement periodAfterAzan = (AndroidElement) zohrMenuElement.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/et_number");
        periodAfterAzan.sendKeys(number);
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on period of making phone silent during prayer for zohr prayer minus button
     * apply settings for all prayers switch must be enabled
     * make phone silent during zohr prayer switch is enabled
     */
    public void clickOnMinusButtonForPeriodOfMakingPhoneSilentDuringPrayerForZohrPrayer() {
        wait.until(ExpectedConditions.visibilityOf(zohrMenuElement));
        AndroidElement minusButton = (AndroidElement) zohrMenuElement.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the unexpanded asr section to expand it
     */
    public void clickOnExpandAsrSection() {
        wait.until(ExpectedConditions.visibilityOf(expandAsrMenuButton));
        expandAsrMenuButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for asr prayer
     * apply settings for all prayers switch must be disabled
     */
    public void clickOnMakePhoneSilentDuringAsrPrayerSwitch() {
        wait.until(ExpectedConditions.visibilityOf(asrMenuElement));
        AndroidElement makePhoneSilentDuringPrayerSwitch = (AndroidElement) asrMenuElement.findElementById("com.moslay:id/on_off_switch");
        makePhoneSilentDuringPrayerSwitch.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during asr prayer plus button
     * apply settings for all prayers switch must be disabled
     * make phone silent during asr prayer switch is enabled
     */
    public void clickOnPlusButtonForTimeAfterAzanToMakeThePhoneSilentFoAsrPrayer() {
        wait.until(ExpectedConditions.visibilityOf(asrMenuElement));
        AndroidElement plusButton = (AndroidElement) asrMenuElement.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_plus");
        plusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to send number to make phone silent during prayer for asr prayer text field
     * apply settings for all prayers switch must be disabled
     * make phone silent during asr prayer switch is enabled
     */
    public void sendNumberToPeriodAfterAzanToMakeThePhoneSilentForAsrPrayer(String number) {
        wait.until(ExpectedConditions.visibilityOf(asrMenuElement));
        AndroidElement periodAfterAzan = (AndroidElement) asrMenuElement.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/et_number");
        periodAfterAzan.sendKeys(number);
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for asr prayer minus button
     * apply settings for all prayers switch must be disabled
     * make phone silent during asr prayer switch is enabled
     */
    public void clickOnMinusButtonForTimeAfterAzanToMakeThePhoneSilentForAsrPrayer() {
        wait.until(ExpectedConditions.visibilityOf(asrMenuElement));
        AndroidElement minusButton = (AndroidElement) asrMenuElement.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on period of making phone silent during prayer for asr prayer plus button
     * apply settings for all prayers switch must be disabled
     * make phone silent during asr prayer switch is enabled
     */
    public void clickOnPlusButtonForPeriodOfMakingPhoneSilentDuringPrayerForAsrPrayer() {
        wait.until(ExpectedConditions.visibilityOf(asrMenuElement));
        AndroidElement plusButton = (AndroidElement) asrMenuElement.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_plus");
        plusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to send number to period of making phone silent during prayer for asr prayer text field
     * apply settings for all prayers switch must be disabled
     * make phone silent during asr prayer switch is enabled
     */
    public void sendNumberToPeriodOfMakingPhoneSilentDuringPrayerForAsrPrayer(String number) {
        wait.until(ExpectedConditions.visibilityOf(asrMenuElement));
        AndroidElement periodAfterAzan = (AndroidElement) asrMenuElement.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/et_number");
        periodAfterAzan.sendKeys(number);
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on period of making phone silent during prayer for asr prayer minus button
     * apply settings for all prayers switch must be enabled
     * make phone silent during asr prayer switch is enabled
     */
    public void clickOnMinusButtonForPeriodOfMakingPhoneSilentDuringPrayerForAsrPrayer() {
        wait.until(ExpectedConditions.visibilityOf(asrMenuElement));
        AndroidElement minusButton = (AndroidElement) asrMenuElement.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the unexpanded maghrib section to expand it
     */
    public void clickOnExpandMaghribSection() {
        wait.until(ExpectedConditions.visibilityOf(maghribMenuElement));
        expandMaghribMenuButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for maghrib prayer
     * apply settings for all prayers switch must be disabled
     */
    public void clickOnMakePhoneSilentDuringMaghribPrayerSwitch() {
        wait.until(ExpectedConditions.visibilityOf(maghribMenuElement));
        AndroidElement makePhoneSilentDuringPrayerSwitch = (AndroidElement) maghribMenuElement.findElementById("com.moslay:id/on_off_switch");
        makePhoneSilentDuringPrayerSwitch.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during maghrib prayer plus button
     * apply settings for all prayers switch must be disabled
     * make phone silent during maghrib prayer switch is enabled
     */
    public void clickOnPlusButtonForTimeAfterAzanToMakeThePhoneSilentFoMaghribPrayer() {
        wait.until(ExpectedConditions.visibilityOf(maghribMenuElement));
        AndroidElement plusButton = (AndroidElement) maghribMenuElement.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_plus");
        plusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to send number to make phone silent during prayer for maghrib prayer text field
     * apply settings for all prayers switch must be disabled
     * make phone silent during maghrib prayer switch is enabled
     */
    public void sendNumberToPeriodAfterAzanToMakeThePhoneSilentForMaghribPrayer(String number) {
        wait.until(ExpectedConditions.visibilityOf(maghribMenuElement));
        AndroidElement periodAfterAzan = (AndroidElement) maghribMenuElement.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/et_number");
        periodAfterAzan.sendKeys(number);
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for zohr prayer minus button
     * apply settings for all prayers switch must be disabled
     * make phone silent during zohr prayer switch is enabled
     */
    public void clickOnMinusButtonForTimeAfterAzanToMakeThePhoneSilentForMaghribPrayer() {
        wait.until(ExpectedConditions.visibilityOf(maghribMenuElement));
        AndroidElement minusButton = (AndroidElement) maghribMenuElement.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on period of making phone silent during prayer for zohr prayer plus button
     * apply settings for all prayers switch must be disabled
     * make phone silent during zohr prayer switch is enabled
     */
    public void clickOnPlusButtonForPeriodOfMakingPhoneSilentDuringPrayerForMaghribPrayer() {
        wait.until(ExpectedConditions.visibilityOf(maghribMenuElement));
        AndroidElement plusButton = (AndroidElement) maghribMenuElement.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_plus");
        plusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to send number to period of making phone silent during prayer for zohr prayer text field
     * apply settings for all prayers switch must be disabled
     * make phone silent during zohr prayer switch is enabled
     */
    public void sendNumberToPeriodOfMakingPhoneSilentDuringPrayerForMaghribPrayer(String number) {
        wait.until(ExpectedConditions.visibilityOf(maghribMenuElement));
        AndroidElement periodAfterAzan = (AndroidElement) maghribMenuElement.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/et_number");
        periodAfterAzan.sendKeys(number);
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on period of making phone silent during prayer for maghrib prayer minus button
     * apply settings for all prayers switch must be enabled
     * make phone silent during maghrib prayer switch is enabled
     */
    public void clickOnMinusButtonForPeriodOfMakingPhoneSilentDuringPrayerForMaghribPrayer() {
        wait.until(ExpectedConditions.visibilityOf(maghribMenuElement));
        AndroidElement minusButton = (AndroidElement) maghribMenuElement.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the unexpanded ishaa section to expand it
     */
    public void clickOnExpandIshaaSection() {
        wait.until(ExpectedConditions.visibilityOf(expandIshaaMenuButton));
        expandIshaaMenuButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for ishaa prayer
     * apply settings for all prayers switch must be disabled
     */
    public void clickOnMakePhoneSilentDuringIshaaPrayerSwitch() {
        wait.until(ExpectedConditions.visibilityOf(ishaaMenuElement));
        AndroidElement makePhoneSilentDuringPrayerSwitch = (AndroidElement) ishaaMenuElement.findElementById("com.moslay:id/on_off_switch");
        makePhoneSilentDuringPrayerSwitch.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during ishaa prayer plus button
     * apply settings for all prayers switch must be disabled
     * make phone silent during ishaa prayer switch is enabled
     */
    public void clickOnPlusButtonForTimeAfterAzanToMakeThePhoneSilentFoIshaaPrayer() {
        wait.until(ExpectedConditions.visibilityOf(ishaaMenuElement));
        AndroidElement plusButton = (AndroidElement) ishaaMenuElement.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_plus");
        plusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to send number to make phone silent during prayer for ishaa prayer text field
     * apply settings for all prayers switch must be disabled
     * make phone silent during ishaa prayer switch is enabled
     */
    public void sendNumberToPeriodAfterAzanToMakeThePhoneSilentForIshaaPrayer(String number) {
        wait.until(ExpectedConditions.visibilityOf(ishaaMenuElement));
        AndroidElement periodAfterAzan = (AndroidElement) ishaaMenuElement.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/et_number");
        periodAfterAzan.sendKeys(number);
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for ishaa prayer minus button
     * apply settings for all prayers switch must be disabled
     * make phone silent during ishaa prayer switch is enabled
     */
    public void clickOnMinusButtonForTimeAfterAzanToMakeThePhoneSilentForIshaaPrayer() {
        wait.until(ExpectedConditions.visibilityOf(ishaaMenuElement));
        AndroidElement minusButton = (AndroidElement) ishaaMenuElement.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on period of making phone silent during prayer for ishaa prayer plus button
     * apply settings for all prayers switch must be disabled
     * make phone silent during ishaa prayer switch is enabled
     */
    public void clickOnPlusButtonForPeriodOfMakingPhoneSilentDuringPrayerForIshaaPrayer() {
        wait.until(ExpectedConditions.visibilityOf(ishaaMenuElement));
        AndroidElement plusButton = (AndroidElement) ishaaMenuElement.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_plus");
        plusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to send number to period of making phone silent during prayer for ishaa prayer text field
     * apply settings for all prayers switch must be disabled
     * make phone silent during ishaa prayer switch is enabled
     */
    public void sendNumberToPeriodOfMakingPhoneSilentDuringPrayerForIshaaPrayer(String number) {
        wait.until(ExpectedConditions.visibilityOf(ishaaMenuElement));
        AndroidElement periodAfterAzan = (AndroidElement) ishaaMenuElement.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/et_number");
        periodAfterAzan.sendKeys(number);
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on period of making phone silent during prayer for ishaa prayer minus button
     * apply settings for all prayers switch must be enabled
     * make phone silent during ishaa prayer switch is enabled
     */
    public void clickOnMinusButtonForPeriodOfMakingPhoneSilentDuringPrayerForIshaaPrayer() {
        wait.until(ExpectedConditions.visibilityOf(ishaaMenuElement));
        AndroidElement minusButton = (AndroidElement) ishaaMenuElement.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for gomaa prayer
     */
    public void clickOnMakePhoneSilentDuringGomaaPrayerSwitch() {
        wait.until(ExpectedConditions.visibilityOf(silentDurningGomaaPrayerElement));
        AndroidElement makePhoneSilentDuringPrayerSwitch = (AndroidElement) silentDurningGomaaPrayerElement.findElementById("com.moslay:id/on_off_switch");
        makePhoneSilentDuringPrayerSwitch.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during gomaa prayer plus button
     * make phone silent during gomaa prayer switch is enabled
     */
    public void clickOnPlusButtonForTimeAfterAzanToMakeThePhoneSilentFoGomaaPrayer() {
        wait.until(ExpectedConditions.visibilityOf(silentDurningGomaaPrayerElement));
        AndroidElement plusButton = (AndroidElement) silentDurningGomaaPrayerElement.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_plus");
        plusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to send number to make phone silent during prayer for gomaa prayer text field
     * make phone silent during gomaa prayer switch is enabled
     */
    public void sendNumberToPeriodAfterAzanToMakeThePhoneSilentForGomaaPrayer(String number) {
        wait.until(ExpectedConditions.visibilityOf(silentDurningGomaaPrayerElement));
        AndroidElement periodAfterAzan = (AndroidElement) silentDurningGomaaPrayerElement.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/et_number");
        periodAfterAzan.sendKeys(number);
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for gomaa prayer minus button
     * make phone silent during gomaa prayer switch is enabled
     */
    public void clickOnMinusButtonForTimeAfterAzanToMakeThePhoneSilentForGomaaPrayer() {
        wait.until(ExpectedConditions.visibilityOf(silentDurningGomaaPrayerElement));
        AndroidElement minusButton = (AndroidElement) silentDurningGomaaPrayerElement.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on period of making phone silent during prayer for gomaa prayer plus button
     * make phone silent during gomaa prayer switch is enabled
     */
    public void clickOnPlusButtonForPeriodOfMakingPhoneSilentDuringPrayerForGomaaPrayer() {
        wait.until(ExpectedConditions.visibilityOf(silentDurningGomaaPrayerElement));
        AndroidElement plusButton = (AndroidElement) silentDurningGomaaPrayerElement.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_plus");
        plusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to send number to period of making phone silent during prayer for gomaa prayer text field
     * make phone silent during gomaa prayer switch is enabled
     */
    public void sendNumberToPeriodOfMakingPhoneSilentDuringPrayerForGomaaPrayer(String number) {
        wait.until(ExpectedConditions.visibilityOf(silentDurningGomaaPrayerElement));
        AndroidElement periodAfterAzan = (AndroidElement) silentDurningGomaaPrayerElement.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/et_number");
        periodAfterAzan.sendKeys(number);
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on period of making phone silent during prayer for gomaa prayer minus button
     * make phone silent during gomaa prayer switch is enabled
     */
    public void clickOnMinusButtonForPeriodOfMakingPhoneSilentDuringPrayerForGomaaPrayer() {
        wait.until(ExpectedConditions.visibilityOf(silentDurningGomaaPrayerElement));
        AndroidElement minusButton = (AndroidElement) silentDurningGomaaPrayerElement.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for taraweeh prayer
     */
    public void clickOnMakePhoneSilentDuringTaraweehPrayerSwitch() {
        wait.until(ExpectedConditions.visibilityOf(silentDurningTaraweehPrayerElement));
        AndroidElement makePhoneSilentDuringPrayerSwitch = (AndroidElement) silentDurningTaraweehPrayerElement.findElementById("com.moslay:id/on_off_switch");
        makePhoneSilentDuringPrayerSwitch.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during taraweeh prayer plus button
     * make phone silent during taraweeh prayer switch is enabled
     */
    public void clickOnPlusButtonForTimeAfterAzanToMakeThePhoneSilentFoTaraweehPrayer() {
        wait.until(ExpectedConditions.visibilityOf(silentDurningTaraweehPrayerElement));
        AndroidElement plusButton = (AndroidElement) silentDurningTaraweehPrayerElement.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_plus");
        plusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to send number to make phone silent during prayer for taraweeh prayer text field
     * make phone silent during taraweeh prayer switch is enabled
     */
    public void sendNumberToPeriodAfterAzanToMakeThePhoneSilentForTaraweehPrayer(String number) {
        wait.until(ExpectedConditions.visibilityOf(silentDurningTaraweehPrayerElement));
        AndroidElement periodAfterAzan = (AndroidElement) silentDurningTaraweehPrayerElement.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/et_number");
        periodAfterAzan.sendKeys(number);
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for taraweeh prayer minus button
     * make phone silent during taraweeh prayer switch is enabled
     */
    public void clickOnMinusButtonForTimeAfterAzanToMakeThePhoneSilentForTaraweehPrayer() {
        wait.until(ExpectedConditions.visibilityOf(silentDurningTaraweehPrayerElement));
        AndroidElement minusButton = (AndroidElement) silentDurningTaraweehPrayerElement.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on period of making phone silent during prayer for taraweeh prayer plus button
     * make phone silent during taraweeh prayer switch is enabled
     */
    public void clickOnPlusButtonForPeriodOfMakingPhoneSilentDuringPrayerForTaraweehPrayer() {
        wait.until(ExpectedConditions.visibilityOf(silentDurningTaraweehPrayerElement));
        AndroidElement plusButton = (AndroidElement) silentDurningTaraweehPrayerElement.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_plus");
        plusButton.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to send number to period of making phone silent during prayer for taraweeh prayer text field
     * make phone silent during taraweeh prayer switch is enabled
     */
    public void sendNumberToPeriodOfMakingPhoneSilentDuringPrayerForTaraweehPrayer(String number) {
        wait.until(ExpectedConditions.visibilityOf(silentDurningTaraweehPrayerElement));
        AndroidElement periodAfterAzan = (AndroidElement) silentDurningTaraweehPrayerElement.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/et_number");
        periodAfterAzan.sendKeys(number);
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on period of making phone silent during prayer for taraweeh prayer minus button
     * make phone silent during taraweeh prayer switch is enabled
     */
    public void clickOnMinusButtonForPeriodOfMakingPhoneSilentDuringPrayerForTaraweehPrayer() {
        wait.until(ExpectedConditions.visibilityOf(silentDurningTaraweehPrayerElement));
        AndroidElement minusButton = (AndroidElement) silentDurningTaraweehPrayerElement.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
