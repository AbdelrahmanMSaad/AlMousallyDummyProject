package java.Screens.settings.location.otherMethods;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class SearchOnlineScreen extends Base {
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement screenTitle_Text;

    @AndroidFindBy(id = "com.moslay:id/autocomplete_places")
    private AndroidElement searchBar_TextView;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to assert the screen
     *
     * @return actual title as a string
     */
    public String getScreenTitle() {
        return screenTitle_Text.getText();
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
        searchBar_TextView.sendKeys(text);
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
        return searchBar_TextView.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
