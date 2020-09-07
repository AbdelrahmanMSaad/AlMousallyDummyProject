package java.screens.quranWerd.addWerd;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;
import java.utilities.TestUtils;

public class HowManyChaptersScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    @AndroidFindBy(id = "android:id/select_dialog_listview")
    private AndroidElement numbersListElement;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to scroll to a chapter number then click it, the number is sent as a parameter
     *
     * @return AddWerdScreen
     */
    public AddWerdScreen scrollToAChapterNumberAndClickIt(String chapterNumber) {
        wait.until(ExpectedConditions.visibilityOf(numbersListElement));
        AndroidElement requiredElement = (AndroidElement) TestUtils.scrollToASpecificElementByItsText(chapterNumber);
        requiredElement.click();
        return new AddWerdScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
