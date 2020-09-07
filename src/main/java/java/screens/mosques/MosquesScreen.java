package java.screens.mosques;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;

public class MosquesScreen extends Base {
    String expectedTitle = "مساجد";
    @AndroidFindBy(id = "com.moslay:id/img_more")
    private AndroidElement navigationDrawer_Btn;
    @AndroidFindBy(id = "com.moslay:id/qibla_inside_title")
    private AndroidElement screenTitle_Text;
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
     * This method is to click on navigation drawer button
     *
     * @return navigation drawer screen
     */
    public void clickOnNavigationDrawerButton() {
        navigationDrawer_Btn.click();
        //This method returns navigation drawer method with shams
    }
    /**
     * *********************************************************************************************************************************************
     */
}
