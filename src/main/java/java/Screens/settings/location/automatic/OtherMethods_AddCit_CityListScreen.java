package java.Screens.settings.location.automatic;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class OtherMethods_AddCit_CityListScreen extends Base {
    @AndroidFindBy(id = "android:id/select_dialog_listview")
    private AndroidElement countriesList_Element;

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
