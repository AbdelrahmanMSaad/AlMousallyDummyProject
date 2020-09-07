package java.screens.werdAlMohasba;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;

public class InfoScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/werd_close")
    private AndroidElement close_Btn;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on close button and returns WerdAlMohasbaScreen
     *
     * @return WerdAlMohasbaScreen
     */
    public WerdAlMohasbaScreen clickOnCloseButton() {
        close_Btn.click();
        return new WerdAlMohasbaScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
