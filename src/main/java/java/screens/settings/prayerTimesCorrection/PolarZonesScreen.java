package java.screens.settings.prayerTimesCorrection;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class PolarZonesScreen extends PrayerTimesCorrectionScreen {

    @AndroidFindBy(id = "com.moslay:id/txt_setting_title")
    private AndroidElement screenTitleTxt_Text;

    @AndroidFindBy(id = "com.moslay:id/lv_calway_list")
    private AndroidElement polarZonesListElement_Element;

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
        return screenTitleTxt_Text.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on none button
     */
    public void clickOnNoneButton() {
        List<MobileElement> polarZonesList_List = (List<MobileElement>) polarZonesListElement_Element.findElementByClassName("android.widget.LinearLayout");
        AndroidElement noneButton = (AndroidElement) polarZonesList_List.get(0);
        noneButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on using angle button
     */
    public void clickOnUsingAngleButton() {
        List<MobileElement> polarZonesList_List = (List<MobileElement>) polarZonesListElement_Element.findElementByClassName("android.widget.LinearLayout");
        AndroidElement usingAngleButton = (AndroidElement) polarZonesList_List.get(1);
        usingAngleButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on mid night button
     */
    public void clickOnMidnightButton() {
        List<MobileElement> polarZonesList_List = (List<MobileElement>) polarZonesListElement_Element.findElementByClassName("android.widget.LinearLayout");
        AndroidElement midnightButton = (AndroidElement) polarZonesList_List.get(2);
        midnightButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on seventh night button
     */
    public void clickOnSeventhNightButton() {
        List<MobileElement> polarZonesList_List = (List<MobileElement>) polarZonesListElement_Element.findElementByClassName("android.widget.LinearLayout");
        AndroidElement seventhNightButton = (AndroidElement) polarZonesList_List.get(3);
        seventhNightButton.click();
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
        List<MobileElement> scrollList_List = scrollListElement_Element.findElementsByClassName("android.widget.LinearLayout");
        scrollList_List.get(index).click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
