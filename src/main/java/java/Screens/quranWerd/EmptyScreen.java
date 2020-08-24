package java.Screens.quranWerd;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.Screens.quranWerd.addWerd.AddWerdScreen;
import java.base.Base;
import java.utilities.TestUtils;

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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, screenTitle_Text);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, navigationDrawer_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, info_btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, readFromMoshaf_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, addWerd_Btn);
        addWerd_Btn.click();
        return new AddWerdScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
