package java.screens.settings.generalSettings;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.screens.home.HomePageScreen;
import java.base.Base;

public class LanguageScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(id = "com.moslay:id/lang_txt_chooseLanguage")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/list_container")
    private AndroidElement languagesListElement;
    @AndroidFindBy(accessibility = "العربية")
    private AndroidElement arabicButton;
    @AndroidFindBy(accessibility = "English")
    private AndroidElement englishButton;
    @AndroidFindBy(accessibility = "Türk")
    private AndroidElement turkishButton;
    @AndroidFindBy(accessibility = "Duits")
    private AndroidElement germanButton;
    @AndroidFindBy(accessibility = "francais")
    private AndroidElement frenchButton;
    @AndroidFindBy(accessibility = "Español")
    private AndroidElement spanishButton;
    @AndroidFindBy(accessibility = "Indonesia")
    private AndroidElement indonesianButton;
    @AndroidFindBy(accessibility = "اردو")
    private AndroidElement arduButtton;
    @AndroidFindBy(accessibility = "ئۇيغۇرچە")
    private AndroidElement ugyhrButton;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return the screen's title as a string
     *
     * @return String representing the screen's title
     */
    public String getScreenTitle() {
        wait.until(ExpectedConditions.visibilityOf(screenTitleText));
        return screenTitleText.getText();
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
        wait.until(ExpectedConditions.visibilityOf(arabicButton));
        arabicButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(englishButton));
        englishButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(turkishButton));
        turkishButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(germanButton));
        germanButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(frenchButton));
        frenchButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(spanishButton));
        spanishButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(indonesianButton));
        indonesianButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(arduButtton));
        arduButtton.click();
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
        wait.until(ExpectedConditions.visibilityOf(ugyhrButton));
        ugyhrButton.click();
        return new HomePageScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
