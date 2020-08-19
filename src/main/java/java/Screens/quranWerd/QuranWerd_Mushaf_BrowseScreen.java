package java.Screens.quranWerd;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class QuranWerd_Mushaf_BrowseScreen extends Base {
	@AndroidFindBy(id = "com.moslay:id/moshaf_menu_surah_layout")
	private AndroidElement suraaMenuButton_Btn;

	@AndroidFindBy(id = "com.moslay:id/moshaf_menu_chapter_layout")
	private AndroidElement chapterMenuButton_Btn;

	@AndroidFindBy(id = "com.moslay:id/moshaf_menu_pages_layout")
	private AndroidElement pagesMenuScreen;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView")
	private AndroidElement downloadMushafButton_Btn;

	/**
	 * *********************************************************************************************************************************************
	 */
	/**
	 * This method is to click on suraa menu button
	 */
	public void clickOnSuraaMenuButton() {
		TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, suraaMenuButton_Btn);
		suraaMenuButton_Btn.click();
	}
	/**
	 * *********************************************************************************************************************************************
	 */
	/**
	 * This method is to click on chapter menu button
	 */
	public void clickOnChapterMenuButton() {
		TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, chapterMenuButton_Btn);
		chapterMenuButton_Btn.click();
	}
	/**
	 * *********************************************************************************************************************************************
	 */
	/**
	 * This method is to click on pages menu button
	 */
	public void clickOnPagesMenuButton() {
		TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, pagesMenuScreen);
		pagesMenuScreen.click();
	}
	/**
	 * *********************************************************************************************************************************************
	 */
	/**
	 * This method is to click on download button
	 */
	public void clickOnDownloadButton() {
		TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, downloadMushafButton_Btn);
		downloadMushafButton_Btn.click();
	}
	/**
	 * *********************************************************************************************************************************************
	 */
}
