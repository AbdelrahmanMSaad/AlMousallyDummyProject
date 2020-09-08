package java.screens.settings.prayerTimesCorrection;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PolarZonesScreen extends PrayerTimesCorrectionScreen {
//    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(id = "com.moslay:id/txt_setting_title")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/lv_calway_list")
    private AndroidElement polarZonesListElement;
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
     * This method is to click on none button
     */
    public void clickOnNoneButton() {
        wait.until(ExpectedConditions.visibilityOf(polarZonesListElement));
        List<MobileElement> polarZonesList_List = (List<MobileElement>) polarZonesListElement.findElementByClassName("android.widget.LinearLayout");
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
        wait.until(ExpectedConditions.visibilityOf(polarZonesListElement));
        List<MobileElement> polarZonesList_List = (List<MobileElement>) polarZonesListElement.findElementByClassName("android.widget.LinearLayout");
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
        wait.until(ExpectedConditions.visibilityOf(polarZonesListElement));
        List<MobileElement> polarZonesList_List = (List<MobileElement>) polarZonesListElement.findElementByClassName("android.widget.LinearLayout");
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
        wait.until(ExpectedConditions.visibilityOf(polarZonesListElement));
        List<MobileElement> polarZonesList_List = (List<MobileElement>) polarZonesListElement.findElementByClassName("android.widget.LinearLayout");
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
        wait.until(ExpectedConditions.visibilityOf(scrollListElement));
        List<MobileElement> scrollList_List = scrollListElement.findElementsByClassName("android.widget.LinearLayout");
        scrollList_List.get(index).click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
