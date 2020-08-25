package java.Screens.calender;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class HijriDateCorrectionScreen extends Base {
    String expectedTitle = "تصحيح التاريخ الهجرى";
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")
    private AndroidElement screenTitle_Text;
    @AndroidFindBy(id = "com.moslay:id/tv_hegry_correction")
    private AndroidElement date_Text;
    @AndroidFindBy(id = "com.moslay:id/ll_correction_m_3")
    private AndroidElement correctionMinusThree_Btn;
    @AndroidFindBy(id = "com.moslay:id/ll_correction_m_2")
    private AndroidElement correctionMinusTwo_Btn;
    @AndroidFindBy(id = "com.moslay:id/ll_correction_m_1")
    private AndroidElement correctionMinusOne_Btn;
    @AndroidFindBy(id = "com.moslay:id/ll_correction_0")
    private AndroidElement correctionZero_Btn;
    @AndroidFindBy(id = "com.moslay:id/ll_correction_1")
    private AndroidElement correctionPlusOne_Btn;
    @AndroidFindBy(id = "com.moslay:id/ll_correction_2")
    private AndroidElement correctionPlusTwo_Btn;
    @AndroidFindBy(id = "com.moslay:id/ll_correction_3")
    private AndroidElement correctionPlusThree_Btn;
    @AndroidFindBy(id = "com.moslay:id/tv_cancel_correction")
    private AndroidElement cancel_Btn;
    @AndroidFindBy(id = "com.moslay:id/tv_save_correction")
    private AndroidElement save_Btn;
    /**
     * *********************************************************************************************************************************************
     */

    /**
     * This method is to return the screen's actual title as a string
     *
     * @return Screen title as a string
     */
    public String getActualScreenTitle() {
        return screenTitle_Text.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return the current date as a string
     *
     * @return current date as a string
     */
    public String getCurrentDateInString() {
        return date_Text.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on -3 button
     */
    public void clickOnMinusThreeButton() { correctionMinusThree_Btn.click(); }
    /**
     * This method is to click on -2 button
     */
    public void clickOnMinusTwoButton() {
        correctionMinusTwo_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on -1 button
     */
    public void clickOnMinusOneButton() {
        correctionMinusOne_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on zero button
     */
    public void clickOnZeroButton() {
        correctionZero_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on +1 button
     */
    public void clickOnPlusOneButton() {
        correctionPlusOne_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on +2 button
     */
    public void clickOnPlusTwoButton() {
        correctionPlusTwo_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on +3 button
     */
    public void clickOnPlusThreeButton() {
        correctionPlusThree_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on save button
     */
    public void clickOnSaveButton() {
        save_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on cancel button
     */
    public void clickOnCancelButton() {
        cancel_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
