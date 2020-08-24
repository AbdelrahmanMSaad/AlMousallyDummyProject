package java.Screens.settings.location.automatic;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.Screens.home.HomePageScreen;
import java.base.Base;
import java.utilities.TestUtils;

public class AutomaticScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/background_onbaording")
    private AndroidElement backgroundImgLayout_Element;

    @AndroidFindBy(id = "com.moslay:id/loading_image")
    private AndroidElement loadingImg;

    @AndroidFindBy(id = "com.moslay:id/tvCityName")
    private AndroidElement cityName_Text;

    @AndroidFindBy(id = "com.moslay:id/txt_next")
    private AndroidElement next_Btn;

    @AndroidFindBy(id = "com.moslay:id/detect_other_ways")
    private AndroidElement detectViaOtherWays_Btn;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return city name as a string
     *
     * @return city name as a string
     */
    public String getCityNameAsString() {
        return cityName_Text.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on next button
     *
     * @return HomePageScreen
     */
    public HomePageScreen clickOnNextButton() {
        next_Btn.click();
        return new HomePageScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on detect via detect via other methods button
     *
     * @return OtherMethodsScreen
     */
    public OtherMethodsScreen clickOnDetectViaOtherMethodsScreen() {
        detectViaOtherWays_Btn.click();
        return new OtherMethodsScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
