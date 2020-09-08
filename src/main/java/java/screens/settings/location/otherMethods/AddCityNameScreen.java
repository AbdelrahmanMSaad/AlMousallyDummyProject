package java.screens.settings.location.otherMethods;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class AddCityNameScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(id = "com.moslay:id/country_list_spinner")
    private AndroidElement countryListElement;
    @AndroidFindBy(id = "com.moslay:id/et_city_name")
    private AndroidElement cityNameText;
    @AndroidFindBy(id = "com.moslay:id/txt_save")
    private AndroidElement saveButton;
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on country element to open the screen showing the list of elements
     *
     * @return OtherMethods_AddCit_CityListScreen
     */
    public AddCityName_CityListScreen clickOnCountryElementToOpenCountriesList() {
        wait.until(ExpectedConditions.visibilityOf(countryListElement));
        countryListElement.click();
        return new AddCityName_CityListScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send keys to the city name bar
     *
     * @param text to be sent to the city name bar
     */
    public void sendTextToCityNameBar(String text) {
        wait.until(ExpectedConditions.visibilityOf(cityNameText));
        cityNameText.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to assert what has been sent to the city name bar
     *
     * @return the text within the city name bar bar as a string
     */
    public String getTextFromCityNameBar() {
        wait.until(ExpectedConditions.visibilityOf(cityNameText));
        return cityNameText.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on save button
     */
    public void clickOnSaveButton() {
        wait.until(ExpectedConditions.visibilityOf(saveButton));
        saveButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
