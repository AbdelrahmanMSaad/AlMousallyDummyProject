package java.Screens.settings.location.automatic;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class OtherMethodsScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/hint")
    private AndroidElement hint_Text;

    @AndroidFindBy(id = "com.moslay:id/rv_city_list")
    private AndroidElement cityList_Element;

    @AndroidFindBy(id = "com.moslay:id/txt_offline_search")
    private AndroidElement offlineSearch_Btn;

    @AndroidFindBy(id = "com.moslay:id/txt_online_detection")
    private AndroidElement onlineDetection_Btn;

    @AndroidFindBy(id = "com.moslay:id/txt_search_online")
    private AndroidElement searchOnline_Btn;

    @AndroidFindBy(id = "com.moslay:id/txt_add_city_name_to_your_location")
    private AndroidElement addCityNameToYourLocation_Btn;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on offline search button to open the offline search screen
     *
     * @return OtherMethods_OfflineSearchScreen
     */
    public OtherMethods_OfflineSearchScreen clickOnOfflineSearchButton() {
        offlineSearch_Btn.click();
        return new OtherMethods_OfflineSearchScreen();
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
        onlineDetection_Btn.click();
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
    public OtherMethods_SearchOnlineScreen clickOnSearchOnlineButton() {
        searchOnline_Btn.click();
        return new OtherMethods_SearchOnlineScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on add city button to open the add city screen
     *
     * @return OtherMethods_AddCityNameScreen
     */
    public OtherMethods_AddCityNameScreen clickOnAddCityNameButton() {
        addCityNameToYourLocation_Btn.click();
        return new OtherMethods_AddCityNameScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
