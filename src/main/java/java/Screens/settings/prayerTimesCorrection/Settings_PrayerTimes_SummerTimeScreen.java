package java.Screens.settings.prayerTimesCorrection;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.util.List;
import java.utilities.TestUtils;

public class Settings_PrayerTimes_SummerTimeScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/img_menu")
    private AndroidElement navigationDrawerBtn_Btn;

    @AndroidFindBy(id = "com.moslay:id/Azkar_menu_Header")
    private AndroidElement screenGeneralTitleTxt_Text;

    @AndroidFindBy(id = "com.moslay:id/isha_time")
    private AndroidElement ishaTimeElement_Element;

    @AndroidFindBy(id = "com.moslay:id/maghrib_time")
    private AndroidElement maghribTimeElement_Element;

    @AndroidFindBy(id = "com.moslay:id/asr_time")
    private AndroidElement asrTimeElement_Element;

    @AndroidFindBy(id = "com.moslay:id/zohr_time")
    private AndroidElement zohrTimeElement_Element;

    @AndroidFindBy(id = "com.moslay:id/shorouqe_time")
    private AndroidElement shrouqeTimeElement_Element;

    @AndroidFindBy(id = "com.moslay:id/fajr_time")
    private AndroidElement fajrTimeElement_Element;

    @AndroidFindBy(id = "com.moslay:id/txt_setting_title")
    private AndroidElement screenTitleTxt_Text;

    @AndroidFindBy(id = "com.moslay:id/lv_calway_list")
    private AndroidElement summerTimeListElement_Element;

    @AndroidFindBy(id = "com.moslay:id/fagr_helper_double_listview")
    private AndroidElement scrollListElement_Element;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on navigation drawer button
     *
     * @return navigation drawer screen
     */
    public void clickOnNavigationDrawerButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, navigationDrawerBtn_Btn);
        navigationDrawerBtn_Btn.click();
        //This method returns navigation drawer screen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return the screen's general title
     *
     * @return the screen's general title as a string
     */
    public String returnScreenGeneralTitleString() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, screenGeneralTitleTxt_Text);
        return screenGeneralTitleTxt_Text.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return ishaa time in a string
     *
     * @return ishaa time in string
     */
    public String returnIshaaTimeString() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, ishaTimeElement_Element);
        return ishaTimeElement_Element.findElementByClassName("android.widget.TextView").getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return maghrib time in a string
     *
     * @return maghrib time in string
     */
    public String returnMaghribTimeString() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, maghribTimeElement_Element);
        return maghribTimeElement_Element.findElementByClassName("android.widget.TextView").getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return asr time in a string
     *
     * @return asr time in string
     */
    public String returnAsrTimeString() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, asrTimeElement_Element);
        return asrTimeElement_Element.findElementByClassName("android.widget.TextView").getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return zohr time in a string
     *
     * @return zohr time in string
     */
    public String returnZohrTimeString() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, zohrTimeElement_Element);
        return zohrTimeElement_Element.findElementByClassName("android.widget.TextView").getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return sherouqe time in a string
     *
     * @return sherouqe time in string
     */
    public String returnSherouqeTimeString() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, shrouqeTimeElement_Element);
        return shrouqeTimeElement_Element.findElementByClassName("android.widget.TextView").getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return fajr time in a string
     *
     * @return fajr time in string
     */
    public String returnFajrTimeString() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, fajrTimeElement_Element);
        return fajrTimeElement_Element.findElementByClassName("android.widget.TextView").getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return the screen's title as a string
     *
     * @return screen's title as a string
     */
    public String returnScreenTitleString() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, screenTitleTxt_Text);
        return screenTitleTxt_Text.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on disable summer time
     */
    public void clickOnDisableSummerTimingButton() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, summerTimeListElement_Element);
        List<MobileElement> summerTimeList_List = summerTimeListElement_Element.findElementsByClassName("android.widget.LinearLayout");
        summerTimeList_List.get(0).click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on enable summer time
     */
    public void clickOnEnableSummerTimingButton() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, summerTimeListElement_Element);
        List<MobileElement> summerTimeList_List = summerTimeListElement_Element.findElementsByClassName("android.widget.LinearLayout");
        summerTimeList_List.get(1).click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on a scroll dot
     *
     * @param index that represents the scroll dot number
     */
    public void clickOnAScrollDotByIndex(int index) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, scrollListElement_Element);
        List<MobileElement> scrollList_List = scrollListElement_Element.findElementsByClassName("android.widget.LinearLayout");
        scrollList_List.get(index).click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}