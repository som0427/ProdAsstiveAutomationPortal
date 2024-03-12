package com.test.channelplay.object;

import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class WF_ContactCreatedObject extends DriverBase {

    @FindBy(xpath = "//span[text()=' Admin ']")
    private WebElement Admin_menu;

    @FindBy(xpath = "//span[text()=' Workflows ']")
    private WebElement Workflows_submenu;

    @FindBy(xpath = "//span[text()='Add New']")
    private WebElement AddNew_button;

    @FindBy(xpath = "//label[text()='Name']/parent::div//following-sibling::div//input")
    private WebElement EnterWFName_field;

    @FindBy(xpath = "//label[text()='Description']/parent::div//following-sibling::div//input")
    private WebElement Description_field;

    @FindBy(xpath = "//label[text()='Entity']/parent::div//following-sibling::div/mat-form-field")
    private WebElement Entity_dropdown;

    @FindBy(xpath = "//mat-option[4]")
    private WebElement Contact_option;

    @FindBy(xpath = "//label[text()='Trigger']/parent::div//following-sibling::div/mat-form-field")
    private WebElement Trigger_dropdown;

    @FindBy(xpath = "//mat-option[2]")
    private WebElement ContactCreated_option;

    @FindBy(xpath = "//button[text()=\" Save \"]")
    private WebElement Save_button;

    @FindBy(xpath = "//div[text()='Workflow is Inactive']/parent::div//span[@class=\"switch switch-small\"]")
    private WebElement ActivateWF_checkbox;

    @FindBy(xpath = "//div[@class=\"ng-star-inserted\"]/a/img")
    private WebElement WFBack_button;

    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    private WebElement WFSearch_bar;

    @FindBy(xpath = "//img[@title=\"Workflow\"]")
    private WebElement WFDashboard_button;

    @FindBy(xpath = "//div[@class=\"hv-item ng-star-inserted\"]/div/div/div[@class=\"top-icon ng-star-inserted\"]")
    private WebElement ActionPlus_button;

    @FindBy(xpath = "//div[text()='Send Email ']")
    private WebElement ActionEmail_Option;

    @FindBy(xpath = "//button[text()=' Next ']")
    private WebElement Next_button;

    @FindBy(xpath = "//label[text()='To']/parent::div//following-sibling::div/mat-form-field")
    private WebElement EmailTO_dropdown;

    @FindBy(xpath = "//mat-option[2]")
    private WebElement OwnerCheckbox_option;

    @FindBy(xpath = "//mat-option[3]")
    private WebElement ReportingManagerCheckbox_option;

    @FindBy(xpath = "//mat-option[4]")
    private WebElement SelectedUserCheckbox_option;

    @FindBy(xpath = "//mat-option[5]")
    private WebElement CustomEmailIdCheckbox_option;


    CommonUtils commonUtils = new CommonUtils();
    WebDriverUtils webDriverUtils = new WebDriverUtils();

    public WF_ContactCreatedObject(){
        PageFactory.initElements(getDriver(), this);
    }

    private String dataPicker;
    private String WFName;


    public void userClicksOnAdminMenuAndClickOnWorkflows() {
        commonUtils.sleep(12000);
        webDriverUtils.waitUntilVisible(getDriver(), Admin_menu, Duration.ofSeconds(30000));
        Admin_menu.click();
        commonUtils.sleep(1000);
        Workflows_submenu.click();
        commonUtils.sleep(4000);
    }
    public void clicksOnAddNewButtonToANewWorkflow() {
        AddNew_button.click();
        commonUtils.sleep(5000);
    }
    public void userEnterWorkflowName_field() {
        dataPicker = commonUtils.generateRandomString(3);
        WFName = "Contact Created " + dataPicker;
        EnterWFName_field.sendKeys(WFName);
        commonUtils.sleep(1000);
    }
    public void userEnterWorkflowDescription_field() {
        Description_field.sendKeys("This is contact wf automation");
        commonUtils.sleep(1000);
    }
    public void userSelectEntityFromDropdown() {
        Entity_dropdown.click();
        commonUtils.sleep(1000);
        Contact_option.click();
        commonUtils.sleep(2000);
    }
    public void userSelectTriggerFromDropdown() {
        Trigger_dropdown.click();
        commonUtils.sleep(1000);
        ContactCreated_option.click();
    }
    public void clickOnSave_button() {
        Save_button.click();
        commonUtils.sleep(5000);
    }
    public void UserRedirectOnTheNewlyCreatedWorkflowPageAndValidateTheWfName() {
        WebElement WFNameVerify = getDriver().findElement(By.xpath("//h5[text()=' "+WFName+" ']"));
        Assert.assertTrue(WFNameVerify.isDisplayed());
        commonUtils.sleep(4000);

    }
    public void userActiveTheWorkflow() {
        ActivateWF_checkbox.click();
        commonUtils.sleep(2000);
    }
    public void userClickOnBackButtonAndCheckTheWorkflowAddedSuccessfullyOrNot() {
        WFBack_button.click();
        commonUtils.sleep(3000);
        WFSearch_bar.sendKeys(WFName);
        commonUtils.sleep(3000);
        WebElement WFIsAdded = getDriver().findElement(By.xpath("//div[text()='"+WFName+"']"));
        WebElement isStatusActive = getDriver().findElement(By.xpath("//button[text()='Active']"));
        Assert.assertTrue(WFIsAdded.isDisplayed() && isStatusActive.isDisplayed());
        commonUtils.sleep(3000);
    }
    public void userClickOnOnWorkflowContactCreatedWorkflowArrowButton() {
        WFDashboard_button.click();
        commonUtils.sleep(3000);
    }
    public void userClickOnPlusButtonToAddNewAction() {
        ActionPlus_button.click();
        commonUtils.sleep(8000);
    }
    public void userSelectFirstEmailAction() {
        ActionEmail_Option.click();
        commonUtils.sleep(2000);
    }
    public void clickOnNextButton() {
        Next_button.click();
        commonUtils.sleep(10000);
    }
    public void userSelectToEmailFromDropdownCheckboxList() {
        EmailTO_dropdown.click();
        commonUtils.sleep(2000);
    }
    public void userClickOnOwnerCheckbox() {
        OwnerCheckbox_option.click();
        commonUtils.sleep(1000);
    }
    public void userClickOnReportingManagerCheckbox() {
        ReportingManagerCheckbox_option.click();
        commonUtils.sleep(1000);
    }
    public void userClickOnSelectedUserCheckbox() {
        SelectedUserCheckbox_option.click();
        commonUtils.sleep(1000);
    }
    public void userClickOnCustomEmailIdCheckbox() {
        CustomEmailIdCheckbox_option.click();
        commonUtils.sleep(1000);
    }
















}
