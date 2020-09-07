package java.screens.quranWerd.addWerd;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.screens.home.HomePageScreen;
import java.screens.quranWerd.mushafScreen.MushafScreen;
import java.base.Base;

public class AddWerdScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    String expectedTitle = "اضافة ختمة جديده";
    @AndroidFindBy(id = "com.moslay:id/img_more")
    private AndroidElement navigationDrawerButton;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/werd_add_khatma_name")
    private AndroidElement khatmaNameTextBar;
    @AndroidFindBy(id = "com.moslay:id/imageView1")
    private AndroidElement dailyReadingTypeButton;
    @AndroidFindBy(id = "com.moslay:id/text_change")
    private AndroidElement howManyChaptersButton;
    @AndroidFindBy(id = "com.moslay:id/werd_spin_start")
    private AndroidElement startReadingFromButton;
    @AndroidFindBy(id = "com.moslay:id/bg")
    private AndroidElement alertSwitch;
    @AndroidFindBy(id = "com.moslay:id/alert_exp")
    private AndroidElement setAlertTimeButton;
    @AndroidFindBy(id = "com.moslay:id/werd_cancel_khatma")
    private AndroidElement cancelButton;
    @AndroidFindBy(id = "com.moslay:id/werd_save_khatma")
    private AndroidElement saveButton;
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
     * This method is to send text to khatma name text field
     *
     * @param text the text sent to khatma name text field
     */
    public void sendTextToKhatmaNameTextBar(String text) {
        wait.until(ExpectedConditions.visibilityOf(khatmaNameTextBar));
        khatmaNameTextBar.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on daily reading button and returns DailyReadingScreen
     *
     * @return DailyReadingScreen
     */
    public DailyReadingScreen clickOnDailyReadingButton() {
        wait.until(ExpectedConditions.visibilityOf(dailyReadingTypeButton));
        dailyReadingTypeButton.click();
        return new DailyReadingScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on how many chapters button and returns HowManyChaptersScreen
     *
     * @return HowManyChaptersScreen
     */
    public HowManyChaptersScreen clickOnHowManyChaptersButton() {
        wait.until(ExpectedConditions.visibilityOf(howManyChaptersButton));
        howManyChaptersButton.click();
        return new HowManyChaptersScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on start from button and returns StartFromScreen
     *
     * @return StartFromScreen
     */
    public StartFromScreen clickOnStartFromButton() {
        wait.until(ExpectedConditions.visibilityOf(startReadingFromButton));
        startReadingFromButton.click();
        return new StartFromScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on alert switch
     */
    public void clickOnAlertOnOffSwitch() {
        wait.until(ExpectedConditions.visibilityOf(alertSwitch));
        alertSwitch.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on set alert time button and returns QuranWerd_AddWerrd_SetAlertTimeScreen
     *
     * @return SetAlertTimeScreen
     */
    public SetAlertTimeScreen clickOnSetAlertTimeButton() {
        wait.until(ExpectedConditions.visibilityOf(setAlertTimeButton));
        setAlertTimeButton.click();
        return new SetAlertTimeScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on cancel button and returns home screen
     *
     * @return HomePageScreen
     */
    public HomePageScreen clickOnCancelButton() {
        wait.until(ExpectedConditions.visibilityOf(cancelButton));
        cancelButton.click();
        return new HomePageScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on save button and returns MushafScreen
     *
     * @return MushafScreen
     */
    public MushafScreen clickOnSaveButton() {
        wait.until(ExpectedConditions.visibilityOf(saveButton));
        saveButton.click();
        return new MushafScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
