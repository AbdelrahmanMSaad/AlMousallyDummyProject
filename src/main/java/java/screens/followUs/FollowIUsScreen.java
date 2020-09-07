package java.screens.followUs;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;

public class FollowIUsScreen extends Base {
    String expectedTitle = "تابعنا";
    @AndroidFindBy(id = "com.moslay:id/img_more")
    private AndroidElement navigationDrawer_Btn;
    @AndroidFindBy(id = "com.moslay:id/my_resources_header")
    private AndroidElement screenTitle_Text;
    @AndroidFindBy(id = "com.moslay:id/follow_us_fb")
    private AndroidElement facebook_Btn;
    @AndroidFindBy(id = "com.moslay:id/settings_twitter")
    private AndroidElement twitter_Btn;
    @AndroidFindBy(id = "com.moslay:id/settings_instagram")
    private AndroidElement youtube_Btn;
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
     * This method is click on facebook button
     */
    public void clickOnFacebookButton() {
        facebook_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on twitter button
     */
    public void clickOnTwitterButton() {
        twitter_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on youtube button
     */
    public void clickOnYouTubeButton() {
        youtube_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
