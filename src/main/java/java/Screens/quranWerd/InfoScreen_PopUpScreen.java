package java.Screens.quranWerd;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class InfoScreen_PopUpScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/warning_cancel")
    private AndroidElement cancel_Btn;

    @AndroidFindBy(id = "com.moslay:id/warning_ok")
    private AndroidElement ok_Btn;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on ok button
     *
     * @return InfoScreen
     */
    public InfoScreen clickOnOkButton() {
        ok_Btn.click();
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
        cancel_Btn.click();
        return new InfoScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
