package com.test.channelplay.object;

import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class userList extends DriverBase {

    CommonUtils commonutils = new CommonUtils();


    @FindBy(xpath = "//ul[@class=\"menu-nav\"]//following-sibling::li/a//descendant::span[text()=\" Admin \"]")
    WebElement Admin_menu;

    @FindBy(xpath = "//li/a[@href=\"/users\"]/span[text()=\" Users \"]")
    WebElement Users_subMenu;

    @FindBy(xpath = "//div/h5[text()=\" Users \"]")
    WebElement users_title;

    @FindBy(xpath = "//div/button/span[text()=\"Add\"]")
    WebElement Add_button;

    @FindBy(xpath = "//div/h4[@class=\"modal-title\" and text()=\"Add New User\"]")
    WebElement addNewUser_title;

    @FindBy(xpath = "//div[@id=\"div_28000\"]/div/following-sibling::div/mat-form-field/div/div/div[@class=\"mat-form-field-infix\"]/input")
    WebElement firstName_field;

    @FindBy(xpath = "//div[@id=\"div_28001\"]/div/following-sibling::div/mat-form-field/div/div/div[@class=\"mat-form-field-infix\"]/input")
    WebElement lastName_field;

    @FindBy(xpath = "//div[@id=\"div_28002\"]/div/following-sibling::div/mat-form-field/div/div/div[@class=\"mat-form-field-infix\"]/input")
    WebElement work_email_field;

    @FindBy(xpath = "//div[@id=\"div_28003\"]/div/following-sibling::div/div/div/mat-form-field/div/div/div[@class=\"mat-form-field-infix\"]/input")
    WebElement mobile_no_field;

    @FindBy(xpath = "//div[@id=\"div_28004\"]/div[@id=\"select_28004\"]/mat-form-field/div/div[@class=\"mat-form-field-flex\"]")
    WebElement User_Role_dropdown;

    @FindBy(xpath = "//mat-option/span[@class=\"mat-option-text\" and text()=\" Admin \"]")
    WebElement User_Role_dropdown_admin;

    @FindBy(xpath = "//mat-option/span[@class=\"mat-option-text\" and text()=\" User \"]")
    WebElement User_Role_dropdown_user;

//    @FindBy(xpath = "//div[@id=\"div_28005\"]/div/following-sibling::div[@id=\"select_28005\"]/mat-form-field/div/div/div/mat-select/div/div[@class=\"mat-select-value\"]")
    @FindBy(xpath = "//div[@id=\"div_28005\"]/div/following-sibling::div//descendant::div[@class=\"mat-select-value\"]")
    WebElement Reports_To_dropdown;

    @FindBy(xpath = "//div[@class=\"cdk-overlay-pane\"]/div/div//following-sibling::mat-option")
    WebElement Reports_To_dropdown_options;

    @FindBy(xpath = "//label[@class=\"mat-checkbox-layout\"]/div")
    WebElement Set_password_checkbox;

    @FindBy(xpath = "//div[@id=\"div_28007\"]/div/following-sibling::div//descendant::input")
    WebElement password_field;

    @FindBy(xpath = "//button[text()=\"Save\"]")
    private WebElement save_button;



    public userList() {
        PageFactory.initElements(getDriver(), this);
    }

    public void User_clicks_on_menu_admin_and_submenu_users() {
        Admin_menu.click();
        Users_subMenu.click();
    }

    public boolean User_is_on_users_page() {
        boolean usersTitle = users_title.isDisplayed();
        return usersTitle;
    }

    public void Clicks_on_add_button_opens_add_new_user_page() {
        Add_button.click();
        addNewUser_title.isDisplayed();
        commonutils.sleep(2000);
    }

    public void Fill_data_into_first_name_and_last_name(String fname, String lname) {
        firstName_field.sendKeys(fname);
        lastName_field.sendKeys(lname);
    }

    public void Enter_email_id_in_email_field(String work_email) {
        work_email_field.sendKeys(work_email);
    }

    public void Enter_mobile_number(String mob_no) {
        mobile_no_field.sendKeys(mob_no);
    }

    public void Select_user_role_from_dropdown() {
        User_Role_dropdown.click();
        User_Role_dropdown_user.click();
    }

    public void Select_reports_to_from_dropdown() {
        Reports_To_dropdown.click();
        List<WebElement>rep_dropdown_ele = getDriver().findElements(By.xpath("//div[@class=\"cdk-overlay-pane\"]/div/div//following-sibling::mat-option/span"));
System.out.println(" size: " +rep_dropdown_ele.size() +"....");
        for (WebElement rep_dropdown_ele_size : rep_dropdown_ele) {
            String repDropdown_values = rep_dropdown_ele_size.getText();
            System.out.println("Values of Reports To: " +repDropdown_values);
            if (repDropdown_values.contentEquals("1channel - 1channelcrm1@gmail.com")) {
                rep_dropdown_ele_size.click();
                break;
            }
        }
/*        for (int i=0; i<rep_dropdown_ele.size(); i++) {
            WebElement rep_dropdown_ele_size = rep_dropdown_ele.get(i);
//            System.out.println("rep vals: " +rep_dropdown_ele_size);
            String repDropdown_values = rep_dropdown_ele_size.getText();
            System.out.println("Values of Reports To: " +repDropdown_values);
            if (repDropdown_values.contentEquals("1channel - 1channelcrm1@gmail.com")) {
                rep_dropdown_ele_size.click();
                break;
            }
        } */
    }

    public void Click_on_checkbox_of_set_password() {
        Set_password_checkbox.click();
    }

    public void Enter_password_in_password_checkbox() {
        password_field.sendKeys("1");
        commonutils.sleep(9000);
    }

    public void Clicks_on_save_button() {
        save_button.click();
        commonutils.sleep(3000);
    }

}
