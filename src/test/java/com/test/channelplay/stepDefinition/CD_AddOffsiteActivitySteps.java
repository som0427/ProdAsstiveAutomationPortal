package com.test.channelplay.stepDefinition;

import com.test.channelplay.object.CD_AddOffsiteActivityObject;
import com.test.channelplay.object.CD_AddOffsiteActivityObject;
import com.test.channelplay.object.LoginCRMObject;
import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CD_AddOffsiteActivitySteps extends DriverBase {

    CommonUtils commonUtils = new CommonUtils();
    CD_AddOffsiteActivityObject addOffsiteActivityObject = new CD_AddOffsiteActivityObject();
    LoginCRMObject loginCRMObject = new LoginCRMObject();

    @Given("after successfully logged in to crm user will be on the home page")
    public void afterSuccessfullyLoggedInToCrmUserWillBeOnTheHomePage() {
        getDriver().get(GetProperty.value("appUrl"));
        commonUtils.validatePage("Assistive");
        loginCRMObject.login(GetProperty.value("username"), GetProperty.value("password"));
    }

    @And("user select CRM and Click on Customers menu")
    public void userSelectCRMAndClickOnCustomersMenu() {
        addOffsiteActivityObject.setCRM_menu();
    }

    @When("user click on customer edit button")
    public void userClickOnCustomerEditButton() {
        addOffsiteActivityObject.setdashboardButton();
    }

    @And("user click on plus button")
    public void userClickOnPlusButton() {
        addOffsiteActivityObject.setPlus_button();
    }

    @And("user select Opportunity under offsite activity")
    public void userSelectOpportunityUnderOffsiteActivity() {
        addOffsiteActivityObject.setSelectOpportunity_dropdown();
    }

    @And("user enter title under offsite activity")
    public void userEnterTitleUnderOffsiteActivity() {
        addOffsiteActivityObject.setTitle_field();
    }

    @And("user enter Update Opportunity Value under offsite activity")
    public void userEnterUpdateOpportunityValueUnderOffsiteActivity() {
        addOffsiteActivityObject.setUpdate_Opportunity_Value_Field();
    }

    @And("user select Update Opportunity Status under offsite activity")
    public void userSelectUpdateOpportunityStatusUnderOffsiteActivity() {
        addOffsiteActivityObject.setUpdateOpportunityStatus_dropdown();
    }

    @And("user select Update Exp Closure Date under offsite activity")
    public void userSelectUpdateExpClosureDateUnderOffsiteActivity() {
        addOffsiteActivityObject.setUpdateExpClosureDate_CalenderButton();

    }

    @And("user select Update Win Probability under offsite activity")
    public void userSelectUpdateWinProbabilityUnderOffsiteActivity() {
        addOffsiteActivityObject.setUpdateWinProbability_dropdown();
    }

    @And("user select Contact under offsite activity")
    public void userSelectContactUnderOffsiteActivity() {
        addOffsiteActivityObject.setContact_dropdown();
    }

    @And("user enter testActivity under offsite activity")
    public void userEnterTestActivityUnderOffsiteActivity() {
        addOffsiteActivityObject.setTestActivity_field();
    }


    @And("user select  offsite activity country")
    public void userSelectOffsiteActivityCountry() {
        addOffsiteActivityObject.setCountry_Dropdown();
    }

    @And("user select offsite activity State")
    public void userSelectOffsiteActivityState() {
        addOffsiteActivityObject.setState_Dropdown();
    }

    @And("user select offsite activity City")
    public void userSelectOffsiteActivityCity() {
        addOffsiteActivityObject.setCity_Dropdown();
    }

    @And("hit save button under offsite activity")
    public void hitSaveButtonUnderOffsiteActivity() {

        addOffsiteActivityObject.setSave_button();
    }

    @Then("new offsite activity will show in the list")
    public void newOffsiteActivityWillShowInTheList() {
        addOffsiteActivityObject.newOffsiteActivityWillShowInTheList();
    }

    @And("user select CRM and Click on Contact menu")
    public void userSelectCRMAndClickOnContactMenu() {
        addOffsiteActivityObject.userSelectCRMAndClickOnContactMenu();
    }

    @When("user click on contact Dashboard button")
    public void userClickOnContactDashboardButton() {
        addOffsiteActivityObject.userClickOnContactDashboardButton();
    }

    @And("user select customer name")
    public void userSelectCustomerName() {
        addOffsiteActivityObject.userSelectCustomerName();
    }

    @When("user click on Opportunity Dashboard button")
    public void userClickOnOpportunityDashboardButton() {
        addOffsiteActivityObject.userClickOnOpportunityDashboardButton();
    }

    @And("user select CRM and Click on Activities menu")
    public void userSelectCRMAndClickOnActivitiesMenu() {
        addOffsiteActivityObject.userSelectCRMAndClickOnActivitiesMenu();

    }
    @When("user click on Add Activities button")
    public void userClickOnAddActivitiesButton() {
        addOffsiteActivityObject.userClickOnAddActivitiesButton();

    }

    @And("user select offsite activity Option")
    public void userSelectOffsiteActivityOption() {
        addOffsiteActivityObject.userSelectOffsiteActivityOption();

    }

    @And("User click on plus button and Select Onsite Activities option")
    public void UserClickOnPlusButtonAndSelectOnsiteActivitiesOption() {
        addOffsiteActivityObject.UserClickOnPlusButtonAndSelectOnsiteActivitiesOption();

    }

    @Then("new Onsite activity will show in the list")
    public void newOnsiteActivityWillShowInTheList() {
        addOffsiteActivityObject.newOnsiteActivityWillShowInTheList();

    }

    @And("user enter title under Onsite activity")
    public void userEnterTitleUnderOnsiteActivity() {
        addOffsiteActivityObject.userEnterTitleUnderOnsiteActivity();
    }

    @And("User click save button under offsite activity")
    public void userClickSaveButtonUnderOffsiteActivity() {
        addOffsiteActivityObject.setSaveCRMActivities_button();
    }

    @Then("new offsite activities will show in the list")
    public void newOffsiteActivitiesWillShowInTheList() {
        addOffsiteActivityObject.newOffsiteActivitiesWillShowInTheList();
    }

    @And("user select Onsite activity Option")
    public void userSelectOnsiteActivityOption() {
        addOffsiteActivityObject.userSelectOnsiteActivityOption();

    }

    @And("user select Opportunity under onsite activity")
    public void userSelectOpportunityUnderOnsiteActivity() {
        addOffsiteActivityObject.setSelectOpportunity_dropdown();
    }

    @And("user enter title under Onsite activity activity")
    public void userEnterTitleUnderOnsiteActivityActivity() {
        addOffsiteActivityObject.userEnterTitleUnderOnsiteActivity();
    }

    @And("user enter Update Opportunity Value under onsite activity")
    public void userEnterUpdateOpportunityValueUnderOnsiteActivity() {
        addOffsiteActivityObject.setUpdate_Opportunity_Value_Field();
    }

    @And("user select Update Opportunity Status under onsite activity")
    public void userSelectUpdateOpportunityStatusUnderOnsiteActivity() {
        addOffsiteActivityObject.setUpdateOpportunityStatus_dropdown();
    }

    @And("user select Update Exp Closure Date under onsite activity")
    public void userSelectUpdateExpClosureDateUnderOnsiteActivity() {
        addOffsiteActivityObject.setUpdateExpClosureDate_CalenderButton();
    }

    @And("user select Update Win Probability under onsite activity")
    public void userSelectUpdateWinProbabilityUnderOnsiteActivity() {
        addOffsiteActivityObject.setUpdateWinProbability_dropdown();
    }

    @And("user select Contact under onsite activity")
    public void userSelectContactUnderOnsiteActivity() {
        addOffsiteActivityObject.setContact_dropdown();
    }

    @And("User click save button under onsite activity")
    public void userClickSaveButtonUnderOnsiteActivity() {
        addOffsiteActivityObject.setSaveCRMActivities_button();
    }

    @Then("new onsite activities will show in the list")
    public void newOnsiteActivitiesWillShowInTheList() {
        addOffsiteActivityObject.newOnsiteActivitiesWillShowInTheList();
    }
}
