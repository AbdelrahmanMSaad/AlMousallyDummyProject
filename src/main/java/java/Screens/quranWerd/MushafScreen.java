package java.Screens.quranWerd;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;

import java.base.Base;
import java.utilities.TestUtils;

public class MushafScreen extends Base {
    String expectedTitle = "ورد القران";
    @AndroidFindBy(id = "com.moslay:id/im_back")
    private AndroidElement back_Btn;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement screenTitle_Text;
    @AndroidFindBy(id = "com.moslay:id/tb_turn_screen_on")
    private AndroidElement screenOn_Btn;
    @AndroidFindBy(id = "com.moslay:id/im_download_moshaf")
    private AndroidElement browsingMushaf_Btn;

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
     * This method is to click on back button and returns AddedScreen
     *
     * @return AddedScreen
     */
    public AddedScreen clickOnBackButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, back_Btn);
        back_Btn.click();
        return new AddedScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on Screen On Button
     */
    public void clickOnScreenOnButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, screenOn_Btn);
        screenOn_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on mushaf browse and returns Mushaf_BrowseScreen
     *
     * @return Mushaf_BrowseScreen
     */
    public Mushaf_BrowseScreen clickOnMushafBrowseButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, browsingMushaf_Btn);
        browsingMushaf_Btn.click();
        return new Mushaf_BrowseScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to scroll to next page in the mushaf
     */
    public void scrollToNextPage() {
        PointOption options1 = new PointOption().withCoordinates((int) (windowSize.width * .2), (int) (windowSize.height * .5));
        PointOption options2 = new PointOption().withCoordinates((int) (windowSize.width * .8), (int) (windowSize.height * .5));
        TestUtils.scrollByPoints(options1, options2);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to scroll to next page in the mushaf
     */
    public void scrollToPreviousPage() {
        PointOption options1 = new PointOption().withCoordinates((int) (windowSize.width * .8), (int) (windowSize.height * .5));
        PointOption options2 = new PointOption().withCoordinates((int) (windowSize.width * .2), (int) (windowSize.height * .5));
        TestUtils.scrollByPoints(options1, options2);
    }
    /**
     * *********************************************************************************************************************************************
     */
}
