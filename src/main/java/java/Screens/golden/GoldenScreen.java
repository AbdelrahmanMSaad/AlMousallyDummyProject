package java.Screens.golden;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class GoldenScreen extends Base {
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement screenTitle_Text;

    @AndroidFindBy(id = "com.moslay:id/subscribe")
    private AndroidElement subscribe_Btn;

    @AndroidFindBy(id = "com.moslay:id/renew_subscribe")
    private AndroidElement renewSubscribtion_Btn;

    @AndroidFindBy(id = "com.moslay:id/list")
    private AndroidElement plansList_Element;

    @AndroidFindBy(id = "com.moslay:id/privacy_policy")
    private AndroidElement privacyPolicy_Btn;

    @AndroidFindBy(id = "com.moslay:id/terms_conditions")
    private AndroidElement termsAndConditions_Btn;
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
     * This method is to click on subscribe button
     */
    public void clickOnSubscribeButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, subscribe_Btn);
        subscribe_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on renew subscribtion button
     */
    public void clickOnRenewSubscribtion() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, renewSubscribtion_Btn);
        renewSubscribtion_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on privacy and policy button
     */
    public void clickOnPrivacyAndPolicyButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, privacyPolicy_Btn);
        privacyPolicy_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on terms and condition button
     */
    public void clickOnTermsAndConditionsButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, termsAndConditions_Btn);
        termsAndConditions_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
