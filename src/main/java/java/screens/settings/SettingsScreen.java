package java.screens.settings;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.screens.settings.generalSettings.EnableBackgroudActivationScreen;
import java.screens.settings.generalSettings.LanguageScreen;
import java.screens.settings.location.automatic.AutomaticScreen;
import java.screens.settings.location.travelMode.TravelModeScreen;
import java.screens.settings.notifications.silentDuringPrayer.SilentDuringPrayerNotificationsScreen;
import java.screens.settings.prayerTimesCorrection.*;
import java.base.Base;
import java.utilities.TestUtils;

public class SettingsScreen extends Base {
    String expectedTile = "الاعدادات";
    @AndroidFindBy(id = "com.moslay:id/settings")
    private AndroidElement screenTitle_Text;
    @AndroidFindBy(id = "com.moslay:id/settings_language_layout")
    private AndroidElement language_Btn;
    @AndroidFindBy(id = "com.moslay:id/settings_general_language")
    private AndroidElement languageChoice_TxtView;
    @AndroidFindBy(id = "com.moslay:id/mosaly_bg_activate")
    private AndroidElement backgroundActivation_Btn;
    @AndroidFindBy(id = "com.moslay:id/solve_azan_problems")
    private AndroidElement solveAzanProblems_Btn;
    @AndroidFindBy(id = "com.moslay:id/ll_azan_mode")
    private AndroidElement azanMode_Btn;
    @AndroidFindBy(id = "com.moslay:id/tv_azan_mode")
    private AndroidElement azanModeChoice_TxtView;
    @AndroidFindBy(id = "com.moslay:id/ex_azanMode")
    private AndroidElement azanModeSelectionsList_Element;
    @AndroidFindBy(id = "com.moslay:id/settings_calcultionMethod")
    private AndroidElement calcultionMethod_Btn;
    @AndroidFindBy(id = "com.moslay:id/settings_calculation")
    private AndroidElement calcultionMethodChoice_TxtView;
    @AndroidFindBy(id = "com.moslay:id/settings_asr")
    private AndroidElement mazhabCorrection_Btn;
    @AndroidFindBy(id = "com.moslay:id/settings_prayer_mazhab")
    private AndroidElement mazhabCorrectionChoice_TxtView;
    @AndroidFindBy(id = "com.moslay:id/settings_DayLightSaving")
    private AndroidElement summerTiming_Btn;
    @AndroidFindBy(id = "com.moslay:id/settings_day_light_saving")
    private AndroidElement summerTimingChoice_TxtView;
    @AndroidFindBy(id = "com.moslay:id/settings_prayerTimeCorrection")
    private AndroidElement prayerTimeCorrection_Btn;
    @AndroidFindBy(id = "com.moslay:id/settings_timeZone")
    private AndroidElement timeZone_Btn;
    @AndroidFindBy(id = "com.moslay:id/time_zone")
    private AndroidElement timeZoneChoice_TxtView;
    @AndroidFindBy(id = "com.moslay:id/settings_highLatitudeWay")
    private AndroidElement polarZonesCalculation_Btn;
    @AndroidFindBy(id = "com.moslay:id/high_latitude")
    private AndroidElement polarZonesCalculationChoice_TxtView;
    @AndroidFindBy(id = "com.moslay:id/settings_restoreSettings")
    private AndroidElement resetPrayerTimesCorrections_Btn;
    @AndroidFindBy(id = "com.moslay:id/settings_location_layout")
    private AndroidElement autoDetectLocation_Btn;
    @AndroidFindBy(id = "com.moslay:id/settings_country_city")
    private AndroidElement locationChoice_TxtView;
    @AndroidFindBy(id = "com.moslay:id/setting_travel_on")
    private AndroidElement travelModeSection_Element;
    @AndroidFindBy(id = "com.moslay:id/settings_azkar_layout")
    private AndroidElement azkarSettings_Btn;
    @AndroidFindBy(id = "com.moslay:id/settingsAzanLayout")
    private AndroidElement azanSettings_Btn;
    @AndroidFindBy(id = "com.moslay:id/ll_alert_sound")
    private AndroidElement alertSound_Btn;
    @AndroidFindBy(id = "com.moslay:id/tv_choosen_alert_sound")
    private AndroidElement alertSoundChoice_TxtView;
    @AndroidFindBy(id = "com.moslay:id/lv_alert_sounds")
    private AndroidElement alertSoundList_Element;
    @AndroidFindBy(id = "com.moslay:id/setting_azanAndIqama_ll")
    private AndroidElement azanAndIqamaSettingsSection_Btn;
    @AndroidFindBy(id = "com.moslay:id/settings_nawafel")
    private AndroidElement nawafelSettingsSection_Btn;
    @AndroidFindBy(id = "com.moslay:id/settings_notification_Friday")
    private AndroidElement gomaaSettingsSection_Btn;
    @AndroidFindBy(id = "com.moslay:id/settings_fasting")
    private AndroidElement fastingSettingsFasting_Btn;
    @AndroidFindBy(id = "com.moslay:id/settings_silent")
    private AndroidElement silentDuringPrayerSettingsSection_Btn;
    @AndroidFindBy(id = "com.moslay:id/settings_azkar_notification_on_off")
    private AndroidElement azkarNotificationsSettingsSection_Btn;
    @AndroidFindBy(id = "com.moslay:id/settings_benefits_notifications")
    private AndroidElement benefitsNotificationsSettingsSections_Btn;
    /**
     * *********************************************************************************************************************************************
     */

    /**
     * This method is to return the screen's actual title as a string
     *
     * @return Screen title as a string
     */
    public String getActualScreenTitle() {
        return screenTitle_Text.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on language button
     *
     * @return LanguageScreen
     */
    public LanguageScreen clickOnLanguageButton() {
        language_Btn.click();
        return new LanguageScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return the language choice as a string
     *
     * @return the chosen language as text
     */
    public String getLanguageChoiceString() {
        return languageChoice_TxtView.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on background activation button
     *
     * @return EnableBackgroudActivationScreen
     */
    public EnableBackgroudActivationScreen clickOnBackgroundActivationButton() {
        backgroundActivation_Btn.click();
        return new EnableBackgroudActivationScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on solve azan problems solutions
     *
     * @return common questions screen
     */
    public void clickOnSolveAzaanProblemsSolutionsButton() {
        solveAzanProblems_Btn.click();
        //This methods returns CommonQuestionsScreen class with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on azan mode button
     */
    public void clickOnAzanModeButton() {
        azanMode_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return azan mode selection as a string
     *
     * @return the chosen azan mode as a string
     */
    public String getAzanModeSelectionString() {
        return azanModeChoice_TxtView.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on mode 1 in azan mode
     */
    public void clickOnAzanModeOneButton() {
        AndroidElement azanModeOne = (AndroidElement) TestUtils.scrollToASpecificElementByItsText("نمط صوتى 1");
        azanModeOne.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on mode 2 in azan mode
     */
    public void clickOnAzanModeTwoButton() {
        AndroidElement azanModeTwo = (AndroidElement) TestUtils.scrollToASpecificElementByItsText("نمط صوتى 2");
        azanModeTwo.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on calculation method button
     *
     * @return CalculationMethodScreen
     */
    public CalculationMethodScreen clickOnCalculationMethodButton() {
        calcultionMethod_Btn.click();
        return new CalculationMethodScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return calculation method choice as a string
     *
     * @return the chosen calculation method as a string
     */
    public String getCalculationMethodChoiceString() {
        return calcultionMethodChoice_TxtView.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on Mazhab button
     *
     * @return MazhabScreen
     */
    public MazhabScreen clickOnMazhabButton() {
        mazhabCorrection_Btn.click();
        return new MazhabScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return mazhab choice as a string
     *
     * @return the chosen mazhab as a string
     */
    public String getMazhabChoiceString() {
        return mazhabCorrectionChoice_TxtView.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on summer time button
     *
     * @return SummerTimeScreen
     */
    public SummerTimeScreen clickOnSummerTimeButton() {
        summerTiming_Btn.click();
        return new SummerTimeScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return mazhab choice as a string
     *
     * @return the chosen option for summer timing
     */
    public String getSummerTimingChoiceString() {
        return summerTimingChoice_TxtView.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on prayer times correction button
     *
     * @return TimesCorrectionScreen
     */
    public TimesCorrectionScreen clickOnPrayerTimesCorrectionButton() {
        prayerTimeCorrection_Btn.click();
        return new TimesCorrectionScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on time zone button
     *
     * @return TimeZoneScreen
     */
    public TimeZoneScreen clickOnTimeZoneButton() {
        timeZone_Btn.click();
        return new TimeZoneScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return time zone choice as a string
     *
     * @return the chosen time zone as a string
     */
    public String getTimeZoneChoiceString() {
        return timeZoneChoice_TxtView.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on polar zones calculation button
     *
     * @return PolarZonesScreen
     */
    public PolarZonesScreen clickOnPolarZonesCalculationButton() {
        polarZonesCalculation_Btn.click();
        return new PolarZonesScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return polar zones calculation choice as a string
     *
     * @return the chose option for the polar zone as a string
     */
    public String getPolarZonesChoiceString() {
        return polarZonesCalculationChoice_TxtView.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on reset to default prayer times button
     *
     * @return ResetScreen
     */
    public ResetScreen clickOnResetToDefaultButton() {
        resetPrayerTimesCorrections_Btn.click();
        return new ResetScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on auto location detection button
     *
     * @return AutomaticScreen
     */
    public AutomaticScreen clickOnAutoDetectLocationButton() {
        autoDetectLocation_Btn.click();
        return new AutomaticScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return location choice as string
     *
     * @return the chosen location as a string
     */
    public String getLocationChoiceString() {
        return locationChoice_TxtView.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on travel mode switch
     */
    public void clickOnTravelModeSwitch() {
        AndroidElement travelModeSwitch = (AndroidElement) travelModeSection_Element.findElementById("com.moslay:id/on_off_switch");
        travelModeSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on travel mode section and open travel mode screen
     *
     * @return TravelModeScreen
     */
    public TravelModeScreen clickOnTravelModeSectionToOpenTravelModeScreen() {
        AndroidElement travelModeSection = (AndroidElement) travelModeSection_Element.findElementById("com.moslay:id/title");
        travelModeSection.click();
        return new TravelModeScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on azkar settings button and returns azkar settings
     *
     * @return the azkar settings screen
     */
    public void clickOnAzkarSettingsButton() {
        azkarSettings_Btn.click();
        //This method returns azkar settings screen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on azan settings button and returns azkar settings
     *
     * @return the azan settings screen
     */
    public void clickOnAzanSettingsButton() {
        azanSettings_Btn.click();
        //This method returns azan settings screen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on alert sound button
     */
    public void clickOnAlertSoundButton() {
        alertSound_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return alert sound choice as a string
     *
     * @return the alert sound as a string
     */
    public String returnALertSoundChoiceAsAString() {
        return alertSoundChoice_TxtView.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on alert sound option one
     */
    public void clickOnAlertSoundOptionOne() {
        AndroidElement soundAlertsOptionOne = (AndroidElement) alertSoundList_Element.findElementById("com.moslay:id/radio_button_layout[1]");
        soundAlertsOptionOne.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on alert sound option Two
     */
    public void clickOnAlertSoundOptionTwo() {
        AndroidElement soundAlertsOptionTwo = (AndroidElement) alertSoundList_Element.findElementById("com.moslay:id/radio_button_layout[2]");
        soundAlertsOptionTwo.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on azan and iqama settings button
     *
     * @return azan and iqama notifications screen
     */
    public void clickOnAzanAndIqamaSettingsButton() {
        azanAndIqamaSettingsSection_Btn.click();
        //This method returns azan and iqama notifications screen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on azan and Iqama notifications switch
     */
    public void clickOnAzanAndIqamaNotificationsSwitch() {
        AndroidElement azanAndIqamaSwitch = (AndroidElement) azanAndIqamaSettingsSection_Btn.findElementById("com.moslay:id/bg");
        azanAndIqamaSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on nawafel settings button
     *
     * @return nawafel notifications settings button
     */
    public void clickOnNawafelSettingsButton() {
        nawafelSettingsSection_Btn.click();
        //This method returns nawafel notifications screen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on nawafel notifications switch
     */
    public void clickOnNawafelNotificationsSwitch() {
        AndroidElement nawafelSwitch = (AndroidElement) nawafelSettingsSection_Btn.findElementById("com.moslay:id/bg");
        nawafelSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on gomaa settings button
     *
     * @return gomaa notifications screen
     */
    public void clickOnGomaaSettingsButton() {
        gomaaSettingsSection_Btn.click();
        //This method returns gomaa notifications screen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on gomaa notifications switch
     */
    public void clickOnGomaaNotificationsSwitch() {
        AndroidElement gomaaSwitch = (AndroidElement) gomaaSettingsSection_Btn.findElementById("com.moslay:id/bg");
        gomaaSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on fasting settings button
     *
     * @return fasting notifications settings screen
     */
    public void clickOnFastingSettingsButton() {
        fastingSettingsFasting_Btn.click();
        //This method will return fasting notifications screen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on fasting notifications switch
     */
    public void clickOnFastingNotificationsSwitch() {
        AndroidElement fastingSwitch = (AndroidElement) fastingSettingsFasting_Btn.findElementById("com.moslay:id/bg");
        fastingSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on silent during prayer settings button
     *
     * @return SilentDuringPrayerNotificationsScreen
     */
    public SilentDuringPrayerNotificationsScreen clickOnSilentDuringPrayerSettingsButton() {
        silentDuringPrayerSettingsSection_Btn.click();
        return new SilentDuringPrayerNotificationsScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on silent during prayer notifications switch
     */
    public void clickOnSilentDurningPrayerNotificationsSwitch() {
        AndroidElement silentDuringPrayerSwitch = (AndroidElement) silentDuringPrayerSettingsSection_Btn.findElementById("com.moslay:id/bg");
        silentDuringPrayerSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on azkar notification settings button
     *
     * @return azkar notifications screen
     */
    public void clickOnAzkarNotificationsSettingsButton() {
        azkarNotificationsSettingsSection_Btn.click();
        //This method will return azkar notifications screen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on azkar notification notifications switch
     */
    public void clickOnAzkarNotificationsSwitch() {
        AndroidElement azkarNotificationsSwitch = (AndroidElement) azkarNotificationsSettingsSection_Btn.findElementById("com.moslay:id/bg");
        azkarNotificationsSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on beneftis notifications switch
     */
    public void clickOnBenefitsNotificationsSwitch() {
        AndroidElement benefitsNotificationsSwitch = (AndroidElement) benefitsNotificationsSettingsSections_Btn.findElementById("com.moslay:id/bg");
        benefitsNotificationsSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
