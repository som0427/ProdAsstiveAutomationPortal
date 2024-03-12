package com.test.channelplay.object;

import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CD_EditContactInfoObject extends DriverBase {

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

    @FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/kt-company-dashboard/div/div/div[3]/kt-widget4-company/div/div[1]/div[2]/div/a/img")
    WebElement ClickEditInfo_button;

    @FindBy(xpath = "//label[text()=\"Customer Type\"]/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement CustomerType_dropdown;

    @FindBy(xpath = "//mat-option[3]")
    private WebElement Second_Option;

    @FindBy(xpath = "//label[text()=\"Phone\" ]/parent::div/following-sibling::div//input")
    private WebElement PhoneNumber_Field;

    @FindBy(xpath = "//label[text()=\"Time zone\"]/parent::div//following-sibling::div/mat-form-field/div")
    private WebElement TimeZone_Dropdown;

    @FindBy(xpath = "//mat-option[2]")
    private WebElement FirstToSecond_Option;

    @FindBy(xpath = "//button[text()=\"Save\"]")
    private WebElement Save_button;

    //Global Code
    CommonUtils commonUtils = new CommonUtils();
    Actions actions = new Actions(getDriver());

    public CD_EditContactInfoObject() {
        PageFactory.initElements(getDriver(), this);
    }

    public void loginCRM(String username, String password) {
        username_field.sendKeys(username);
        password_field.sendKeys(password);
        submit_button.click();
        sleep(10000);

    }
    public void setCRM_menu() {
        sleep(3000);
        CRM_menu.click();
        sleep(2000);
        Customer_menu.click();
        sleep(5000);

    }
    public void setDashboard_button(){
        Dashboard_button.click();
        sleep(6000);
    }
    public void setClickEditInfo_button(){
        ClickEditInfo_button.click();
        sleep(3000);
    }
    public void setCustomerType_dropdown(){
        CustomerType_dropdown.click();
        sleep(2000);
        Second_Option.click();
        sleep(1000);
    }
    public void setPhoneNumber_Field(){
        PhoneNumber_Field.clear();
        sleep(1000);
        PhoneNumber_Field.sendKeys("9875676546");
        sleep(2000);
    }
    public void setTimeZone_Dropdown(){
        TimeZone_Dropdown.click();
        Second_Option.click();
        sleep(1000);
        FirstToSecond_Option.click();
        WebElement freeSpace = getDriver().findElement(By.xpath("//label[text()=\"Date\"]"));
        actions.moveToElement(freeSpace).click().perform();
    }
    public void setSave_button() {
        Save_button.click();
        sleep(10000);
    }

    public void sleep(long s) {
        try {
            Thread.sleep(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}