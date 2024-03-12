package com.test.channelplay.stepDefinition;

import com.test.channelplay.object.LoginCRMObject;
import com.test.channelplay.object.WF_ContactCreatedObject;
import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WFContactCreatedSteps extends DriverBase {

    WF_ContactCreatedObject wfContactCreatedObject = new WF_ContactCreatedObject();
    LoginCRMObject loginCRMObject = new LoginCRMObject();
    CommonUtils commonUtils = new CommonUtils();

    @Given("user logged in to Assistive project successfully")
    public void UserLoggedInToAssistiveProjectSuccessfully() {
        getDriver().get(GetProperty.value("appUrl"));
        commonUtils.validatePage("Assistive");
        loginCRMObject.login(GetProperty.value("username"), GetProperty.value("password"));
    }
    @And("User clicks on Admin menu and click on Workflows")
    public void userClicksOnAdminMenuAndClickOnWorkflows() {
        wfContactCreatedObject.userClicksOnAdminMenuAndClickOnWorkflows();
    }
    @When("clicks on Add New button to a new workflow")
    public void clicksOnAddNewButtonToANewWorkflow() {
        wfContactCreatedObject.clicksOnAddNewButtonToANewWorkflow();
    }
    @And("user enter workflow name_field")
    public void userEnterWorkflowName_field() {
        wfContactCreatedObject.userEnterWorkflowName_field();
    }
    @And("user enter workflow description_field")
    public void userEnterWorkflowDescription_field() {
        wfContactCreatedObject.userEnterWorkflowDescription_field();
    }
    @And("user select entity from dropdown")
    public void userSelectEntityFromDropdown() {
        wfContactCreatedObject.userSelectEntityFromDropdown();
    }
    @And("user select trigger from dropdown")
    public void userSelectTriggerFromDropdown() {
        wfContactCreatedObject.userSelectTriggerFromDropdown();
    }
    @And("Click on save_button")
    public void clickOnSave_button() {
        wfContactCreatedObject.clickOnSave_button();
    }
    @And("user redirect on the newly created workflow page and Validate the WF Name")
    public void UserRedirectOnTheNewlyCreatedWorkflowPageAndValidateTheWfNam() {
        wfContactCreatedObject.UserRedirectOnTheNewlyCreatedWorkflowPageAndValidateTheWfName();
    }
    @Then("user click on back button and check the workflow added successfully or not")
    public void userClickOnBackButtonAndCheckTheWorkflowAddedSuccessfullyOrNot() {
        wfContactCreatedObject.userClickOnBackButtonAndCheckTheWorkflowAddedSuccessfullyOrNot();
    }
    //Scenario2
    @And("user click on on workflow contact created workflow arrow button")
    public void userClickOnOnWorkflowContactCreatedWorkflowArrowButton() {
        wfContactCreatedObject.userClickOnOnWorkflowContactCreatedWorkflowArrowButton();
    }
    @And("user click on plus button to add new action")
    public void userClickOnPlusButtonToAddNewAction() {
        wfContactCreatedObject.userClickOnPlusButtonToAddNewAction();
    }
    @And("user select first Email Action")
    public void userSelectFirstEmailAction() {
        wfContactCreatedObject.userSelectFirstEmailAction();
    }
    @And("click on Next button")
    public void clickOnNextButton() {
        wfContactCreatedObject.clickOnNextButton();
    }
    @And("user select To email from dropdown checkbox list")
    public void userSelectToEmailFromDropdownCheckboxList() {
        wfContactCreatedObject.userSelectToEmailFromDropdownCheckboxList();
    }
    @And("user click on Owner checkbox")
    public void userClickOnOwnerCheckbox() {
        wfContactCreatedObject.userClickOnOwnerCheckbox();
    }
    @And("user click on Reporting Manager checkbox")
    public void userClickOnReportingManagerCheckbox() {
        wfContactCreatedObject.userClickOnReportingManagerCheckbox();
    }
    @And("user click on Selected User checkbox")
    public void userClickOnSelectedUserCheckbox() {
        wfContactCreatedObject.userClickOnSelectedUserCheckbox();
    }
    @And("user click on Custom Email-Id checkbox")
    public void userClickOnCustomEmailIdCheckbox() {
    }
    @And("user select from Users dropdown list")
    public void userSelectFromUsersDropdownList() {
    }

    @And("user enter email id for custom email's")
    public void userEnterEmailIdForCustomEmailS() {
    }

    @And("user select Carbon copy \\(CC)")
    public void userSelectCarbonCopyCC() {
    }

    @And("user enter email Subject")
    public void userEnterEmailSubject() {
    }

    @And("User Draft the email for sending user's")
    public void userDraftTheEmailForSendingUserS() {
    }

    @And("User select placeholder")
    public void userSelectPlaceholder() {
    }

    @And("user select bold the email font")
    public void userSelectBoldTheEmailFont() {
    }

    @And("user select italic the email font")
    public void userSelectItalicTheEmailFont() {
    }

    @And("user select underline font style")
    public void userSelectUnderlineFontStyle() {
    }

    @And("user select the bullet list")
    public void userSelectTheBulletList() {
    }

    @And("user select the font size")
    public void userSelectTheFontSize() {
    }

    @And("user select the font to left align to right align")
    public void userSelectTheFontToLeftAlignToRightAlign() {
    }

    @And("user select the heading")
    public void userSelectTheHeading() {
    }

    @And("user select the font style")
    public void userSelectTheFontStyle() {
    }

    @And("user select the font color")
    public void userSelectTheFontColor() {
    }

    @And("user select the font background color")
    public void userSelectTheFontBackgroundColor() {
    }

    @And("user select the alignment")
    public void userSelectTheAlignment() {
    }

    @And("user select the reset button")
    public void userSelectTheResetButton() {
    }

    @And("user add the hyperlink in email content")
    public void userAddTheHyperlinkInEmailContent() {
    }

    @And("user select delete button to check it's working or not as expected")
    public void userSelectDeleteButtonToCheckItSWorkingOrNotAsExpected() {
    }

    @And("user will click on Save button")
    public void userWillClickOnSaveButton() {
    }

    @And("user active the workflow")
    public void userActiveTheWorkflow() {
        wfContactCreatedObject.userActiveTheWorkflow();
    }

    @Then("user check email action added successfully")
    public void userCheckEmailActionAddedSuccessfully() {
    }
}
