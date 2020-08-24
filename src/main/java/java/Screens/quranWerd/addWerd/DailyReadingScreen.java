package java.Screens.quranWerd.addWerd;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class DailyReadingScreen extends Base {
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
        gozaaButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on hezb button
     */
    public void clickOnHezbButton() {
        hezbButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on robaa button
     */
    public void clickOnRobaaButton() {
        robaaButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on page button
     */
    public void clickOnPageButton() {
        pageButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on soraa button
     */
    public void clickOnSoraaButton() {
        soraaButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
