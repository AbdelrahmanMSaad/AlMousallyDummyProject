package java.Screens.golden;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class GoldenScreen extends Base {
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement screenTitleTxt_Text;

    @AndroidFindBy(id = "com.moslay:id/subscribe")
    private AndroidElement subscribeButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/renew_subscribe")
    private AndroidElement renewSubscribtionButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/list")
    private AndroidElement plansListElement_Element;

    @AndroidFindBy(id = "com.moslay:id/privacy_policy")
    private AndroidElement privacyPolicyButton_Btn;

    @AndroidFindBy(id = "com.moslay:id/terms_conditions")
    private AndroidElement termsAndConditionsButton_Btn;
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
     * This method is to click on subscribe button
     */
    public void clickOnSubscribeButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, subscribeButton_Btn);
        subscribeButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on renew subscribtion button
     */
    public void clickOnRenewSubscribtion() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, renewSubscribtionButton_Btn);
        renewSubscribtionButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on privacy and policy button
     */
    public void clickOnPrivacyAndPolicyButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, privacyPolicyButton_Btn);
        privacyPolicyButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on terms and condition button
     */
    public void clickOnTermsAndConditionsButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, termsAndConditionsButton_Btn);
        termsAndConditionsButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
