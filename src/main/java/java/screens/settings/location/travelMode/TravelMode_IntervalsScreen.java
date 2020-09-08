package java.screens.settings.location.travelMode;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class TravelMode_IntervalsScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(id = "android:id/select_dialog_listview")
    private AndroidElement intervalsListElement;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[1]")
    private AndroidElement quarterHourButton;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    private AndroidElement halfHourButton;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
    private AndroidElement hourButton;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[4]")
    private AndroidElement twoHoursButton;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[5]")
    private AndroidElement threeHoursButton;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[6]")
    private AndroidElement fourHoursButton;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[7]")
    private AndroidElement fiveHoursButton;
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on quarter hour button
     *
     * @return TravelModeScreen
     */
    public TravelModeScreen clickOnQuarterHourButton() {
        wait.until(ExpectedConditions.visibilityOf(quarterHourButton));
        quarterHourButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(halfHourButton));
        halfHourButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(hourButton));
        hourButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(twoHoursButton));
        twoHoursButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(threeHoursButton));
        threeHoursButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(fourHoursButton));
        fourHoursButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(fiveHoursButton));
        fiveHoursButton.click();
        return new TravelModeScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
