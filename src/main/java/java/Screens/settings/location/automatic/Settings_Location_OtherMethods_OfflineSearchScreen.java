package java.Screens.settings.location.automatic;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class Settings_Location_OtherMethods_OfflineSearchScreen extends Base {
    @AndroidFindBy(accessibility = "رجوع")
    private AndroidElement backButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/country_header")
    private AndroidElement screenTitleTxt_Text;

    @AndroidFindBy(id = "com.moslay:id/countrySelection_inputSearch")
    private AndroidElement searchBarTextField_TxtInput;

    @AndroidFindBy(id = "com.moslay:id/country_ListView")
    private AndroidElement countryListElement_Element;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to assert the screen
     *
     * @return actual title as a string
     */
    public String returnScreenTitle() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(
                1, 60, screenTitleTxt_Text
        );
        return screenTitleTxt_Text.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on back button
     *
     * @return Settings_Location_OtherMethodsScreen
     */
    public Settings_Location_OtherMethodsScreen clickOnBackButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, backButton_Btn);
        backButton_Btn.click();
        return new Settings_Location_OtherMethodsScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send keys to the search bar
     *
     * @param text to be sent to the search bar
     */
    public void sendKeysToSearchTextField(String text) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, searchBarTextField_TxtInput);
        searchBarTextField_TxtInput.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to assert what has been sent to the search bar
     *
     * @return the text within the search bar as a string
     */
    public String returnTextFromSearchTextField() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, searchBarTextField_TxtInput);
        return searchBarTextField_TxtInput.getText();
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
