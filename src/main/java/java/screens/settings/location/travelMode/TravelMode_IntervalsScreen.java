package java.screens.settings.location.travelMode;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;

public class TravelMode_IntervalsScreen extends Base {
    @AndroidFindBy(id = "android:id/select_dialog_listview")
    private AndroidElement intervalsList_Element;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[1]")
    private AndroidElement quarterHour_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    private AndroidElement halfHour_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
    private AndroidElement hour_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[4]")
    private AndroidElement twoHours_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[5]")
    private AndroidElement threeHours_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[6]")
    private AndroidElement fourHours_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[7]")
    private AndroidElement fiveHours_Btn;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on quarter hour button
     *
     * @return TravelModeScreen
     */
    public TravelModeScreen clickOnQuarterHourButton() {
        quarterHour_Btn.click();
        return new TravelModeScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on half hour button
     *
     * @return TravelModeScreen
     */
    public TravelModeScreen clickOnHalfHourButton() {
        halfHour_Btn.click();
        return new TravelModeScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on hour button
     *
     * @return TravelModeScreen
     */
    public TravelModeScreen clickOnHourButton() {
        hour_Btn.click();
        return new TravelModeScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on two hours button
     *
     * @return TravelModeScreen
     */
    public TravelModeScreen clickOnTwoHoursButton() {
        twoHours_Btn.click();
        return new TravelModeScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on three hours button
     *
     * @return TravelModeScreen
     */
    public TravelModeScreen clickOnThreeHoursButton() {
        threeHours_Btn.click();
        return new TravelModeScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on four hours button
     *
     * @return TravelModeScreen
     */
    public TravelModeScreen clickOnFourHoursButton() {
        fourHours_Btn.click();
        return new TravelModeScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on five hours button
     *
     * @return TravelModeScreen
     */
    public TravelModeScreen clickOnFiveHoursButton() {
        fiveHours_Btn.click();
        return new TravelModeScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
