package java.screens.quranWerd.addWerd;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.screens.home.HomePageScreen;
import java.screens.quranWerd.MushafScreen;
import java.base.Base;

public class AddWerdScreen extends Base {
    String expectedTitle = "اضافة ختمة جديده";
    @AndroidFindBy(id = "com.moslay:id/img_more")
    private AndroidElement navigationDrawer_Btn;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")
    private AndroidElement screenTitle_Text;
    @AndroidFindBy(id = "com.moslay:id/werd_add_khatma_name")
    private AndroidElement khatmaNameTxtBar_TextView;
    @AndroidFindBy(id = "com.moslay:id/imageView1")
    private AndroidElement dailyReadingType_Button;
    @AndroidFindBy(id = "com.moslay:id/text_change")
    private AndroidElement howManyChapters_Btn;
    @AndroidFindBy(id = "com.moslay:id/werd_spin_start")
    private AndroidElement startReadingFrom_Btn;
    @AndroidFindBy(id = "com.moslay:id/bg")
    private AndroidElement alertSwitch_Switch;
    @AndroidFindBy(id = "com.moslay:id/alert_exp")
    private AndroidElement setAlertTime_Btn;
    @AndroidFindBy(id = "com.moslay:id/werd_cancel_khatma")
    private AndroidElement cancel_Btn;
    @AndroidFindBy(id = "com.moslay:id/werd_save_khatma")
    private AndroidElement save_Btn;
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
     * This method is to send text to khatma name text field
     *
     * @param text the text sent to khatma name text field
     */
    public void sendTextToKhatmaNameTextBar(String text) {
        khatmaNameTxtBar_TextView.sendKeys(text);
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
        dailyReadingType_Button.click();
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
        howManyChapters_Btn.click();
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
        startReadingFrom_Btn.click();
        return new StartFromScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on alert switch
     */
    public void clickOnAlertOnOffSwitch() {
        alertSwitch_Switch.click();
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
        setAlertTime_Btn.click();
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
        cancel_Btn.click();
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
        save_Btn.click();
        return new MushafScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
