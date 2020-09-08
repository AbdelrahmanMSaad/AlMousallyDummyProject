package java.screens.technicalSupport;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.screens.technicalSupport.contactUs.ContactUsScreen;
import java.base.Base;

public class TechnicalSupportScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    String expectedTitle = "الدعم الفنى";
    @AndroidFindBy(id = "com.moslay:id/img_more")
    private AndroidElement navigationDrawerButton;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/azan_questions")
    private AndroidElement azanQuestionsButton;
    @AndroidFindBy(id = "com.moslay:id/add_question")
    private AndroidElement contactUsButton;
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
     * This method is to click on azan questions button and returns CommonQuestions class
     *
     * @return common questions screen
     */
    public void clickOnAzaanQuestionsButton() {
        wait.until(ExpectedConditions.visibilityOf(azanQuestionsButton));
        azanQuestionsButton.click();
        //It is supposed to return common questions class which is with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on contact us button and returns ContactUsScreen
     *
     * @return ContactUsScreen
     */
    public ContactUsScreen clickOnContactUsButton() {
        wait.until(ExpectedConditions.visibilityOf(contactUsButton));
        contactUsButton.click();
        return new ContactUsScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
