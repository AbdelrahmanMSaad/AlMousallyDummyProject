package java.Screens.quranWerd.addWerd;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class SetAlertTimeScreen extends Base {
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.EditText")
    private AndroidElement minutesBar_TextView;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.EditText")
    private AndroidElement hoursBar_TextView;

    @AndroidFindBy(id = "android:id/button2")
    private AndroidElement cancel_Btn;

    @AndroidFindBy(id = "android:id/button1")
    private AndroidElement save_Btn;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send text to minutes text field
     *
     * @param numberOfMinutes number of minutes sent as a string
     */
    public void sendKeysToMinutesTextField(String numberOfMinutes) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, minutesBar_TextView);
        minutesBar_TextView.sendKeys(numberOfMinutes);
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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, hoursBar_TextView);
        hoursBar_TextView.sendKeys(numberOfHours);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, cancel_Btn);
        cancel_Btn.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, save_Btn);
        save_Btn.click();
        return new AddWerdScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
