package java.screens.qibla;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class VisualScreen extends QiblaScreen {
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Zoom in\"]")
    private AndroidElement zoomInButton;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Zoom out\"]")
    private AndroidElement zoomOutButton;
    @AndroidFindBy(id = "com.moslay:id/map_type")
    private AndroidElement mapLayersButton;
    /**
     * *********************************************************************************************************************************************
     */

    /**
     * This method is to return the screen's actual title as a string
     *
     * @return Screen title as a string
     */
    public String getActualScreenTitle() {
        wait.until(ExpectedConditions.visibilityOf(screenTitleText));
        return screenTitleText.getText();
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
        wait.until(ExpectedConditions.visibilityOf(navigationDrawerButton));
        navigationDrawerButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(compassButton));
        compassButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(sunAndMoonButton));
        sunAndMoonButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(shadowButton));
        shadowButton.click();
        return new ShadowScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on help button
     */
    public void clickOnHelpButton() {
        wait.until(ExpectedConditions.visibilityOf(helpButton));
        helpButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on zoom in button
     */
    public void clickOnZoomInButton() {
        wait.until(ExpectedConditions.visibilityOf(zoomInButton));
        zoomInButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on zoom in button
     */
    public void clickOnZoomOutButton() {
        wait.until(ExpectedConditions.visibilityOf(zoomOutButton));
        zoomOutButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on map layers button
     */
    public void clickOnMapLayersButton(){
        wait.until(ExpectedConditions.visibilityOf(mapLayersButton));
        mapLayersButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
