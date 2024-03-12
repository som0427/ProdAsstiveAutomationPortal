package com.test.channelplay.stepDefinition;

import com.test.channelplay.object.ValidateAccountSetupObject;
import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidateAccountSetupSteps extends DriverBase {

    CommonUtils commonUtils = new CommonUtils();
    ValidateAccountSetupObject validateAccountSetupObject = new ValidateAccountSetupObject();

    @Given("user will be on the Account Setup page under System under Settings")
    public void userWillBeOnTheAccountSetupPageUnderSystemUnderSettings() {
        getDriver().get(GetProperty.value("appUrl"));
        commonUtils.validatePage("Assistive");
        validateAccountSetupObject.login(GetProperty.value("username"), GetProperty.value("password"));
    }

    @When("user select Customer Settings tab")
    public void userSelectCustomerSettingsTab() {
        validateAccountSetupObject.UserSelectCustomerSettingsTab();
    }

    @And("change value in the field Rename Customer")
    public void changeValueInTheFieldRenameCustomer() {
        validateAccountSetupObject.ChangeValueInTheFieldRenameCustomer();
    }

    @And("change value in the field What would be the plural Customer")
    public void changeValueInTheFieldWhatWouldBeThePluralCustomer() {
        validateAccountSetupObject.ChangeValueInTheFieldWhatWouldBeThePluralCustomer();
    }

    @And("hit save button on Account Setup screen")
    public void hitSaveButtonOnAccountSetupScreen() {
        validateAccountSetupObject.HitSaveButtonOnAccountSetupScreen();
    }

    @And("Sign Out the account and log in again")
    public void signOutTheAccountAndLogInAgain() {
        validateAccountSetupObject.SignOutTheAccountAndLogInAgain(GetProperty.value("username"), GetProperty.value("password"));
    }

    @And("select CRM sub menu under Settings menu")
    public void selectCRMSubMenuUnderSettingsMenu() {
        validateAccountSetupObject.SelectCRMSubMenuUnderSettingsMenu();
    }

    @Then("in the CRM dropdown renamed field will show")
    public void inTheCRMDropdownRenamedCustomerWillShow() {
        validateAccountSetupObject.InTheCRMDropdownRenamedCustomerWillShow();
    }

    @And("select CRM menu")
    public void selectCRMMenu() {
        validateAccountSetupObject.SelectCRMMenu();
    }

    @Then("changed field for plural will show in the sub menu")
    public void changedCustomerForPluralWillShowInTheSubMenu() {
        validateAccountSetupObject.ChangedCustomerForPluralWillShowInTheSubMenu();
    }

    @And("rename that fields with original name for Customer")
    public void renameThatFieldsWithOriginalNameForCustomer() {
        validateAccountSetupObject.RenameThatFieldsWithOriginalNameForCustomer(GetProperty.value("username"), GetProperty.value("password"));
    }

    @Then("fields name will be changed successfully")
    public void fieldsNameWillBeChangedSuccessfully() {
        validateAccountSetupObject.FieldsNameWillBeChangedSuccessfully();
    }


    @When("user select Contact Settings tab")
    public void userSelectContactSettingsTab() {
        validateAccountSetupObject.UserSelectContactSettingsTab();
    }

    @And("change value in the field Rename Contact")
    public void changeValueInTheFieldRenameContact() {
        validateAccountSetupObject.ChangeValueInTheFieldRenameContact();
    }

    @And("change value in the field What would be the plural Contact")
    public void changeValueInTheFieldWhatWouldBeThePluralContact() {
        validateAccountSetupObject.ChangeValueInTheFieldWhatWouldBeThePluralContact();
    }

    @And("rename that fields with original name for Contact")
    public void renameThatFieldsWithOriginalNameForContact() {
        validateAccountSetupObject.RenameThatFieldsWithOriginalNameForContact(GetProperty.value("username"), GetProperty.value("password"));
    }

    @When("user select Opportunity Settings tab")
    public void userSelectOpportunitySettingsTab() {
        validateAccountSetupObject.UserSelectOpportunitySettingsTab();
    }

    @And("change value in the field Rename Opportunity")
    public void changeValueInTheFieldRenameOpportunity() {
        validateAccountSetupObject.ChangeValueInTheFieldRenameOpportunity();
    }

    @And("change value in the field What would be the plural Opportunity")
    public void changeValueInTheFieldWhatWouldBeThePluralOpportunity() {
        validateAccountSetupObject.ChangeValueInTheFieldWhatWouldBeThePluralOpportunity();
    }

    @And("rename that fields with original name for Opportunity")
    public void renameThatFieldsWithOriginalNameForOpportunity() {
        validateAccountSetupObject.RenameThatFieldsWithOriginalNameForOpportunity(GetProperty.value("username"), GetProperty.value("password"));
    }

    public boolean opportunityFeature_isSelected;
    @And("disable the Opportunity Feature")
    public void disableTheOpportunityFeature() {
        opportunityFeature_isSelected = validateAccountSetupObject.DisableTheOpportunityFeature();
    }

    @Then("Opportunity sub menu will not appear")
    public void opportunitySubMenuWillNotAppear() {
        validateAccountSetupObject.OpportunitySubMenuWillNotAppear();
    }

    @Then("Opportunity Plural sub menu will not appear")
    public void opportunityPluralSubMenuWillNotAppear() {
        validateAccountSetupObject.OpportunityPluralSubMenuWillNotAppear();
    }

    @And("again start the opportunity feature")
    public void againStartTheOpportunityFeature() {
        if(opportunityFeature_isSelected){
            validateAccountSetupObject.AgainStartTheOpportunityFeature();
        }
    }
}
