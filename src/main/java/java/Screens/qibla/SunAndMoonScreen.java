package java.Screens.qibla;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class SunAndMoonScreen extends QiblaScreen {
   
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
     * This method is to click on visible button
     *
     * @return VisualScreen
     */
    public VisualScreen clickOnVisibleButton() {
        visual_Btn.click();
        return new VisualScreen();
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
}
