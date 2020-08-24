package java.Screens.worldPrayers;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class WorldPrayersScreen extends Base {
    String expectedTitle = "الصلاة حول العالم";
    @AndroidFindBy(id = "com.moslay:id/img_more")
    private AndroidElement navigationDrawer_Btn;
    @AndroidFindBy(id = "com.moslay:id/qibla_inside_title")
    private AndroidElement screenTitle_Text;
    @AndroidFindBy(id = "com.moslay:id/img_share")
    private AndroidElement share_Btn;
    @AndroidFindBy(id = "com.moslay:id/frag_around_world_help")
    private AndroidElement help_Btn;
    @AndroidFindBy(accessibility = "Zoom in")
    private AndroidElement zoomIn_Btn;
    @AndroidFindBy(accessibility = "Zoom out")
    private AndroidElement zoomOut_Btn;
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
     * This test case is to click on share button
     */
    public void clickOnShareButton() {
        share_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This test case is to click on help button
     */
    public void clickOnHelpButton() {
        help_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This test case is to click on zoom in button
     */
    public void clickOnZoomInButton() {
        zoomIn_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This test case is to click on zoom out button
     */
    public void clickOnZoomOutButton() {
        zoomOut_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
