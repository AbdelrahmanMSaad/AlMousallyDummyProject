package java.Screens.settings.generalSettings;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.Screens.home.HomePageScreen;
import java.base.Base;
import java.utilities.TestUtils;

public class Settings_LanguageScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/lang_txt_chooseLanguage")
    private AndroidElement screenTitleTxt_Text;

    @AndroidFindBy(id = "com.moslay:id/list_container")
    private AndroidElement languagesListElements_Element;

    @AndroidFindBy(accessibility = "العربية")
    private AndroidElement arabicElement_ELement;

    @AndroidFindBy(accessibility = "English")
    private AndroidElement englishElement_Element;

    @AndroidFindBy(accessibility = "Türk")
    private AndroidElement turkishElement_Element;

    @AndroidFindBy(accessibility = "Duits")
    private AndroidElement germanElement_Element;

    @AndroidFindBy(accessibility = "francais")
    private AndroidElement frenchElement_Element;

    @AndroidFindBy(accessibility = "Español")
    private AndroidElement spanishElement_Element;

    @AndroidFindBy(accessibility = "Indonesia")
    private AndroidElement indonesianElement_Element;

    @AndroidFindBy(accessibility = "اردو")
    private AndroidElement arduElement_Element;

    @AndroidFindBy(accessibility = "ئۇيغۇرچە")
    private AndroidElement igurElement_Element;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return the screen's title as a string
     *
     * @return String representing the screen's title
     */
    public String returnScreenTitle() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, screenTitleTxt_Text);
        return screenTitleTxt_Text.getText();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, arabicElement_ELement);
        arabicElement_ELement.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, englishElement_Element);
        englishElement_Element.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, turkishElement_Element);
        turkishElement_Element.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, germanElement_Element);
        germanElement_Element.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, frenchElement_Element);
        frenchElement_Element.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, spanishElement_Element);
        spanishElement_Element.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, indonesianElement_Element);
        indonesianElement_Element.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, arduElement_Element);
        arduElement_Element.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, igurElement_Element);
        igurElement_Element.click();
        return new HomePageScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
