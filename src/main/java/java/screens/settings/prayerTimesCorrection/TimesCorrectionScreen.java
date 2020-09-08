package java.screens.settings.prayerTimesCorrection;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class TimesCorrectionScreen extends PrayerTimesCorrectionScreen {

    @AndroidFindBy(id = "com.moslay:id/txt_setting_title")
    private AndroidElement screenTitleText;

    @AndroidFindBy(id = "com.moslay:id/lv_calway_list")
    private AndroidElement timesCorrectionListElement;

    @AndroidFindBy(id = "com.moslay:id/fagr_helper_double_listview")
    private AndroidElement scrollListElement;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on navigation drawer button
     *
     * @return navigation drawer screen
     */
    public void clickOnNavigationDrawerButton() {
        wait.until(ExpectedConditions.visibilityOf(navigationDrawerButton));
        navigationDrawerButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(screenGeneralTitleText));
        return screenGeneralTitleText.getText();
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
        wait.until(ExpectedConditions.visibilityOf(ishaTimeElement));
        return ishaTimeElement.findElementByClassName("android.widget.TextView").getText();
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
        wait.until(ExpectedConditions.visibilityOf(maghribTimeElement));
        return maghribTimeElement.findElementByClassName("android.widget.TextView").getText();
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
        wait.until(ExpectedConditions.visibilityOf(asrTimeElement));
        return asrTimeElement.findElementByClassName("android.widget.TextView").getText();
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
        wait.until(ExpectedConditions.visibilityOf(zohrTimeElement));
        return zohrTimeElement.findElementByClassName("android.widget.TextView").getText();
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
        wait.until(ExpectedConditions.visibilityOf(shrouqeTimeElement));
        return shrouqeTimeElement.findElementByClassName("android.widget.TextView").getText();
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
        wait.until(ExpectedConditions.visibilityOf(fajrTimeElement));
        return fajrTimeElement.findElementByClassName("android.widget.TextView").getText();
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
        wait.until(ExpectedConditions.visibilityOf(screenTitleText));
        return screenTitleText.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on fajr plus button
     */
    public void clickOnFajrPlusButton() {
        wait.until(ExpectedConditions.visibilityOf(timesCorrectionListElement));
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement.findElementsByClassName("timesCorrectionListElement_Element");
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
        wait.until(ExpectedConditions.visibilityOf(timesCorrectionListElement));
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement.findElementsByClassName("timesCorrectionListElement_Element");
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
        wait.until(ExpectedConditions.visibilityOf(timesCorrectionListElement));
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement.findElementsByClassName("timesCorrectionListElement_Element");
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
        wait.until(ExpectedConditions.visibilityOf(timesCorrectionListElement));
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement.findElementsByClassName("timesCorrectionListElement_Element");
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
        wait.until(ExpectedConditions.visibilityOf(timesCorrectionListElement));
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement.findElementsByClassName("timesCorrectionListElement_Element");
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
        wait.until(ExpectedConditions.visibilityOf(timesCorrectionListElement));
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement.findElementsByClassName("timesCorrectionListElement_Element");
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
        wait.until(ExpectedConditions.visibilityOf(timesCorrectionListElement));
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement.findElementsByClassName("timesCorrectionListElement_Element");
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
        wait.until(ExpectedConditions.visibilityOf(timesCorrectionListElement));
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement.findElementsByClassName("timesCorrectionListElement_Element");
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
        wait.until(ExpectedConditions.visibilityOf(timesCorrectionListElement));
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement.findElementsByClassName("timesCorrectionListElement_Element");
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
        wait.until(ExpectedConditions.visibilityOf(timesCorrectionListElement));
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement.findElementsByClassName("timesCorrectionListElement_Element");
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
        wait.until(ExpectedConditions.visibilityOf(timesCorrectionListElement));
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement.findElementsByClassName("timesCorrectionListElement_Element");
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
        wait.until(ExpectedConditions.visibilityOf(timesCorrectionListElement));
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement.findElementsByClassName("timesCorrectionListElement_Element");
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
        wait.until(ExpectedConditions.visibilityOf(timesCorrectionListElement));
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement.findElementsByClassName("timesCorrectionListElement_Element");
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
        wait.until(ExpectedConditions.visibilityOf(timesCorrectionListElement));
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement.findElementsByClassName("timesCorrectionListElement_Element");
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
        wait.until(ExpectedConditions.visibilityOf(timesCorrectionListElement));
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement.findElementsByClassName("timesCorrectionListElement_Element");
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
        wait.until(ExpectedConditions.visibilityOf(timesCorrectionListElement));
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement.findElementsByClassName("timesCorrectionListElement_Element");
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
        wait.until(ExpectedConditions.visibilityOf(timesCorrectionListElement));
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement.findElementsByClassName("timesCorrectionListElement_Element");
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
        wait.until(ExpectedConditions.visibilityOf(timesCorrectionListElement));
        List<MobileElement> timesCorrectionList_List = timesCorrectionListElement.findElementsByClassName("timesCorrectionListElement_Element");
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
        wait.until(ExpectedConditions.visibilityOf(scrollListElement));
        List<MobileElement> scrollList_List = scrollListElement.findElementsByClassName("android.widget.LinearLayout");
        scrollList_List.get(index).click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
