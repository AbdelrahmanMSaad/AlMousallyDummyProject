package java.screens.settings.location.otherMethods;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class SearchOnlineScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/autocomplete_places")
    private AndroidElement searchBarText;
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to assert the screen
     *
     * @return actual title as a string
     */
    public String getScreenTitle() {
        wait.until(ExpectedConditions.visibilityOf(screenTitleText));
        return screenTitleText.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send keys to the search bar
     *
     * @param text to be sent to the search bar
     */
    public void sendTextToSearchBar(String text) {
        wait.until(ExpectedConditions.visibilityOf(searchBarText));
        searchBarText.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to assert what has been sent to the search bar
     *
     * @return the text within the search bar as a string
     */
    public String getTextFromSearchBar() {
        wait.until(ExpectedConditions.visibilityOf(searchBarText));
        return searchBarText.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
