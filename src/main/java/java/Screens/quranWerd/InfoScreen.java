package java.Screens.quranWerd;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class InfoScreen extends Base {
    String expectedTitle = "ورد القران";
    @AndroidFindBy(id = "com.moslay:id/img_menu")
    private AndroidElement navigationDrawerButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/Azkar_menu_Header")
    private AndroidElement screenTitleTxt_Text;
    @AndroidFindBy(id = "com.moslay:id/delete_khtma")
    private AndroidElement deleteButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/pause_khtma")
    private AndroidElement pauseButton_Btn;

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
     * This method is to click on navigation drawer button
     *
     * @return navigation drawer screen
     */
    public void clickOnNavigationDrawerButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, navigationDrawerButton_Btn);
        navigationDrawerButton_Btn.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, pauseButton_Btn);
        pauseButton_Btn.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, deleteButton_Btn);
        deleteButton_Btn.click();
        return new InfoScreen_PopUpScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
