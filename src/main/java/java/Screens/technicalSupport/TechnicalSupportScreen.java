package java.Screens.technicalSupport;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.Screens.technicalSupport.contactUs.TechnicalSupport_ContactUsScreen;
import java.base.Base;
import java.utilities.TestUtils;

public class TechnicalSupportScreen extends Base {
	@AndroidFindBy(id = "com.moslay:id/img_more")
	private AndroidElement navigationDrawerButton_Btn;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView")
	private AndroidElement screenTitleTxt_Text;

	@AndroidFindBy(id = "com.moslay:id/azan_questions")
	private AndroidElement azanQuestionsButton_Btn;

	@AndroidFindBy(id = "com.moslay:id/add_question")
	private AndroidElement contactUsButton_Btn;

	String expectedTitle = "الدعم الفنى";
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
	 * This method is to click on azan questions button and returns CommonQuestions class
	 *
	 * @return common questions screen
	 */
	public void clickOnAzaanQuestionsButton() {
		TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, azanQuestionsButton_Btn);
		azanQuestionsButton_Btn.click();
		//It is supposed to return common questions class which is with shams
	}
	/**
	 * *********************************************************************************************************************************************
	 */
	/**
	 * This method is to click on contact us button and returns TechnicalSupport_ContactUsScreen
	 *
	 * @return TechnicalSupport_ContactUsScreen
	 */
	public TechnicalSupport_ContactUsScreen clickOnContactUsButton() {
		TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, contactUsButton_Btn);
		contactUsButton_Btn.click();
		return new TechnicalSupport_ContactUsScreen();
	}
	/**
	 * *********************************************************************************************************************************************
	 */
}
