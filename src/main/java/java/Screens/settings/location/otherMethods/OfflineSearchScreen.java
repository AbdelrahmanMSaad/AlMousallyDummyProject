package java.Screens.settings.location.otherMethods;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class OfflineSearchScreen extends Base {
    @AndroidFindBy(accessibility = "رجوع")
    private AndroidElement back_Btn;

    @AndroidFindBy(id = "com.moslay:id/country_header")
    private AndroidElement screenTitle_Text;

    @AndroidFindBy(id = "com.moslay:id/countrySelection_inputSearch")
    private AndroidElement searchBar_TextView;

    @AndroidFindBy(id = "com.moslay:id/country_ListView")
    private AndroidElement countryList_Element;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to assert the screen
     *
     * @return actual title as a string
     */
    public String getScreenTitle() {
        return screenTitle_Text.getText();
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
        back_Btn.click();
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
        searchBar_TextView.sendKeys(text);
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
        return searchBar_TextView.getText();
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
