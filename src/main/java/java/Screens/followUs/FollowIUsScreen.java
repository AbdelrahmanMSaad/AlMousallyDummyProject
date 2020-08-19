package java.Screens.followUs;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class FollowIUsScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/img_more")
    private AndroidElement navigationDrawerButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/my_resources_header")
    private AndroidElement screenTitleTxt_Text;

    @AndroidFindBy(id = "com.moslay:id/follow_us_fb")
    private AndroidElement facebookButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/settings_twitter")
    private AndroidElement twitterButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/settings_instagram")
    private AndroidElement youtubeButton_Btn;

    String expectedTitle = "تابعنا";
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
     * This method is click on facebook button
     */
    public void clickOnFacebookButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, facebookButton_Btn);
        facebookButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on twitter button
     */
    public void clickOnTwitterButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, twitterButton_Btn);
        twitterButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on youtube button
     */
    public void clickOnYouTubeButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, youtubeButton_Btn);
        youtubeButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
