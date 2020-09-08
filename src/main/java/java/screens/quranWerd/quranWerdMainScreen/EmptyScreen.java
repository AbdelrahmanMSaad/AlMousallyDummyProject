package java.screens.quranWerd.quranWerdMainScreen;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.screens.quranWerd.addWerd.AddWerdScreen;
import java.base.Base;
import java.screens.quranWerd.mushafScreen.MushafScreen;

public class EmptyScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    String expectedTitle = "ورد القران";
    @AndroidFindBy(id = "com.moslay:id/img_menu")
    private AndroidElement navigationDrawerButton;
    @AndroidFindBy(id = "com.moslay:id/header_txt")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/fagr_help")
    private AndroidElement infoButton;
    @AndroidFindBy(id = "com.moslay:id/werd_add_default_khatma")
    private AndroidElement readFromMoshafButton;
    @AndroidFindBy(id = "com.moslay:id/werd_add_khatma")
    private AndroidElement addWerdButton;
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
     * This method is to click on info button
     */
    public void clickOnInfoButton() {
        wait.until(ExpectedConditions.visibilityOf(infoButton));
        infoButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on read from mushaf button and returns MushafScreen
     *
     * @return MushafScreen
     */
    public MushafScreen clickOnReadFromMushafButton() {
        wait.until(ExpectedConditions.visibilityOf(readFromMoshafButton));
        readFromMoshafButton.click();
        return new MushafScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on add khatma button and returns AddWerdScreen
     *
     * @return AddWerdScreen
     */
    public AddWerdScreen clickOnAddWerdButton() {
        wait.until(ExpectedConditions.visibilityOf(addWerdButton));
        addWerdButton.click();
        return new AddWerdScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
