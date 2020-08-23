package java.Screens.werdAlMohasba;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.base.Base;
import java.util.List;
import java.utilities.TestUtils;

public class WerdAlMohasbaScreen extends Base {
    String expectedTitle = "ورد المحاسبة";
    @AndroidFindBy(id = "com.moslay:id/img_back")
    private AndroidElement backButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/img_help")
    private AndroidElement infoButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/azkar_inside_title")
    private AndroidElement screenTitleTxt_Text;
    @AndroidFindBy(id = "com.moslay:id/img_statistics")
    private AndroidElement statsButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/selected_date")
    private AndroidElement selectedDateTxt_TxtView;
    @AndroidFindBy(id = "com.moslay:id/imgview_add")
    private AndroidElement addTaskButton;
    @AndroidFindBy(id = "com.moslay:id/edittext_add_tasks_cat")
    private AndroidElement taskNameTxtInput_TextInput;
    @AndroidFindBy(id = "com.moslay:id/imgview_add_cat_text")
    private AndroidElement finishAddTaskButton_Btn;
    @AndroidFindBy(id = "com.moslay:id/tasks_items_recycler_view")
    private AndroidElement tasksList_Element;
    @AndroidFindBy(id = "com.moslay:id/txtview_hide_done")
    private AndroidElement hideDoneTaskButton_Btn;
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
     * This method is to click on back button
     */
    public void clickOnBackButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, backButton_Btn);
        backButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on info screen and returns InfoScreen
     */
    public InfoScreen clickOnInfoButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, infoButton_Btn);
        infoButton_Btn.click();
        return new InfoScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on info screen and returns InfoScreen
     */
    public void clickOnStatsButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, statsButton_Btn);
        statsButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on add task button
     */
    public void clickOnAddTaskButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, addTaskButton);
        addTaskButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to send text to task name test field
     *
     * @param text string sent to task name text field
     */
    public void sendTextToTaskNameTextInput(String text) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, taskNameTxtInput_TextInput);
        taskNameTxtInput_TextInput.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on finish add task button
     */
    public void clickOnFinishAddTaskButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, finishAddTaskButton_Btn);
        finishAddTaskButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to access a task via index
     *
     * @param index integer to access a specific element from the tasks list
     */
    public MobileElement accessTaskViaIndex(int index) {
        TestUtils.fluentWaitBySecondsToCheckTheVisibilityOfAnAndroidElemnet(1, 60, tasksList_Element);
        List<MobileElement> tasksList_List = tasksList_Element.findElementsById("com.moslay:id/cardview_root");
        return tasksList_List.get(index);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on check task button for a selected task via index
     *
     * @param index integer to access a specific element from the tasks list to click on its check button
     */
    public void clickOnCheckTaskButtonForATaskSelectedVIAIndex(int index) {
        MobileElement requiredElement = accessTaskViaIndex(index);
        MobileElement requiredElement_CheckTaskButton;
        requiredElement_CheckTaskButton = requiredElement.findElementById("com.moslay:id/tasks_check");
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, requiredElement_CheckTaskButton);
        requiredElement_CheckTaskButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on delete task button for a selected task via index
     *
     * @param index integer to access a specific element from the tasks list to click on its delete button
     */
    public void clickOnDeleteTaskButtonForATaskSelectedVIAIndex(int index) {
        MobileElement requiredElement = accessTaskViaIndex(index);
        MobileElement requiredElement_DeleteTaskButton;
        requiredElement_DeleteTaskButton = requiredElement.findElementById("com.moslay:id/imgview_delete");
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, requiredElement_DeleteTaskButton);
        requiredElement_DeleteTaskButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on hide done tasks button
     */
    public void clickOnHideDoneTasksButton() {
        TestUtils.fluentWaitBySecondsToCheckTheClickabilityOfAnAndroidElemnet(1, 60, hideDoneTaskButton_Btn);
        hideDoneTaskButton_Btn.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
