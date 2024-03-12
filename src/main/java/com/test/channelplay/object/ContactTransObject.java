package com.test.channelplay.object;

import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ContactTransObject extends DriverBase {


    @FindBy(xpath = "//input[@formcontrolname=\"email\"]")
    private WebElement username_field;

    @FindBy(xpath = "//input[@formcontrolname=\"password\"]")
    private WebElement password_field;

    @FindBy(xpath = "//button[text()=\"Sign In\"]")
    private WebElement submit_button;

    @FindBy(xpath = "//span[text()=\" CRM \"]")
    private WebElement CRM_menu;

    @FindBy(xpath = "//span[text()=' Contacts ']")
    private WebElement Contact_menu;

    @FindBy(xpath = "//span[text()='Add']")
    private WebElement Add_button;

    @FindBy(xpath = "//label[text()=\"Name\"]/parent::div/following-sibling::div//input")
    private WebElement ContactName_field;

    @FindBy(xpath = "//label[text()=\"Contact Type\"]/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement ContactType_dropdown;

    @FindBy(xpath = "//mat-option[2]")
    private WebElement First_Option;

    @FindBy(xpath = "//mat-option[3]/mat-pseudo-checkbox")
    private WebElement Second_Option;

    @FindBy(xpath = "//label[text()=\"Assign Customer\"]/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement AssignCustomer_dropdown;

    @FindBy(xpath = "//label[text()=\"Designation\"]/parent::div/following-sibling::div//input")
    private WebElement Designation_field;

    @FindBy(xpath = "//label[text()=\"Mobile\" ]/parent::div/following-sibling::div//input")
    private WebElement MobileNumber_Field;

    @FindBy(xpath = "//label[text()=\"Email\"]/parent::div/following-sibling::div//input")
    private WebElement Email_Field;

    @FindBy(xpath = "//label[text()=\"Address\"]/parent::div/following-sibling::div//textarea")
    private WebElement Address_Field;

    @FindBy(xpath = "//mat-select[@formcontrolname=\"countryName\"]")
    private WebElement Country_Dropdown;

    @FindBy(xpath = "//span[text()=\" India \"]")
    private WebElement India_Option;

    @FindBy(xpath = "//mat-select[@formcontrolname=\"stateName\"]")
    private WebElement State_Dropdown;

    @FindBy(xpath = "//span[text()=\" Andhra Pradesh \"]")
    public WebElement AndhraPradesh_Option;

    @FindBy(xpath = "//mat-select[@formcontrolname=\"cityName\"]")
    private WebElement City_Dropdown;

    @FindBy(xpath = "//span[text()=\" Adilabad \"]")
    private WebElement Adilabad_Option;

    @FindBy(xpath = "//label[text()=\"Data List Groups\"]/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement DataListGroups_dropdown;

    @FindBy(xpath = "//label[text()=\"Company Test\"]/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement CompanyTest_Dropdown;

    @FindBy(xpath = "//label[text()=\"Company Phone\" ]/parent::div/following-sibling::div//input")
    private WebElement CompanyPhoneNumber_Field;

    @FindBy(xpath = "//button[@aria-label=\"Open calendar\"]")
    private WebElement StartedDateCalender_button;

    @FindBy(xpath = "//label[text()=\"Certificate Upload\"]/parent::div/following-sibling::div//input")
    private WebElement Certificate_upload;

    @FindBy(xpath = "//label[text()=\"Location Video\"]/parent::div/following-sibling::div//input")
    private WebElement LocationVideo_upload;

    @FindBy(xpath = "//label[text()=\"Data List Module\"]/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement DataListModule_Dropdown;

    @FindBy(xpath = "//label[text()=\"Company Registered Email\"]/parent::div/following-sibling::div//input")
    private WebElement CompanyRegistredEmail_field;

    @FindBy(xpath = "//button[text()=\"Save\"]")
    private WebElement ContactSave_button;

    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    private WebElement ContactSearch_bar;

    @FindBy(xpath = "//h4[text()='Add New ']/ancestor::div[2]//button[text()='Cancel']")
    private WebElement CancelForm_button;

    @FindBy(xpath = "//img[@title=\"Edit\"]")
    private WebElement Edit_button;

    @FindBy(xpath = "//span[text()=' Business Partner ']")
    WebElement BusinessPartner_Option;

    @FindBy(xpath = "//mat-option[3]")
    WebElement DatalistSecond_Option;

    @FindBy(xpath = "//button[@aria-label=\"Open calendar\"]")
    private WebElement ExpectedClosureCalender_button;

    @FindBy(xpath = "//mat-month-view/table/tbody")
    private WebElement ExpectedClosureDate_CalendarTable;

    @FindBy(xpath = "//button[@aria-label=\"Next month\"]")
    private WebElement NextMonth_button;

    @FindBy(xpath = "//mat-select-trigger/ancestor::div[2]")
    private WebElement ClickSelf_dropdown;

    @FindBy(xpath = "//span[contains (text(),\"Team\")]")
    private WebElement ClickTeam_option;

    //Global Code
    CommonUtils commonUtils = new CommonUtils();
    Actions actions = new Actions(getDriver());
    public String contactName;
    public String dataPicker;
    public String email;
    public String CompanyEmail;

    public ContactTransObject() {
        PageFactory.initElements(getDriver(), this);
    }

    public void loginCRM(String username, String password) {
        username_field.sendKeys(username);
        password_field.sendKeys(password);
        submit_button.click();
        sleep(15000);

    }

    public void setCRM_menu() {
        CRM_menu.click();
        Contact_menu.click();
        sleep(3000);
    }

    public void setAdd_button() {
        sleep(2000);
        Add_button.click();
    }

    public void setContactName() {
        dataPicker = commonUtils.generateRandomString(2);
        contactName = "Cont_user" + dataPicker;
        ContactName_field.sendKeys(contactName);
    }

    public void setContactType_dropdown() {
        ContactType_dropdown.click();
        sleep(1000);
        First_Option.click();
    }

    public void setAssignCustomer_dropdown() {
        AssignCustomer_dropdown.click();
        sleep(1000);
        First_Option.click();
        sleep(2000);
        WebElement freeSpace = getDriver().findElement(By.xpath("//label[text()=\"Designation\"]"));
        actions.moveToElement(freeSpace).click().perform();
    }

    public void setDesignation_field() {
        Designation_field.sendKeys("Sales Executive");
    }

    public void setMobileNumber_Field() {
        MobileNumber_Field.sendKeys("8767898765");
    }

    public void setEmail_Field() {
        dataPicker = commonUtils.generateRandomString(3);
        email = dataPicker + "test@test.com";
        Email_Field.sendKeys(email);
    }

    public void setAddress_Field() {
        sleep(1000);
        Address_Field.sendKeys("PM Mall new delhi");
    }

    public void setCountry_Dropdown() {
        Country_Dropdown.click();
        sleep(1000);
    }

    public void setIndia_Option() {
        India_Option.click();
        sleep(1000);
    }

    public void setState_Dropdown() {
        State_Dropdown.click();
        sleep(1000);
    }

    public void setAndhraPradesh_Option() {
        AndhraPradesh_Option.click();
        sleep(1000);
    }

    public void setCity_Dropdown() {
        City_Dropdown.click();
        sleep(1000);
    }

    public void setAdilabad_Option() {
        Adilabad_Option.click();
        sleep(3000);
    }

    public void setDataListGroups_dropdown() {
        DataListGroups_dropdown.click();
        sleep(1000);
        First_Option.click();
    }

    public void setCompanyTest_Dropdown() {
        CompanyTest_Dropdown.click();
        sleep(1000);
        First_Option.click();
        sleep(2000);
        WebElement freeSpace = getDriver().findElement(By.xpath("//label[text()=\"Company Test\"]"));
        actions.moveToElement(freeSpace).click().perform();
        sleep(3000);
    }

    public void setCompanyPhoneNumber_Field() {

        CompanyPhoneNumber_Field.sendKeys("9876786576");
    }

    public String CurrentDay_picker() {
        Date CurrentDate = new Date();
        SimpleDateFormat DateFormat = new SimpleDateFormat("d");
        return DateFormat.format(CurrentDate);
    }

    public void setStartedDateCalender_button() {
        ExpectedClosureCalender_button.click();
        sleep(2000);
        String CurrentDate = CurrentDay_picker();
        ExpectedClosureDate_CalendarTable.findElement(By.xpath("//td//div[text()=' " + CurrentDate + " ']")).click();

    }

    public void setCertificate_upload() {
        String rootPath = System.getProperty("user.dir");
        System.out.println(rootPath + "....................>");
        sleep(3000);
        Certificate_upload.sendKeys(rootPath + "/Files/samplePDF.pdf");
        sleep(6000);
    }

    public void setLocationVideo_upload() {
        String rootPath = System.getProperty("user.dir");
        System.out.println(rootPath + "....................>");
        sleep(3000);
        LocationVideo_upload.sendKeys(rootPath + "/Files/dummymp4.mp4");
        sleep(5000);
    }

    public void setDataListModule_Dropdown() {
        DataListModule_Dropdown.click();
        sleep(2000);
        First_Option.click();
    }

    public void setCompanyRegistredEmail_field() {
        dataPicker = commonUtils.generateRandomString(5);
        CompanyEmail = dataPicker + "@test.com";
        CompanyRegistredEmail_field.sendKeys(CompanyEmail);
        sleep(3000);
    }

    public void setContactSave_button() {
        ContactSave_button.click();
        sleep(10000);
    }

    public void setContactSearch_bar() {
        sleep(2000);
        ContactSearch_bar.click();
        ContactSearch_bar.sendKeys(contactName);
        sleep(6000);
        List<WebElement> rows = getDriver().findElements(By.xpath("//div[text()='" + contactName + "']"));
        if (rows.size() < 1) {
            ClickSelf_dropdown.click();
            sleep(3000);
            ClickTeam_option.click();
            sleep(5000);
            ContactSearch_bar.clear();
            ContactSearch_bar.sendKeys(contactName);
            sleep(2000);
        }
        WebElement isContactName = getDriver().findElement(By.xpath("//div[text()='" + contactName + "']"));

        sleep(2000);

        Assert.assertTrue(isContactName.isDisplayed());
    }

    public void setCancelForm_button() {
        CancelForm_button.click();
        sleep(1000);
        getDriver().navigate().refresh();
        sleep(6000);
    }
    //Scenario: Edit Contact with all fields

    public void setEdit_button() {
        Edit_button.click();
        sleep(5000);
        ContactName_field.clear();
        Designation_field.clear();
        MobileNumber_Field.clear();
        Email_Field.clear();
        Address_Field.clear();
        CompanyPhoneNumber_Field.clear();
        CompanyRegistredEmail_field.clear();
        sleep(2000);
        WebElement PageArea = getDriver().findElement(By.xpath("//h4[text()='Edit ']/ancestor::div[2]"));
        List<WebElement> files = PageArea.findElements(By.xpath("//img[@class=\"close-svg\"]"));
        for (int a = 1; a <= files.size(); a++) {
            WebElement ClearDocuments_button = getDriver().findElement(By.xpath("//img[@class=\"close-svg\"]"));
            ClearDocuments_button.click();


        }
    }

    public void userSelectAssignCustomerFirstOptionToSecond() {
        AssignCustomer_dropdown.click();
        sleep(2000);
        WebElement SelectAll = getDriver().findElement(By.xpath("//span[text()=' user mfhd ']"));
        SelectAll.click();
        sleep(2000);
        actions.moveToElement(Second_Option).build().perform();
        Second_Option.click();
        sleep(1000);
        WebElement freeSpace = getDriver().findElement(By.xpath("//label[text()=\"Designation\"]"));
        actions.moveToElement(freeSpace).click().perform();
        sleep(1000);
    }

    public void userSelectDataListGroupFromDropdownListFirstToSecond() {
        DataListGroups_dropdown.click();
        sleep(1000);
        actions.moveToElement(DatalistSecond_Option).build().perform();
        DatalistSecond_Option.click();
    }

    public void userSelectDataListModuleFromDropdownFromFirstOptionToSecondOption() {
        DataListModule_Dropdown.click();
        sleep(1000);
        actions.moveToElement(DatalistSecond_Option).build().perform();
        DatalistSecond_Option.click();
    }

    public void userSelectCompanyTestFromDropdownListFirstOptionToSecond() {
        CompanyTest_Dropdown.click();
        sleep(1000);
        Second_Option.click();
        sleep(1000);
        First_Option.click();
        sleep(1000);
        WebElement freeSpace = getDriver().findElement(By.xpath("//label[text()=\"Company Test\"]"));
        actions.moveToElement(freeSpace).click().perform();
        sleep(3000);

    }

    public void userSelectContactTypeDropdownAndClickFirstOptionToSecondOption() {
        ContactType_dropdown.click();
        sleep(1000);
        actions.moveToElement(BusinessPartner_Option).build().perform();
        BusinessPartner_Option.click();

    }

    public String currentDay() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d");
        String ExpectedDate = simpleDateFormat.format(date);
        return ExpectedDate;
    }

    public void setEditCalender_button() {
        StartedDateCalender_button.click();
        sleep(1000);
        List<WebElement> Days = ExpectedClosureDate_CalendarTable.findElements(By.xpath("//td[@aria-selected]"));
        String ActiveDay_str = ExpectedClosureDate_CalendarTable.findElement(By.xpath("//td[@aria-selected=\"true\"]/div")).getText();
        int Days_Size = Days.size();
        int ActiveDay_Int = Integer.parseInt(ActiveDay_str);

        if (Days_Size == ActiveDay_Int) {
            NextMonth_button.click();
            sleep(2000);
            ExpectedClosureDate_CalendarTable.findElement(By.xpath("//td//div[text()=' 1 ']")).click();
        } else if (Days_Size > ActiveDay_Int) {
            String NewDate = Integer.toString(ActiveDay_Int + 1);
            ExpectedClosureDate_CalendarTable.findElement(By.xpath("//td//div[text()=' " + NewDate + " ']")).click();
        }
    }

    public void sleep(long s) {
        try {
            Thread.sleep(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
