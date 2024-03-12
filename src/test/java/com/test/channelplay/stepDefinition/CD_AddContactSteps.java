package com.test.channelplay.stepDefinition;

import com.test.channelplay.object.CD_AddContactObject;
import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CD_AddContactSteps extends DriverBase {

    CD_AddContactObject CDAddContactObject = new CD_AddContactObject();
    CommonUtils commonUtils = new CommonUtils();
    @Given("after login to crm user will be on the Customer page under CRM menu")
    public void afterLoginToCrmUserWillBeOnTheCustomerPageUnderCRM() {
        getDriver().get(GetProperty.value("appUrl"));
        commonUtils.validatePage("Assistive");
        CDAddContactObject.loginCRM(GetProperty.value("username"), GetProperty.value("password"));
    }

    @And("user select CRM and Click on Customer submenu")
    public void userSelectCRMAndClickOnCustomerSubmenu() {
        CDAddContactObject.setCRM_menu();

    }

    @When("user Click on dashboard button")
    public void userClickOnDashboardButton() {
        CDAddContactObject.setDashboard_button();
    }

    @And("user click on plussign contact button")
    public void userClickOnPlussignContactButton() {
        CDAddContactObject.setAddContactPlus_button();
    }

    @And("Contact_user Enter contact Name")
    public void contact_userEnterContactName() {
        CDAddContactObject.setContactName();
    }

    @And("select ContactType dropdown and click first option")
    public void selectContactTypeDropdownAndClickFirstOption() {
        CDAddContactObject.setContactType_dropdown();
    }

    @And("enter designation")
    public void enterDesignation() {
        CDAddContactObject.setDesignation_field();
    }

    @And("enter mobile number from CD")
    public void enterMobileNumberFromCD() {
        CDAddContactObject.setMobileNumber_Field();
    }

    @And("enter contact email")
    public void enterContactEmail() {
        CDAddContactObject.setEmail_Field();
    }

    @And("enter contact address")
    public void enterContactAddress() {
        CDAddContactObject.setAddress_Field();
    }

    @And("select contact Country")
    public void selectContactCountry() {
        CDAddContactObject.setCountry_Dropdown();
        CDAddContactObject.setIndia_Option();
    }

    @And("select contact State")
    public void selectContactState() {
        CDAddContactObject.setState_Dropdown();
        CDAddContactObject.setAndhraPradesh_Option();
    }

    @And("select contact City")
    public void selectContactCity() {
        CDAddContactObject.setCity_Dropdown();
        CDAddContactObject.setAdilabad_Option();
    }

    @And("select data list group")
    public void selectDataListGroup() {
        CDAddContactObject.setDataListGroups_dropdown();
    }

    @And("select company test from dropdown list")
    public void selectCompanyTestFromDropdownList() {
        CDAddContactObject.setCompanyTest_Dropdown();
    }

    @And("enter company phone number")
    public void enterCompanyPhoneNumber() {
        CDAddContactObject.setCompanyPhoneNumber_Field();
    }

    @And("select date")
    public void selectDate() {
        CDAddContactObject.setStartedDateCalender_button();
    }

    @And("upload certificate")
    public void uploadCertificate() {
        CDAddContactObject.setCertificate_upload();
    }

    @And("upload video")
    public void uploadVideo() {
        CDAddContactObject.setLocationVideo_upload();
    }

    @And("select Data List Module from dropdown")
    public void selectDataListModuleFromDropdown() {
        CDAddContactObject.setDataListModule_Dropdown();
    }

    @And("enter Company Registered Email Test")
    public void enterCompanyRegisteredEmailTest() {
        CDAddContactObject.setCompanyRegistredEmail_field();
    }

    @And("click contact save button")
    public void clickContactSaveButton() {
        CDAddContactObject.setContactSave_button();
    }


    @Then("user check contact will added successfully with active status or not")
    public void userCheckContactWillAddedSuccessfullyWithActiveStatusOrNot() {
        CDAddContactObject.setContactSearch_bar();
    }
}


