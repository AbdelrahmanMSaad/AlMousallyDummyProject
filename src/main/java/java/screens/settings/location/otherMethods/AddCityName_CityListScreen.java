package java.screens.settings.location.otherMethods;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;
import java.utilities.TestUtils;

public class AddCityName_CityListScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(id = "android:id/select_dialog_listview")
    private AndroidElement countriesListElement;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to search for a country by its text and click it
     *
     * @param text name of the country
     */
    public void scrollToACountryByTextAndClickIt(String text) {
        AndroidElement requiredElement = (AndroidElement) TestUtils.scrollToASpecificElementByItsText(text);
        requiredElement.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
