package java.screens.settings.location.otherMethods;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;
import java.utilities.TestUtils;

public class OfflineSearchScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(accessibility = "رجوع")
    private AndroidElement backButton;
    @AndroidFindBy(id = "com.moslay:id/country_header")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/countrySelection_inputSearch")
    private AndroidElement searchBar;
    @AndroidFindBy(id = "com.moslay:id/country_ListView")
    private AndroidElement countryListElement;
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to assert the screen
     *
     * @return actual title as a string
     */
    public String getScreenTitle() {
        wait.until(ExpectedConditions.visibilityOf(screenTitleText));
        return screenTitleText.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on back button
     *
     * @return OtherMethodsScreen
     */
    public OtherMethodsScreen clickOnBackButton() {
        wait.until(ExpectedConditions.visibilityOf(backButton));
        backButton.click();
        return new OtherMethodsScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send keys to the search bar
     *
     * @param text to be sent to the search bar
     */
    public void sendTextToSearchBar(String text) {
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to assert what has been sent to the search bar
     *
     * @return the text within the search bar as a string
     */
    public String getTextFromSearchBar() {
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        return searchBar.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to search for a country by its text and click it
     *
     * @param text name of the country
     */
    public void searchForACountryByTextAndClickIt(String text) {
        AndroidElement requiredElement = (AndroidElement) TestUtils.scrollToASpecificElementByItsText(text);
        requiredElement.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
