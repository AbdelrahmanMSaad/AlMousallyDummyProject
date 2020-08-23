package java.Screens.calender;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class GregorianScreen extends Base {
    String expectedTitle = "التقويم";
    @AndroidFindBy(id = "com.moslay:id/img_more")
    private AndroidElement navigationDrawerButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/tv_hegry_date")
    private AndroidElement screenTitleTxt_Text;
    @AndroidFindBy(id = "com.moslay:id/openCorrectionImageView")
    private AndroidElement hijriDateCorrectionButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/tv_hegry_tab")
    private AndroidElement hijriCalenderButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/tv_melady_tab")
    private AndroidElement gregorianCalenderButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/im_prev_month")
    private AndroidElement prevMonthButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/tv_currnet_month")
    private AndroidElement currentMonthTxt_TxtView;
    @AndroidFindBy(id = "com.moslay:id/im_next_month")
    private AndroidElement nextMonthButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/gv_calendrview")
    private AndroidElement calenderElement_Element;
    @AndroidFindBy(id = "com.moslay:id/lv_listevents")
    private AndroidElement listEventsElement_Element;
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
     * /**
     * This method is to click on navigation drawer button
     *
     * @return navigation drawer screen
     */
    public void clickOnNavigationDrawerButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, navigationDrawerButton_Btn);
        navigationDrawerButton_Btn.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, hijriDateCorrectionButton_Btn);
        hijriDateCorrectionButton_Btn.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, hijriCalenderButton_Btn);
        hijriCalenderButton_Btn.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, gregorianCalenderButton_Btn);
        gregorianCalenderButton_Btn.click();
        return new GregorianScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on previous month button
     */
    public void clickOnPreviousMonthButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, prevMonthButton_Btn);
        prevMonthButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on next month button
     */
    public void clickOnNextMonthButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, nextMonthButton_Btn);
        nextMonthButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return the current month as a string
     *
     * @return current month as a string
     */
    public String returnCurrentMonthInString() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, currentMonthTxt_TxtView);
        return currentMonthTxt_TxtView.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to check the calender existance
     */
    public void checkCalenderExistance() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, calenderElement_Element);
        calenderElement_Element.isDisplayed();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to check the events list existance
     *
     * @return bool represents if the list of events is displayed
     */
    public boolean checkEventsListExistance() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, listEventsElement_Element);
        return (listEventsElement_Element.isDisplayed());
    }
    /**
     * *********************************************************************************************************************************************
     */
}
