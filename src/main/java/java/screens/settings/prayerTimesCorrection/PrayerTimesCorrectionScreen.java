package java.screens.settings.prayerTimesCorrection;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class PrayerTimesCorrectionScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(id = "com.moslay:id/img_menu")
    protected AndroidElement navigationDrawerButton;
    @AndroidFindBy(id = "com.moslay:id/Azkar_menu_Header")
    protected AndroidElement screenGeneralTitleText;
    @AndroidFindBy(id = "com.moslay:id/isha_time")
    protected AndroidElement ishaTimeElement;
    @AndroidFindBy(id = "com.moslay:id/maghrib_time")
    protected AndroidElement maghribTimeElement;
    @AndroidFindBy(id = "com.moslay:id/asr_time")
    protected AndroidElement asrTimeElement;
    @AndroidFindBy(id = "com.moslay:id/zohr_time")
    protected AndroidElement zohrTimeElement;
    @AndroidFindBy(id = "com.moslay:id/shorouqe_time")
    protected AndroidElement shrouqeTimeElement;
    @AndroidFindBy(id = "com.moslay:id/fajr_time")
    protected AndroidElement fajrTimeElement;
}
