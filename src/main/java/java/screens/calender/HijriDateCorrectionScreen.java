package java.screens.calender;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class HijriDateCorrectionScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    String expectedTitle = "تصحيح التاريخ الهجرى";
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/tv_hegry_correction")
    private AndroidElement dateText;
    @AndroidFindBy(id = "com.moslay:id/ll_correction_m_3")
    private AndroidElement correctionMinusThreeButton;
    @AndroidFindBy(id = "com.moslay:id/ll_correction_m_2")
    private AndroidElement correctionMinusTwoButton;
    @AndroidFindBy(id = "com.moslay:id/ll_correction_m_1")
    private AndroidElement correctionMinusOneButton;
    @AndroidFindBy(id = "com.moslay:id/ll_correction_0")
    private AndroidElement correctionZeroButton;
    @AndroidFindBy(id = "com.moslay:id/ll_correction_1")
    private AndroidElement correctionPlusOneButton;
    @AndroidFindBy(id = "com.moslay:id/ll_correction_2")
    private AndroidElement correctionPlusTwoButton;
    @AndroidFindBy(id = "com.moslay:id/ll_correction_3")
    private AndroidElement correctionPlusThreeButton;
    @AndroidFindBy(id = "com.moslay:id/tv_cancel_correction")
    private AndroidElement cancelButton;
    @AndroidFindBy(id = "com.moslay:id/tv_save_correction")
    private AndroidElement saveButton;
    /**
     * *********************************************************************************************************************************************
     */

    /**
     * This method is to return the screen's actual title as a string
     *
     * @return Screen title as a string
     */
    public String getActualScreenTitle() {
        wait.until(ExpectedConditions.visibilityOf(screenTitleText));
        return screenTitleText.getText();
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
        wait.until(ExpectedConditions.visibilityOf(dateText));
        return dateText.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on -3 button
     */
    public void clickOnMinusThreeButton() {
        wait.until(ExpectedConditions.visibilityOf(correctionMinusThreeButton));
        correctionMinusThreeButton.click(); }
    /**
     * This method is to click on -2 button
     */
    public void clickOnMinusTwoButton() {
        wait.until(ExpectedConditions.visibilityOf(correctionMinusTwoButton));
        correctionMinusTwoButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on -1 button
     */
    public void clickOnMinusOneButton() {
        wait.until(ExpectedConditions.visibilityOf(correctionMinusOneButton));
        correctionMinusOneButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on zero button
     */
    public void clickOnZeroButton() {
        wait.until(ExpectedConditions.visibilityOf(correctionZeroButton));
        correctionZeroButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on +1 button
     */
    public void clickOnPlusOneButton() {
        wait.until(ExpectedConditions.visibilityOf(correctionPlusOneButton));
        correctionPlusOneButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on +2 button
     */
    public void clickOnPlusTwoButton() {
        wait.until(ExpectedConditions.visibilityOf(correctionPlusTwoButton));
        correctionPlusTwoButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on +3 button
     */
    public void clickOnPlusThreeButton() {
        wait.until(ExpectedConditions.visibilityOf(correctionPlusThreeButton));
        correctionPlusThreeButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on save button
     */
    public void clickOnSaveButton() {
        wait.until(ExpectedConditions.visibilityOf(saveButton));
        saveButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on cancel button
     */
    public void clickOnCancelButton() {
        wait.until(ExpectedConditions.visibilityOf(cancelButton));
        cancelButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
