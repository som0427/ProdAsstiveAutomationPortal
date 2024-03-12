package com.test.channelplay.stepDefinition;

import com.test.channelplay.object.OpportunityTransObject;
import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpportunityTransSteps extends DriverBase {

    OpportunityTransObject opportunityTransObject = new OpportunityTransObject();
    CommonUtils commonUtils = new CommonUtils();


    @Given("after successfully login to crm user will be on the Opportunity page under CRM")
    public void afterSuccessfullyLoginToCrmUserWillBeOnTheOpportunityPageUnderCRM() {

        getDriver().get(GetProperty.value("appUrl"));
        commonUtils.validatePage("Assistive");
        opportunityTransObject.loginCRM(GetProperty.value("username"), GetProperty.value("password"));
    }

    @And("user select CRM and Click on Opportunity")
    public void userSelectCRMAndClickOnOpportunity() {
        opportunityTransObject.Customer();
    }

    @When("User click on Add opportunity button")
    public void userClickOnAddOpportunityButton() {
        opportunityTransObject.setAdd_button();
    }

    @And("user select customer name from dropdown")
    public void userSelectCustomerNameFromDropdown() {
        opportunityTransObject.setCustomerName_dropdown();
    }

    @And("user enter opportunity name")
    public void userEnterOpportunityName() {
        opportunityTransObject.setOpportunityName_field();

    }

    @And("user enter description")
    public void userEnterDescription() {
        opportunityTransObject.setDescription_field();
    }

    @And("user select contact from dropdown list")
    public void userSelectContactFromDropdownList() {
        opportunityTransObject.setContact_dropdown();
    }

    @And("user enter value")
    public void userEnterValue() {
        opportunityTransObject.setValue_field();
    }

    @And("user select expected closure date")
    public void userSelectExpectedClosureDate() {
        opportunityTransObject.setExpectedClosureCalender_button();
    }

    @And("user select status from dropdown")
    public void userSelectStatusFromDropdown() {
        opportunityTransObject.setStatus_dropdown();
    }

    @And("user select win probability from dropdown")
    public void userSelectWinProbabilityFromDropdown() {
        opportunityTransObject.setWinProbability_dropdown();
    }

    @And("user enter home address")
    public void userEnterHomeAddress() {
        opportunityTransObject.setHomeAddress_Field();
    }

    @And("user select contact Country from dropdown")
    public void userSelectContactCountryFromDropdown() {
        opportunityTransObject.setCountry_Dropdown();
        opportunityTransObject.setIndia_Option();
    }

    @And("user select contact State from dropdown")
    public void userSelectContactStateFromDropdown() {
        opportunityTransObject.setState_Dropdown();
        opportunityTransObject.setAndhraPradesh_Option();
    }

    @And("user select contact City from dropdown")
    public void userSelectContactCityFromDropdown() {
        opportunityTransObject.setCity_Dropdown();
        opportunityTransObject.setAdilabad_Option();
    }

    @And("user enter about")
    public void userEnterAbout() {
        opportunityTransObject.setAbout_field();
    }

    @And("user enter store phone number")
    public void userEnterStorePhoneNumber() {
        opportunityTransObject.setStorePhone_Field();
    }

    @And("user select religion from dropdown")
    public void userSelectReligionFromDropdown() {
        opportunityTransObject.setReligion_dropdown();
    }

    @And("user select company-test from dropdown list")
    public void userSelectCompanyTestFromDropdownList() {
        opportunityTransObject.setCompanyTest_dropdown();
    }

    @And("user enter store email")
    public void userEnterStoreEmail() {
        opportunityTransObject.setStoreEmail_field();
    }

    @And("user upload opportunity plan document")
    public void userUploadOpportunityPlanDocument() {
        opportunityTransObject.setOpportunityPlan_upload();
    }

    @And("user upload testimonial video")
    public void userUploadTestimonialVideo() {
        opportunityTransObject.setTestimonialVideo_upload();
    }

    @And("user click opportunity save button")
    public void userClickOpportunitySaveButton() {
        opportunityTransObject.setSave_button();
    }

    @Then("check opportunity will added successfully with Customer name or not")
    public void checkOpportunityWillAddedSuccessfullyWithCustomerNameOrNot() {
        opportunityTransObject.setSearch_bar();
    }

    @And("then user click on Opportunity cancel button")
    public void thenUserClickOnOpportunityCancelButton() {
        opportunityTransObject.setCancel_button();
    }

    @When("User Click on Edit button for opportunity")
    public void userClickOnEditButtonForOpportunity() {
        opportunityTransObject.UpdateOpportunity();
    }

    @And("user select contact from dropdown list first option to second")
    public void userSelectContactFromDropdownListFirstOptionToSecond() {
        opportunityTransObject.userSelectContactFromDropdownListFirstOptionToSecond();

    }

    @And("user select status from dropdown first option to second option")
    public void userSelectStatusFromDropdownFirstOptionToSecondOption() {
        opportunityTransObject.userSelectStatusFromDropdownFirstOptionToSecondOption();

    }

    @And("user change the win probability from dropdown")
    public void userChangeTheWinProbabilityFromDropdown() {
        opportunityTransObject.userChangeTheWinProbabilityFromDropdown();
    }

    @And("user select company-test from dropdown list first option to second")
    public void userSelectCompanyTestFromDropdownListFirstOptionToSecond() {
        opportunityTransObject.userSelectCompanyTestFromDropdownListFirstOptionToSecond();
    }

    @And("user select religion from dropdown first option to second")
    public void userSelectReligionFromDropdownFirstOptionToSecond() {
        opportunityTransObject.userSelectReligionFromDropdownFirstOptionToSecond();
    }

    @And("user select expected closure date with current date")
    public void userSelectExpectedClosureDateWithCurrentDate() {
        opportunityTransObject.userSelectExpectedClosureDateWithCurrentDate();

    }
}

