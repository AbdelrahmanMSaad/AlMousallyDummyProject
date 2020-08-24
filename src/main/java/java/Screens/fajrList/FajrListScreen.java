package java.Screens.fajrList;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class FajrListScreen extends Base {
    String expectedTitle = "قائمة الفجر";
    @AndroidFindBy(id = "com.moslay:id/img_more")
    private AndroidElement navigationDrawer_Btn;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView")
    private AndroidElement screenTitle_Text;
    @AndroidFindBy(id = "com.moslay:id/im_fajr_list_add")
    private AndroidElement addElement_Btn;
    @AndroidFindBy(id = "com.moslay:id/im_fajr_list_delete")
    private AndroidElement deleteElement_Btn;
    @AndroidFindBy(id = "com.moslay:id/im_fajr_list_pause")
    private AndroidElement pause_Btn;
    @AndroidFindBy(id = "com.moslay:id/et_fajr_list_search")
    private AndroidElement searchBar_TextView;
    @AndroidFindBy(id = "com.moslay:id/txt_fagr_list_add")
    private AndroidElement addContact_Btn;
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
     * This method is to click on add element button
     */
    public void clickOnAddElementButton() {
        addElement_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on delete element button
     */
    public void clickOnDeleteElementButton() {
        deleteElement_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on pause button
     */
    public void clickOnPauseButton() {
        pause_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send text to search text field
     */
    public void sendTextToSearchBar(String text) {
        searchBar_TextView.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on add contact button
     */
    public void clickOnAddContactButton() {
        addContact_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
