package java.screens.benefits;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;
import java.util.List;

public class CommentScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    String expectedTitle = "التعليقات";
    @AndroidFindBy(id = "com.moslay:id/news_like")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/comments_list")
    private AndroidElement commentsListElement;
    @AndroidFindBy(id = "com.moslay:id/comments_add_comment_Image")
    private AndroidElement addCommentBtn;
    @AndroidFindBy(id = "com.moslay:id/commnet_list_editText")
    private AndroidElement commentTextBar;
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
     * This method is to click on add comment button
     */
    public void clickOnAddCommentButton() {
        wait.until(ExpectedConditions.visibilityOf(addCommentBtn));
        addCommentBtn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to add text to the comment text field
     */
    public void sendTextToCommentTextBar(String text) {
        wait.until(ExpectedConditions.visibilityOf(commentTextBar));
        commentTextBar.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to check the comments list visibility
     * @return boolean is the the comment list displayed
     */
    public boolean isCommentListDisplayed(){
        wait.until((ExpectedConditions.visibilityOf(commentsListElement)));
        return commentsListElement.isDisplayed();
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
        List<MobileElement> commentsList = (List<MobileElement>) commentsListElement.findElementByClassName("android.widget.RelativeLayout");
        return commentsList.get(index);
    }
    public void getTextFromASelectedCommentByIndex(int index){
        MobileElement requiredElement = accessCommentByIndex(index);
        //TODO :
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
