package java.screens.quranWerd.infoScreen;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class InfoScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    String expectedTitle = "ورد القران";
    @AndroidFindBy(id = "com.moslay:id/img_menu")
    private AndroidElement navigationDrawerButton;
    @AndroidFindBy(id = "com.moslay:id/Azkar_menu_Header")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/delete_khtma")
    private AndroidElement deleteButton;
    @AndroidFindBy(id = "com.moslay:id/pause_khtma")
    private AndroidElement pauseButton;

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
     * This method is to click on pause button and returns InfoScreen_PopUpScreen
     *
     * @return InfoScreen_PopUpScreen
     */
    public InfoScreen_PopUpScreen clickOnPauseButton() {
        wait.until(ExpectedConditions.visibilityOf(pauseButton));
        pauseButton.click();
        return new InfoScreen_PopUpScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on delete button and returns InfoScreen_PopUpScreen
     *
     * @return InfoScreen_PopUpScreen
     */
    public InfoScreen_PopUpScreen clickOnDeleteButton() {
        wait.until(ExpectedConditions.visibilityOf(deleteButton));
        deleteButton.click();
        return new InfoScreen_PopUpScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
