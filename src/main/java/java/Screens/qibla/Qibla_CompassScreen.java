package java.Screens.qibla;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class Qibla_CompassScreen extends Base {
    String expectedTitle = "القبلة";
    @AndroidFindBy(id = "com.moslay:id/qibla_inside_title")
    private AndroidElement screenTitleTxt_Text;
    @AndroidFindBy(id = "com.moslay:id/img_menu")
    private AndroidElement navigationDrawerButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/qibla_by_north")
    private AndroidElement compassButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/qibla_by_sun_and_moon")
    private AndroidElement sunAndMoonButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/qibla_by_shadow")
    private AndroidElement shadowButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/qibla_visual")
    private AndroidElement visualButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/qibla_help_imageview")
    private AndroidElement helpButton_Btn;

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
     */
    /**
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
     * This method is to click on compass button
     *
     * @return Qibla_CompassScreen
     */
    public Qibla_CompassScreen clickOnCompassButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, compassButton_Btn);
        compassButton_Btn.click();
        return new Qibla_CompassScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on sun and moon button
     *
     * @returns Qibla_SunAndMoonScreen
     */
    public Qibla_SunAndMoonScreen clickOnSunAndMoonButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, sunAndMoonButton_Btn);
        sunAndMoonButton_Btn.click();
        return new Qibla_SunAndMoonScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on shadow button
     *
     * @return Qibla_ShadowScreen
     */
    public Qibla_ShadowScreen clickOnShadowButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, shadowButton_Btn);
        shadowButton_Btn.click();
        return new Qibla_ShadowScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on visible button
     *
     * @return Qibla_VisualScreen
     */
    public Qibla_VisualScreen clickOnVisibleButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, visualButton_Btn);
        visualButton_Btn.click();
        return new Qibla_VisualScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on help button
     */
    public void clickOnHelpButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, helpButton_Btn);
        helpButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
