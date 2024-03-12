package com.test.channelplay.object;

import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.WebDriverUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.security.Key;
import java.util.List;

public class ReportBuilderObject extends DriverBase {



    @FindBy(xpath = "//span[text()=' Analytics ']")
    private WebElement Analytics_menu;

    @FindBy(xpath = "//span[contains(text(), ' Dashboards ')]")
    private WebElement Dashboard_Submenu;

    @FindBy(xpath = "//span[text()=' Reports Catalog ']")
    private WebElement ReportCatalog_submenu;

    @FindBy(xpath = "//span[text()=' Report Builder ']")
    private WebElement ReportBuilder_submenu;

    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    private WebElement Search_EntityFields;

    @FindBy(xpath = "//td[text()=' Pie Chart']")
    private WebElement SelectPieChart_Option;

    @FindBy(xpath = "//span[text()='Report Type']/parent::td/following-sibling::td")
    private WebElement ReportTypeUpArrow_button;

    @FindBy(xpath = "//span[text()='Entity']")
    private WebElement Entity_dropdown;

    @FindBy(xpath = "//input[@aria-label=\"dropdown search\"]")
    private WebElement whiteSpace;

    @FindBy(xpath = "//button[contains(text(), \"Save\")]")
    private WebElement Save_button;

    @FindBy(xpath = "//label[text()='Measure']/ancestor::div[2]//div[@class=\"mat-form-field-wrapper\"]")
    private WebElement Measure_dropdown;

    @FindBy(xpath = "//label[text()='Condition']/ancestor::div[2]//div[@class=\"mat-form-field-wrapper\"]")
    private WebElement Condition_dropdown;

    @FindBy(xpath = "//span[text()=' Contains ']")
    private WebElement Contains_option;

    @FindBy(xpath = "//span[text()=' Equals to ']")
    private WebElement EqualsTo_option;

    @FindBy(xpath = "//span[text()=' count ']")
    private WebElement Count_option;

    @FindBy(xpath = "//label[text()='Value']/ancestor::div[2]//input")
    private WebElement Value_field;

    @FindBy(xpath = "//button[text()='Show Preview']")
    private WebElement ShowPreview_button;

    @FindBy(xpath = "//label[text()=' Name']/ancestor::div[2]//input")
    private WebElement Name_field;

    @FindBy(xpath = "//label[text()='Description']/ancestor::div[2]//input")
    private WebElement Description_field;

    @FindBy(xpath = "//mat-checkbox[@formcontrolname=\"dashboard\"]")
    private WebElement Dashboard_checkbox;

    @FindBy(xpath = "//mat-checkbox[@formcontrolname=\"reportMenue\"]")
    private WebElement ReportsMenu_checkbox;

    @FindBy(xpath = "//h4[text()='Add New']/ancestor::form//button[text()='Save']")
    private WebElement AddNewScreenSave_button;

    @FindBy(xpath = "//label[text()='Select Existing Dashboard']/ancestor::div[2]//div[@class=\"mat-form-field-wrapper\"]")
    private WebElement SelectExistingDashboard_dropdown;

    @FindBy(xpath = "//mat-option[6]")
    private WebElement SelectOption6_Checkbox;

    @FindBy(xpath = "//mat-option[1]")
    private WebElement ClickOn_WhiteSpace;

    @FindBy(xpath = "//label[text()='Enter New Dashboard Name']/ancestor::div[2]//input")
    private WebElement EnterNewDashboardName_field;

    @FindBy(xpath = "//span[text()=' Reports ']")
    private WebElement Reports_submenu;

    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    private WebElement Search_box;







    WebDriverUtils webDriverUtils = new WebDriverUtils();
    Actions actions = new Actions(getDriver());
    CommonUtils commonUtils = new CommonUtils();

    JavascriptExecutor js = (JavascriptExecutor) getDriver();

    public ReportBuilderObject() {
        PageFactory.initElements(getDriver(), this);
    }

    public void thenUserWillClickOnReportBuilderUnderAnalyticsMenu() {
        commonUtils.sleep(10000);
        Analytics_menu.click();
        ReportBuilder_submenu.click();
        commonUtils.sleep(1000);
    }

    public void userSelectTheReportTypeOfReportBuilder(String reportType) {
        getDriver().findElement(By.xpath("//td[contains(text(), '" + reportType + "')]")).click();
        commonUtils.sleep(2000);
    }

    public void userCloseTheReportTypeUpArrowButton() {
        ReportTypeUpArrow_button.click();
        commonUtils.sleep(1000);
    }

    public void userClickOnEntityDropdown() {
        Entity_dropdown.click();
        commonUtils.sleep(1000);
    }

    public void userSelectEntityOption(String EntityOption) {
        commonUtils.sleep(1000);
        getDriver().findElement(By.xpath("//mat-option/span[contains(text(), '" + EntityOption + "')]")).click();
        commonUtils.sleep(3000);
        whiteSpace.sendKeys(Keys.ESCAPE);
        commonUtils.sleep(2000);

//        List<WebElement> entityDataList = getDriver().findElements(By.xpath("//div[@class=\"example-list cdk-drop-list\"]//td[2]"));
//        for(int i=1; i<=entityDataList.size(); i++){
//            String data = getDriver().findElement(By.xpath("//div[@class=\"example-list cdk-drop-list\"]/div["+i+"]//td[2]")).getText();
//            System.out.println("| " + data + " |");
//        }
    }

    public void userSearchEntityFieldFromEntityFieldDropdownAndDragDropIntoTheFieldSection(String EntityFieldsValue) {
        Search_EntityFields.sendKeys(EntityFieldsValue);
        commonUtils.sleep(3000);
        //drag and drop
        WebElement from = getDriver().findElement(By.xpath("//td[contains(text(), '" + EntityFieldsValue + "')]"));
        WebElement to = getDriver().findElement(By.xpath("//descendant::div[text()='Drag fields here'][1]"));
        commonUtils.dragAndDrop(from, to);
        commonUtils.sleep(4000);
        Save_button.click();
        Search_EntityFields.clear();
        commonUtils.sleep(3000);
    }

    public void userSearchEntityFieldFromEntityFieldDropdownAndDragDropIntoTheMeasureSection(String EntityFieldsValue) {
        Search_EntityFields.sendKeys(EntityFieldsValue);
        commonUtils.sleep(3000);
        //drag and drop
        WebElement from = getDriver().findElement(By.xpath("//td[contains(text(), '" + EntityFieldsValue + "')]"));
        WebElement to = getDriver().findElement(By.xpath("//descendant::div[text()='Drag fields here'][1]"));
        commonUtils.dragAndDrop(from, to);
        commonUtils.sleep(4000);
        Measure_dropdown.click();
        commonUtils.sleep(1000);
        Count_option.click();
        Save_button.click();
        Search_EntityFields.clear();
        commonUtils.sleep(3000);
    }

    public void userSearchEntityFieldFromEntityFieldDropdownAndDragDropIntoTheFiltersSection(String EntityFieldsValue) {
        Search_EntityFields.sendKeys(EntityFieldsValue);
        commonUtils.sleep(3000);
        //drag and drop
        WebElement from = getDriver().findElement(By.xpath("//td[contains(text(), '" + EntityFieldsValue + "')]"));
        WebElement to = getDriver().findElement(By.xpath("//descendant::div[text()='Drag fields here'][1]"));
        commonUtils.dragAndDrop(from, to);
        commonUtils.sleep(4000);
    }

    public void userSelectConditionAndValueUnderFilterScreen(String Condition, String Value) {
        Condition_dropdown.click();
        commonUtils.sleep(1000);
        getDriver().findElement(By.xpath("//span[text()=' " + Condition + " ']")).click();
        commonUtils.sleep(1000);
        Value_field.sendKeys(Value);
        Save_button.click();
        Search_EntityFields.clear();
        commonUtils.sleep(3000);
    }
    public void UserClickOnShowPreviewButtonAndSelectSaveButtonOnThePreviewSection() {
        ShowPreview_button.click();
        commonUtils.sleep(6000);
        js.executeScript("window.scrollBy(0,-100)",  "");
        Save_button.click();
        commonUtils.sleep(2000);
    }

    public void userEnterNameAndDescriptionOnTheAddNewScreen(String ReportsName, String ReportsDescription) {
        Name_field.sendKeys(ReportsName);
        commonUtils.sleep(1000);
        Description_field.sendKeys(ReportsDescription);
    }

    public void userSelectDashboardAndSelectExistingDashboardAndSelectDashboardNameOREnterNewDashboardName
            (String DashboardOption, String SelectExistingDashboard, String DashboardName, String EnterNewDashboardName, String NewDashboardName) {
        if (DashboardOption.equals("YES")) {
            Dashboard_checkbox.click();
            commonUtils.sleep(1000);
        }
        if (SelectExistingDashboard.equals("YES")) {
            SelectExistingDashboard_dropdown.click();
            commonUtils.sleep(1000);
            getDriver().findElement(By.xpath("//span[contains(text(), ' " + DashboardName + " ')]")).click();
            commonUtils.sleep(1000);
            ClickOn_WhiteSpace.sendKeys(Keys.ESCAPE);
            commonUtils.sleep(1000);
        }
        if (EnterNewDashboardName.equals("YES")) {
            commonUtils.sleep(1000);
            EnterNewDashboardName_field.sendKeys(NewDashboardName);
            commonUtils.sleep(2000);
        }
    }
    public void userSelectReportsMenuFromLocation(String ReportsMenuOption ) {
        if (ReportsMenuOption.equals("YES")){
            ReportsMenu_checkbox.click();
            commonUtils.sleep(1000);
        }
    }
    public void userClickOnAddNewScreenSaveButton() {
        AddNewScreenSave_button.click();
        commonUtils.sleep(4000);
        getDriver().navigate().refresh();
    }
    public void selectReportCatalogsSubmenuUnderAnalyticsAndTheNewCreatedReportWillBeShownAs(String CreatedReportsName) {
        commonUtils.sleep(4000);
        Analytics_menu.click();
        commonUtils.sleep(1000);
        ReportCatalog_submenu.click();
        commonUtils.sleep(8000);
        Search_box.sendKeys(CreatedReportsName);
        List <WebElement> CreatedReport = getDriver().findElements(By.xpath("//div[contains(text(), '"+CreatedReportsName+"')]"));

        Assert.assertTrue(CreatedReport.size()>0);
    }
    public void ifReportIsCreatedUnderDashboardAndUserSelectDashboardSubmenuUnderAnalyticsAndTheNewCreatedReportWillBeShownAs(String CreatedReportsName) {
        commonUtils.sleep(4000);
        Analytics_menu.click();
        commonUtils.sleep(1000);
        Dashboard_Submenu.click();
        List <WebElement> DashboardCreatedReport = getDriver().findElements(By.xpath("//div[contains(text(), '"+CreatedReportsName+"')]"));

        Assert.assertTrue(DashboardCreatedReport.size()>0);

    }
    public void ifReportIsCreatedUnderReportsSubmenuAndUserSelectReportsSubmenuUnderAnalyticsAndTheNewCreatedReportWillBeShownAs(String CreatedReportName) {
        commonUtils.sleep(5000);
        Analytics_menu.click();
        commonUtils.sleep(1000);
        Reports_submenu.click();
        commonUtils.sleep(3000);
        List<WebElement> Reports = getDriver().findElements(By.xpath("//span[contains(text(), '"+CreatedReportName+"')]"));

        Assert.assertTrue(Reports.size()>0);
    }
}








