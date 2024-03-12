package com.test.channelplay.object;

import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CD_AddContactObject extends DriverBase {


    @FindBy(xpath = "//input[@formcontrolname=\"email\"]")
    private WebElement username_field;

    @FindBy(xpath = "//input[@formcontrolname=\"password\"]")
    private WebElement password_field;

    @FindBy(xpath = "//button[text()=\"Sign In\"]")
    private WebElement submit_button;

    @FindBy(xpath = "//span[text()=\" CRM \"]")
    private WebElement CRM_menu;

    @FindBy(xpath = "//div[@id='kt_header_menu']/ul/li[2]/div/ul/li/a/span[2]")
    private WebElement Customer_menu;

    @FindBy(xpath = "//img[@title=\"Dashboard\"]")
    private WebElement Dashboard_button;

    @FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/kt-company-dashboard/div/div/div[3]/kt-widget3-contact/div/div[1]/div[2]/div/a")
    WebElement AddContactPlus_button;

    @FindBy(xpath = "//label[text()=\"Name\"]/parent::div/following-sibling::div//input")
    private WebElement ContactName_field;

    @FindBy(xpath = "//label[text()=\"Contact Type\"]/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement ContactType_dropdown;

    @FindBy(xpath = "//mat-option[2]")
    private WebElement First_Option;

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

    @FindBy(xpath = "//label[text()=\"Company Phone Number Test\" ]/parent::div/following-sibling::div//input")
    private WebElement CompanyPhoneNumber_Field;

    @FindBy(xpath = "//button[@aria-label=\"Open calendar\"]")
    private WebElement StartedDateCalender_button;

    @FindBy(xpath = "//div[@class=\"mat-calendar-body-cell-content mat-calendar-body-today\"]\n")
    private WebElement CurrentDate;

    @FindBy(xpath = "//label[text()=\"Company Registration Certificate Test\"]/parent::div/following-sibling::div//input")
    private WebElement Certificate_upload;

    @FindBy(xpath = "//label[text()=\"Company Location Video Test\"]/parent::div/following-sibling::div//input")
    private WebElement LocationVideo_upload;

    @FindBy(xpath = "//label[text()=\"Data List Module\"]/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement DataListModule_Dropdown;

    @FindBy(xpath = "//label[text()=\"Company Registered Email Test\"]/parent::div/following-sibling::div//input")
    private WebElement CompanyRegistredEmail_field;

    @FindBy(xpath = "//button[text()=\"Save\"]")
    private WebElement ContactSave_button;

    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    private WebElement ContactSearch_bar;

    @FindBy(xpath = "//button[@aria-label=\"Open calendar\"]")
    private WebElement ExpectedClosureCalender_button;

    @FindBy(xpath = "//mat-month-view/table/tbody")
    private WebElement ExpectedClosureDate_CalendarTable;

    //Global Code
    CommonUtils commonUtils = new CommonUtils();
    Actions actions = new Actions(getDriver());
    public String contactName;
    public String dataPicker;
    public String email;
    public String CompanyEmail;
    public String salesExecutive;

    public CD_AddContactObject() {
        PageFactory.initElements(getDriver(), this);
    }

    public void loginCRM(String username, String password) {
        username_field.sendKeys(username);
        password_field.sendKeys(password);
        submit_button.click();
        sleep(10000);

    }

    public void setCRM_menu() {
        commonUtils.sleep(12000);
        CRM_menu.click();
        Customer_menu.click();
        sleep(3000);
    }

    public void setDashboard_button() {
        sleep(3000);
        Dashboard_button.click();
    }

    public void setAddContactPlus_button() {
        sleep(4000);
        AddContactPlus_button.click();
        sleep(10000);
    }

    public void setContactName() {
        dataPicker = commonUtils.generateRandomString(4);
        contactName = "Contact " + dataPicker;
        ContactName_field.sendKeys(contactName);
    }

    public void setContactType_dropdown() {
        ContactType_dropdown.click();
        sleep(1000);
        First_Option.click();
    }

    public void setDesignation_field() {
        dataPicker = commonUtils.generateRandomString(2);
        salesExecutive = "Customer Support" + dataPicker;
        Designation_field.sendKeys(salesExecutive);
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
        sleep(5000);
    }

    public void setContactSearch_bar() {
        sleep(2000);
        String isContactName_xpath = ("//a[text()='" + contactName + "']");
        WebElement isContactName = getDriver().findElement(By.xpath(isContactName_xpath));
        String isSalesExecutive_xpath = ("//span[text()=' " + salesExecutive + " ']");
        WebElement isSalesExecutivePresent = getDriver().findElement(By.xpath(isSalesExecutive_xpath));
        System.out.println(getDriver().findElement(By.xpath("//a[text()='" + contactName + "']")).getText() + "---------------------------------------<<");
        Assert.assertTrue(isContactName.isDisplayed() && isSalesExecutivePresent.isDisplayed());
        sleep(4000);

    }

    public void sleep(long s) {
        try {
            Thread.sleep(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
