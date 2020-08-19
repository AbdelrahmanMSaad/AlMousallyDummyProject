package java.Screens.quranWerd;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class QuranWerd_EmptyScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/img_menu")
    private AndroidElement navigationDrawerButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/header_txt")
    private AndroidElement screenTitleTxt_Text;

    @AndroidFindBy(id = "com.moslay:id/fagr_help")
    private AndroidElement infoButton_btn;

    @AndroidFindBy(id = "com.moslay:id/werd_add_default_khatma")
    private AndroidElement readFromMoshafButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/werd_add_khatma")
    private AndroidElement addWerdButton;

    String expectedTitle = "ورد القران";
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
     * This method is to click on info button
     */
    public void clickOnInfoButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, infoButton_btn);
        infoButton_btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on read from mushaf button and returns QuranWerd_MushafScreen
     *
     * @return QuranWerd_MushafScreen
     */
    public QuranWerd_MushafScreen clickOnReadFromMushafButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, readFromMoshafButton_Btn);
        readFromMoshafButton_Btn.click();
        return new QuranWerd_MushafScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on add khatma button and returns QuranWerd_AddWerdScreen
     * @return QuranWerd_AddWerdScreen
     */
    public QuranWerd_AddWerdScreen clickOnAddWerdButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, addWerdButton);
        addWerdButton.click();
        return new QuranWerd_AddWerdScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
