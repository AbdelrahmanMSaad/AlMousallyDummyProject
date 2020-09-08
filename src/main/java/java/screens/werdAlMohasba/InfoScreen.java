package java.screens.werdAlMohasba;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class InfoScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(id = "com.moslay:id/werd_close")
    private AndroidElement closeButton;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on close button and returns WerdAlMohasbaScreen
     *
     * @return WerdAlMohasbaScreen
     */
    public WerdAlMohasbaScreen clickOnCloseButton() {
        wait.until(ExpectedConditions.visibilityOf(closeButton));
        closeButton.click();
        return new WerdAlMohasbaScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
