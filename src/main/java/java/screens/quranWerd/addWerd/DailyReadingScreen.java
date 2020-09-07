package java.screens.quranWerd.addWerd;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class DailyReadingScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[1]")
    private AndroidElement gozaaButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    private AndroidElement hezbButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
    private AndroidElement robaaButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[4]")
    private AndroidElement pageButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[5]")
    private AndroidElement soraaButton;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on gozaa button
     */
    public void clickOnGozaaButton() {
        wait.until(ExpectedConditions.visibilityOf(gozaaButton));
        gozaaButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on hezb button
     */
    public void clickOnHezbButton() {
        wait.until(ExpectedConditions.visibilityOf(hezbButton));
        hezbButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on robaa button
     */
    public void clickOnRobaaButton() {
        wait.until(ExpectedConditions.visibilityOf(robaaButton));
        robaaButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on page button
     */
    public void clickOnPageButton() {
        wait.until(ExpectedConditions.visibilityOf(pageButton));
        pageButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on soraa button
     */
    public void clickOnSoraaButton() {
        wait.until(ExpectedConditions.visibilityOf(soraaButton));
        soraaButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
