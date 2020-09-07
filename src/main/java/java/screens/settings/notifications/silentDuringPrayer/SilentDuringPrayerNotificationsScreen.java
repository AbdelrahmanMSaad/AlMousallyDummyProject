package java.screens.settings.notifications.silentDuringPrayer;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;

public class SilentDuringPrayerNotificationsScreen extends Base {
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement screenTitle_Text;

    @AndroidFindBy(id = "com.moslay:id/onoff_force_sound")
    private AndroidElement enableNotificationsInSilentModeOnOffSwitch_Element;

    @AndroidFindBy(id = "com.moslay:id/rl_silence_status")
    private AndroidElement silentModes_Btn;

    @AndroidFindBy(id = "com.moslay:id/txt_silence_status")
    private AndroidElement silentModeChoice_TextView;

    @AndroidFindBy(id = "com.moslay:id/radio_silence")
    private AndroidElement silentRadio_Btn;

    @AndroidFindBy(id = "com.moslay:id/radio_vibrate")
    private AndroidElement vibrateRadio_Btn;

    @AndroidFindBy(id = "com.moslay:id/on_off_alert")
    private AndroidElement enableSilentDuringPrayerOnOffSwitch_Element;

    @AndroidFindBy(id = "com.moslay:id/onoff_apply_for_all")
    private AndroidElement applySettingsForAllPrayersOnOffSwitch_Element;

    @AndroidFindBy(id = "com.moslay:id/ll_all_salawat_fragment")
    private AndroidElement allPrayersSection_Element;

    @AndroidFindBy(id = "com.moslay:id/inc_dec_time_after_azan_for_silence")
    private AndroidElement makePhoneSilentAfterAzanForAllPrayersSection_Element;

    @AndroidFindBy(id = "com.moslay:id/inc_dec_silence_duration")
    private AndroidElement periodOfMakingPhoneSilentForAllPrayersSection_Element;

    @AndroidFindBy(id = "com.moslay:id/expand_fajr")
    private AndroidElement expandFajrMenu_Btn;

    @AndroidFindBy(id = "com.moslay:id/expand_fajr_fragment")
    private AndroidElement fajrMenu_Element;

    @AndroidFindBy(id = "com.moslay:id/expand_zohr")
    private AndroidElement expandZohrMenu_Btn;

    @AndroidFindBy(id = "com.moslay:id/expand_zohr_fragment")
    private AndroidElement zohrMenu_Element;

    @AndroidFindBy(id = "com.moslay:id/expand_asr")
    private AndroidElement expandAsrMenu_Btn;

    @AndroidFindBy(id = "com.moslay:id/expand_asr_fragment")
    private AndroidElement asrMenu_Element;

    @AndroidFindBy(id = "com.moslay:id/expand_maghrib")
    private AndroidElement expandMaghribMenu_Btn;

    @AndroidFindBy(id = "com.moslay:id/expand_maghrib_fragment")
    private AndroidElement maghribMenu_Element;

    @AndroidFindBy(id = "com.moslay:id/expand_ishaa")
    private AndroidElement expandIshaaMenu_Btn;

    @AndroidFindBy(id = "com.moslay:id/expand_ishaa_fragment")
    private AndroidElement ishaaMenu_Element;

    @AndroidFindBy(id = "com.moslay:id/ll_silent_gom3aa")
    private AndroidElement silentDurningGomaaPrayer_Element;

    @AndroidFindBy(id = "com.moslay:id/ll_silent_traweeh")
    private AndroidElement silentDurningTaraweehPrayer_Element;
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return the screen title as a string
     *
     * @return screen title as string
     */
    public String getScreenTitleString() {
        return screenTitle_Text.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on enable notifications during prayer switch
     */
    public void clickOnEnableNotificationsDuringSilentSwitch() {
        AndroidElement enableSilentDuringPrayerOnOffSwitch = (AndroidElement) enableNotificationsInSilentModeOnOffSwitch_Element.findElementById("com.moslay:id/on_off_switch");
        enableSilentDuringPrayerOnOffSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on silent modes button to expand the modes options
     */
    public void clickOnSilentModesButton() {
        silentModes_Btn.click();
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
        return silentModeChoice_TextView.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on silent mode choice radio button
     */
    public void clickOnSilentRadioButton() {
        silentRadio_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on silent mode choice radio button
     */
    public void clickOnVibrateRadioButton() {
        vibrateRadio_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on enable notifications during prayer switch
     */
    public void clickOnEnableSilentDuringPrayerSwitch() {
        AndroidElement enableSilentDuringPrayerOnOffSwitch = (AndroidElement) enableSilentDuringPrayerOnOffSwitch_Element.findElementById("com.moslay:id/on_off_switch");
        enableSilentDuringPrayerOnOffSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on apply settings for all prayers switch
     */
    public void clickOnApplySettingsForAllPrayersSwitch() {
        AndroidElement applySettingsForAllPrayersSwitch = (AndroidElement) applySettingsForAllPrayersOnOffSwitch_Element.findElementById("com.moslay:id/on_off_switch");
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
        AndroidElement makePhoneSilentDuringPrayerSwitch = (AndroidElement) allPrayersSection_Element.findElementById("com.moslay:id/on_off_switch");
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
        AndroidElement plusButton = (AndroidElement) makePhoneSilentAfterAzanForAllPrayersSection_Element.findElementById("com.moslay:id/im_plus");
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
        AndroidElement periodAfterAzan = (AndroidElement) makePhoneSilentAfterAzanForAllPrayersSection_Element.findElementById("com.moslay:id/et_number");
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
        AndroidElement minusButton = (AndroidElement) makePhoneSilentAfterAzanForAllPrayersSection_Element.findElementById("com.moslay:id/im_minus");
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
        AndroidElement plusButton = (AndroidElement) periodOfMakingPhoneSilentForAllPrayersSection_Element.findElementById("com.moslay:id/im_plus");
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
        AndroidElement periodAfterAzan = (AndroidElement) periodOfMakingPhoneSilentForAllPrayersSection_Element.findElementById("com.moslay:id/et_number");
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
        AndroidElement minusButton = (AndroidElement) periodOfMakingPhoneSilentForAllPrayersSection_Element.findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the unexpanded fajr section to expand it
     */
    public void clickOnExpandFajrSection() {
        expandFajrMenu_Btn.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for fajr prayer
     * apply settings for all prayers switch must be disabled
     */
    public void clickOnMakePhoneSilentDuringFajrPrayerSwitch() {
        AndroidElement makePhoneSilentDuringPrayerSwitch = (AndroidElement) fajrMenu_Element.findElementById("com.moslay:id/on_off_switch");
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
        AndroidElement plusButton = (AndroidElement) fajrMenu_Element.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_plus");
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
        AndroidElement periodAfterAzan = (AndroidElement) fajrMenu_Element.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/et_number");
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
        AndroidElement minusButton = (AndroidElement) fajrMenu_Element.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_minus");
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
        AndroidElement plusButton = (AndroidElement) fajrMenu_Element.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_plus");
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
        AndroidElement periodAfterAzan = (AndroidElement) fajrMenu_Element.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/et_number");
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
        AndroidElement minusButton = (AndroidElement) fajrMenu_Element.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the unexpanded zohr section to expand it
     */
    public void clickOnExpandZohrSection() {
        expandZohrMenu_Btn.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for zohr prayer
     * apply settings for all prayers switch must be disabled
     */
    public void clickOnMakePhoneSilentDuringZohrPrayerSwitch() {
        AndroidElement makePhoneSilentDuringPrayerSwitch = (AndroidElement) zohrMenu_Element.findElementById("com.moslay:id/on_off_switch");
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
        AndroidElement plusButton = (AndroidElement) zohrMenu_Element.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_plus");
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
        AndroidElement periodAfterAzan = (AndroidElement) zohrMenu_Element.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/et_number");
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
        AndroidElement minusButton = (AndroidElement) zohrMenu_Element.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_minus");
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
        AndroidElement plusButton = (AndroidElement) zohrMenu_Element.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_plus");
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
        AndroidElement periodAfterAzan = (AndroidElement) zohrMenu_Element.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/et_number");
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
        AndroidElement minusButton = (AndroidElement) zohrMenu_Element.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the unexpanded asr section to expand it
     */
    public void clickOnExpandAsrSection() {
        expandAsrMenu_Btn.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for asr prayer
     * apply settings for all prayers switch must be disabled
     */
    public void clickOnMakePhoneSilentDuringAsrPrayerSwitch() {
        AndroidElement makePhoneSilentDuringPrayerSwitch = (AndroidElement) asrMenu_Element.findElementById("com.moslay:id/on_off_switch");
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
        AndroidElement plusButton = (AndroidElement) asrMenu_Element.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_plus");
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
        AndroidElement periodAfterAzan = (AndroidElement) asrMenu_Element.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/et_number");
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
        AndroidElement minusButton = (AndroidElement) asrMenu_Element.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_minus");
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
        AndroidElement plusButton = (AndroidElement) asrMenu_Element.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_plus");
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
        AndroidElement periodAfterAzan = (AndroidElement) asrMenu_Element.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/et_number");
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
        AndroidElement minusButton = (AndroidElement) asrMenu_Element.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the unexpanded maghrib section to expand it
     */
    public void clickOnExpandMaghribSection() {
        expandMaghribMenu_Btn.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for maghrib prayer
     * apply settings for all prayers switch must be disabled
     */
    public void clickOnMakePhoneSilentDuringMaghribPrayerSwitch() {
        AndroidElement makePhoneSilentDuringPrayerSwitch = (AndroidElement) maghribMenu_Element.findElementById("com.moslay:id/on_off_switch");
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
        AndroidElement plusButton = (AndroidElement) maghribMenu_Element.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_plus");
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
        AndroidElement periodAfterAzan = (AndroidElement) maghribMenu_Element.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/et_number");
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
        AndroidElement minusButton = (AndroidElement) maghribMenu_Element.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_minus");
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
        AndroidElement plusButton = (AndroidElement) maghribMenu_Element.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_plus");
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
        AndroidElement periodAfterAzan = (AndroidElement) maghribMenu_Element.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/et_number");
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
        AndroidElement minusButton = (AndroidElement) maghribMenu_Element.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the unexpanded ishaa section to expand it
     */
    public void clickOnExpandIshaaSection() {
        expandIshaaMenu_Btn.click();
    }
    /**
     * ******************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for ishaa prayer
     * apply settings for all prayers switch must be disabled
     */
    public void clickOnMakePhoneSilentDuringIshaaPrayerSwitch() {
        AndroidElement makePhoneSilentDuringPrayerSwitch = (AndroidElement) ishaaMenu_Element.findElementById("com.moslay:id/on_off_switch");
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
        AndroidElement plusButton = (AndroidElement) ishaaMenu_Element.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_plus");
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
        AndroidElement periodAfterAzan = (AndroidElement) ishaaMenu_Element.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/et_number");
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
        AndroidElement minusButton = (AndroidElement) ishaaMenu_Element.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_minus");
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
        AndroidElement plusButton = (AndroidElement) ishaaMenu_Element.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_plus");
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
        AndroidElement periodAfterAzan = (AndroidElement) ishaaMenu_Element.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/et_number");
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
        AndroidElement minusButton = (AndroidElement) ishaaMenu_Element.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_minus");
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
        AndroidElement makePhoneSilentDuringPrayerSwitch = (AndroidElement) silentDurningGomaaPrayer_Element.findElementById("com.moslay:id/on_off_switch");
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
        AndroidElement plusButton = (AndroidElement) silentDurningGomaaPrayer_Element.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_plus");
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
        AndroidElement periodAfterAzan = (AndroidElement) silentDurningGomaaPrayer_Element.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/et_number");
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
        AndroidElement minusButton = (AndroidElement) silentDurningGomaaPrayer_Element.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_minus");
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
        AndroidElement plusButton = (AndroidElement) silentDurningGomaaPrayer_Element.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_plus");
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
        AndroidElement periodAfterAzan = (AndroidElement) silentDurningGomaaPrayer_Element.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/et_number");
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
        AndroidElement minusButton = (AndroidElement) silentDurningGomaaPrayer_Element.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on make phone silent during prayer for taraweeh prayer
     */
    public void clickOnMakePhoneSilentDuringTaraweehPrayerSwitch() {
        AndroidElement makePhoneSilentDuringPrayerSwitch = (AndroidElement) silentDurningTaraweehPrayer_Element.findElementById("com.moslay:id/on_off_switch");
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
        AndroidElement plusButton = (AndroidElement) silentDurningTaraweehPrayer_Element.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_plus");
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
        AndroidElement periodAfterAzan = (AndroidElement) silentDurningTaraweehPrayer_Element.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/et_number");
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
        AndroidElement minusButton = (AndroidElement) silentDurningTaraweehPrayer_Element.findElementById("com.moslay:id/inc_dec_time_after_azan_for_silence").findElementById("com.moslay:id/im_minus");
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
        AndroidElement plusButton = (AndroidElement) silentDurningTaraweehPrayer_Element.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_plus");
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
        AndroidElement periodAfterAzan = (AndroidElement) silentDurningTaraweehPrayer_Element.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/et_number");
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
        AndroidElement minusButton = (AndroidElement) silentDurningTaraweehPrayer_Element.findElementById("com.moslay:id/inc_dec_silence_duration").findElementById("com.moslay:id/im_minus");
        minusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
