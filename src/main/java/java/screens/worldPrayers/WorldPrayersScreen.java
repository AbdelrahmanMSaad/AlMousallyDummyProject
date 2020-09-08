package java.screens.worldPrayers;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class WorldPrayersScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    String expectedTitle = "الصلاة حول العالم";
    @AndroidFindBy(id = "com.moslay:id/img_more")
    private AndroidElement navigationDrawerButton;
    @AndroidFindBy(id = "com.moslay:id/qibla_inside_title")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/img_share")
    private AndroidElement shareButton;
    @AndroidFindBy(id = "com.moslay:id/frag_around_world_help")
    private AndroidElement helpButton;
    @AndroidFindBy(accessibility = "Zoom in")
    private AndroidElement zoomInButton;
    @AndroidFindBy(accessibility = "Zoom out")
    private AndroidElement zoomOutButton;
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
     * This test case is to click on share button
     */
    public void clickOnShareButton() {
        wait.until(ExpectedConditions.visibilityOf(shareButton));
        shareButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This test case is to click on help button
     */
    public void clickOnHelpButton() {
        wait.until(ExpectedConditions.visibilityOf(helpButton));
        helpButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This test case is to click on zoom in button
     */
    public void clickOnZoomInButton() {
        wait.until(ExpectedConditions.visibilityOf(zoomInButton));
        zoomInButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This test case is to click on zoom out button
     */
    public void clickOnZoomOutButton() {
        wait.until(ExpectedConditions.visibilityOf(zoomInButton));
        zoomOutButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
