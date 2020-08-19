package java.Screens.home;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.Screens.benefits.Benefits_CommentScreen;
import java.Screens.qibla.Qibla_CompassScreen;
import java.Screens.qibla.Qibla_ShadowScreen;
import java.Screens.qibla.Qibla_SunAndMoonScreen;
import java.Screens.qibla.Qibla_VisualScreen;
import java.Screens.quranWerd.QuranWerd_AddWerdScreen;
import java.Screens.quranWerd.QuranWerd_MushafScreen;
import java.Screens.settings.SettingsScreen;
import java.Screens.werdAlMohasba.WerdAlMohasbaScreen;
import java.base.Base;
import java.utilities.TestUtils;

public class HomePageScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/img_sebha")
    private AndroidElement toolbar_SebhaButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/img_azkar")
    private AndroidElement toolbar_AzkarButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/img_werd_mohasba")
    private AndroidElement toolbar_WerdMohasbaButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/img_benefits")
    private AndroidElement toolbar_BenefitsButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/img_settings")
    private AndroidElement toolbar_SettingsButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/img_more")
    private AndroidElement toolbar_NavigationDrawerButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/right_arrow_imageView")
    private AndroidElement prayerTimes_RightArrow_Btn;

    @AndroidFindBy(id = "com.moslay:id/left_arrow_imageView")
    private AndroidElement prayerTimes_LeftArrow_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]")
    private AndroidElement prayerTimes_Fajr_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]")
    private AndroidElement prayerTimes_Sherouk_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]")
    private AndroidElement prayerTimes_Duhr_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]")
    private AndroidElement prayerTimes_Asr_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]")
    private AndroidElement prayerTimes_Maghreb_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]")
    private AndroidElement prayerTimes_Ishaa_Btn;

    @AndroidFindBy(id = "com.moslay:id/moreTv")
    private AndroidElement prayerTimes_MoreButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/shareTv")
    private AndroidElement prayerTimes_ShareButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/azkar_title")
    private AndroidElement azkarCard_Title_TxtView;

    @AndroidFindBy(id = "com.moslay:id/zekrContent")
    private AndroidElement azkarCard_Content_TxtView;

    @AndroidFindBy(id = "com.moslay:id/approveButton")
    private AndroidElement azkarCard_ApproveButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/moreButton")
    private AndroidElement azkarCard_MoreButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/qibla_by_compass")
    private AndroidElement qiblaCard_ByCompassButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/qibla_by_sun_and_moon")
    private AndroidElement qiblaCard_BySunAndMoonButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/qibla_by_shadow")
    private AndroidElement qiblaCard_ByShadowButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/qibla_visual")
    private AndroidElement qiblaCard_ByVisualButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/congrats_btn")
    private AndroidElement eidCard_CongratsButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/like_image")
    private AndroidElement bestParticipation_LikeButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/news_comment")
    private AndroidElement bestParticipation_CommentButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/news_share")
    private AndroidElement bestParticipation_ShareButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/like_layout")
    private AndroidElement benefits_LikeButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/comment_layout")
    private AndroidElement benefits_CommentButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/share_layout")
    private AndroidElement benefits_ShareButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/new_benefits_layout")
    private AndroidElement benefits_BenefitSubject_Btn;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on toolbar sebha button
     *
     * @returns sebha screen
     */
    public void clickOnToolBarSebhaButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, toolbar_SebhaButton_Btn);
        toolbar_SebhaButton_Btn.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, toolbar_AzkarButton_Btn);
        toolbar_AzkarButton_Btn.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, toolbar_WerdMohasbaButton_Btn);
        toolbar_WerdMohasbaButton_Btn.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, toolbar_BenefitsButton_Btn);
        toolbar_BenefitsButton_Btn.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, toolbar_SettingsButton_Btn);
        toolbar_SettingsButton_Btn.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, toolbar_NavigationDrawerButton_Btn);
        toolbar_NavigationDrawerButton_Btn.click();
        //This method returns Navigation Drawer screen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on prayer times right arrow button
     */
    public void clickOnPrayerTimesRightArrowButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, prayerTimes_RightArrow_Btn);
        prayerTimes_RightArrow_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on prayer times left arrow button
     */
    public void clickOnPrayerTimesLeftArrowButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, prayerTimes_LeftArrow_Btn);
        prayerTimes_LeftArrow_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on prayer times fajr button
     */
    public void clickOnPrayerTimesFajrButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, prayerTimes_Fajr_Btn);
        prayerTimes_Fajr_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on prayer times fajr button
     */
    public void clickOnPrayerTimesSheroukButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, prayerTimes_Sherouk_Btn);
        prayerTimes_Sherouk_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on prayer times fajr button
     */
    public void clickOnPrayerTimesDuhrButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, prayerTimes_Duhr_Btn);
        prayerTimes_Duhr_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on prayer times Asr button
     */
    public void clickOnPrayerTimesAsrButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, prayerTimes_Asr_Btn);
        prayerTimes_Asr_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on prayer times Maghreb button
     */
    public void clickOnPrayerTimesMaghrebButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, prayerTimes_Maghreb_Btn);
        prayerTimes_Maghreb_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on prayer times Ishaa button
     */
    public void clickOnPrayerTimesIshaaButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, prayerTimes_Ishaa_Btn);
        prayerTimes_Ishaa_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to scroll to the next day in prayer times card
     */
    public void scrollToTheNextDayOnPrayerTimesCard() {
        TestUtils.scrollFromAnElementToAnElement(prayerTimes_Ishaa_Btn, prayerTimes_Fajr_Btn);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to scroll to the previous day in prayer times card
     */
    public void scrollToThePreviousDayOnPrayerTimesCard() {
        TestUtils.scrollFromAnElementToAnElement(prayerTimes_Fajr_Btn, prayerTimes_Ishaa_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, prayerTimes_MoreButton_Btn);
        prayerTimes_MoreButton_Btn.click();
        //This method returns PrayerTimesMoreScreen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on prayer times Share button
     */
    public void clickOnPrayerTimesShareButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, prayerTimes_ShareButton_Btn);
        prayerTimes_ShareButton_Btn.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, azkarCard_ApproveButton_Btn);
        azkarCard_ApproveButton_Btn.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, azkarCard_MoreButton_Btn);
        azkarCard_MoreButton_Btn.click();
        //This method returns AzkarVarietyListScreen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on Qibla compass button
     *
     * @return Qibla_CompassScreen
     */
    public Qibla_CompassScreen clickOnQiblaCompassButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, qiblaCard_ByCompassButton_Btn);
        qiblaCard_ByCompassButton_Btn.click();
        return new Qibla_CompassScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on Qibla Sun ANd Moon button
     *
     * @return Qibla_SunAndMoonScreen
     */
    public Qibla_SunAndMoonScreen clickOnQiblaSunAndMoonButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, qiblaCard_BySunAndMoonButton_Btn);
        qiblaCard_BySunAndMoonButton_Btn.click();
        return new Qibla_SunAndMoonScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on Qibla Shadow button
     *
     * @return Qibla_ShadowScreen
     */
    public Qibla_ShadowScreen clickOnQiblaShadowButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, qiblaCard_ByShadowButton_Btn);
        qiblaCard_ByShadowButton_Btn.click();
        return new Qibla_ShadowScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on Qibla Visual button
     *
     * @return Qibla_VisualScreen
     */
    public Qibla_VisualScreen clickOnQiblaVisualButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, qiblaCard_ByVisualButton_Btn);
        qiblaCard_ByVisualButton_Btn.click();
        return new Qibla_VisualScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on Quran Werd read from mushaf button
     *
     * @return QuranWerd_MushafScreen
     */
    public QuranWerd_MushafScreen clickOnQuranWerdReadFromMushafButton() {
        AndroidElement quranWerdReadFromMushafButton = (AndroidElement) TestUtils.scrollToASpecificElementByItsText("اضافة ختمة جديده");
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, quranWerdReadFromMushafButton);
        quranWerdReadFromMushafButton.click();
        return new QuranWerd_MushafScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on add new khatma button
     *
     * @return QuranWerd_AddWerdScreen
     */
    public QuranWerd_AddWerdScreen clickOnQuranWerdAddNewKhatmaButton() {
        AndroidElement quranWerdAddNewKhatmaButton = (AndroidElement) TestUtils.scrollToASpecificElementByItsText("اقرأ من المصحف");
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, quranWerdAddNewKhatmaButton);
        quranWerdAddNewKhatmaButton.click();
        return new QuranWerd_AddWerdScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on Werd Al Muhasba done screen
     */
    public void clickOnWerdAlMohasbaDoneButton() {
        AndroidElement werdAlMohasbaDoneButton = (AndroidElement) TestUtils.scrollToASpecificElementByItsText("تم");
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, werdAlMohasbaDoneButton);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, werdAlMohasbaMoreButton);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, bestParticipation_LikeButton_Btn);
        bestParticipation_LikeButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on best participation like button
     *
     * @return Benefits_CommentScreen
     */
    public Benefits_CommentScreen clickOnBestParticipationCommentButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, bestParticipation_CommentButton_Btn);
        bestParticipation_CommentButton_Btn.click();
        return new Benefits_CommentScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on best participation share button
     */
    public void clickOnBestParticipationShareButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, bestParticipation_ShareButton_Btn);
        bestParticipation_ShareButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on benefits like button
     */
    public void clickOnBeneftitsCardLikeButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, benefits_LikeButton_Btn);
        benefits_LikeButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on benefits comment button
     *
     * @return Benefits_CommentScreen
     */
    public Benefits_CommentScreen clickOnBeneftitsCardCommentButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, benefits_CommentButton_Btn);
        benefits_CommentButton_Btn.click();
        return new Benefits_CommentScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on benefits share button
     */
    public void clickOnBeneftitsCardShareButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, benefits_ShareButton_Btn);
        benefits_ShareButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on benefits subject button
     */
    public void clickOnBenefitsSubject() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, benefits_BenefitSubject_Btn);
        benefits_BenefitSubject_Btn.click();
        //This method returns benefit subject with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to scroll to the next benefit on the screen
     */
    public void scrollToTheNextBenefitOnTheScreen() {
        TestUtils.scrollFromAnElementToAnElement(benefits_ShareButton_Btn, benefits_LikeButton_Btn);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to scroll to the prevoius benefit on the screen
     */
    public void scrollToThePreviousBenefitOnTheScreen() {
        TestUtils.scrollFromAnElementToAnElement(benefits_LikeButton_Btn, benefits_ShareButton_Btn);
    }
    /**
     * *********************************************************************************************************************************************
     */
}
