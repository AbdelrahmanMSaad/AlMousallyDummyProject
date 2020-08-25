package java.Screens.benefits;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.util.List;

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
        return screenTitle_Text.getText();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on add comment button
     */
    public void clickOnAddCommentButton() {
        addComment_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to add text to the comment text field
     */
    public void sendTextToCommentTextBar(String text) {
        commentTextBar_TextView.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to access a comment container via its index in the comments list
     *
     * @param index of the comment
     * @return the selected comment container in a mobile element
     */
    public MobileElement accessCommentByIndex(int index) {
        List<MobileElement> commentsList = (List<MobileElement>) commentsList_Element.findElementByClassName("android.widget.RelativeLayout");
        return commentsList.get(index);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on report button for a selected comment by index
     *
     * @param index of the comment
     */
    public void clickOnReportCommentButtonForASelectedCommentViaIndex(int index) {
        MobileElement requiredElement = accessCommentByIndex(index);
        MobileElement reportButton = requiredElement.findElementById("com.moslay:id/report_txt_view");
        reportButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on like button for a selected comment by index
     *
     * @param index of the comment
     */
    public void clickOnLikeButtonForASelectedCommentByIndex(int index) {
        MobileElement requiredElement = accessCommentByIndex(index);
        MobileElement likeButton = requiredElement.findElementById("com.moslay:id/like_txt_view2");
        likeButton.click();

    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on reply button for a selected comment by index
     *
     * @param index of the comment
     */
    public void clickOnReplyButtonForASelectedCommentByIndex(int index) {
        MobileElement requiredElement = accessCommentByIndex(index);
        MobileElement replyButton = requiredElement.findElementById("com.moslay:id/like_txt_view2");
        replyButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on delete button for a selected comment by index
     *
     * @param index of the comment
     */
    public void clickOnDeleteButtonForASelectedCommentByIndex(int index) {
        MobileElement requiredElement = accessCommentByIndex(index);
        MobileElement deleteButton = requiredElement.findElementById("com.moslay:id/delete_txt_view");
        deleteButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on edit button for a selected comment by index
     *
     * @param index of the comment
     */
    public void clickOnEditButtonForASelectedCommentByIndex(int index) {
        MobileElement requiredElement = accessCommentByIndex(index);
        MobileElement editButton = requiredElement.findElementById("com.moslay:id/edit_txt_view");
        editButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
