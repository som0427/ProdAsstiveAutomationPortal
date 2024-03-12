package com.test.channelplay.stepDefinition;

import com.test.channelplay.object.LoginCRMObject;
import com.test.channelplay.object.ReportBuilderObject;
import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.tools.ant.taskdefs.Get;

public class ReportBuilderSteps extends DriverBase {

    CommonUtils commonUtils = new CommonUtils();
    LoginCRMObject loginCRMObject = new LoginCRMObject();
    ReportBuilderObject reportBuilderObject = new ReportBuilderObject();
    @Given("user successfully logged in then user will redirect on home page")
    public void userSuccessfullyLoggedInThenUserWillRedirectOnHomePage() {
      getDriver().get(GetProperty.value("appUrl"));
      commonUtils.validatePage("Assistive");
        loginCRMObject.login(GetProperty.value("username"), GetProperty.value("password"));
    }
    @And("then user will click on Report builder under Analytics menu")
    public void thenUserWillClickOnReportBuilderUnderAnalyticsMenu() {
        reportBuilderObject.thenUserWillClickOnReportBuilderUnderAnalyticsMenu();
    }
    @When("user select the report type {string} of Report builder")
    public void userSelectTheReportTypeOfReportBuilder(String args) {
        reportBuilderObject.userSelectTheReportTypeOfReportBuilder(args);
    }

    @And("user close the Report type Up-Arrow button")
    public void userCloseTheReportTypeUpArrowButton() {
        reportBuilderObject.userCloseTheReportTypeUpArrowButton();
    }
    @And("user click on entity dropdown")
    public void userClickOnEntityDropdown() {
        reportBuilderObject.userClickOnEntityDropdown();

    }


    @And("user select entity option {string}")
    public void userSelectEntityOption(String arg0) {
        reportBuilderObject.userSelectEntityOption(arg0);
    }
    @And("user search entity field {string} from entity field dropdown and drag & drop into the Field section")
    public void userSearchEntityFieldFromEntityFieldDropdownAndDragDropIntoTheFieldSection(String arg0) {
        reportBuilderObject.userSearchEntityFieldFromEntityFieldDropdownAndDragDropIntoTheFieldSection(arg0);
    }

    @And("user search entity field {string} from entity field dropdown and drag & drop into the Measure section")
    public void userSearchEntityFieldFromEntityFieldDropdownAndDragDropIntoTheMeasureSection(String arg0) {
        reportBuilderObject.userSearchEntityFieldFromEntityFieldDropdownAndDragDropIntoTheMeasureSection(arg0);
    }

    @And("user search entity field {string} from entity field dropdown and drag & drop into the Filters section")
    public void userSearchEntityFieldFromEntityFieldDropdownAndDragDropIntoTheFiltersSection(String arg0) {
        reportBuilderObject.userSearchEntityFieldFromEntityFieldDropdownAndDragDropIntoTheFiltersSection(arg0);
    }

    @And("user select Condition {string} and Value {string} under Filter screen")
    public void userSelectConditionAndValueUnderFilterScreen(String arg0, String arg1) {
        reportBuilderObject.userSelectConditionAndValueUnderFilterScreen(arg0, arg1);
    }


    @And("user click on Show Preview button and select save button on the preview section")
    public void UserClickOnShowPreviewButtonAndSelectSaveButtonOnThePreviewSection() {
        reportBuilderObject.UserClickOnShowPreviewButtonAndSelectSaveButtonOnThePreviewSection();
    }

    @And("user enter Name {string} and Description {string} on the Add New screen")
    public void userEnterNameAndDescriptionOnTheAddNewScreen(String arg0, String arg1) {
        reportBuilderObject.userEnterNameAndDescriptionOnTheAddNewScreen(arg0, arg1);
    }


    @And("user select Dashboard {string} and Select Existing Dashboard {string} and select Dashboard Name {string}  OR Enter New Dashboard Name {string} with DashboardName as {string}")
    public void userSelectDashboardAndSelectExistingDashboardAndSelectDashboardNameOREnterNewDashboardName(String arg0, String arg1, String arg2, String arg3, String arg4) {
        reportBuilderObject.userSelectDashboardAndSelectExistingDashboardAndSelectDashboardNameOREnterNewDashboardName(arg0, arg1, arg2, arg3, arg4);
    }

    @And("user select Reports Menu {string} from location")
    public void userSelectReportsMenuFromLocation(String arg0) {
        reportBuilderObject.userSelectReportsMenuFromLocation(arg0);
    }

    @And("user click on Add New screen Save button")
    public void userClickOnAddNewScreenSaveButton() {
        reportBuilderObject.userClickOnAddNewScreenSaveButton();
    }


    @Then("select Report Catalogs submenu under Analytics and the new Created Report will be shown as {string}")
    public void selectReportCatalogsSubmenuUnderAnalyticsAndTheNewCreatedReportWillBeShownAs(String arg0) {
        reportBuilderObject.selectReportCatalogsSubmenuUnderAnalyticsAndTheNewCreatedReportWillBeShownAs(arg0);
    }

    @Then("if Report is created under Dashboard {string} and user select Dashboard submenu under Analytics and the new Created Report will be shown as {string}")
    public void ifReportIsCreatedUnderDashboardAndUserSelectDashboardSubmenuUnderAnalyticsAndTheNewCreatedReportWillBeShownAs(String Dashboard, String arg1) {
        if(Dashboard.equals("YES")){
            reportBuilderObject.ifReportIsCreatedUnderDashboardAndUserSelectDashboardSubmenuUnderAnalyticsAndTheNewCreatedReportWillBeShownAs(arg1);
        }

    }

    @Then("if Report is created under Reports submenu {string} and user select Reports submenu under Analytics and the new Created Report will be shown as {string}")
    public void ifReportIsCreatedUnderReportsSubmenuAndUserSelectReportsSubmenuUnderAnalyticsAndTheNewCreatedReportWillBeShownAs(String ReportsMenu, String arg1) {
        if (ReportsMenu.equals("YES")) {
            reportBuilderObject.ifReportIsCreatedUnderReportsSubmenuAndUserSelectReportsSubmenuUnderAnalyticsAndTheNewCreatedReportWillBeShownAs(arg1);
        }
    }
}
