package java.Screens.benefits;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class CommentScreen extends Base {
    String expectedTitle = "التعليقات";
    @AndroidFindBy(id = "com.moslay:id/news_like")
    private AndroidElement screenTitle_Text;
    @AndroidFindBy(id = "com.moslay:id/comments_list")
    private AndroidElement commentsList_Element;
    @AndroidFindBy(id = "com.moslay:id/comments_add_comment_Image")
    private AndroidElement addComment_Btn;
    @AndroidFindBy(id = "com.moslay:id/commnet_list_editText")
    private AndroidElement commentTextBar_TextView;
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to return the screen's actual title as a string
     *
     * @return Screen title as a string
     */
    public String getActualScreenTitle() {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, screenTitle_Text);
        return screenTitle_Text.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on add comment button
     */
    public void clickOnAddCommentButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, addComment_Btn);
        addComment_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to add text to the comment text field
     */
    public void sendTextToCommentTextBar(String text) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, commentTextBar_TextView);
        commentTextBar_TextView.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
}
