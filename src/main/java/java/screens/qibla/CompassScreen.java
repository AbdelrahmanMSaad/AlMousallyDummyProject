package java.screens.qibla;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class CompassScreen extends QiblaScreen {
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
     * This method is to click on visible button
     *
     * @return VisualScreen
     */
    public VisualScreen clickOnVisibleButton() {
        wait.until(ExpectedConditions.visibilityOf(visualButton));
        visualButton.click();
        return new VisualScreen();
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
}
