package java.Screens.benefits;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.utilities.TestUtils;

public class CommentScreen extends Base {
    String expectedTitle = "التعليقات";
    @AndroidFindBy(id = "com.moslay:id/news_like")
    private AndroidElement screenTitleTxt_Text;
    @AndroidFindBy(id = "com.moslay:id/comments_list")
    private AndroidElement commentsListElement_Element;
    @AndroidFindBy(id = "com.moslay:id/comments_add_comment_Image")
    private AndroidElement addCommentButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/commnet_list_editText")
    private AndroidElement commentTextInput_TextInput;
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
     * This method is to click on add comment button
     */
    public void clickOnAddCommentButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, addCommentButton_Btn);
        addCommentButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to add text to the comment text field
     */
    public void sendTextToCommentTextField(String text) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, commentTextInput_TextInput);
        commentTextInput_TextInput.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
}
