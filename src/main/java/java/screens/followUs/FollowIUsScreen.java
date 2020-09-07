package java.screens.followUs;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class FollowIUsScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    String expectedTitle = "تابعنا";
    @AndroidFindBy(id = "com.moslay:id/img_more")
    private AndroidElement navigationDrawerButton;
    @AndroidFindBy(id = "com.moslay:id/my_resources_header")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/follow_us_fb")
    private AndroidElement facebookButton;
    @AndroidFindBy(id = "com.moslay:id/settings_twitter")
    private AndroidElement twitterButton;
    @AndroidFindBy(id = "com.moslay:id/settings_instagram")
    private AndroidElement youtubeButton;
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
     * This method is to click on navigation drawer button
     *
     * @return navigation drawer screen
     */
    public void clickOnNavigationDrawerButton() {
        wait.until(ExpectedConditions.visibilityOf(navigationDrawerButton));
        navigationDrawerButton.click();
        //This method returns navigation drawer method with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is click on facebook button
     */
    public void clickOnFacebookButton() {
        wait.until(ExpectedConditions.visibilityOf(facebookButton));
        facebookButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on twitter button
     */
    public void clickOnTwitterButton() {
        wait.until(ExpectedConditions.visibilityOf(twitterButton));
        twitterButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on youtube button
     */
    public void clickOnYouTubeButton() {
        wait.until(ExpectedConditions.visibilityOf(youtubeButton));
        youtubeButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
