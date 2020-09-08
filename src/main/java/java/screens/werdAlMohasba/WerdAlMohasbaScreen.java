package java.screens.werdAlMohasba;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.base.Base;
import java.util.List;

public class WerdAlMohasbaScreen extends Base {
    Wait wait = new WebDriverWait(driver,10);
    String expectedTitle = "ورد المحاسبة";
    @AndroidFindBy(id = "com.moslay:id/img_back")
    private AndroidElement backButton;
    @AndroidFindBy(id = "com.moslay:id/img_help")
    private AndroidElement infoButton;
    @AndroidFindBy(id = "com.moslay:id/azkar_inside_title")
    private AndroidElement screenTitleText;
    @AndroidFindBy(id = "com.moslay:id/img_statistics")
    private AndroidElement statisticsButton;
    @AndroidFindBy(id = "com.moslay:id/selected_date")
    private AndroidElement selectedDateTextField;
    @AndroidFindBy(id = "com.moslay:id/imgview_add")
    private AndroidElement addTaskButton;
    @AndroidFindBy(id = "com.moslay:id/edittext_add_tasks_cat")
    private AndroidElement taskNameTextField;
    @AndroidFindBy(id = "com.moslay:id/imgview_add_cat_text")
    private AndroidElement finishAddTaskButton;
    @AndroidFindBy(id = "com.moslay:id/tasks_items_recycler_view")
    private AndroidElement tasksListElement;
    @AndroidFindBy(id = "com.moslay:id/txtview_hide_done")
    private AndroidElement hideDoneTaskButton;
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
     * This method is to click on back button
     */
    public void clickOnBackButton() {
        wait.until(ExpectedConditions.visibilityOf(backButton));
        backButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on info screen and returns InfoScreen
     */
    public InfoScreen clickOnInfoButton() {
        wait.until(ExpectedConditions.visibilityOf(infoButton));
        infoButton.click();
        return new InfoScreen();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on info screen and returns InfoScreen
     */
    public void clickOnStatsButton() {
        wait.until(ExpectedConditions.visibilityOf(statisticsButton));
        statisticsButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on add task button
     */
    public void clickOnAddTaskButton() {
        wait.until(ExpectedConditions.visibilityOf(addTaskButton));
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
    public void sendTextToTaskNameTextBar(String text) {
        wait.until(ExpectedConditions.visibilityOf(tasksListElement));
        taskNameTextField.sendKeys(text);
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on finish add task button
     */
    public void clickOnFinishAddTaskButton() {
        wait.until(ExpectedConditions.visibilityOf(finishAddTaskButton));
        finishAddTaskButton.click();
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
        wait.until(ExpectedConditions.visibilityOf(tasksListElement));
        List<MobileElement> tasksList_List = tasksListElement.findElementsById("com.moslay:id/cardview_root");
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
        requiredElement_DeleteTaskButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
    /**
     * This method is to click on hide done tasks button
     */
    public void clickOnHideDoneTasksButton() {
        wait.until(ExpectedConditions.visibilityOf(hideDoneTaskButton));
        hideDoneTaskButton.click();
    }
    /**
     * *********************************************************************************************************************************************
     */
}
