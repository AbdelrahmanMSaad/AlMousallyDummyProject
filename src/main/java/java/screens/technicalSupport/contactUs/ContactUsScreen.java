package java.screens.technicalSupport.contactUs;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;

public class ContactUsScreen extends Base {
    String expectedTitle = "الدعم الفنى";
    @AndroidFindBy(id = "com.moslay:id/img_menu")
    private AndroidElement navigationDrawer_Btn;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement screenTitle_Text;
    @AndroidFindBy(id = "name")
    private AndroidElement name_TextView;
    @AndroidFindBy(id = "email")
    private AndroidElement email_TextView;
    @AndroidFindBy(id = "title")
    private AndroidElement title_TextView;
    @AndroidFindBy(id = "message")
    private AndroidElement message_TextView;
    @AndroidFindBy(id = "groupId")
    private AndroidElement contactUsPurpose_Btn;
    @AndroidFindBy(id = "image")
    private AndroidElement uplaodFile_Btn;
    @AndroidFindBy(id = "allAppsId")
    private AndroidElement send_Btn;
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
     * This method is to send text to name text field
     *
     * @param text string sent to the name text field
     */
    public void sendTextToNameTextBar(String text) {
        name_TextView.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send text to email text field
     *
     * @param text string sent to the email text field
     */
    public void sendTextToEmailTextBar(String text) {
        email_TextView.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send text to title text field
     *
     * @param text string sent to the title text field
     */
    public void sendTextToTitleTextBar(String text) {
        title_TextView.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send text to message text field
     *
     * @param text string sent to the message text field
     */
    public void sendTextToMessageTextBar(String text) {
        message_TextView.sendKeys(text);
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
        contactUsPurpose_Btn.click();
        return new ContactUsPurposeScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on upload image button
     */
    public void clickOnUploadImageButton() {
        uplaodFile_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on upload image button
     */
    public void clickOnSendButton() {
        send_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
