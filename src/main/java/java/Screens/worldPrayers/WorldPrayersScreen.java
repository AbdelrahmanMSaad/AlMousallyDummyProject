package java.Screens.worldPrayers;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class WorldPrayersScreen extends Base {
    String expectedTitle = "الصلاة حول العالم";
    @AndroidFindBy(id = "com.moslay:id/img_more")
    private AndroidElement navigationDrawerButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/qibla_inside_title")
    private AndroidElement screenTitleTxt_Text;
    @AndroidFindBy(id = "com.moslay:id/img_share")
    private AndroidElement shareButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/frag_around_world_help")
    private AndroidElement helpButton_Btn;
    @AndroidFindBy(accessibility = "Zoom in")
    private AndroidElement zoomInButton_Btn;
    @AndroidFindBy(accessibility = "Zoom out")
    private AndroidElement zoomOutButton_Btn;
    /**
     * *********************************************************************************************************************************************
     */

    /**
     * This method is to return the screen's actual title as a string
     *
     * @return Screen title as a string
     */
    public String returnActualScreenTitle() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, screenTitleTxt_Text);
        return screenTitleTxt_Text.getText();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, navigationDrawerButton_Btn);
        navigationDrawerButton_Btn.click();
        //This method returns navigation drawer method with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This test case is to click on share button
     */
    public void clickOnShareButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, shareButton_Btn);
        shareButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This test case is to click on help button
     */
    public void clickOnHelpButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, helpButton_Btn);
        helpButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This test case is to click on zoom in button
     */
    public void clickOnZoomInButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, zoomInButton_Btn);
        zoomInButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This test case is to click on zoom out button
     */
    public void clickOnZoomOutButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, zoomOutButton_Btn);
        zoomOutButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
