package java.Screens.quranWerd.addWerd;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.Screens.home.HomePageScreen;
import java.Screens.quranWerd.MushafScreen;
import java.base.Base;
import java.utilities.TestUtils;

public class AddWerdScreen extends Base {
    String expectedTitle = "اضافة ختمة جديده";
    @AndroidFindBy(id = "com.moslay:id/img_more")
    private AndroidElement navigationDrawerButton_Btn;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")
    private AndroidElement screenTitleTxt_Text;
    @AndroidFindBy(id = "com.moslay:id/werd_add_khatma_name")
    private AndroidElement khatmaNameTxt_TxtEdit;
    @AndroidFindBy(id = "com.moslay:id/imageView1")
    private AndroidElement dailyReadingType_Button;
    @AndroidFindBy(id = "com.moslay:id/text_change")
    private AndroidElement howManyChaptersButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/werd_spin_start")
    private AndroidElement startReadingFromButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/bg")
    private AndroidElement alertSwitch_Switch;
    @AndroidFindBy(id = "com.moslay:id/alert_exp")
    private AndroidElement setAlertTimeButton_Button;
    @AndroidFindBy(id = "com.moslay:id/werd_cancel_khatma")
    private AndroidElement cancelButton_Button;
    @AndroidFindBy(id = "com.moslay:id/werd_save_khatma")
    private AndroidElement saveButton_Button;
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
     * This method is to send text to khatma name text field
     *
     * @param text the text sent to khatma name text field
     */
    public void sendTextToKhatmaNameTextField(String text) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, khatmaNameTxt_TxtEdit);
        khatmaNameTxt_TxtEdit.sendKeys(text);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, dailyReadingType_Button);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, howManyChaptersButton_Btn);
        howManyChaptersButton_Btn.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, startReadingFromButton_Btn);
        startReadingFromButton_Btn.click();
        return new StartFromScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on alert switch
     */
    public void clickOnAlertOnOffSwitch() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, alertSwitch_Switch);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, setAlertTimeButton_Button);
        setAlertTimeButton_Button.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, cancelButton_Button);
        cancelButton_Button.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, saveButton_Button);
        saveButton_Button.click();
        return new MushafScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}