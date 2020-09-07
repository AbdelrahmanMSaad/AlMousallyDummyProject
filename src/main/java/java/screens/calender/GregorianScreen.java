package java.screens.calender;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GregorianScreen extends CalenderScreen {
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
     * /**
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
     * This method is to click on hijri calender button
     *
     * @return HijriScreen
     */
    public HijriScreen clickOnHijriCalenderButton() {
        wait.until(ExpectedConditions.visibilityOf(hijriCalenderButton));
        hijriCalenderButton.click();
        return new HijriScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to check if the gregorian button is selected
     *
     * @return boolean
     */
    public boolean isGregorianCalenderSelected(){
        wait.until(ExpectedConditions.visibilityOf(gregorianCalenderButton));
        return gregorianCalenderButton.isSelected();
        //TODO : isSelected doesn't work
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
     * @return current month as a string
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
