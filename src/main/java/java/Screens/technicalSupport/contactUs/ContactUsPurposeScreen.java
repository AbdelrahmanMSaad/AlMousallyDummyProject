package java.Screens.technicalSupport.contactUs;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class ContactUsPurposeScreen extends Base {
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]")
    private AndroidElement technicalSupport_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    private AndroidElement suggestions_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
    private AndroidElement marketingAndSales_Btn;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on Technical support button and returns ContactUsScreen
     *
     * @return ContactUsScreen
     */
    public ContactUsScreen clickOnTechnicalSupportButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, technicalSupport_Btn);
        technicalSupport_Btn.click();
        return new ContactUsScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on Suggestions button and returns ContactUsScreen
     *
     * @return ContactUsScreen
     */
    public ContactUsScreen clickOnSuggestionsButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, suggestions_Btn);
        suggestions_Btn.click();
        return new ContactUsScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on Sales and Marketing button and returns TechnicalSuppor_ContactUsScreen
     *
     * @return ContactUsScreen
     */
    public ContactUsScreen clickOnSalesAndMarketingButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, marketingAndSales_Btn);
        marketingAndSales_Btn.click();
        return new ContactUsScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
