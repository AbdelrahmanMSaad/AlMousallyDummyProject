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
    private AndroidElement navigationDrawerButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/Azkar_menu_Header")
    private AndroidElement screenTitleTxt_Text;
    @AndroidFindBy(id = "com.moslay:id/add_khtma")
    private AndroidElement addKhatmaButton_Btn;
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
     * This method is to click on add Khatma button and returns AddWerdScreen
     *
     * @return AddWerdScreen
     */
    public AddWerdScreen clickOnAddWerdButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, addKhatmaButton_Btn);
        addKhatmaButton_Btn.click();
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
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, khatmaList_Element);
        List<MobileElement> khatmaList_List = khatmaList_Element.findElementsById("com.moslay:id/dimmed");
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, khatmaList_List.get(index));
        AndroidElement requiredElement = (AndroidElement) khatmaList_List.get(index);
        AndroidElement requiredElement_KhatmaInfoButton = (AndroidElement) requiredElement.findElementById("com.moslay:id/khtma_info");
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, requiredElement_KhatmaInfoButton);
        requiredElement_KhatmaInfoButton.click();
        return new InfoScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
