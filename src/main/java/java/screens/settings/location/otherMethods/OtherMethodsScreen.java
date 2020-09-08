package java.screens.settings.location.otherMethods;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.screens.settings.location.automatic.AutomaticScreen;
import java.base.Base;

public class OtherMethodsScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(id = "com.moslay:id/hint")
    private AndroidElement hintText;
    @AndroidFindBy(id = "com.moslay:id/rv_city_list")
    private AndroidElement citySuggestionListElement;
    @AndroidFindBy(id = "com.moslay:id/txt_offline_search")
    private AndroidElement offlineSearchButton;
    @AndroidFindBy(id = "com.moslay:id/txt_online_detection")
    private AndroidElement onlineDetectionButton;
    @AndroidFindBy(id = "com.moslay:id/txt_search_online")
    private AndroidElement searchOnlineButton;
    @AndroidFindBy(id = "com.moslay:id/txt_add_city_name_to_your_location")
    private AndroidElement addCityNameToYourLocationButton;
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to check if the location suggestion list
     *
     * @return boolean
     */
    public boolean isLocationSuggestionListDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(citySuggestionListElement));
        return citySuggestionListElement.isDisplayed();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on offline search button to open the offline search screen
     *
     * @return OtherMethods_OfflineSearchScreen
     */
    public OfflineSearchScreen clickOnOfflineSearchButton() {
        wait.until(ExpectedConditions.visibilityOf(offlineSearchButton));
        offlineSearchButton.click();
        return new OfflineSearchScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on online detection button
     *
     * @return AutomaticScreen
     */
    public AutomaticScreen clickOnOnlineDetectionButton() {
        wait.until(ExpectedConditions.visibilityOf(onlineDetectionButton));
        onlineDetectionButton.click();
        return new AutomaticScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on online search button to open the online search screen
     *
     * @return OtherMethods_SearchOnlineScreen
     */
    public SearchOnlineScreen clickOnSearchOnlineButton() {
        wait.until(ExpectedConditions.visibilityOf(searchOnlineButton));
        searchOnlineButton.click();
        return new SearchOnlineScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on add city button to open the add city screen
     *
     * @return OtherMethods_AddCityNameScreen
     */
    public AddCityNameScreen clickOnAddCityNameButton() {
        wait.until(ExpectedConditions.visibilityOf(addCityNameToYourLocationButton));
        addCityNameToYourLocationButton.click();
        return new AddCityNameScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
