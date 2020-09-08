package java.screens.settings;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;
import java.screens.settings.generalSettings.EnableBackgroudActivationScreen;
import java.screens.settings.generalSettings.LanguageScreen;
import java.screens.settings.location.automatic.AutomaticScreen;
import java.screens.settings.location.travelMode.TravelModeScreen;
import java.screens.settings.notifications.silentDuringPrayer.SilentDuringPrayerNotificationsScreen;
import java.screens.settings.prayerTimesCorrection.*;
import java.utilities.TestUtils;

public class SettingsScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    String expectedTile = "الاعدادات";
    @AndroidFindBy(id = "com.moslay:id/settings")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/settings_language_layout")
    private AndroidElement languageButton;
    @AndroidFindBy(id = "com.moslay:id/settings_general_language")
    private AndroidElement languageChoiceText;
    @AndroidFindBy(id = "com.moslay:id/mosaly_bg_activate")
    private AndroidElement backgroundActivationButton;
    @AndroidFindBy(id = "com.moslay:id/solve_azan_problems")
    private AndroidElement solveAzanProblemsButton;
    @AndroidFindBy(id = "com.moslay:id/ll_azan_mode")
    private AndroidElement azanModeButton;
    @AndroidFindBy(id = "com.moslay:id/tv_azan_mode")
    private AndroidElement azanModeChoiceText;
    @AndroidFindBy(id = "com.moslay:id/ex_azanMode")
    private AndroidElement azanModeSelectionsListElement;
    @AndroidFindBy(id = "com.moslay:id/settings_calcultionMethod")
    private AndroidElement calcultionMethodButton;
    @AndroidFindBy(id = "com.moslay:id/settings_calculation")
    private AndroidElement calcultionMethodChoiceText;
    @AndroidFindBy(id = "com.moslay:id/settings_asr")
    private AndroidElement mazhabCorrectionButton;
    @AndroidFindBy(id = "com.moslay:id/settings_prayer_mazhab")
    private AndroidElement mazhabCorrectionChoiceText;
    @AndroidFindBy(id = "com.moslay:id/settings_DayLightSaving")
    private AndroidElement summerTimingButton;
    @AndroidFindBy(id = "com.moslay:id/settings_day_light_saving")
    private AndroidElement summerTimingChoiceText;
    @AndroidFindBy(id = "com.moslay:id/settings_prayerTimeCorrection")
    private AndroidElement prayerTimeCorrectionButton;
    @AndroidFindBy(id = "com.moslay:id/settings_timeZone")
    private AndroidElement timeZoneButton;
    @AndroidFindBy(id = "com.moslay:id/time_zone")
    private AndroidElement timeZoneChoiceText;
    @AndroidFindBy(id = "com.moslay:id/settings_highLatitudeWay")
    private AndroidElement polarZonesCalculationButton;
    @AndroidFindBy(id = "com.moslay:id/high_latitude")
    private AndroidElement polarZonesCalculationChoiceText;
    @AndroidFindBy(id = "com.moslay:id/settings_restoreSettings")
    private AndroidElement resetPrayerTimesCorrectionsText;
    @AndroidFindBy(id = "com.moslay:id/settings_location_layout")
    private AndroidElement autoDetectLocationButton;
    @AndroidFindBy(id = "com.moslay:id/settings_country_city")
    private AndroidElement locationChoiceText;
    @AndroidFindBy(id = "com.moslay:id/setting_travel_on")
    private AndroidElement travelModeSectionElement;
    @AndroidFindBy(id = "com.moslay:id/settings_azkar_layout")
    private AndroidElement azkarSettingsButton;
    @AndroidFindBy(id = "com.moslay:id/settingsAzanLayout")
    private AndroidElement azanSettingsButton;
    @AndroidFindBy(id = "com.moslay:id/ll_alert_sound")
    private AndroidElement alertSoundButton;
    @AndroidFindBy(id = "com.moslay:id/tv_choosen_alert_sound")
    private AndroidElement alertSoundChoiceText;
    @AndroidFindBy(id = "com.moslay:id/lv_alert_sounds")
    private AndroidElement alertSoundListElement;
    @AndroidFindBy(id = "com.moslay:id/setting_azanAndIqama_ll")
    private AndroidElement azanAndIqamaSettingsSectionButton;
    @AndroidFindBy(id = "com.moslay:id/settings_nawafel")
    private AndroidElement nawafelSettingsSectionButton;
    @AndroidFindBy(id = "com.moslay:id/settings_notification_Friday")
    private AndroidElement gomaaSettingsSectionButton;
    @AndroidFindBy(id = "com.moslay:id/settings_fasting")
    private AndroidElement fastingSettingsFastingButton;
    @AndroidFindBy(id = "com.moslay:id/settings_silent")
    private AndroidElement silentDuringPrayerSettingsSectionButton;
    @AndroidFindBy(id = "com.moslay:id/settings_azkar_notification_on_off")
    private AndroidElement azkarNotificationsSettingsSectionButton;
    @AndroidFindBy(id = "com.moslay:id/settings_benefits_notifications")
    private AndroidElement benefitsNotificationsSettingsSectionsButton;
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return the screen's actual title as a string
     *
     * @return Screen title as a string
     */
    public String getActualScreenTitle() {
        wait.until(ExpectedConditions.visibilityOf(screenTitleText));
        return screenTitleText.getText();
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
        wait.until(ExpectedConditions.visibilityOf(languageButton));
        languageButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(languageChoiceText));
        return languageChoiceText.getText();
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
        wait.until(ExpectedConditions.visibilityOf(backgroundActivationButton));
        backgroundActivationButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(solveAzanProblemsButton));
        solveAzanProblemsButton.click();
        //This methods returns CommonQuestionsScreen class with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on azan mode button
     */
    public void clickOnAzanModeButton() {
        wait.until(ExpectedConditions.visibilityOf(azanModeButton));
        azanModeButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(azanModeChoiceText));
        return azanModeChoiceText.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on mode 1 in azan mode
     */
    public void clickOnAzanModeOneButton() {
        AndroidElement azanModeOne = (AndroidElement) TestUtils.scrollToASpecificElementByItsText("نمط صوتى 1");
        wait.until(ExpectedConditions.visibilityOf(azanModeOne));
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
        wait.until(ExpectedConditions.visibilityOf(azanModeTwo));
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
        wait.until(ExpectedConditions.visibilityOf(calcultionMethodButton));
        calcultionMethodButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(calcultionMethodChoiceText));
        return calcultionMethodChoiceText.getText();
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
        wait.until(ExpectedConditions.visibilityOf(mazhabCorrectionButton));
        mazhabCorrectionButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(mazhabCorrectionChoiceText));
        return mazhabCorrectionChoiceText.getText();
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
        wait.until(ExpectedConditions.visibilityOf(summerTimingButton));
        summerTimingButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(summerTimingChoiceText));
        return summerTimingChoiceText.getText();
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
        wait.until(ExpectedConditions.visibilityOf(prayerTimeCorrectionButton));
        prayerTimeCorrectionButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(timeZoneButton));
        timeZoneButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(timeZoneChoiceText));
        return timeZoneChoiceText.getText();
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
        wait.until(ExpectedConditions.visibilityOf(polarZonesCalculationButton));
        polarZonesCalculationButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(polarZonesCalculationChoiceText));
        return polarZonesCalculationChoiceText.getText();
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
        wait.until(ExpectedConditions.visibilityOf(resetPrayerTimesCorrectionsText));
        resetPrayerTimesCorrectionsText.click();
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
        wait.until(ExpectedConditions.visibilityOf(autoDetectLocationButton));
        autoDetectLocationButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(locationChoiceText));
        return locationChoiceText.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on travel mode switch
     */
    public void clickOnTravelModeSwitch() {
        wait.until(ExpectedConditions.visibilityOf(travelModeSectionElement));
        AndroidElement travelModeSwitch = (AndroidElement) travelModeSectionElement.findElementById("com.moslay:id/on_off_switch");
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
        wait.until(ExpectedConditions.visibilityOf(travelModeSectionElement));
        AndroidElement travelModeSection = (AndroidElement) travelModeSectionElement.findElementById("com.moslay:id/title");
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
        wait.until(ExpectedConditions.visibilityOf(azkarSettingsButton));
        azkarSettingsButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(azanSettingsButton));
        azanSettingsButton.click();
        //This method returns azan settings screen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on alert sound button
     */
    public void clickOnAlertSoundButton() {
        wait.until(ExpectedConditions.visibilityOf(alertSoundButton));
        alertSoundButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(alertSoundChoiceText));
        return alertSoundChoiceText.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on alert sound option one
     */
    public void clickOnAlertSoundOptionOne() {
        wait.until(ExpectedConditions.visibilityOf(alertSoundListElement));
        AndroidElement soundAlertsOptionOne = (AndroidElement) alertSoundListElement.findElementById("com.moslay:id/radio_button_layout[1]");
        soundAlertsOptionOne.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on alert sound option Two
     */
    public void clickOnAlertSoundOptionTwo() {
        wait.until(ExpectedConditions.visibilityOf(alertSoundListElement));
        AndroidElement soundAlertsOptionTwo = (AndroidElement) alertSoundListElement.findElementById("com.moslay:id/radio_button_layout[2]");
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
        wait.until(ExpectedConditions.visibilityOf(azanAndIqamaSettingsSectionButton));
        azanAndIqamaSettingsSectionButton.click();
        //This method returns azan and iqama notifications screen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on azan and Iqama notifications switch
     */
    public void clickOnAzanAndIqamaNotificationsSwitch() {
        wait.until(ExpectedConditions.visibilityOf(azanAndIqamaSettingsSectionButton));
        AndroidElement azanAndIqamaSwitch = (AndroidElement) azanAndIqamaSettingsSectionButton.findElementById("com.moslay:id/bg");
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
        wait.until(ExpectedConditions.visibilityOf(nawafelSettingsSectionButton));
        nawafelSettingsSectionButton.click();
        //This method returns nawafel notifications screen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on nawafel notifications switch
     */
    public void clickOnNawafelNotificationsSwitch() {
        wait.until(ExpectedConditions.visibilityOf(nawafelSettingsSectionButton));
        AndroidElement nawafelSwitch = (AndroidElement) nawafelSettingsSectionButton.findElementById("com.moslay:id/bg");
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
        wait.until(ExpectedConditions.visibilityOf(gomaaSettingsSectionButton));
        gomaaSettingsSectionButton.click();
        //This method returns gomaa notifications screen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on gomaa notifications switch
     */
    public void clickOnGomaaNotificationsSwitch() {
        wait.until(ExpectedConditions.visibilityOf(gomaaSettingsSectionButton));
        AndroidElement gomaaSwitch = (AndroidElement) gomaaSettingsSectionButton.findElementById("com.moslay:id/bg");
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
        wait.until(ExpectedConditions.visibilityOf(fastingSettingsFastingButton));
        fastingSettingsFastingButton.click();
        //This method will return fasting notifications screen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on fasting notifications switch
     */
    public void clickOnFastingNotificationsSwitch() {
        wait.until(ExpectedConditions.visibilityOf(fastingSettingsFastingButton));
        AndroidElement fastingSwitch = (AndroidElement) fastingSettingsFastingButton.findElementById("com.moslay:id/bg");
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
        wait.until(ExpectedConditions.visibilityOf(silentDuringPrayerSettingsSectionButton));
        silentDuringPrayerSettingsSectionButton.click();
        return new SilentDuringPrayerNotificationsScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on silent during prayer notifications switch
     */
    public void clickOnSilentDurningPrayerNotificationsSwitch() {
        wait.until(ExpectedConditions.visibilityOf(silentDuringPrayerSettingsSectionButton));
        AndroidElement silentDuringPrayerSwitch = (AndroidElement) silentDuringPrayerSettingsSectionButton.findElementById("com.moslay:id/bg");
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
        wait.until(ExpectedConditions.visibilityOf(azkarNotificationsSettingsSectionButton));
        azkarNotificationsSettingsSectionButton.click();
        //This method will return azkar notifications screen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on azkar notification notifications switch
     */
    public void clickOnAzkarNotificationsSwitch() {
        wait.until(ExpectedConditions.visibilityOf(azkarNotificationsSettingsSectionButton));
        AndroidElement azkarNotificationsSwitch = (AndroidElement) azkarNotificationsSettingsSectionButton.findElementById("com.moslay:id/bg");
        azkarNotificationsSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on beneftis notifications switch
     */
    public void clickOnBenefitsNotificationsSwitch() {
        wait.until(ExpectedConditions.visibilityOf(benefitsNotificationsSettingsSectionsButton));
        AndroidElement benefitsNotificationsSwitch = (AndroidElement) benefitsNotificationsSettingsSectionsButton.findElementById("com.moslay:id/bg");
        benefitsNotificationsSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
