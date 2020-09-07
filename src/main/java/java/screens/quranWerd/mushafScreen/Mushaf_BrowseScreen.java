package java.screens.quranWerd.mushafScreen;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;

public class Mushaf_BrowseScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/moshaf_menu_surah_layout")
    private AndroidElement suraaMenu_Btn;

    @AndroidFindBy(id = "com.moslay:id/moshaf_menu_chapter_layout")
    private AndroidElement chapterMenu_Btn;

    @AndroidFindBy(id = "com.moslay:id/moshaf_menu_pages_layout")
    private AndroidElement pagesMenu_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView")
    private AndroidElement downloadMushaf_Btn;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on suraa menu button
     */
    public void clickOnSuraaMenuButton() {
        suraaMenu_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on chapter menu button
     */
    public void clickOnChapterMenuButton() {
        chapterMenu_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on pages menu button
     */
    public void clickOnPagesMenuButton() {
        pagesMenu_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on download button
     */
    public void clickOnDownloadButton() {
        downloadMushaf_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}