package java.Screens.calender;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.utilities.TestUtils;

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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, screenTitle_Text);
        return screenTitle_Text.getText();
    }

    /**
     * *********************************************************************************************************************************************
     * /**
     * This method is to click on navigation drawer button
     *
     * @return navigation drawer screen
     */
    public void clickOnNavigationDrawerButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, navigationDrawer_Btn);
        navigationDrawer_Btn.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, hijriDateCorrection_Btn);
        hijriDateCorrection_Btn.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, hijriCalender_Btn);
        hijriCalender_Btn.click();
        return new HijriScreen();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, gregorianCalender_Btn);
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, prevMonth_Btn);
        prevMonth_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on next month button
     */
    public void clickOnNextMonthButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, nextMonth_Btn);
        nextMonth_Btn.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, currentMonthText);
        return currentMonthText.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to check if the calender is displayed
     */
    public boolean isCalenderDisplayed() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, calenderElement);
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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, listEvents_Element);
        return (listEvents_Element.isDisplayed());
    }
    /**
     * *********************************************************************************************************************************************
     */
}
