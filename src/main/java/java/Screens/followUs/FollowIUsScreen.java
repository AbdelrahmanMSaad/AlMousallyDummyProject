package java.Screens.followUs;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

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
     * This method is click on facebook button
     */
    public void clickOnFacebookButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, facebook_Btn);
        facebook_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on twitter button
     */
    public void clickOnTwitterButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, twitter_Btn);
        twitter_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on youtube button
     */
    public void clickOnYouTubeButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, youtube_Btn);
        youtube_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
