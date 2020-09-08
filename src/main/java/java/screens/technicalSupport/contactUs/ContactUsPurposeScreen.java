package java.screens.technicalSupport.contactUs;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class ContactUsPurposeScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]")
    private AndroidElement technicalSupportButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    private AndroidElement suggestionsButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
    private AndroidElement marketingAndSalesButton;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on Technical support button and returns ContactUsScreen
     *
     * @return ContactUsScreen
     */
    public ContactUsScreen clickOnTechnicalSupportButton() {
        wait.until(ExpectedConditions.visibilityOf(technicalSupportButton));
        technicalSupportButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(suggestionsButton));
        suggestionsButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(marketingAndSalesButton));
        marketingAndSalesButton.click();
        return new ContactUsScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
