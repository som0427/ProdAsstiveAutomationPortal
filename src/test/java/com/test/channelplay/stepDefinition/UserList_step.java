package com.test.channelplay.stepDefinition;

import com.test.channelplay.object.Assistive_Login;
import com.test.channelplay.object.CRMloginObject;
import com.test.channelplay.object.userList;
import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UserList_step extends DriverBase {

    userList userlist = new userList();
    Assistive_Login login = new Assistive_Login();
    CommonUtils commonUtils = new CommonUtils();

    @Given("user loggedIn to Assistive project")
    public void user_logged_in_to_assistive_project() {
        getDriver().get(GetProperty.value("appUrl"));
        commonUtils.validatePage("Assistive");
        login.loginToCRM(GetProperty.value("username"),GetProperty.value("password"));
    }


    @When("user clicks on menu Admin and submenu Users")
    public void user_clicks_on_menu_admin_and_submenu_users() {
        userlist.User_clicks_on_menu_admin_and_submenu_users();
    }


    @Given("user is on Users page")
    public void user_is_on_users_page() {
        boolean user_Title = userlist.User_is_on_users_page();
        Assert.assertTrue(user_Title);
    }


    @Then("clicks on Add button opens Add new user page")
    public void clicks_on_add_button_opens_add_new_user_page() {
        userlist.Clicks_on_add_button_opens_add_new_user_page();
    }


    @Then("fill data into FirstName and LastName")
    public void fill_data_into_first_name_and_last_name() {
        userlist.Fill_data_into_first_name_and_last_name(GetProperty.value("newUser_firstname"), GetProperty.value("newUser_lastname"));
    }


    @Then("enter email id in email field")
    public void enter_email_id_in_email_field() {
        userlist.Enter_email_id_in_email_field("test1_user@crm.com");
    }


    @Then("enter mobile number from user list")
    public void enter_mobile_number_from_user_list() {
        userlist.Enter_mobile_number("9876543210");
    }


    @Then("select User Role from dropdown")
    public void select_user_role_from_dropdown() {
        userlist.Select_user_role_from_dropdown();
    }


    @Then("select reports to from dropdown")
    public void select_reports_to_from_dropdown() {
        userlist.Select_reports_to_from_dropdown();
    }


    @Then("click on checkbox of set password")
    public void click_on_checkbox_of_set_password() {
        userlist.Click_on_checkbox_of_set_password();
    }


    @Then("enter password in password checkbox")
    public void enter_password_in_password_checkbox() {
        userlist.Enter_password_in_password_checkbox();
    }


    @Then("clicks on Save button")
    public void clicks_on_save_button() {
        userlist.Clicks_on_save_button();
    }

}
