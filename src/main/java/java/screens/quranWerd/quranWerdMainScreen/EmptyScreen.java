package java.screens.quranWerd.quranWerdMainScreen;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.screens.quranWerd.addWerd.AddWerdScreen;
import java.base.Base;
import java.screens.quranWerd.mushafScreen.MushafScreen;

public class EmptyScreen extends Base {
    String expectedTitle = "ورد القران";
    @AndroidFindBy(id = "com.moslay:id/img_menu")
    private AndroidElement navigationDrawer_Btn;
    @AndroidFindBy(id = "com.moslay:id/header_txt")
    private AndroidElement screenTitle_Text;
    @AndroidFindBy(id = "com.moslay:id/fagr_help")
    private AndroidElement info_btn;
    @AndroidFindBy(id = "com.moslay:id/werd_add_default_khatma")
    private AndroidElement readFromMoshaf_Btn;
    @AndroidFindBy(id = "com.moslay:id/werd_add_khatma")
    private AndroidElement addWerd_Btn;
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
     * This method is to click on info button
     */
    public void clickOnInfoButton() {
        info_btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on read from mushaf button and returns MushafScreen
     *
     * @return MushafScreen
     */
    public MushafScreen clickOnReadFromMushafButton() {
        readFromMoshaf_Btn.click();
        return new MushafScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on add khatma button and returns AddWerdScreen
     *
     * @return AddWerdScreen
     */
    public AddWerdScreen clickOnAddWerdButton() {
        addWerd_Btn.click();
        return new AddWerdScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}