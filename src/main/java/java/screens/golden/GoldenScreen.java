package java.screens.golden;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class GoldenScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement screenTitleText;

    @AndroidFindBy(id = "com.moslay:id/subscribe")
    private AndroidElement subscribeButton;

    @AndroidFindBy(id = "com.moslay:id/renew_subscribe")
    private AndroidElement renewSubscribtionButton;

    @AndroidFindBy(id = "com.moslay:id/list")
    private AndroidElement plansListElement;

    @AndroidFindBy(id = "com.moslay:id/privacy_policy")
    private AndroidElement privacyPolicyButton;

    @AndroidFindBy(id = "com.moslay:id/terms_conditions")
    private AndroidElement termsAndConditionsButton;
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
     * This method is to click on subscribe button
     */
    public void clickOnSubscribeButton() {
        wait.until(ExpectedConditions.visibilityOf(subscribeButton));
        subscribeButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on renew subscribtion button
     */
    public void clickOnRenewSubscribtion() {
        wait.until(ExpectedConditions.visibilityOf(renewSubscribtionButton));
        renewSubscribtionButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on privacy and policy button
     */
    public void clickOnPrivacyAndPolicyButton() {
        wait.until(ExpectedConditions.visibilityOf(privacyPolicyButton));
        privacyPolicyButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on terms and condition button
     */
    public void clickOnTermsAndConditionsButton() {
        wait.until(ExpectedConditions.visibilityOf(termsAndConditionsButton));
        termsAndConditionsButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
