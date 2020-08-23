package java.Screens.technicalSupport.contactUs;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class ContactUsScreen extends Base {
    String expectedTitle = "الدعم الفنى";
    @AndroidFindBy(id = "com.moslay:id/img_menu")
    private AndroidElement navigationDrawerButton_Btn;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement screenTitleTxt_Text;
    @AndroidFindBy(id = "name")
    private AndroidElement nameTxtField_TxtEdit;
    @AndroidFindBy(id = "email")
    private AndroidElement emailTxtField_TxtEdit;
    @AndroidFindBy(id = "title")
    private AndroidElement titleTxtField_TxtEdit;
    @AndroidFindBy(id = "message")
    private AndroidElement messageTxtField_TxtEdit;
    @AndroidFindBy(id = "groupId")
    private AndroidElement contactUsPurposeButton_Btn;
    @AndroidFindBy(id = "image")
    private AndroidElement uplaodFileButton_Btn;
    @AndroidFindBy(id = "allAppsId")
    private AndroidElement sendButton_Btn;
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
     * This method is to send text to name text field
     *
     * @param text string sent to the name text field
     */
    public void sendKeysToNameTextField(String text) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, nameTxtField_TxtEdit);
        nameTxtField_TxtEdit.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send text to email text field
     *
     * @param text string sent to the email text field
     */
    public void sendKeysToEmailTextField(String text) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, emailTxtField_TxtEdit);
        emailTxtField_TxtEdit.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send text to title text field
     *
     * @param text string sent to the title text field
     */
    public void sendKeysToTitleTextField(String text) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, titleTxtField_TxtEdit);
        titleTxtField_TxtEdit.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send text to message text field
     *
     * @param text string sent to the message text field
     */
    public void sendKeysToMessageTextField(String text) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, messageTxtField_TxtEdit);
        messageTxtField_TxtEdit.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on contact purpose screen and it returns TechnicalSupport_ContactUSPurposeScreen
     *
     * @return ContactUsPurposeScreen
     */
    public ContactUsPurposeScreen clickOnContactUsPurposeScreenButton() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, contactUsPurposeButton_Btn);
        contactUsPurposeButton_Btn.click();
        return new ContactUsPurposeScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on upload image button
     */
    public void clickOnUploadImageScreen() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, uplaodFileButton_Btn);
        uplaodFileButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on upload image button
     */
    public void clickOnSendScreen() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, sendButton_Btn);
        sendButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
