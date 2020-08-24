package java.Screens.settings.generalSettings;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.Screens.home.HomePageScreen;
import java.base.Base;
import java.utilities.TestUtils;

public class LanguageScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/lang_txt_chooseLanguage")
    private AndroidElement screenTitle_Text;

    @AndroidFindBy(id = "com.moslay:id/list_container")
    private AndroidElement languagesList_Element;

    @AndroidFindBy(accessibility = "العربية")
    private AndroidElement arabic_Btn;

    @AndroidFindBy(accessibility = "English")
    private AndroidElement english_Btn;

    @AndroidFindBy(accessibility = "Türk")
    private AndroidElement turkish_Btn;

    @AndroidFindBy(accessibility = "Duits")
    private AndroidElement german_Btn;

    @AndroidFindBy(accessibility = "francais")
    private AndroidElement french_Btn;

    @AndroidFindBy(accessibility = "Español")
    private AndroidElement spanish_Btn;

    @AndroidFindBy(accessibility = "Indonesia")
    private AndroidElement indonesian_Btn;

    @AndroidFindBy(accessibility = "اردو")
    private AndroidElement ardu_Btn;

    @AndroidFindBy(accessibility = "ئۇيغۇرچە")
    private AndroidElement igur_Btn;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return the screen's title as a string
     *
     * @return String representing the screen's title
     */
    public String getScreenTitle() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, screenTitle_Text);
        return screenTitle_Text.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the arabic language
     *
     * @return home page screen
     */
    public HomePageScreen clickOnArabicElement() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, arabic_Btn);
        arabic_Btn.click();
        return new HomePageScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the english language
     *
     * @return home page screen
     */
    public HomePageScreen clickOnEnglishElement() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, english_Btn);
        english_Btn.click();
        return new HomePageScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the turkish language
     *
     * @return home page screen
     */
    public HomePageScreen clickOnTurkishElement() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, turkish_Btn);
        turkish_Btn.click();
        return new HomePageScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the german language
     *
     * @return home page screen
     */
    public HomePageScreen clickOnGermanElement() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, german_Btn);
        german_Btn.click();
        return new HomePageScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the french language
     *
     * @return home page screen
     */
    public HomePageScreen clickOnFrenchElement() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, french_Btn);
        french_Btn.click();
        return new HomePageScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the spanish language
     *
     * @return home page screen
     */
    public HomePageScreen clickOnSpanishElement() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, spanish_Btn);
        spanish_Btn.click();
        return new HomePageScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the indonesian language
     *
     * @return home page screen
     */
    public HomePageScreen clickOnIndonesianElement() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, indonesian_Btn);
        indonesian_Btn.click();
        return new HomePageScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the ardu language
     *
     * @return home page screen
     */
    public HomePageScreen clickOnArduElement() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, ardu_Btn);
        ardu_Btn.click();
        return new HomePageScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the igur language
     *
     * @return home page screen
     */
    public HomePageScreen clickOnIgurElement() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, igur_Btn);
        igur_Btn.click();
        return new HomePageScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
