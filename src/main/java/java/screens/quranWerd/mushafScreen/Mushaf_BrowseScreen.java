package java.screens.quranWerd.mushafScreen;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class Mushaf_BrowseScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(id = "com.moslay:id/moshaf_menu_surah_layout")
    private AndroidElement suraaMenuButton;

    @AndroidFindBy(id = "com.moslay:id/moshaf_menu_chapter_layout")
    private AndroidElement chapterMenuButton;

    @AndroidFindBy(id = "com.moslay:id/moshaf_menu_pages_layout")
    private AndroidElement pagesMenuButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView")
    private AndroidElement downloadMushafButton;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on suraa menu button
     */
    public void clickOnSuraaMenuButton() {
        wait.until(ExpectedConditions.visibilityOf(suraaMenuButton));
        suraaMenuButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on chapter menu button
     */
    public void clickOnChapterMenuButton() {
        wait.until(ExpectedConditions.visibilityOf(chapterMenuButton));
        chapterMenuButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on pages menu button
     */
    public void clickOnPagesMenuButton() {
        wait.until(ExpectedConditions.visibilityOf(pagesMenuButton));
        pagesMenuButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on download button
     */
    public void clickOnDownloadButton() {
        wait.until(ExpectedConditions.visibilityOf(downloadMushafButton));
        downloadMushafButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
