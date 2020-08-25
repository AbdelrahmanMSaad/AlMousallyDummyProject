package java.Screens.calender;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HijriScreen extends CalenderScreen {
    @AndroidFindBy(id = "com.moslay:id/tv_currnet_month")
    private AndroidElement currentMonthTxt_TxtView;
    @AndroidFindBy(id = "com.moslay:id/gv_calendrview")
    private AndroidElement calenderElement_Element;
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
     * This method is to click on Navigation Drawer Button
     *
     * @return navigation drawer screen
     */
    public void clickOnNavigationDrawerButton() {
        navigationDrawer_Btn.click();
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
        hijriDateCorrection_Btn.click();
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
        return hijriCalender_Btn.isSelected();
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
        gregorianCalender_Btn.click();
        return new GregorianScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on previous month button
     */
    public void clickOnPreviousMonthButton() {
        prevMonth_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on next month button
     */
    public void clickOnNextMonthButton() {
        nextMonth_Btn.click();
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
        return currentMonthTxt_TxtView.getText();
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
        return calenderElement_Element.isDisplayed();
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
        return (listEvents_Element.isDisplayed());
    }
    /**
     * *********************************************************************************************************************************************
     */
}
