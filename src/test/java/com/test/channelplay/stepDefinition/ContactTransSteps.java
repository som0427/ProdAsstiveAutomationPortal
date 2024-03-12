package com.test.channelplay.stepDefinition;

import com.test.channelplay.object.ContactTransObject;
import com.test.channelplay.object.CustomerTransObjectProd;
import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactTransSteps extends DriverBase {

    ContactTransObject contactTransObject = new ContactTransObject();
    CustomerTransObjectProd customerTransObjectProd = new CustomerTransObjectProd();
    CommonUtils commonUtils = new CommonUtils();
    @Given("after login to crm home page user will be on the Contact page under CRM")
    public void AfterLoginToCrmHomePageUserWillBeOnTheContactPageUnderCrm() {
        getDriver().get(GetProperty.value("appUrl"));
        commonUtils.validatePage("Assistive");
        contactTransObject.loginCRM(GetProperty.value("username"), GetProperty.value("password"));
    }
    @And("user select CRM and Click on Contact")
    public void userSelectCRMAndClickOnContact() {
        contactTransObject.setCRM_menu();
    }

    @When("User Click on Add contact button")
    public void userClickOnAddContactButton() {
        contactTransObject.setAdd_button();
    }

    @And("user Enter contact Name")
    public void userEnterContactName() {
        contactTransObject.setContactName();
    }

    @And("user select ContactType dropdown and click first option")
    public void userSelectContactTypeDropdownAndClickFirstOption() {
        contactTransObject.setContactType_dropdown();
    }

    @And("user select assign customer")
    public void userSelectAssignCustomer() {
        contactTransObject.setAssignCustomer_dropdown();
    }

    @And("user enter designation")
    public void userEnterDesignation() {
        contactTransObject.setDesignation_field();
    }

    @And("user enter mobile number")
    public void userEnterMobileNumber() {
        contactTransObject.setMobileNumber_Field();
    }

    @And("user enter contact email")
    public void userEnterContactEmail() {
        contactTransObject.setEmail_Field();
    }

    @And("user enter contact address")
    public void userEnterContactAddress() {
        contactTransObject.setAddress_Field();
    }

    @And("user select contact Country")
    public void userSelectContactCountry() {
        contactTransObject.setCountry_Dropdown();
        contactTransObject.setIndia_Option();
    }

    @And("user select contact State")
    public void userSelectContactState() {
        contactTransObject.setState_Dropdown();
        contactTransObject.setAndhraPradesh_Option();
    }

    @And("user select contact City")
    public void userSelectContactCity() {
        contactTransObject.setCity_Dropdown();
        contactTransObject.setAdilabad_Option();
    }

    @And("user select data list group")
    public void userSelectDataListGroup() {
        contactTransObject.setDataListGroups_dropdown();
   }

    @And("user select company test from dropdown list")
    public void userSelectCompanyTestFromDropdownList() {
        contactTransObject.setCompanyTest_Dropdown();
    }

    @And("user select date")
    public void userSelectDate() {
        contactTransObject.setStartedDateCalender_button();
    }

    @And("user upload certificate")
    public void userUploadCertificate() {
        contactTransObject.setCertificate_upload();
    }

    @And("user upload video")
    public void userUploadVideo() {
        contactTransObject.setLocationVideo_upload();
    }

    @And("user select Data List Module from dropdown")
    public void userSelectDataListModuleFromDropdown() {
        contactTransObject.setDataListModule_Dropdown();
    }

    @And("user enter Company Registered Email Test")
    public void userEnterCompanyRegisteredEmailTest() {
        contactTransObject.setCompanyRegistredEmail_field();
    }

    @And("user click contact save button")
    public void userClickContactSaveButton() {
        contactTransObject.setContactSave_button();
    }

    @Then("check contact will added successfully with active status")
    public void checkContactWillAddedSuccessfullyWithActiveStatus() {
        contactTransObject.setContactSearch_bar();
    }

    @And("user enter company phone number")
    public void userEnterCompanyPhoneNumber() {
        contactTransObject.setCompanyPhoneNumber_Field();
    }

    @And("then user click on cancel form button")
    public void thenUserClickOnCancelFormButton() {
        contactTransObject.setCancelForm_button();
    }

    @And("user select ContactType dropdown and click first option to second option")
    public void userSelectContactTypeDropdownAndClickFirstOptionToSecondOption() {
        contactTransObject.userSelectContactTypeDropdownAndClickFirstOptionToSecondOption();

    }

    @When("User Clicks on Edit button")
    public void userClicksOnEditButton() {
        contactTransObject.setEdit_button();
    }

    @And("user select assign customer first option to second")
    public void userSelectAssignCustomerFirstOptionToSecond() {
        contactTransObject.userSelectAssignCustomerFirstOptionToSecond();

    }

    @And("user select data list group from dropdown list first to second")
    public void userSelectDataListGroupFromDropdownListFirstToSecond() {
        contactTransObject.userSelectDataListGroupFromDropdownListFirstToSecond();
    }

    @And("user select Data List Module from dropdown from first option to second option")
    public void userSelectDataListModuleFromDropdownFromFirstOptionToSecondOption() {
        contactTransObject.userSelectDataListModuleFromDropdownFromFirstOptionToSecondOption();

    }

    @And("user select company test from dropdown list first option to second")
    public void userSelectCompanyTestFromDropdownListFirstOptionToSecond() {
        contactTransObject.userSelectCompanyTestFromDropdownListFirstOptionToSecond();

    }

    @And("user select date and click on current date")
    public void userSelectDateAndClickOnCurrentDate() {
        contactTransObject.setEditCalender_button();
    }
}
