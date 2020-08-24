package java.Screens.qibla;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.utilities.TestUtils;

public class VisualScreen extends QiblaScreen {
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Zoom in\"]")
    private AndroidElement zoomIn_Btn;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Zoom out\"]")
    private AndroidElement zoomOut_Btn;
    @AndroidFindBy(id = "com.moslay:id/map_type")
    private AndroidElement mapLayers_Btn;
    /**
     * *********************************************************************************************************************************************
     */

    /**
     * This method is to return the screen's actual title as a string
     *
     * @return Screen title as a string
     */
    public String getActualScreenTitle() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, screenTitle_Text);
        return screenTitle_Text.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on navigation drawer button
     *
     * @return navigation drawer screen
     */
    public void clickOnNavigationDrawerButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, navigationDrawer_Btn);
        navigationDrawer_Btn.click();
        //This method returns navigation drawer method with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on compass button
     *
     * @return CompassScreen
     */
    public CompassScreen clickOnCompassButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, compass_Btn);
        compass_Btn.click();
        return new CompassScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on sun and moon button
     *
     * @returns SunAndMoonScreen
     */
    public SunAndMoonScreen clickOnSunAndMoonButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, sunAndMoon_Btn);
        sunAndMoon_Btn.click();
        return new SunAndMoonScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on shadow button
     *
     * @return ShadowScreen
     */
    public ShadowScreen clickOnShadowButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, shadow_Btn);
        shadow_Btn.click();
        return new ShadowScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on help button
     */
    public void clickOnHelpButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, help_Btn);
        help_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on zoom in button
     */
    public void clickOnZoomInButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, zoomIn_Btn);
        zoomIn_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on zoom in button
     */
    public void clickOnZoomOutButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, zoomOut_Btn);
        zoomOut_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on map layers button
     */
    public void clickOnMapLayersButton(){
        mapLayers_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
