package java.screens.quranWerd.addWerd;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class SetAlertTimeScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.EditText")
    private AndroidElement minutesBarTextView;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.EditText")
    private AndroidElement hoursBarTextView;

    @AndroidFindBy(id = "android:id/button2")
    private AndroidElement cancelButton;

    @AndroidFindBy(id = "android:id/button1")
    private AndroidElement saveButton;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send text to minutes text field
     *
     * @param numberOfMinutes number of minutes sent as a string
     */
    public void sendKeysToMinutesTextField(String numberOfMinutes) {
        wait.until(ExpectedConditions.visibilityOf(minutesBarTextView));
        minutesBarTextView.sendKeys(numberOfMinutes);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send text to hours text field
     *
     * @param numberOfHours number of hours sent as a string
     */
    public void sendKeysToHoursTextField(String numberOfHours) {
        wait.until(ExpectedConditions.visibilityOf(hoursBarTextView));
        hoursBarTextView.sendKeys(numberOfHours);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on cancel button and returns AddWerdScreen
     *
     * @return AddWerdScreen
     */
    public AddWerdScreen clickOnCancelButton() {
        wait.until(ExpectedConditions.visibilityOf(cancelButton));
        cancelButton.click();
        return new AddWerdScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on save button and returns AddWerdScreen
     *
     * @return AddWerdScreen
     */
    public AddWerdScreen clickOnSaveButton() {
        wait.until(ExpectedConditions.visibilityOf(saveButton));
        saveButton.click();
        return new AddWerdScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
