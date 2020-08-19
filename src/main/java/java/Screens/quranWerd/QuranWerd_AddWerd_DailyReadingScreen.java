package java.Screens.quranWerd;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class QuranWerd_AddWerd_DailyReadingScreen extends Base {
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[1]")
	private AndroidElement gozaaButton_Btn;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
	private AndroidElement hezbButton_Btn;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
	private AndroidElement robaaButton;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[4]")
	private AndroidElement pageButton_Btn;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[5]")
	private AndroidElement soraaButton_Btn;

	/**
	 * *********************************************************************************************************************************************
	 */
	/**
	 * This method is to click on gozaa button
	 */
	public void clickOnGozaaButton() {
		TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, gozaaButton_Btn);
		gozaaButton_Btn.click();
	}
	/**
	 * *********************************************************************************************************************************************
	 */
	/**
	 * This method is to click on hezb button
	 */
	public void clickOnHezbButton() {
		TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, hezbButton_Btn);
		hezbButton_Btn.click();
	}
	/**
	 * *********************************************************************************************************************************************
	 */
	/**
	 * This method is to click on robaa button
	 */
	public void clickOnRobaaButton() {
		TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, robaaButton);
		robaaButton.click();
	}
	/**
	 * *********************************************************************************************************************************************
	 */
	/**
	 * This method is to click on page button
	 */
	public void clickOnPageButton() {
		TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, pageButton_Btn);
		pageButton_Btn.click();
	}
	/**
	 * *********************************************************************************************************************************************
	 */
	/**
	 * This method is to click on soraa button
	 */
	public void clickOnSoraaButton() {
		TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, soraaButton_Btn);
		soraaButton_Btn.click();
	}
	/**
	 * *********************************************************************************************************************************************
	 */
}
