package java.Screens.quranWerd.addWerd;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class StartFromScreen extends Base {
    @AndroidFindBy(id = "android:id/select_dialog_listview")
    private AndroidElement numbersList_Element;
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to scroll to a chapter number then click it, the number is sent as a string parameter
     *
     * @param chapterNumber the chapter number as string
     * @return AddWerdScreen
     */
    public AddWerdScreen scrollToAChapterNumberAndClickIt(String chapterNumber) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, numbersList_Element);
        AndroidElement requiredElement = (AndroidElement) TestUtils.scrollToASpecificElementByItsText(chapterNumber);
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, requiredElement);
        requiredElement.click();
        return new AddWerdScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
