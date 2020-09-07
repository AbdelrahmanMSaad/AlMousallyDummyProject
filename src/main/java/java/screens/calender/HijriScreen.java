package java.screens.calender;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HijriScreen extends CalenderScreen {
    @AndroidFindBy(id = "com.moslay:id/tv_currnet_month")
    private AndroidElement currentMonthText;
    @AndroidFindBy(id = "com.moslay:id/gv_calendrview")
    private AndroidElement calenderElement;
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
     * This method is to click on Navigation Drawer Button
     *
     * @return navigation drawer screen
     */
    public void clickOnNavigationDrawerButton() {
        wait.until(ExpectedConditions.visibilityOf(navigationDrawerButton));
        navigationDrawerButton.click();
        //This method returns navigation drawer screen with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on hijri date correction button
     *
     * @return HijriDateCorrectionScreen
     */
    public HijriDateCorrectionScreen clickOnHijriDateCorrectionButton() {
        wait.until(ExpectedConditions.visibilityOf(hijriDateCorrectionButton));
        hijriDateCorrectionButton.click();
        return new HijriDateCorrectionScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to check if the hijri button is selected
     *
     * @return boolean
     */
    public boolean isHijriCalenderSelected() {
        wait.until(ExpectedConditions.visibilityOf(hijriCalenderButton));
        return hijriCalenderButton.isSelected();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on gregorian calender button
     *
     * @return GregorianScreen
     */
    public GregorianScreen clickOnGregorianCalenderButton() {
        wait.until(ExpectedConditions.visibilityOf(gregorianCalenderButton));
        gregorianCalenderButton.click();
        return new GregorianScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on previous month button
     */
    public void clickOnPreviousMonthButton() {
        wait.until(ExpectedConditions.visibilityOf(prevMonthButton));
        prevMonthButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on next month button
     */
    public void clickOnNextMonthButton() {
        wait.until(ExpectedConditions.visibilityOf(nextMonthButton));
        nextMonthButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return the current month as a string
     *
     * @return the current month as a string
     */
    public String getCurrentMonthInString() {
        wait.until(ExpectedConditions.visibilityOf(currentMonthText));
        return currentMonthText.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to check if the calender is displayed
     *
     * @return bool representing if th calender exists or not
     */
    public boolean isCalenderDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(calenderElement));
        return calenderElement.isDisplayed();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to check the events list existance
     *
     * @return bool represents if the list of events is displayed
     */
    public boolean isEventsLisDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(listEventsElement));
        return (listEventsElement.isDisplayed());
    }
    /**
     * *********************************************************************************************************************************************
     */
}
