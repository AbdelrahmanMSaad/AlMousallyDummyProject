package java.screens.home;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.screens.benefits.CommentScreen;
import java.screens.qibla.CompassScreen;
import java.screens.qibla.ShadowScreen;
import java.screens.qibla.SunAndMoonScreen;
import java.screens.qibla.VisualScreen;
import java.screens.quranWerd.mushafScreen.MushafScreen;
import java.screens.quranWerd.addWerd.AddWerdScreen;
import java.screens.settings.SettingsScreen;
import java.screens.werdAlMohasba.WerdAlMohasbaScreen;
import java.base.Base;
import java.utilities.TestUtils;

public class HomePageScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(id = "com.moslay:id/img_sebha")
    private AndroidElement toolbar_SebhaButton;

    @AndroidFindBy(id = "com.moslay:id/img_azkar")
    private AndroidElement toolbar_AzkarButton;

    @AndroidFindBy(id = "com.moslay:id/img_werd_mohasba")
    private AndroidElement toolbar_WerdMohasbaButton;

    @AndroidFindBy(id = "com.moslay:id/img_benefits")
    private AndroidElement toolbar_BenefitsButton;

    @AndroidFindBy(id = "com.moslay:id/img_settings")
    private AndroidElement toolbar_SettingsButton;

    @AndroidFindBy(id = "com.moslay:id/img_more")
    private AndroidElement toolbar_NavigationDrawerButton;

    @AndroidFindBy(id = "com.moslay:id/right_arrow_imageView")
    private AndroidElement prayerTimes_RightArrowButton;

    @AndroidFindBy(id = "com.moslay:id/left_arrow_imageView")
    private AndroidElement prayerTimes_LeftArrowButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]")
    private AndroidElement prayerTimes_FajrButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]")
    private AndroidElement prayerTimes_SheroukButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]")
    private AndroidElement prayerTimes_DuhrButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]")
    private AndroidElement prayerTimes_AsrButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]")
    private AndroidElement prayerTimes_MaghrebButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]")
    private AndroidElement prayerTimes_IshaaButton;

    @AndroidFindBy(id = "com.moslay:id/moreTv")
    private AndroidElement prayerTimes_MoreButtonButton;

    @AndroidFindBy(id = "com.moslay:id/shareTv")
    private AndroidElement prayerTimes_ShareButton;

    @AndroidFindBy(id = "com.moslay:id/azkar_title")
    private AndroidElement azkarCard_TitleText;

    @AndroidFindBy(id = "com.moslay:id/zekrContent")
    private AndroidElement azkarCard_ContentText;

    @AndroidFindBy(id = "com.moslay:id/approveButton")
    private AndroidElement azkarCard_ApproveButton;

    @AndroidFindBy(id = "com.moslay:id/moreButton")
    private AndroidElement azkarCard_MoreButton;

    @AndroidFindBy(id = "com.moslay:id/qibla_by_compass")
    private AndroidElement byCompassButton;

    @AndroidFindBy(id = "com.moslay:id/qibla_by_sun_and_moon")
    private AndroidElement bySunAndMoonButton;

    @AndroidFindBy(id = "com.moslay:id/qibla_by_shadow")
    private AndroidElement byShadowButton;

    @AndroidFindBy(id = "com.moslay:id/qibla_visual")
    private AndroidElement byVisualButton;

    @AndroidFindBy(id = "com.moslay:id/congrats_btn")
    private AndroidElement eidCard_CongratsButton;

    @AndroidFindBy(id = "com.moslay:id/like_image")
    private AndroidElement bestParticipation_LikeButton;

    @AndroidFindBy(id = "com.moslay:id/news_comment")
    private AndroidElement bestParticipation_CommentButton;

    @AndroidFindBy(id = "com.moslay:id/news_share")
    private AndroidElement bestParticipation_ShareButton;

    @AndroidFindBy(id = "com.moslay:id/like_layout")
    private AndroidElement benefits_LikeButton;

    @AndroidFindBy(id = "com.moslay:id/comment_layout")
    private AndroidElement benefits_CommentButton;

    @AndroidFindBy(id = "com.moslay:id/share_layout")
    private AndroidElement benefits_ShareButton;

    @AndroidFindBy(id = "com.moslay:id/new_benefits_layout")
    private AndroidElement benefits_BenefitSubjectButton;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on toolbar sebha button
     *
     * @returns sebha screen
     */
    public void clickOnToolBarSebhaButton() {
        wait.until(ExpectedConditions.visibilityOf(toolbar_SebhaButton));
        toolbar_SebhaButton.click();
        //This method returns Sebha screen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on toolbar azkar button
     *
     * @returns azkar screen
     */
    public void clickOnToolBarAzkarButton() {
        wait.until(ExpectedConditions.visibilityOf(toolbar_AzkarButton));
        toolbar_AzkarButton.click();
        //This method returns Azkar screen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on toolbar werd al mohasba button
     *
     * @return WerdAlMohasbaScreen
     */
    public WerdAlMohasbaScreen clickOnToolBarWerdAlMohasbaButton() {
        wait.until(ExpectedConditions.visibilityOf(toolbar_WerdMohasbaButton));
        toolbar_WerdMohasbaButton.click();
        return new WerdAlMohasbaScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on toolbar benefits button
     *
     * @returns benefits screen
     */
    public void clickOnToolBarBenefitsButton() {
        wait.until(ExpectedConditions.visibilityOf(toolbar_BenefitsButton));
        toolbar_BenefitsButton.click();
        //This method returns Benefits screen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on toolbar settings button
     *
     * @returns SettingsScreen
     */
    public SettingsScreen clickOnToolBarSettingsButton() {
        wait.until(ExpectedConditions.visibilityOf(toolbar_SettingsButton));
        toolbar_SettingsButton.click();
        return new SettingsScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on toolbar navigation drawer button
     *
     * @return navigation drawer screen
     */
    public void clickOnToolBarNavigationDrawerButton() {
        wait.until(ExpectedConditions.visibilityOf(toolbar_NavigationDrawerButton));
        toolbar_NavigationDrawerButton.click();
        //This method returns Navigation Drawer screen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on prayer times right arrow button
     */
    public void clickOnPrayerTimesRightArrowButton() {
        wait.until(ExpectedConditions.visibilityOf(prayerTimes_RightArrowButton));
        prayerTimes_RightArrowButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on prayer times left arrow button
     */
    public void clickOnPrayerTimesLeftArrowButton() {
        wait.until(ExpectedConditions.visibilityOf(prayerTimes_LeftArrowButton));
        prayerTimes_LeftArrowButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on prayer times fajr button
     */
    public void clickOnPrayerTimesFajrButton() {
        wait.until(ExpectedConditions.visibilityOf(prayerTimes_FajrButton));
        prayerTimes_FajrButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on prayer times fajr button
     */
    public void clickOnPrayerTimesSheroukButton() {
        wait.until(ExpectedConditions.visibilityOf(prayerTimes_SheroukButton));
        prayerTimes_SheroukButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on prayer times fajr button
     */
    public void clickOnPrayerTimesDuhrButton() {
        wait.until(ExpectedConditions.visibilityOf(prayerTimes_DuhrButton));
        prayerTimes_DuhrButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on prayer times Asr button
     */
    public void clickOnPrayerTimesAsrButton() {
        wait.until(ExpectedConditions.visibilityOf(prayerTimes_AsrButton));
        prayerTimes_AsrButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on prayer times Maghreb button
     */
    public void clickOnPrayerTimesMaghrebButton() {
        wait.until(ExpectedConditions.visibilityOf(prayerTimes_MaghrebButton));
        prayerTimes_MaghrebButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on prayer times Ishaa button
     */
    public void clickOnPrayerTimesIshaaButton() {
        wait.until(ExpectedConditions.visibilityOf(prayerTimes_IshaaButton));
        prayerTimes_IshaaButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to scroll to the next day in prayer times card
     */
    public void scrollToTheNextDayOnPrayerTimesCard() {
        wait.until(ExpectedConditions.visibilityOf(prayerTimes_IshaaButton));
        wait.until(ExpectedConditions.visibilityOf(prayerTimes_FajrButton));
        TestUtils.scrollFromAnElementToAnElement(prayerTimes_IshaaButton, prayerTimes_FajrButton);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to scroll to the previous day in prayer times card
     */
    public void scrollToThePreviousDayOnPrayerTimesCard() {
        wait.until(ExpectedConditions.visibilityOf(prayerTimes_IshaaButton));
        wait.until(ExpectedConditions.visibilityOf(prayerTimes_FajrButton));
        TestUtils.scrollFromAnElementToAnElement(prayerTimes_FajrButton, prayerTimes_IshaaButton);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on prayer times More button
     *
     * @return prayer times more screen
     */
    public void clickOnPrayerTimesMoreButton() {
        wait.until(ExpectedConditions.visibilityOf(prayerTimes_MoreButtonButton));
        prayerTimes_MoreButtonButton.click();
        //This method returns PrayerTimesMoreScreen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on prayer times Share button
     */
    public void clickOnPrayerTimesShareButton() {
        wait.until(ExpectedConditions.visibilityOf(prayerTimes_ShareButton));
        prayerTimes_ShareButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on approve button in azkar card
     *
     * @return azkar variety Screen
     */
    public void clickOnApproveButtonAzkarCard() {
        wait.until(ExpectedConditions.visibilityOf(azkarCard_ApproveButton));
        azkarCard_ApproveButton.click();
        //This method returns AzkarVarietyScreen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on more button in azkar card
     *
     * @return azkar variety list Screen
     */
    public void clickOnMoreButtonAzkarCard() {
        wait.until(ExpectedConditions.visibilityOf(azkarCard_MoreButton));
        azkarCard_MoreButton.click();
        //This method returns AzkarVarietyListScreen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on Qibla compass button
     *
     * @return CompassScreen
     */
    public CompassScreen clickOnQiblaCompassButton() {
        wait.until(ExpectedConditions.visibilityOf(byCompassButton));
        byCompassButton.click();
        return new CompassScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on Qibla Sun ANd Moon button
     *
     * @return SunAndMoonScreen
     */
    public SunAndMoonScreen clickOnQiblaSunAndMoonButton() {
        wait.until(ExpectedConditions.visibilityOf(bySunAndMoonButton));
        bySunAndMoonButton.click();
        return new SunAndMoonScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on Qibla Shadow button
     *
     * @return ShadowScreen
     */
    public ShadowScreen clickOnQiblaShadowButton() {
        wait.until(ExpectedConditions.visibilityOf(byShadowButton));
        byShadowButton.click();
        return new ShadowScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on Qibla Visual button
     *
     * @return VisualScreen
     */
    public VisualScreen clickOnQiblaVisualButton() {
        wait.until(ExpectedConditions.visibilityOf(byVisualButton));
        byVisualButton.click();
        return new VisualScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on Quran Werd read from mushaf button
     *
     * @return MushafScreen
     */
    public MushafScreen clickOnQuranWerdReadFromMushafButton() {
        AndroidElement quranWerdReadFromMushafButton = (AndroidElement) TestUtils.scrollToASpecificElementByItsText("اضافة ختمة جديده");
        quranWerdReadFromMushafButton.click();
        return new MushafScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on add new khatma button
     *
     * @return AddWerdScreen
     */
    public AddWerdScreen clickOnQuranWerdAddNewKhatmaButton() {
        AndroidElement quranWerdAddNewKhatmaButton = (AndroidElement) TestUtils.scrollToASpecificElementByItsText("اقرأ من المصحف");
        quranWerdAddNewKhatmaButton.click();
        return new AddWerdScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on Werd Al Muhasba done screen
     */
    public void clickOnWerdAlMohasbaDoneButton() {
        AndroidElement werdAlMohasbaDoneButton = (AndroidElement) TestUtils.scrollToASpecificElementByItsText("تم");
        werdAlMohasbaDoneButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on Werd Al Muhasba more screen
     *
     * @return WerdAlMohasbaScreen
     */
    public WerdAlMohasbaScreen clickOnWerdAlMohasbaMoreButton() {
        AndroidElement werdAlMohasbaMoreButton = (AndroidElement) TestUtils.scrollToASpecificElementByItsText("المزيد");
        werdAlMohasbaMoreButton.click();
        return new WerdAlMohasbaScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on best participation like button
     */
    public void clickOnBestParticipationLikeButton() {
        wait.until(ExpectedConditions.visibilityOf(bestParticipation_LikeButton));
        bestParticipation_LikeButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on best participation like button
     *
     * @return CommentScreen
     */
    public CommentScreen clickOnBestParticipationCommentButton() {
        wait.until(ExpectedConditions.visibilityOf(bestParticipation_CommentButton));
        bestParticipation_CommentButton.click();
        return new CommentScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on best participation share button
     */
    public void clickOnBestParticipationShareButton() {
        wait.until(ExpectedConditions.visibilityOf(bestParticipation_ShareButton));
        bestParticipation_ShareButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on benefits like button
     */
    public void clickOnBenefitsCardLikeButton() {
        wait.until(ExpectedConditions.visibilityOf(benefits_LikeButton));
        benefits_LikeButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on benefits comment button
     *
     * @return CommentScreen
     */
    public CommentScreen clickOnBenefitsCardCommentButton() {
        wait.until(ExpectedConditions.visibilityOf(benefits_CommentButton));
        benefits_CommentButton.click();
        return new CommentScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on benefits share button
     */
    public void clickOnBenefitsCardShareButton() {
        wait.until(ExpectedConditions.visibilityOf(benefits_ShareButton));
        benefits_ShareButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on benefits subject button
     */
    public void clickOnBenefitsSubject() {
        wait.until(ExpectedConditions.visibilityOf(benefits_BenefitSubjectButton));
        benefits_BenefitSubjectButton.click();
        //This method returns benefit subject with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to scroll to the next benefit on the screen
     */
    public void scrollToTheNextBenefitOnTheScreen() {
        wait.until(ExpectedConditions.visibilityOf(benefits_LikeButton));
        wait.until(ExpectedConditions.visibilityOf(benefits_ShareButton));
        TestUtils.scrollFromAnElementToAnElement(benefits_ShareButton, benefits_LikeButton);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to scroll to the prevoius benefit on the screen
     */
    public void scrollToThePreviousBenefitOnTheScreen() {
        wait.until(ExpectedConditions.visibilityOf(benefits_LikeButton));
        wait.until(ExpectedConditions.visibilityOf(benefits_ShareButton));
        TestUtils.scrollFromAnElementToAnElement(benefits_LikeButton, benefits_ShareButton);
    }
    /**
     * *********************************************************************************************************************************************
     */
}
