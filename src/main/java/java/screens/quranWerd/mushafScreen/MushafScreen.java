package java.screens.quranWerd.mushafScreen;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;
import java.screens.quranWerd.quranWerdMainScreen.AddedScreen;
import java.utilities.TestUtils;

public class MushafScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    String expectedTitle = "ورد القران";
    @AndroidFindBy(id = "com.moslay:id/im_back")
    private AndroidElement backButton;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/tb_turn_screen_on")
    private AndroidElement screenOnButton;
    @AndroidFindBy(id = "com.moslay:id/im_download_moshaf")
    private AndroidElement browsingMushafButton;

    /**
     * *********************************************************************************************************************************************
     */

    /**
     * This method is to return the screen's actual title as a string
     *
     * @return Screen title as a string
     */
    public String getActualScreenTitle() {
        wait.until(ExpectedConditions.visibilityOf(screenTitleText));
        return screenTitleText.getText();
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
        wait.until(ExpectedConditions.visibilityOf(backButton));
        backButton.click();
        return new AddedScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on Screen On Button
     */
    public void clickOnScreenOnButton() {
        wait.until(ExpectedConditions.visibilityOf(screenOnButton));
        screenOnButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(browsingMushafButton));
        browsingMushafButton.click();
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
