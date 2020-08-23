package java.Screens.settings.location.automatic;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class OtherMethods_AddCityNameScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/country_list_spinner")
    private AndroidElement countryListElement_Element;

    @AndroidFindBy(id = "com.moslay:id/et_city_name")
    private AndroidElement cityNameTxtInput_TxtInput;

    @AndroidFindBy(id = "com.moslay:id/txt_save")
    private AndroidElement saveButton_Btn;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on country element to open the screen showing the list of elements
     *
     * @return OtherMethods_AddCit_CityListScreen
     */
    public OtherMethods_AddCit_CityListScreen clickOnCountryElementToOpenCountriesList() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, countryListElement_Element);
        countryListElement_Element.click();
        return new OtherMethods_AddCit_CityListScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send keys to the city name bar
     *
     * @param text to be sent to the city name bar
     */
    public void sendKeysToSearchTextField(String text) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, cityNameTxtInput_TxtInput);
        cityNameTxtInput_TxtInput.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to assert what has been sent to the city name bar
     *
     * @return the text within the city name bar bar as a string
     */
    public String returnTextFromSearchTextField() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, cityNameTxtInput_TxtInput);
        return cityNameTxtInput_TxtInput.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on save button
     */
    public void clickOnSaveButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, saveButton_Btn);
    }
    /**
     * *********************************************************************************************************************************************
     */
}
