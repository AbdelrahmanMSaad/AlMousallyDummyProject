package java.Screens.werdAlMohasba;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, close_Btn);
        close_Btn.click();
        return new WerdAlMohasbaScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
