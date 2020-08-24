package java.Screens.technicalSupport;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.Screens.technicalSupport.contactUs.ContactUsScreen;
import java.base.Base;
import java.utilities.TestUtils;

public class TechnicalSupportScreen extends Base {
    String expectedTitle = "الدعم الفنى";
    @AndroidFindBy(id = "com.moslay:id/img_more")
    private AndroidElement navigationDrawer_Btn;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement screenTitle_Text;
    @AndroidFindBy(id = "com.moslay:id/azan_questions")
    private AndroidElement azanQuestions_Btn;
    @AndroidFindBy(id = "com.moslay:id/add_question")
    private AndroidElement contactUs_Btn;
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
     * This method is to click on azan questions button and returns CommonQuestions class
     *
     * @return common questions screen
     */
    public void clickOnAzaanQuestionsButton() {
        azanQuestions_Btn.click();
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
        contactUs_Btn.click();
        return new ContactUsScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
