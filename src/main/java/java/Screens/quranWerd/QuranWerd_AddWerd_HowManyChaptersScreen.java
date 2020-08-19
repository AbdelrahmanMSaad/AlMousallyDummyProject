package java.Screens.quranWerd;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class QuranWerd_AddWerd_HowManyChaptersScreen extends Base {
	@AndroidFindBy(id = "android:id/select_dialog_listview")
	private AndroidElement numbersListElement_Element;

	/**
	 * *********************************************************************************************************************************************
	 */
	/**
	 * This method is to scroll to a chapter number then click it, the number is sent as a parameter
	 *
	 * @return QuranWerd_AddWerdScreen
	 */
	public QuranWerd_AddWerdScreen scrollToAChapterNumberAndClickIt(String chapterNumber) {
		TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, numbersListElement_Element);
		AndroidElement requiredElement = (AndroidElement) TestUtils.scrollToASpecificElementByItsText(chapterNumber);
		TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, requiredElement);
		requiredElement.click();
		return new QuranWerd_AddWerdScreen();
	}
	/**
	 * *********************************************************************************************************************************************
	 */
}
