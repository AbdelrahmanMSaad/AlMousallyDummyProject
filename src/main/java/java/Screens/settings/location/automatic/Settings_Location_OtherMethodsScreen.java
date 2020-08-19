package java.Screens.settings.location.automatic;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class Settings_Location_OtherMethodsScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/hint")
    private AndroidElement hintTxt_Text;

    @AndroidFindBy(id = "com.moslay:id/rv_city_list")
    private AndroidElement cityListElement_Element;

    @AndroidFindBy(id = "com.moslay:id/txt_offline_search")
    private AndroidElement offlineSearchButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/txt_online_detection")
    private AndroidElement onlineDetectionButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/txt_search_online")
    private AndroidElement searchOnlineButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/txt_add_city_name_to_your_location")
    private AndroidElement addCityNameToYourLocationButton_Btn;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on offline search button to open the offline search screen
     *
     * @return Settings_Location_OtherMethods_OfflineSearchScreen
     */
    public Settings_Location_OtherMethods_OfflineSearchScreen clickOnOfflineSearchButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, offlineSearchButton_Btn);
        offlineSearchButton_Btn.click();
        return new Settings_Location_OtherMethods_OfflineSearchScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on online detection button
     *
     * @return Settings_Location_AutomaticScreen
     */
    public Settings_Location_AutomaticScreen clickOnOnlineDetectionButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, onlineDetectionButton_Btn);
        onlineDetectionButton_Btn.click();
        return new Settings_Location_AutomaticScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on online search button to open the online search screen
     *
     * @return Settings_Location_OtherMethods_SearchOnlineScreen
     */
    public Settings_Location_OtherMethods_SearchOnlineScreen clickOnSearchOnlineButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, searchOnlineButton_Btn);
        searchOnlineButton_Btn.click();
        return new Settings_Location_OtherMethods_SearchOnlineScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on add city button to open the add city screen
     *
     * @return Settings_Location_OtherMethod_AddCityNameScreen
     */
    public Settings_Location_OtherMethod_AddCityNameScreen clickOnAddCityNameButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, addCityNameToYourLocationButton_Btn);
        addCityNameToYourLocationButton_Btn.click();
        return new Settings_Location_OtherMethod_AddCityNameScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
