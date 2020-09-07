package java.screens.qibla;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;

public class QiblaScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(id = "com.moslay:id/qibla_inside_title")
    protected AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/img_menu")
    protected AndroidElement navigationDrawerButton;
    @AndroidFindBy(id = "com.moslay:id/qibla_by_north")
    protected AndroidElement compassButton;
    @AndroidFindBy(id = "com.moslay:id/qibla_by_sun_and_moon")
    protected AndroidElement sunAndMoonButton;
    @AndroidFindBy(id = "com.moslay:id/qibla_by_shadow")
    protected AndroidElement shadowButton;
    @AndroidFindBy(id = "com.moslay:id/qibla_visual")
    protected AndroidElement visualButton;
    @AndroidFindBy(id = "com.moslay:id/qibla_help_imageview")
    protected AndroidElement helpButton;
}
