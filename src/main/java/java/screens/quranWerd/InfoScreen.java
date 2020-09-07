package java.screens.quranWerd;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;

public class InfoScreen extends Base {
    String expectedTitle = "ورد القران";
    @AndroidFindBy(id = "com.moslay:id/img_menu")
    private AndroidElement navigationDrawer_Btn;
    @AndroidFindBy(id = "com.moslay:id/Azkar_menu_Header")
    private AndroidElement screenTitle_Text;
    @AndroidFindBy(id = "com.moslay:id/delete_khtma")
    private AndroidElement delete_Btn;
    @AndroidFindBy(id = "com.moslay:id/pause_khtma")
    private AndroidElement pause_Btn;

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
     * This method is to click on navigation drawer button
     *
     * @return navigation drawer screen
     */
    public void clickOnNavigationDrawerButton() {
        navigationDrawer_Btn.click();
        //This method returns navigation drawer method with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on pause button and returns InfoScreen_PopUpScreen
     *
     * @return InfoScreen_PopUpScreen
     */
    public InfoScreen_PopUpScreen clickOnPauseButton() {
        pause_Btn.click();
        return new InfoScreen_PopUpScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on delete button and returns InfoScreen_PopUpScreen
     *
     * @return InfoScreen_PopUpScreen
     */
    public InfoScreen_PopUpScreen clickOnDeleteButton() {
        delete_Btn.click();
        return new InfoScreen_PopUpScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
