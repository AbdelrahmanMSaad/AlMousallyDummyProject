package java.screens.quranWerd.quranWerdMainScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.screens.quranWerd.addWerd.AddWerdScreen;
import java.base.Base;
import java.screens.quranWerd.infoScreen.InfoScreen;
import java.util.List;

public class AddedScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    String expectedTitle = "ورد القران";
    @AndroidFindBy(id = "com.moslay:id/img_menu")
    private AndroidElement navigationDrawerButton;
    @AndroidFindBy(id = "com.moslay:id/Azkar_menu_Header")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/add_khtma")
    private AndroidElement addKhatmaButton;
    @AndroidFindBy(id = "com.moslay:id/khatma_listview")
    private AndroidElement khatmaListElement;
    /**
     * *********************************************************************************************************************************************
     */

    /**
     * This method is to return the screen's actual title as a string
     *
     * @return Screen title as a string
     */
    public String getActualScreenTitle() {
        wait.until(ExpectedConditions.visibilityOf(screenTitleText));
        return screenTitleText.getText();
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
        wait.until(ExpectedConditions.visibilityOf(navigationDrawerButton));
        navigationDrawerButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(addKhatmaButton));
        addKhatmaButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(khatmaListElement));
        List<MobileElement> khatmaList_List = khatmaListElement.findElementsById("com.moslay:id/dimmed");
        AndroidElement requiredElement = (AndroidElement) khatmaList_List.get(index);
        AndroidElement requiredElement_KhatmaInfoButton = (AndroidElement) requiredElement.findElementById("com.moslay:id/khtma_info");
        requiredElement_KhatmaInfoButton.click();
        return new InfoScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
