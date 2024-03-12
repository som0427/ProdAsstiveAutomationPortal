package com.test.channelplay.stepDefinition;

import com.test.channelplay.object.CD_EditContactInfoObject;
import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.Constants;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CD_EditContactInfoSteps extends DriverBase {

    CD_EditContactInfoObject cdEditContactInfoObject = new CD_EditContactInfoObject();
    CommonUtils commonUtils = new CommonUtils();

    @Given("after user successfully logged in then user will redirect on home page")
    public void afterUserSuccessfullyLoggedInThenUserWillRedirectOnHomePage() {
        getDriver().get(GetProperty.value("appUrl"));
        commonUtils.validatePage("Assistive");
        cdEditContactInfoObject.loginCRM(GetProperty.value("username"), GetProperty.value("password"));
    }

    @And("then user will click on customer under crm menu")
    public void thenUserWillClickOnCustomerUnderCrmMenu() {
        cdEditContactInfoObject.setCRM_menu();
    }

    @When("user click on customer dashboard")
    public void userClickOnCustomerDashboard() {
        cdEditContactInfoObject.setDashboard_button();
    }

    @And("then click on contact info edit button")
    public void thenClickOnContactInfoEditButton() {
        cdEditContactInfoObject.setClickEditInfo_button();
    }

    @And("change the customer type from Customer to Partner")
    public void changeTheCustomerTypeFromCustomerToPartner() {
        cdEditContactInfoObject.setCustomerType_dropdown();
    }

    @And("update the phone number")
    public void updateThePhoneNumber() {
        cdEditContactInfoObject.setPhoneNumber_Field();
    }

    @And("change the time zone")
    public void changeTheTimeZone() {
        cdEditContactInfoObject.setTimeZone_Dropdown();
    }

    @Then("save the info date")
    public void saveTheInfoDate() {
        cdEditContactInfoObject.setSave_button();
    }
}

