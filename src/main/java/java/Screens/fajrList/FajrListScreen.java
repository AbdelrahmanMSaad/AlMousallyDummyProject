package java.Screens.fajrList;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

import java.base.Base;
import java.utilities.TestUtils;

public class FajrListScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/img_more")
    private AndroidElement navigationDrawerButton_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView")
    private AndroidElement screenTitleTxt_Text;

    @AndroidFindBy(id = "com.moslay:id/im_fajr_list_add")
    private AndroidElement addElementButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/im_fajr_list_delete")
    private AndroidElement deleteElementButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/im_fajr_list_pause")
    private AndroidElement pauseButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/et_fajr_list_search")
    private AndroidElement searchTxtField_TxtEdit;

    @AndroidFindBy(id = "com.moslay:id/txt_fagr_list_add")
    private AndroidElement addContactButton_Btn;

    String expectedTitle = "قائمة الفجر";
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
     * This method is to click on add element button
     */
    public void clickOnAddElementButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, addElementButton_Btn);
        addElementButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on delete element button
     */
    public void clickOnDeleteElementButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, deleteElementButton_Btn);
        deleteElementButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on pause button
     */
    public void clickOnPauseButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, pauseButton_Btn);
        pauseButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send text to search text field
     */
    public void sendTextToSearchTextField(String text) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, searchTxtField_TxtEdit);
        searchTxtField_TxtEdit.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on add contact button
     */
    public void clickOnAddContactButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, addContactButton_Btn);
        addContactButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}