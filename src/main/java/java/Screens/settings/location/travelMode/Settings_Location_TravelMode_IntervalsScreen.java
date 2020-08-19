package java.Screens.settings.location.travelMode;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class Settings_Location_TravelMode_IntervalsScreen extends Base {
    @AndroidFindBy(id = "android:id/select_dialog_listview")
    AndroidElement intervalsListElement_Element;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[1]")
    private AndroidElement quarterHourButton_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    private AndroidElement halfHourButton_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
    private AndroidElement hourButton_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[4]")
    private AndroidElement twoHoursButton_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[5]")
    private AndroidElement threeHoursButton_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[6]")
    private AndroidElement fourHoursButton_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[7]")
    private AndroidElement fiveHoursButton_Btn;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on quarter hour button
     *
     * @return Settings_Location_TravelModeScreen
     */
    public Settings_Location_TravelModeScreen clickOnQuarterHourButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, quarterHourButton_Btn);
        quarterHourButton_Btn.click();
        return new Settings_Location_TravelModeScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on half hour button
     *
     * @return Settings_Location_TravelModeScreen
     */
    public Settings_Location_TravelModeScreen clickOnHalfHourButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, halfHourButton_Btn);
        halfHourButton_Btn.click();
        return new Settings_Location_TravelModeScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on hour button
     *
     * @return Settings_Location_TravelModeScreen
     */
    public Settings_Location_TravelModeScreen clickOnHourButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, hourButton_Btn);
        hourButton_Btn.click();
        return new Settings_Location_TravelModeScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on two hours button
     *
     * @return Settings_Location_TravelModeScreen
     */
    public Settings_Location_TravelModeScreen clickOnTwoHoursButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, twoHoursButton_Btn);
        twoHoursButton_Btn.click();
        return new Settings_Location_TravelModeScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on three hours button
     *
     * @return Settings_Location_TravelModeScreen
     */
    public Settings_Location_TravelModeScreen clickOnThreeHoursButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, threeHoursButton_Btn);
        threeHoursButton_Btn.click();
        return new Settings_Location_TravelModeScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on four hours button
     *
     * @return Settings_Location_TravelModeScreen
     */
    public Settings_Location_TravelModeScreen clickOnFourHoursButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, fourHoursButton_Btn);
        fourHoursButton_Btn.click();
        return new Settings_Location_TravelModeScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on five hours button
     *
     * @return Settings_Location_TravelModeScreen
     */
    public Settings_Location_TravelModeScreen clickOnFiveHoursButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, fiveHoursButton_Btn);
        fiveHoursButton_Btn.click();
        return new Settings_Location_TravelModeScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
