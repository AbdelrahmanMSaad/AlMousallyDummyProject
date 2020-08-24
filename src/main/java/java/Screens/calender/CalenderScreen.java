package java.Screens.calender;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;

public class CalenderScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/img_more")
    protected AndroidElement navigationDrawer_Btn;
    @AndroidFindBy(id = "com.moslay:id/tv_hegry_date")
    protected AndroidElement screenTitle_Text;
    @AndroidFindBy(id = "com.moslay:id/openCorrectionImageView")
    protected AndroidElement hijriDateCorrection_Btn;
    @AndroidFindBy(id = "com.moslay:id/tv_hegry_tab")
    protected AndroidElement hijriCalender_Btn;
    @AndroidFindBy(id = "com.moslay:id/tv_melady_tab")
    protected AndroidElement gregorianCalender_Btn;
    @AndroidFindBy(id = "com.moslay:id/im_prev_month")
    protected AndroidElement prevMonth_Btn;
    @AndroidFindBy(id = "com.moslay:id/im_next_month")
    protected AndroidElement nextMonth_Btn;
    @AndroidFindBy(id = "com.moslay:id/lv_listevents")
    protected AndroidElement listEvents_Element;
}
