package java.Screens.settings.prayerTimesCorrection;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.util.List;
import java.utilities.TestUtils;

public class Settings_PrayerTimes_TimesCorrectionScreen extends Base {
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
    private AndroidElement timesCorrectionListElement_Element;

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
     * This method is to click on fajr plus button
     */
    public void clickOnFajrPlusButton() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, timesCorrectionListElement_Element);
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement_Element.findElementsByClassName("timesCorrectionListElement_Element");
        AndroidElement fajrPlusButton = (AndroidElement) timesCorrectionList_List.get(0).findElementsById("com.moslay:id/im_plus");
        fajrPlusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send number to fajr correction time text field
     *
     * @param number represents the number sent to fajr correction time text field
     */
    public void sendNumberToFajrCorrectionTimeTextField(String number) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, timesCorrectionListElement_Element);
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement_Element.findElementsByClassName("timesCorrectionListElement_Element");
        AndroidElement fajrTextField = (AndroidElement) timesCorrectionList_List.get(0).findElementsById("com.moslay:id/et_number");
        fajrTextField.sendKeys(number);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on fajr minus button
     */
    public void clickOnFajrMinusButton() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, timesCorrectionListElement_Element);
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement_Element.findElementsByClassName("timesCorrectionListElement_Element");
        AndroidElement fajrMinusButton = (AndroidElement) timesCorrectionList_List.get(0).findElementsById("com.moslay:id/im_minus");
        fajrMinusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on sherouqe plus button
     */
    public void clickOnSherouqePlusButton() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, timesCorrectionListElement_Element);
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement_Element.findElementsByClassName("timesCorrectionListElement_Element");
        AndroidElement sherouqePlusButton = (AndroidElement) timesCorrectionList_List.get(1).findElementsById("com.moslay:id/im_plus");
        sherouqePlusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send number to sherouqe correction time text field
     *
     * @param number represents the number sent to sherouqe correction time text field
     */
    public void sendNumberToSherouqeCorrectionTimeTextField(String number) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, timesCorrectionListElement_Element);
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement_Element.findElementsByClassName("timesCorrectionListElement_Element");
        AndroidElement sherouqeTextField = (AndroidElement) timesCorrectionList_List.get(1).findElementsById("com.moslay:id/et_number");
        sherouqeTextField.sendKeys(number);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on sherouqe minus button
     */
    public void clickOnSherouqeMinusButton() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, timesCorrectionListElement_Element);
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement_Element.findElementsByClassName("timesCorrectionListElement_Element");
        AndroidElement sherouqeMinusButton = (AndroidElement) timesCorrectionList_List.get(1).findElementsById("com.moslay:id/im_minus");
        sherouqeMinusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on zohr plus button
     */
    public void clickOnZohrPlusButton() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, timesCorrectionListElement_Element);
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement_Element.findElementsByClassName("timesCorrectionListElement_Element");
        AndroidElement zohrPlusButton = (AndroidElement) timesCorrectionList_List.get(2).findElementsById("com.moslay:id/im_plus");
        zohrPlusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send number to zohr correction time text field
     *
     * @param number represents the number sent to zohr correction time text field
     */
    public void sendNumberToZohrCorrectionTimeTextField(String number) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, timesCorrectionListElement_Element);
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement_Element.findElementsByClassName("timesCorrectionListElement_Element");
        AndroidElement zohrTextField = (AndroidElement) timesCorrectionList_List.get(2).findElementsById("com.moslay:id/et_number");
        zohrTextField.sendKeys(number);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on zohr minus button
     */
    public void clickOnZohrMinusButton() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, timesCorrectionListElement_Element);
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement_Element.findElementsByClassName("timesCorrectionListElement_Element");
        AndroidElement zohrMinusButton = (AndroidElement) timesCorrectionList_List.get(2).findElementsById("com.moslay:id/im_minus");
        zohrMinusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on asr plus button
     */
    public void clickOnAsrPlusButton() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, timesCorrectionListElement_Element);
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement_Element.findElementsByClassName("timesCorrectionListElement_Element");
        AndroidElement asrPlusButton = (AndroidElement) timesCorrectionList_List.get(3).findElementsById("com.moslay:id/im_plus");
        asrPlusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send number to asr correction time text field
     *
     * @param number represents the number sent to asr correction time text field
     */
    public void sendNumberToAsrCorrectionTimeTextField(String number) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, timesCorrectionListElement_Element);
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement_Element.findElementsByClassName("timesCorrectionListElement_Element");
        AndroidElement asrTextField = (AndroidElement) timesCorrectionList_List.get(3).findElementsById("com.moslay:id/et_number");
        asrTextField.sendKeys(number);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on asr minus button
     */
    public void clickOnAsrMinusButton() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, timesCorrectionListElement_Element);
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement_Element.findElementsByClassName("timesCorrectionListElement_Element");
        AndroidElement asrMinusButton = (AndroidElement) timesCorrectionList_List.get(3).findElementsById("com.moslay:id/im_minus");
        asrMinusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on maghrib plus button
     */
    public void clickOnMaghribPlusButton() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, timesCorrectionListElement_Element);
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement_Element.findElementsByClassName("timesCorrectionListElement_Element");
        AndroidElement maghribPlusButton = (AndroidElement) timesCorrectionList_List.get(4).findElementsById("com.moslay:id/im_plus");
        maghribPlusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send number to maghrib correction time text field
     *
     * @param number represents the number sent to maghrib correction time text field
     */
    public void sendNumberToMaghribCorrectionTimeTextField(String number) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, timesCorrectionListElement_Element);
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement_Element.findElementsByClassName("timesCorrectionListElement_Element");
        AndroidElement maghribTextField = (AndroidElement) timesCorrectionList_List.get(4).findElementsById("com.moslay:id/et_number");
        maghribTextField.sendKeys(number);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on maghrib minus button
     */
    public void clickOnMaghribMinusButton() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, timesCorrectionListElement_Element);
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement_Element.findElementsByClassName("timesCorrectionListElement_Element");
        AndroidElement maghribMinusButton = (AndroidElement) timesCorrectionList_List.get(4).findElementsById("com.moslay:id/im_minus");
        maghribMinusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on ishaa plus button
     */
    public void clickOnIshaaPlusButton() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, timesCorrectionListElement_Element);
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement_Element.findElementsByClassName("timesCorrectionListElement_Element");
        AndroidElement ishaaPlusButton = (AndroidElement) timesCorrectionList_List.get(5).findElementsById("com.moslay:id/im_plus");
        ishaaPlusButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send number to ishaa correction time text field
     *
     * @param number represents the number sent to ishaa correction time text field
     */
    public void sendNumberToIshaaCorrectionTimeTextField(String number) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, timesCorrectionListElement_Element);
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement_Element.findElementsByClassName("timesCorrectionListElement_Element");
        AndroidElement ishaaTextField = (AndroidElement) timesCorrectionList_List.get(5).findElementsById("com.moslay:id/et_number");
        ishaaTextField.sendKeys(number);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on ishaa minus button
     */
    public void clickOnIshaaMinusButton() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, timesCorrectionListElement_Element);
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement_Element.findElementsByClassName("timesCorrectionListElement_Element");
        AndroidElement ishaaMinusButton = (AndroidElement) timesCorrectionList_List.get(5).findElementsById("com.moslay:id/im_minus");
        ishaaMinusButton.click();
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
