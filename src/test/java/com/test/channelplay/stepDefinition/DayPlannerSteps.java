package com.test.channelplay.stepDefinition;

import com.test.channelplay.object.DayPlannerObject;
import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DayPlannerSteps extends DriverBase {

    CommonUtils commonUtils = new CommonUtils();
    DayPlannerObject dayPlannerObject = new DayPlannerObject();

    @Given("After login the user will be on the Day Planner page under CRM menu")
    public void afterLoginTheUserWillBeOnTheDayPlannerPageUnderCRMMenu() {
        getDriver().get(GetProperty.value("appUrl"));
        commonUtils.validatePage("Assistive");
        dayPlannerObject.login(GetProperty.value("username"),GetProperty.value("password"));
    }

    @When("user select a date for a single user")
    public void userSelectADateForASingleUser() {
        dayPlannerObject.UserSelectADateForASingleUser();
    }

    @And("user will click on the Save Button")
    public void userWillClickOnTheSaveButton() {
        dayPlannerObject.UserWillClickOnTheSaveButton();
    }

    @And("User will goto Activities Menu under CRM Menu")
    public void userWillGotoActivitiesMenuUnderCRMMenu() {
        dayPlannerObject.UserWillGotoActivitiesMenuUnderCRMMenu();
    }

    @Then("User will see the newly created Day Planner Activity in the list")
    public void userWillSeeTheNewlyCreatedDayPlannerActivityInTheList()
    {
        Assert.assertTrue(dayPlannerObject.UserWillSeeTheNewlyCreatedDayPlannerActivityInTheList());
    }
}
