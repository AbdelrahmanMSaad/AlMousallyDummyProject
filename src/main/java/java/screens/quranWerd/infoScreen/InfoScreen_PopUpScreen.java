package java.screens.quranWerd.infoScreen;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class InfoScreen_PopUpScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(id = "com.moslay:id/warning_cancel")
    private AndroidElement cancelButton;

    @AndroidFindBy(id = "com.moslay:id/warning_ok")
    private AndroidElement okButton;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on ok button
     *
     * @return InfoScreen
     */
    public InfoScreen clickOnOkButton() {
        wait.until(ExpectedConditions.visibilityOf(okButton));
        okButton.click();
        return new InfoScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on cancel button
     *
     * @return InfoScreen
     */
    public InfoScreen clickOnCancelButton() {
        wait.until(ExpectedConditions.visibilityOf(cancelButton));
        cancelButton.click();
        return new InfoScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
