package java.screens.golden;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;

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
        return screenTitle_Text.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on subscribe button
     */
    public void clickOnSubscribeButton() {
        subscribe_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on renew subscribtion button
     */
    public void clickOnRenewSubscribtion() {
        renewSubscribtion_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on privacy and policy button
     */
    public void clickOnPrivacyAndPolicyButton() {
        privacyPolicy_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on terms and condition button
     */
    public void clickOnTermsAndConditionsButton() {
        termsAndConditions_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
