package java.screens.quranWerd.addWerd;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class HowManyChaptersScreen extends Base {
    @AndroidFindBy(id = "android:id/select_dialog_listview")
    private AndroidElement numbersList_Element;

    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to scroll to a chapter number then click it, the number is sent as a parameter
     *
     * @return AddWerdScreen
     */
    public AddWerdScreen scrollToAChapterNumberAndClickIt(String chapterNumber) {
        AndroidElement requiredElement = (AndroidElement) TestUtils.scrollToASpecificElementByItsText(chapterNumber);
        requiredElement.click();
        return new AddWerdScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
