package java.screens.calender;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class CalenderScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(id = "com.moslay:id/img_more")
    protected AndroidElement navigationDrawerButton;
    @AndroidFindBy(id = "com.moslay:id/tv_hegry_date")
    protected AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/openCorrectionImageView")
    protected AndroidElement hijriDateCorrectionButton;
    @AndroidFindBy(id = "com.moslay:id/tv_hegry_tab")
    protected AndroidElement hijriCalenderButton;
    @AndroidFindBy(id = "com.moslay:id/tv_melady_tab")
    protected AndroidElement gregorianCalenderButton;
    @AndroidFindBy(id = "com.moslay:id/im_prev_month")
    protected AndroidElement prevMonthButton;
    @AndroidFindBy(id = "com.moslay:id/im_next_month")
    protected AndroidElement nextMonthButton;
    @AndroidFindBy(id = "com.moslay:id/lv_listevents")
    protected AndroidElement listEventsElement;
}
