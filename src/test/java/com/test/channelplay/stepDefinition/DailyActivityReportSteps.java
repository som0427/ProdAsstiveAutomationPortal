package com.test.channelplay.stepDefinition;

import com.test.channelplay.object.Assistive_Login;
import com.test.channelplay.object.DailyActivityReportObject;

import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DailyActivityReportSteps extends DriverBase {

    CommonUtils commonUtils = new CommonUtils();
    Assistive_Login login = new Assistive_Login();
    DailyActivityReportObject dailyActivityReportsObject = new DailyActivityReportObject();


    @Given("user logged in to Assistive")
    public void user_logged_in_to_Assistive() {
        getDriver().get(GetProperty.value("appUrl"));
        commonUtils.validatePage("Assistive");
        login.loginToCRM(GetProperty.value("username"),GetProperty.value("password"));
    }

    @When("clicks on menu Analytics and submenu Reports then Daily Activity Report")
    public void clicksOnMenuAnalyticsAndSubmenuReportsThenDailyActivityReport() {
        dailyActivityReportsObject.ClicksOnMenuAnalyticsAndSubmenuReportsThenDailyActivityReport();
    }

    @When("user selects date range from Calendar")
    public void userSelectsDateRangeFromCalendar() {
        dailyActivityReportsObject.UserSelectsDateRangeFromCalendar(GetProperty.value("daily_calendar_startDate"), GetProperty.value("daily_calendar_endDate"));
    }

    @And("click on apply button")
    public void clickOnApplyButton() {
        dailyActivityReportsObject.ClickOnApplyButton();
    }

    @And("Reports to be shown")
    public void reportsToBeShown() {
        dailyActivityReportsObject.ReportsToBeShown();
    }

    @Then("click on Export button excel get downloaded")
    public void clickOnExportButtonExcelGetsDownloaded() {
        dailyActivityReportsObject.ClickOnExportButtonExcelGetsDownloaded();
    }

}
