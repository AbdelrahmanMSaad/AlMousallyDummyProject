package java.Screens.quranWerd;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class QuranWerd_InfoScreen_PopUpScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/warning_cancel")
    private AndroidElement cancelButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/warning_ok")
    private AndroidElement okButton_Btn;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on ok button
     *
     * @return QuranWerd_InfoScreen
     */
    public QuranWerd_InfoScreen clickOnOkButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, okButton_Btn);
        okButton_Btn.click();
        return new QuranWerd_InfoScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on cancel button
     *
     * @return QuranWerd_InfoScreen
     */
    public QuranWerd_InfoScreen clickOnCancelButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, cancelButton_Btn);
        cancelButton_Btn.click();
        return new QuranWerd_InfoScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
