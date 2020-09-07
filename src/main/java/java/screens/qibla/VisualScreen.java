package java.screens.qibla;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

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
        help_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on zoom in button
     */
    public void clickOnZoomInButton() {
        zoomIn_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on zoom in button
     */
    public void clickOnZoomOutButton() {
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
