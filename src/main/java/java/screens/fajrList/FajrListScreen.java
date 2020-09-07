package java.screens.fajrList;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class FajrListScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    String expectedTitle = "قائمة الفجر";
    @AndroidFindBy(id = "com.moslay:id/img_more")
    private AndroidElement navigationDrawerButton;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/im_fajr_list_add")
    private AndroidElement addElementButton;
    @AndroidFindBy(id = "com.moslay:id/im_fajr_list_delete")
    private AndroidElement deleteElementButton;
    @AndroidFindBy(id = "com.moslay:id/im_fajr_list_pause")
    private AndroidElement pauseButton;
    @AndroidFindBy(id = "com.moslay:id/et_fajr_list_search")
    private AndroidElement searchBar;
    @AndroidFindBy(id = "com.moslay:id/txt_fagr_list_add")
    private AndroidElement addContactButton;
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
     * This method is to click on add element button
     */
    public void clickOnAddElementButton() {
        wait.until(ExpectedConditions.visibilityOf(addElementButton));
        addElementButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on delete element button
     */
    public void clickOnDeleteElementButton() {
        wait.until(ExpectedConditions.visibilityOf(deleteElementButton));
        deleteElementButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on pause button
     */
    public void clickOnPauseButton() {
        wait.until(ExpectedConditions.visibilityOf(pauseButton));
        pauseButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send text to search text field
     */
    public void sendTextToSearchBar(String text) {
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to get text from search text field
     */
    public String getTextFromSearchBar(){
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        return searchBar.getText();}
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on add contact button
     */
    public void clickOnAddContactButton() {
        wait.until(ExpectedConditions.visibilityOf(addContactButton));
        addContactButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
