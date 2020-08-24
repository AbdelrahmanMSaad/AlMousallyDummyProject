package java.Screens.quranWerd;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.Screens.quranWerd.addWerd.AddWerdScreen;
import java.base.Base;
import java.util.List;
import java.utilities.TestUtils;

public class AddedScreen extends Base {
    String expectedTitle = "ورد القران";
    @AndroidFindBy(id = "com.moslay:id/img_menu")
    private AndroidElement navigationDrawer_Btn;
    @AndroidFindBy(id = "com.moslay:id/Azkar_menu_Header")
    private AndroidElement screenTitle_Text;
    @AndroidFindBy(id = "com.moslay:id/add_khtma")
    private AndroidElement addKhatma_Btn;
    @AndroidFindBy(id = "com.moslay:id/khatma_listview")
    private AndroidElement khatmaList_Element;
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
    /**
     * This method is to click on add Khatma button and returns AddWerdScreen
     *
     * @return AddWerdScreen
     */
    public AddWerdScreen clickOnAddWerdButton() {
        addKhatma_Btn.click();
        return new AddWerdScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on the info button for a werd by its index
     *
     * @return InfoScreen
     */
    public InfoScreen clickOnInfoButtonForAWerdByItsIndex(int index) {
        List<MobileElement> khatmaList_List = khatmaList_Element.findElementsById("com.moslay:id/dimmed");
        AndroidElement requiredElement = (AndroidElement) khatmaList_List.get(index);
        AndroidElement requiredElement_KhatmaInfoButton = (AndroidElement) requiredElement.findElementById("com.moslay:id/khtma_info");
        requiredElement_KhatmaInfoButton.click();
        return new InfoScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
