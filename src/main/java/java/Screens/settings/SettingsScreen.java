package java.Screens.settings;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.Screens.settings.generalSettings.EnableBackgroudActivationScreen;
import java.Screens.settings.generalSettings.LanguageScreen;
import java.Screens.settings.location.automatic.AutomaticScreen;
import java.Screens.settings.location.travelMode.TravelModeScreen;
import java.Screens.settings.notifications.silentDuringPrayer.SilentDuringPrayerNotificationsScreen;
import java.Screens.settings.prayerTimesCorrection.*;
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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, screenTitle_Text);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, language_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, backgroundActivation_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, solveAzanProblems_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, azanMode_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, azanModeOne);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, azanModeTwo);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, calcultionMethod_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, calcultionMethodChoice_TxtView);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, mazhabCorrection_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, mazhabCorrectionChoice_TxtView);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, summerTiming_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, summerTimingChoice_TxtView);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, prayerTimeCorrection_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, timeZone_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, timeZoneChoice_TxtView);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, polarZonesCalculation_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, polarZonesCalculationChoice_TxtView);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, resetPrayerTimesCorrections_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, autoDetectLocation_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, travelModeSection_Element);
        AndroidElement travelModeSwitch = (AndroidElement) travelModeSection_Element.findElementById("com.moslay:id/on_off_switch");
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, travelModeSwitch);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, travelModeSection_Element);
        AndroidElement travelModeSection = (AndroidElement) travelModeSection_Element.findElementById("com.moslay:id/title");
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, travelModeSection);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, azkarSettings_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, azanSettings_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, alertSound_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, alertSoundList_Element);
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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, alertSoundList_Element);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, azanAndIqamaSettingsSection_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, azanAndIqamaSettingsSection_Btn);
        AndroidElement azanAndIqamaSwitch = (AndroidElement) azanAndIqamaSettingsSection_Btn.findElementById("com.moslay:id/bg");
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, azanAndIqamaSwitch);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, nawafelSettingsSection_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, nawafelSettingsSection_Btn);
        AndroidElement nawafelSwitch = (AndroidElement) nawafelSettingsSection_Btn.findElementById("com.moslay:id/bg");
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, nawafelSwitch);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, gomaaSettingsSection_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, gomaaSettingsSection_Btn);
        AndroidElement gomaaSwitch = (AndroidElement) gomaaSettingsSection_Btn.findElementById("com.moslay:id/bg");
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, gomaaSwitch);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, fastingSettingsFasting_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, fastingSettingsFasting_Btn);
        AndroidElement fastingSwitch = (AndroidElement) fastingSettingsFasting_Btn.findElementById("com.moslay:id/bg");
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, fastingSwitch);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, silentDuringPrayerSettingsSection_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, silentDuringPrayerSettingsSection_Btn);
        AndroidElement silentDuringPrayerSwitch = (AndroidElement) silentDuringPrayerSettingsSection_Btn.findElementById("com.moslay:id/bg");
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, silentDuringPrayerSwitch);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, azkarNotificationsSettingsSection_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, azkarNotificationsSettingsSection_Btn);
        AndroidElement azkarNotificationsSwitch = (AndroidElement) azkarNotificationsSettingsSection_Btn.findElementById("com.moslay:id/bg");
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, azkarNotificationsSwitch);
        azkarNotificationsSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on beneftis notifications switch
     */
    public void clickOnBenefitsNotificationsSwitch() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, benefitsNotificationsSettingsSections_Btn);
        AndroidElement benefitsNotificationsSwitch = (AndroidElement) benefitsNotificationsSettingsSections_Btn.findElementById("com.moslay:id/bg");
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, benefitsNotificationsSwitch);
        benefitsNotificationsSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
