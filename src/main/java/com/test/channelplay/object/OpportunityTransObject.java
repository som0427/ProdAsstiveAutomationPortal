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
import java.util.List;

public class OpportunityTransObject extends DriverBase {

    @FindBy(xpath = "//input[@formcontrolname=\"email\"]")
    private WebElement username_field;

    @FindBy(xpath = "//input[@formcontrolname=\"password\"]")
    private WebElement password_field;

    @FindBy(xpath = "//button[text()=\"Sign In\"]")
    private WebElement submit_button;

    @FindBy(xpath = "//span[text()=\" CRM \"]")
    private WebElement CRM_menu;

    @FindBy(xpath = "//span[text()=' Opportunities ']")
    private WebElement Opportunity_menu;

    @FindBy(xpath = "//span[text()='Add']")
    private WebElement Add_button;

    @FindBy(xpath = "//label[text()=\"Customer Name\"]/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement CustomerName_dropdown;

    @FindBy(xpath = "//mat-option[2]")
    private WebElement First_Option;

    @FindBy(xpath = "//mat-option[3]/mat-pseudo-checkbox")
    private WebElement Second_Option;

    @FindBy(xpath = "//mat-option[3]")
    private WebElement Second1_Option;

    @FindBy(xpath = "//label[text()=\"Opportunity Name\"]/parent::div/following-sibling::div//input")
    private WebElement OpportunityName_field;

    @FindBy(xpath = "//label[text()=\"Description\"]/parent::div/following-sibling::div//input")
    private WebElement Description_field;

    @FindBy(xpath = "//label[text()=\"Contacts\"]/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement Contact_dropdown;

    @FindBy(xpath = "//label[text()=\"Value\"]/parent::div/following-sibling::div//input")
    private WebElement Value_field;

    @FindBy(xpath = "//button[@aria-label=\"Open calendar\"]")
    private WebElement ExpectedClosureCalender_button;

    @FindBy(xpath = "//label[text()=\"Status\"]/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement Status_dropdown;

    @FindBy(xpath = "//label[text()=\"Win probability\"]/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement WinProbability_dropdown;

    @FindBy(xpath = "//mat-option[11]")
    private WebElement WinProp90_Option;

    @FindBy(xpath = "//mat-option[2]")
    private WebElement WinProp100_Option;

    @FindBy(xpath = "//label[text()=\"Address\"]/parent::div/following-sibling::div//textarea")
    private WebElement HomeAddress_Field;

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

    @FindBy(xpath = "//label[text()=\"About\"]/parent::div/following-sibling::div//input")
    private WebElement About_field;

    @FindBy(xpath = "//label[text()=\"Store phone no\" ]/parent::div/following-sibling::div//input")
    private WebElement StorePhone_Field;

    @FindBy(xpath = "//label[text()=\"Religion\"]/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement Religion_dropdown;

    @FindBy(xpath = "//label[text()=\"Company Test\"]/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement CompanyTest_dropdown;

    @FindBy(xpath = "//label[text()=\"Store Email\"]/parent::div/following-sibling::div//input")
    private WebElement StoreEmail_field;

    @FindBy(xpath = "//label[text()=\"Opportunity plan\"]/parent::div/following-sibling::div//input")
    private WebElement OpportunityPlan_upload;

    @FindBy(xpath = "//label[text()=\"Store Testimonial\"]/parent::div/following-sibling::div//input")
    private WebElement TestimonialVideo_upload;

    @FindBy(xpath = "//button[text()=\"Save\"]")
    private WebElement Save_button;

    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    private WebElement Search_bar;

    @FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/kt-company-dashboard/div/div/div[3]/kt-widget5-opportunity/div/div[1]/div[2]/div/a/i")
    private WebElement AddOpportunityPlus_button;

    @FindBy(xpath = "//h4[text()='Add New Opportunity']/ancestor::div[2]//button[text()='Cancel']")
    private WebElement Cancel_button;

    @FindBy(xpath = "//mat-select-trigger/ancestor::div[2]")
    private WebElement ClickSelf_dropdown;

    @FindBy(xpath = "//span[contains (text(),\"Team\")]")
    private WebElement ClickTeam_option;

    @FindBy(xpath = "//img[@title=\"Edit\"]")
    private WebElement Edit_button;

    //new calendar xpath
    @FindBy(xpath = "//mat-month-view/table/tbody")
    private WebElement ExpectedClosureDate_CalendarTable;

    @FindBy(xpath = "//button[@aria-label=\"Next month\"]")
    private WebElement NextMonth_button;


    //Global Code
    CommonUtils commonUtils = new CommonUtils();
    Actions actions = new Actions(getDriver());
    public String OpportunitytName;
    public String dataPicker;
    public String storeEmail;
    public String CompanyEmail;
    public String customerName;

    public OpportunityTransObject() {
        PageFactory.initElements(getDriver(), this);
    }

    public void loginCRM(String username, String password) {
        username_field.sendKeys(username);
        password_field.sendKeys(password);
        submit_button.click();
        sleep(15000);

    }

    public void Customer() {
        commonUtils.sleep(12000);
        CRM_menu.click();
        sleep(2000);
        Opportunity_menu.click();
        sleep(8000);
    }

    public void setAdd_button() {
        sleep(3000);
        Add_button.click();
        sleep(6000);
    }

    public void setCustomerName_dropdown() {
        CustomerName_dropdown.click();
        sleep(1000);
        First_Option.click();
    }


    public void setOpportunityName_field() {
        dataPicker = commonUtils.generateRandomString(5);
        OpportunitytName = "Peter" + dataPicker;
        OpportunityName_field.sendKeys(OpportunitytName);
    }

    public void setDescription_field() {
        Description_field.sendKeys("Opportunity plan is ready");
    }

    public void setContact_dropdown() {
        Contact_dropdown.click();
        sleep(1000);
        First_Option.click();
        WebElement freeSpace = getDriver().findElement(By.xpath("//label[text()=\"Contacts\"]"));
        actions.moveToElement(freeSpace).click().perform();
    }

    public void setValue_field() {

        Value_field.sendKeys("10000");
    }

    public String CurrentDay_picker() {
        Date CurrentDate = new Date();
        SimpleDateFormat DateFormat = new SimpleDateFormat("d");
        return DateFormat.format(CurrentDate);
    }

    public void setExpectedClosureCalender_button() {
        ExpectedClosureCalender_button.click();
        sleep(2000);
        String CurrentDate = CurrentDay_picker();
        ExpectedClosureDate_CalendarTable.findElement(By.xpath("//td//div[text()=' " + CurrentDate + " ']")).click();

    }

    public void setStatus_dropdown() {
        Status_dropdown.click();
        sleep(1000);
        First_Option.click();
    }

    public void setWinProbability_dropdown() {
        WinProbability_dropdown.click();
        sleep(1000);
        WinProp90_Option.click();
    }

    public void setHomeAddress_Field() {
        HomeAddress_Field.sendKeys("Kolkata new town sector-5");
    }

    public void setCountry_Dropdown() {
        Country_Dropdown.click();
        sleep(3000);
    }

    public void setIndia_Option() {
        sleep(1000);
        India_Option.click();
    }

    public void setState_Dropdown() {
        State_Dropdown.click();
    }

    public void setAndhraPradesh_Option() {
        sleep(1000);
        AndhraPradesh_Option.click();
    }

    public void setCity_Dropdown() {
        sleep(1000);
        City_Dropdown.click();
    }

    public void setAdilabad_Option() {
        Adilabad_Option.click();
        sleep(3000);
    }

    public void setAbout_field() {
        About_field.sendKeys("Channel play Sales person");
    }

    public void setStorePhone_Field() {
        StorePhone_Field.sendKeys("8764567654");
    }

    public void setReligion_dropdown() {
        Religion_dropdown.click();
        sleep(1000);
        First_Option.click();
    }

    public void setCompanyTest_dropdown() {
        CompanyTest_dropdown.click();
        sleep(1000);
        First_Option.click();
        WebElement freeSpace = getDriver().findElement(By.xpath("//label[text()=\"Store Email\"]"));
        actions.moveToElement(freeSpace).click().perform();
    }

    public void setStoreEmail_field() {
        dataPicker = commonUtils.generateRandomString(1);
        storeEmail = dataPicker + "@channelplay.com";
        StoreEmail_field.sendKeys(storeEmail);
    }

    public void setOpportunityPlan_upload() {
        String rootPath = System.getProperty("user.dir");
        System.out.println(rootPath + "....................>");
        OpportunityPlan_upload.sendKeys(rootPath + "/Files/samplePDF.pdf");
        sleep(3000);
    }

    public void setTestimonialVideo_upload() {
        String rootPath = System.getProperty("user.dir");
        System.out.println(rootPath + "....................>");
        TestimonialVideo_upload.sendKeys(rootPath + "/Files/dummymp4.mp4");
        sleep(3000);
    }

    public void setSave_button() {
        actions.moveToElement(Save_button).build().perform();
        Save_button.click();
        sleep(10000);
    }

    //Scenario: Add a new opportunity with Save and Add New
    public void setSearch_bar() {
        sleep(2000);
        // Search_bar.click();
        WebElement selectGridView = getDriver().findElement(By.xpath("//*[@id=\"mat-select-0\"]/div/div[1]/span/mat-select-trigger"));
        selectGridView.click();
        WebElement clickListview = getDriver().findElement(By.xpath("//mat-option[1]"));
        clickListview.click();
        sleep(2000);
        Search_bar.sendKeys(OpportunitytName);
        sleep(2000);
        List<WebElement> rows = getDriver().findElements(By.xpath("//div[text()='" + OpportunitytName + "']"));
        if (rows.size() < 1) {
            ClickSelf_dropdown.click();
            sleep(3000);
            ClickTeam_option.click();
            sleep(5000);
            Search_bar.clear();
            Search_bar.sendKeys(OpportunitytName);
            sleep(2000);
        }
        WebElement isOpportunityName = getDriver().findElement(By.xpath("//div[text()='" + OpportunitytName + "']"));

        sleep(2000);

        Assert.assertTrue(isOpportunityName.isDisplayed());
    }

    //these below functions used for CD_AddOpportunity.feature
    public void setAddOpportunityPlus_button() {
        sleep(4000);
        AddOpportunityPlus_button.click();
        sleep(10000);
    }

    public void setOpportunityAdded() {
        String AddOpportunity_xpath = "//a[text()='" + OpportunitytName + "']";
        WebElement AddOpportunity = getDriver().findElement(By.xpath(AddOpportunity_xpath));
        String isStatusActive_xpath = "//span[text()=' In Progress ']";
        WebElement isInProgressDisplayed = getDriver().findElement(By.xpath(isStatusActive_xpath));
        Assert.assertTrue(AddOpportunity.isDisplayed() && isInProgressDisplayed.isDisplayed());

    }

    public void setCancel_button() {
        actions.moveToElement(Cancel_button).build().perform();
        Cancel_button.click();
        commonUtils.sleep(10000);
        getDriver().navigate().refresh();
        sleep(5000);

    }

    //Scenario: Edits and update the value of opportunity transaction
    public void UpdateOpportunity() {
        Edit_button.click();
        sleep(5000);
        OpportunityName_field.clear();
        Description_field.clear();
        Value_field.clear();
        HomeAddress_Field.clear();
        About_field.clear();
        StorePhone_Field.clear();
        StoreEmail_field.clear();
        sleep(2000);
        WebElement PageArea = getDriver().findElement(By.xpath("//h4[text()='Edit Opportunity']/ancestor::div[2]"));
        List<WebElement> files = PageArea.findElements(By.xpath("//img[@class=\"close-svg\"]"));
        for (int a = 1; a <= files.size(); a++) {
            WebElement ClearDocuments_button = getDriver().findElement(By.xpath("//img[@class=\"close-svg\"]"));
            ClearDocuments_button.click();
            sleep(3000);

        }
    }

    public void userSelectContactFromDropdownListFirstOptionToSecond() {
        Contact_dropdown.click();
        sleep(2000);
        WebElement Unchecked_checkbox = getDriver().findElement(By.xpath("//span[text()=' AssistiveContactgidc ']"));
        Unchecked_checkbox.click();
        sleep(2000);
        actions.moveToElement(Second_Option).build().perform();
        Second_Option.click();
        sleep(1000);
        WebElement freeSpace = getDriver().findElement(By.xpath("//label[text()=\"Description\"]"));
        actions.moveToElement(freeSpace).click().perform();
        sleep(1000);
    }

    public void userSelectStatusFromDropdownFirstOptionToSecondOption() {
        Status_dropdown.click();
        sleep(1000);
        Second1_Option.click();

    }

    public void userChangeTheWinProbabilityFromDropdown() {
        WinProbability_dropdown.click();
        sleep(1000);
        WinProp100_Option.click();

    }

    public void userSelectReligionFromDropdownFirstOptionToSecond() {
        Religion_dropdown.click();
        sleep(1000);
        Second1_Option.click();
    }

    public void userSelectCompanyTestFromDropdownListFirstOptionToSecond() {
        CompanyTest_dropdown.click();
        sleep(1000);
        First_Option.click();
        sleep(1000);
        Second1_Option.click();
        WebElement freeSpace = getDriver().findElement(By.xpath("//label[text()=\"Store Email\"]"));
        actions.moveToElement(freeSpace).click().perform();
    }


    public void userSelectExpectedClosureDateWithCurrentDate() {
        ExpectedClosureCalender_button.click();
        sleep(2000);
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

