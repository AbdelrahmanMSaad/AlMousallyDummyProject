package java.Screens.qibla;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;

public class QiblaScreen extends Base {
    @AndroidFindBy(id = "com.moslay:id/qibla_inside_title")
    protected AndroidElement screenTitle_Text;
    @AndroidFindBy(id = "com.moslay:id/img_menu")
    protected AndroidElement navigationDrawer_Btn;
    @AndroidFindBy(id = "com.moslay:id/qibla_by_north")
    protected AndroidElement compass_Btn;
    @AndroidFindBy(id = "com.moslay:id/qibla_by_sun_and_moon")
    protected AndroidElement sunAndMoon_Btn;
    @AndroidFindBy(id = "com.moslay:id/qibla_by_shadow")
    protected AndroidElement shadow_Btn;
    @AndroidFindBy(id = "com.moslay:id/qibla_visual")
    protected AndroidElement visual_Btn;
    @AndroidFindBy(id = "com.moslay:id/qibla_help_imageview")
    protected AndroidElement help_Btn;
}
