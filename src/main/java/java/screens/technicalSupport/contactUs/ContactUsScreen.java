package java.screens.technicalSupport.contactUs;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class ContactUsScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    String expectedTitle = "الدعم الفنى";
    @AndroidFindBy(id = "com.moslay:id/img_menu")
    private AndroidElement navigationDrawerButton;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "name")
    private AndroidElement nameTextField;
    @AndroidFindBy(id = "email")
    private AndroidElement emailTextField;
    @AndroidFindBy(id = "title")
    private AndroidElement titleTextField;
    @AndroidFindBy(id = "message")
    private AndroidElement messageTextField;
    @AndroidFindBy(id = "groupId")
    private AndroidElement contactUsPurposeButton;
    @AndroidFindBy(id = "image")
    private AndroidElement uplaodFileButton;
    @AndroidFindBy(id = "allAppsId")
    private AndroidElement sendButton;
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
     * This method is to send text to name text field
     *
     * @param text string sent to the name text field
     */
    public void sendTextToNameTextBar(String text) {
        wait.until(ExpectedConditions.visibilityOf(nameTextField));
        nameTextField.sendKeys(text);
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
        wait.until(ExpectedConditions.visibilityOf(emailTextField));
        emailTextField.sendKeys(text);
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
        wait.until(ExpectedConditions.visibilityOf(titleTextField));
        titleTextField.sendKeys(text);
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
        wait.until(ExpectedConditions.visibilityOf(messageTextField));
        messageTextField.sendKeys(text);
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
        wait.until(ExpectedConditions.visibilityOf(contactUsPurposeButton));
        contactUsPurposeButton.click();
        return new ContactUsPurposeScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on upload image button
     */
    public void clickOnUploadImageButton() {
        wait.until(ExpectedConditions.visibilityOf(uplaodFileButton));
        uplaodFileButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on upload image button
     */
    public void clickOnSendButton() {
        wait.until(ExpectedConditions.visibilityOf(sendButton));
        sendButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
