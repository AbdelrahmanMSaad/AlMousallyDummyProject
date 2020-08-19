package java.Screens.calender;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

import java.base.Base;
import java.utilities.TestUtils;

public class CalenderHijriDateCorrectionScreen extends Base {
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")
    private AndroidElement screenTitleTxt_Text;

    @AndroidFindBy(id = "com.moslay:id/tv_hegry_correction")
    private AndroidElement dateTxt_TxtView;

    @AndroidFindBy(id = "com.moslay:id/ll_correction_m_3")
    private AndroidElement correctionMinusThreeButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/ll_correction_m_2")
    private AndroidElement correctionMinusTwoButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/ll_correction_m_1")
    private AndroidElement correctionMinusOneButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/ll_correction_0")
    private AndroidElement correctionZeroButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/ll_correction_1")
    private AndroidElement correctionPlusOneButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/ll_correction_2")
    private AndroidElement correctionPlusTwoButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/ll_correction_3")
    private AndroidElement correctionPlusThreeButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/tv_cancel_correction")
    private AndroidElement cancelButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/tv_save_correction")
    private AndroidElement saveButton_Btn;

    String expectedTitle = "تصحيح التاريخ الهجرى";
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return the screen's actual title as a string
     *
     * @return Screen title as a string
     */
    public String returnActualScreenTitle() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, screenTitleTxt_Text);
        return screenTitleTxt_Text.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return the current date as a string
     *
     * @return current date as a string
     */
    public String returnCurrentDateInString() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, dateTxt_TxtView);
        return dateTxt_TxtView.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on -3 button
     */
    public void clickOnMinusThreeButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, correctionMinusThreeButton_Btn);
        correctionMinusThreeButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on -2 button
     */
    public void clickOnMinusTwoButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, correctionMinusTwoButton_Btn);
        correctionMinusTwoButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on -1 button
     */
    public void clickOnMinusOneButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, correctionMinusOneButton_Btn);
        correctionMinusOneButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on zero button
     */
    public void clickOnZeroButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, correctionZeroButton_Btn);
        correctionZeroButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on +1 button
     */
    public void clickOnPlusOneButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, correctionPlusOneButton_Btn);
        correctionPlusOneButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on +2 button
     */
    public void clickOnPlusTwoButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, correctionPlusTwoButton_Btn);
        correctionPlusTwoButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on +3 button
     */
    public void clickOnPlusThreeButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, correctionPlusThreeButton_Btn);
        correctionPlusThreeButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on save button
     */
    public void clickOnSaveButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, saveButton_Btn);
        saveButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on cancel button
     */
    public void clickOnCancelButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, cancelButton_Btn);
        cancelButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
