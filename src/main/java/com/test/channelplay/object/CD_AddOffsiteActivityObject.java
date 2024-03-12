package com.test.channelplay.object;

import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;
import com.test.channelplay.utils.WebDriverUtils;
import io.cucumber.java.ca.Cal;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import sun.tools.jconsole.Tab;

import java.security.Key;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CD_AddOffsiteActivityObject extends DriverBase {

    @FindBy(xpath = "//span[text()=\" CRM \"]")
    private WebElement CRM_menu;

    @FindBy(xpath = "//div[@id='kt_header_menu']/ul/li[2]/div/ul/li/a/span[2]")
    private WebElement Customer_menu;

    @FindBy(xpath = "//div[text()=\" Activities \"]/parent::div//a")
    private WebElement Plus_button;

    @FindBy(xpath = "//label[text()='Select Opportunity']/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement SelectOpportunity_dropdown;

    @FindBy(xpath = "//label[text()='Title']/parent::div/following-sibling::div//input")
    private WebElement Title_field;

    @FindBy(xpath = "//label[text()='Description']/parent::div/following-sibling::div//div/textarea")
    private WebElement Description_Field;

    @FindBy(xpath = "//label[text()='Update Opportunity Value']/parent::div/following-sibling::div//div/input")
    private WebElement Update_Opportunity_Value_Field;

    @FindBy(xpath = "//label[text()='Update Opportunity Status']/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement UpdateOpportunityStatus_dropdown;

    @FindBy(xpath = "//span[@class=\"mat-option-text\"][text()=' In Progress ']")
    private WebElement InProgress_Option;

    @FindBy(xpath = "//button[@aria-label=\"Open calendar\"]")
    private WebElement UpdateExpClosureDate_CalenderButton;

    @FindBy(xpath = "//div[@class=\"mat-calendar-body-cell-content mat-calendar-body-today\"]\n")
    private WebElement CurrentDate;

    @FindBy(xpath = "//mat-option[2]")
    private WebElement First_Option;

    @FindBy(xpath = "//label[text()='Update Win Probability']/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement UpdateWinProbability_dropdown;

    @FindBy(xpath = "//mat-option[11]")
    private WebElement WP90_Option;

    @FindBy(xpath = "//label[text()='Contacts']/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement Contact_dropdown;

    @FindBy(xpath = "//label[text()='testActivity']/parent::div/following-sibling::div//input")
    private WebElement TestActivity_Numericfield;

    @FindBy(xpath = "//label[text()='State/country']/parent::div/following-sibling::div/div/div[1]//div[@class=\"mat-form-field-wrapper\"]")
    private WebElement Country_Dropdown;

    @FindBy(xpath = "//span[text()=\" India \"]")
    private WebElement India_Option;

    @FindBy(xpath = "//label[text()='State/country']/parent::div/following-sibling::div/div/div[2]//div[@class=\"mat-form-field-wrapper\"]")
    private WebElement State_Dropdown;

    @FindBy(xpath = "//span[text()=\" Andhra Pradesh \"]")
    public WebElement AndhraPradesh_Option;

    @FindBy(xpath = "//label[text()='State/country']/parent::div/following-sibling::div/div/div[3]//div[@class=\"mat-form-field-wrapper\"]")
    private WebElement City_Dropdown;

    @FindBy(xpath = "//span[text()=\" Adilabad \"]")
    private WebElement Adilabad_Option;

    @FindBy(xpath = "//button[text()=\"Save\"]")
    private WebElement Save_button;

    @FindBy(xpath = "//img[@title=\"Dashboard\"]")
    private WebElement dashboardButton;

    @FindBy(xpath = "//div[text()='user mdyoh']/parent::div//img[@title=\"Dashboard\"]")
    private WebElement EmptyOffsiteActivity;

    @FindBy(xpath = "//span[text()=\" Offsite Activity \"]")
    private WebElement offsiteActivity_option;

    @FindBy(xpath = "//div[text()=' Activities ']/parent::div/following-sibling::div")
    private WebElement Activities_ListArea;
    
    @FindBy(xpath = "//span[text()=' Contacts ']")
    private WebElement Contact_menu;

    @FindBy(xpath = "//img[@title=\"Dashboard\"]")
    private WebElement Dashboard_button;

    @FindBy(xpath = "//label[text()=\"Select Customer\"]/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement SelectCustomer_dropdown;

    @FindBy(xpath = "//span[text()=' Activities ']")
    private WebElement Activities_submenu;

    @FindBy(xpath = "//span[text()='Add Activity']")
    private WebElement Activities_button;

    @FindBy(xpath = "//span[text()=\" Onsite Activity \"]")
    private WebElement OnsiteActivities;

    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    private WebElement Search_bar;

    @FindBy(xpath = "//mat-select-trigger/ancestor::div[2]")
    private WebElement ClickSelf_dropdown;

    @FindBy(xpath = "//span[contains (text(),\"Team\")]")
    private WebElement ClickTeam_option;

    @FindBy(xpath = "//img[@title=\"Edit\"]")
    private WebElement ActivityEdit_button;



    CommonUtils commonUtils = new CommonUtils();
    WebDriverUtils webDriverUtils = new WebDriverUtils();
    Actions actions = new Actions(getDriver());

    public String dataPicker;
    public String offsiteActivityName;
    public String OnsiteActivityName;
    public int OffsiteActivityCount;
    public int OnsiteActivityCount;
    public String FieldValue = "null";


    public CD_AddOffsiteActivityObject() {
        PageFactory.initElements(getDriver(), this);
    }

    public void setCRM_menu() {
        commonUtils.sleep(12000);
        CRM_menu.click();
        commonUtils.sleep(1000);
        Customer_menu.click();
        commonUtils.sleep(5000);
    }
    public void setdashboardButton() {
        dashboardButton.click();
        commonUtils.sleep(2000);
    }
    public void setPlus_button() {
        List<WebElement> OffsiteActivities = Activities_ListArea.findElements(By.xpath("//div[contains(text(), 'OFFSITE ACTIVITY')]"));
        OffsiteActivityCount = OffsiteActivities.size();
        Plus_button.click();
        commonUtils.sleep(4000);
        offsiteActivity_option.click();
        commonUtils.sleep(3000);
    }
    public void setSelectOpportunity_dropdown() {
        SelectOpportunity_dropdown.click();
        commonUtils.sleep(4000);
        List<WebElement> Opportunities = getDriver().findElements(By.xpath("//mat-option[2]"));
        if (Opportunities.size()>0){
            First_Option.click();
            commonUtils.sleep(1000);
        }
        else getDriver().findElement(By.xpath("//mat-option[1]")).sendKeys(Keys.ESCAPE);
    }
    public void setTitle_field() {
        dataPicker = commonUtils.generateRandomString(2);
        offsiteActivityName = "Offsite " + dataPicker;
        Title_field.sendKeys(offsiteActivityName);
    }
    public void setUpdate_Opportunity_Value_Field() {
          commonUtils.sleep(2000);
          String FieldValue1 = "abc";
        FieldValue1 = getDriver().findElement(By.xpath("//label[text()='Update Opportunity Value']/parent::div/following-sibling::div//div/input")).getAttribute("value");
        System.out.println(FieldValue1 + "........................................");
        if (FieldValue1 == "abc"){
            Update_Opportunity_Value_Field.sendKeys("10000");
            commonUtils.sleep(1000);
        }

    }


    public void setUpdateOpportunityStatus_dropdown() {
        UpdateOpportunityStatus_dropdown.click();
        commonUtils.sleep(2000);
        InProgress_Option.click();
    }
    public String CurrentDay_picker(){
        Date currentDate = new Date();
        SimpleDateFormat DateFormat = new SimpleDateFormat("d");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 10);
        Date futureDatetime = calendar.getTime();
        return DateFormat.format(futureDatetime);

    }

    public void setUpdateExpClosureDate_CalenderButton() {
        UpdateExpClosureDate_CalenderButton.click();
        commonUtils.sleep(2000);
        String CurrentDay = CurrentDay_picker();
        UpdateExpClosureDate_CalenderButton.findElement(By.xpath("//div[text()=' "+CurrentDay+" ']")).click();
    }
    public void setUpdateWinProbability_dropdown() {
        UpdateWinProbability_dropdown.click();
        commonUtils.sleep(2000);
        WP90_Option.click();
    }
    public void setContact_dropdown() {
        Contact_dropdown.click();
        commonUtils.sleep(2000);
        First_Option.click();
        WebElement freeSpace = getDriver().findElement(By.xpath("//label[text()=\"Contacts\"]"));
        actions.moveToElement(freeSpace).click().perform();
        commonUtils.sleep(2000);
    }
    public void setTestActivity_field() {
        TestActivity_Numericfield.sendKeys("123");
    }

    public void setCountry_Dropdown() {
        Country_Dropdown.click();
        commonUtils.sleep(2000);
        India_Option.click();
    }
    public void setState_Dropdown() {
        State_Dropdown.click();
        commonUtils.sleep(2000);
        AndhraPradesh_Option.click();
    }
    public void setCity_Dropdown() {
        City_Dropdown.click();
        commonUtils.sleep(2000);
        Adilabad_Option.click();
    }
    public void setSave_button() {
        commonUtils.sleep(2000);
        Save_button.click();
        commonUtils.sleep(8000);
    }
    public void setSaveCRMActivities_button() {
        Save_button.click();
        commonUtils.sleep(8000);
        DailyActivityReportObject dailyActivityReportObject = new DailyActivityReportObject();
        dailyActivityReportObject.UserSelectsDateRangeFromCalendar(GetProperty.value("daily_calendar_startDate"), GetProperty.value("daily_calendar_endDate"));
        dailyActivityReportObject.ClickOnApplyButton();
        commonUtils.sleep(10000);
    }
    public void newOffsiteActivityWillShowInTheList() {

        List<WebElement> OffsiteActivities = Activities_ListArea.findElements(By.xpath("//div[contains(text(), 'OFFSITE ACTIVITY')]"));
        int newOffsiteActivityCount = OffsiteActivities.size();
        Assert.assertEquals(newOffsiteActivityCount, OffsiteActivityCount+1, "New Value : "+newOffsiteActivityCount+"|| Old Value : "+OffsiteActivityCount);
    }
    //This below code added for AUT19
    public void userSelectCRMAndClickOnContactMenu() {
         commonUtils.sleep(12000);
         CRM_menu.click();
         commonUtils.sleep(2000);
         Contact_menu.click();
         commonUtils.sleep(5000);
    }
    public void userClickOnContactDashboardButton() {
        Dashboard_button.click();
        commonUtils.sleep(5000);
    }
    public void userSelectCustomerName() {
        SelectCustomer_dropdown.click();
        commonUtils.sleep(3000);
        commonUtils.sleep(4000);
        First_Option.click();
    }
    //This below code added for AUT48
    public void userClickOnOpportunityDashboardButton() {
        Dashboard_button.click();
        commonUtils.sleep(5000);
    }
    //This below code added for AUT51
    public void userSelectCRMAndClickOnActivitiesMenu() {
        commonUtils.sleep(12000);
        CRM_menu.click();
        commonUtils.sleep(2000);
        Activities_submenu.click();
        commonUtils.sleep(6000);
    }
    public void userClickOnAddActivitiesButton() {
        Activities_button.click();
        commonUtils.sleep(2000);
    }
    public void userSelectOffsiteActivityOption() {
       offsiteActivity_option.click();
       commonUtils.sleep(5000);
    }
    public void newOffsiteActivitiesWillShowInTheList() {
        commonUtils.sleep(2000);
        ActivityEdit_button.click();
        commonUtils.sleep(15000);
        String ActualOffsiteTitle = Title_field.getAttribute("value");
        String ExpectedOffsiteTitle = offsiteActivityName;
        Assert.assertEquals(ActualOffsiteTitle, ExpectedOffsiteTitle);
        commonUtils.sleep(4000);
    }
    //This below code added for AUT21
    public void UserClickOnPlusButtonAndSelectOnsiteActivitiesOption() {
        commonUtils.sleep(3000);
        List<WebElement> OnSiteActivities = Activities_ListArea.findElements(By.xpath("//div[contains(text(), 'ONSITE ACTIVITY')]"));
        OnsiteActivityCount = OnSiteActivities.size();
        Plus_button.click();
        commonUtils.sleep(1000);
        OnsiteActivities.click();
        commonUtils.sleep(9000);
    }
    public void newOnsiteActivityWillShowInTheList() {
        List<WebElement> OnsiteActivities = Activities_ListArea.findElements(By.xpath("//div[contains(text(), 'ONSITE ACTIVITY')]"));
        int newOnsiteActivityCount = OnsiteActivities.size();
        Assert.assertEquals(newOnsiteActivityCount, OnsiteActivityCount+1, "New Value : "+newOnsiteActivityCount+"|| Old Value : "+OnsiteActivityCount);
    }
    //This below code added for AUT22
    public void userEnterTitleUnderOnsiteActivity() {
        dataPicker = commonUtils.generateRandomString(2);
        OnsiteActivityName = "Onsite " + dataPicker;
        Title_field.sendKeys(OnsiteActivityName);
    }
    //This below code added for AUT46
    public void userSelectOnsiteActivityOption() {
        OnsiteActivities.click();
        commonUtils.sleep(12000);
    }
    public void newOnsiteActivitiesWillShowInTheList() {
        commonUtils.sleep(2000);
        ActivityEdit_button.click();
        commonUtils.sleep(15000);
        String ActualOnsiteTitle = Title_field.getAttribute("value");
        String ExpectedOnsiteTitle = OnsiteActivityName;
        Assert.assertEquals(ActualOnsiteTitle, ExpectedOnsiteTitle);
        commonUtils.sleep(4000);
    }

}
