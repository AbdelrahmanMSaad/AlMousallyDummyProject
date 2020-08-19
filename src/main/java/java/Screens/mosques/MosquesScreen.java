package java.Screens.mosques;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

import java.base.Base;
import java.utilities.TestUtils;

public class MosquesScreen extends Base {
	@AndroidFindBy(id = "com.moslay:id/img_more")
	private AndroidElement navigationDrawerButton_Btn;
	
	@AndroidFindBy(id = "com.moslay:id/qibla_inside_title")
	private AndroidElement	screenTitleTxt_Text;

	String expectedTitle = "مساجد";
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
}
