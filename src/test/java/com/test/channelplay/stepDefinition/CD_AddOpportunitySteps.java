package com.test.channelplay.stepDefinition;

import com.test.channelplay.object.CD_AddContactObject;
import com.test.channelplay.object.OpportunityTransObject;
import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CD_AddOpportunitySteps extends DriverBase {

    OpportunityTransObject opportunityTransObject = new OpportunityTransObject();
    CD_AddContactObject CDAddContactObject = new CD_AddContactObject();
    CommonUtils commonUtils = new CommonUtils();

    @Given("after user successfully logged in to crm user will be on the home page")
    public void afterUserSuccessfullyLoggedInToCrmUserWillBeOnTheHomePage() {
        getDriver().get(GetProperty.value("appUrl"));
        commonUtils.validatePage("Assistive");
        opportunityTransObject.loginCRM(GetProperty.value("username"), GetProperty.value("password"));
    }

    @And("user select CRM and Click on Customer menu")
    public void userSelectCRMAndClickOnCustomerMenu() {
        CDAddContactObject.setCRM_menu();
    }

    @When("User click on Add dashboard button")
    public void userClickOnAddDashboardButton() {
        CDAddContactObject.setDashboard_button();

    }

    @And("user click on plussign opportunity button")
    public void userClickOnPlussignOpportunityButton() {
       opportunityTransObject.setAddOpportunityPlus_button();
    }

    @And("user_enter opportunity name")
    public void user_enterOpportunityName() {
        opportunityTransObject.setOpportunityName_field();
    }

    @And("user_enter description")
    public void user_enterDescription() {
        opportunityTransObject.setDescription_field();
    }

    @And("user_select contact from dropdown list")
    public void user_selectContactFromDropdownList() {
        opportunityTransObject.setContact_dropdown();
    }

    @And("user_enter value")
    public void user_enterValue() {
        opportunityTransObject.setValue_field();

    }

    @And("user_select expected closure date")
    public void user_selectExpectedClosureDate() {
        opportunityTransObject.setExpectedClosureCalender_button();
    }

    @And("user_select status from dropdown")
    public void user_selectStatusFromDropdown() {
        opportunityTransObject.setStatus_dropdown();
    }

    @And("user_select win probability from dropdown")
    public void user_selectWinProbabilityFromDropdown() {
        opportunityTransObject.setWinProbability_dropdown();
        opportunityTransObject.setHomeAddress_Field();
    }

    @And("user_enter home address")
    public void user_enterHomeAddress() {
    }

    @And("user_select contact Country from dropdown")
    public void user_selectContactCountryFromDropdown() {
        opportunityTransObject.setCountry_Dropdown();
        opportunityTransObject.setIndia_Option();
    }

    @And("user_select contact State from dropdown")
    public void user_selectContactStateFromDropdown() {
        opportunityTransObject.setState_Dropdown();
        opportunityTransObject.setAndhraPradesh_Option();
    }

    @And("user_select contact City from dropdown")
    public void user_selectContactCityFromDropdown() {
        opportunityTransObject.setCity_Dropdown();
        opportunityTransObject.setAdilabad_Option();
    }

    @And("user_enter about")
    public void user_enterAbout() {
        opportunityTransObject.setAbout_field();
    }

    @And("user_enter store phone number")
    public void user_enterStorePhoneNumber() {
        opportunityTransObject.setStorePhone_Field();
    }

    @And("user_select religion from dropdown")
    public void user_selectReligionFromDropdown() {
        opportunityTransObject.setReligion_dropdown();
    }

    @And("user_select company-test from dropdown list")
    public void user_selectCompanyTestFromDropdownList() {
        opportunityTransObject.setCompanyTest_dropdown();
    }

    @And("user_enter store email")
    public void user_enterStoreEmail() {
        opportunityTransObject.setStoreEmail_field();
    }

    @And("user_upload opportunity plan document")
    public void user_uploadOpportunityPlanDocument() {
        opportunityTransObject.setOpportunityPlan_upload();
    }

    @And("user_upload testimonial video")
    public void user_uploadTestimonialVideo() {
        opportunityTransObject.setTestimonialVideo_upload();
    }

    @And("user_click opportunity save button")
    public void user_clickOpportunitySaveButton() {
        opportunityTransObject.setSave_button();
    }

    @Then("check_opportunity will added successfully with Customer name or not")
    public void check_opportunityWillAddedSuccessfullyWithCustomerNameOrNot() {
        opportunityTransObject.setOpportunityAdded();
    }
}



