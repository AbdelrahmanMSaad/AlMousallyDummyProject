package java.screens.settings.prayerTimesCorrection;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;

public class PrayerTimesCorrectionScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/img_menu")
    protected AndroidElement navigationDrawerBtn_Btn;

    @AndroidFindBy(id = "com.moslay:id/Azkar_menu_Header")
    protected AndroidElement screenGeneralTitleTxt_Text;

    @AndroidFindBy(id = "com.moslay:id/isha_time")
    protected AndroidElement ishaTimeElement_Element;

    @AndroidFindBy(id = "com.moslay:id/maghrib_time")
    protected AndroidElement maghribTimeElement_Element;

    @AndroidFindBy(id = "com.moslay:id/asr_time")
    protected AndroidElement asrTimeElement_Element;

    @AndroidFindBy(id = "com.moslay:id/zohr_time")
    protected AndroidElement zohrTimeElement_Element;

    @AndroidFindBy(id = "com.moslay:id/shorouqe_time")
    protected AndroidElement shrouqeTimeElement_Element;

    @AndroidFindBy(id = "com.moslay:id/fajr_time")
    protected AndroidElement fajrTimeElement_Element;
}
