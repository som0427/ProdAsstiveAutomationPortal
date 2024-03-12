package com.test.channelplay.stepDefinition;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.test.channelplay.object.CustomerTransObjectProd;
import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerTransStepsProd extends DriverBase {

    CustomerTransObjectProd customerTransObjectProd = new CustomerTransObjectProd();
    ExtentTest test;
    CommonUtils commonUtils = new CommonUtils();
    Listeners listeners = new Listeners();


    ExtentReports extenetReporterNG = ExtenetReporterNG.getreporterObject();


    @Given("after login to crm user will be on the Customer page under CRM")
    public void afterLoginToCrmUserWillBeOnTheCustomerPageUnderCRM() {
        test= extenetReporterNG.createTest("Start Test");
                getDriver().get(GetProperty.value("appUrl"));
        commonUtils.validatePage("Assistive");
        customerTransObjectProd.loginCRM(GetProperty.value("username"), GetProperty.value("password"));
    }


    @And("user select CRM and Click on Customer")
    public void userSelectCRMAndClickOnCustomer() {
         customerTransObjectProd.Customer();
    }

    @When("User Click on Add button")
    public void userClickOnAddButton() {
        customerTransObjectProd.UserClickOnAddButton();

    }

    @And("user Enter Customer Name")
    public void userEnterCustomerName() {
        customerTransObjectProd.addCus();
    }

    @And("user select CustomerType dropdown and click first option")
    public void userSelectCustomerTypeDropdownAndClickFirstOption() {
        customerTransObjectProd.setCustomerType_dropdown();

    }

    @And("user enter address")
    public void userEnterAddress() {
        customerTransObjectProd.setAddress_Field();
    }

       @And("user select Country")
    public void userSelectCountry() {
        customerTransObjectProd.setCountry_Dropdown();
        customerTransObjectProd.setIndia_Option();
    }

    @And("user select State")
    public void userSelectState() {
        customerTransObjectProd.setState_Dropdown();
        customerTransObjectProd.setAndhraPradesh_Option();
    }

    @And("user select City")
    public void userSelectCity() {
        customerTransObjectProd.setCity_Dropdown();
        customerTransObjectProd.setAdilabad_Option();
    }

    @And("user upload photo")
    public void userUploadPhoto() {
        customerTransObjectProd.setPhoto_upload();
    }

    @And("user enter phone number")
    public void userEnterPhoneNumber() {
        customerTransObjectProd.setPhone_Field();
    }

    @And("user select timezone dropdown and click on first option")
    public void userSelectTimezoneDropdownAndClickOnFirstOption() {
        customerTransObjectProd.setTimeZone_Dropdown();
    }

    @And("user click calender button and click select current date")
    public void userClickCalenderButtonAndClickSelectCurrentDate() {
        customerTransObjectProd.setCalender_button();
    }

    @And("user enter email")
    public void userEnterEmail() {
        customerTransObjectProd.setEmail_Field();
    }

    @And("user upload document docs,pdf,ppt.xlsx")
    public void userUploadDocumentDocsPdfPptXlsx() {
        customerTransObjectProd.setDocument_upload();
    }

    @And("user upload video mpfour,mpg")
    public void userUploadVideoMpfourMpg() {
        customerTransObjectProd.setVideo_upload();
    }

    @And("user select select gender and click first option")
    public void userSelectSelectGenderAndClickFirstOption() {
        customerTransObjectProd.setGender_Dropdown();
    }

    @Then("user click save button")

    public void userClickSaveButton() {
        customerTransObjectProd.setSave_button();
    }


    @Then("customer will added successfully with active status")
    public void customerWillAddedSuccessfullyWithActiveStatus() {
        customerTransObjectProd.setSearch_bar();
      }

    @And("user click save and Add New button")
    public void userClickSaveAndAddNewButton() {
        customerTransObjectProd.setSaveAndAddNew_button();

    }

    @And("then user click on cancel button")
    public void thenUserClickOnCancelButton() {
        customerTransObjectProd.setCancel_button();
    }
    //Scenario: Edit Customer with all fields
    @When("User Click on Edit button")
    public void userClickOnEditButton() {
        customerTransObjectProd.setEdit_button();

    }

    @And("user select CustomerType dropdown and click first option to Second option")
    public void userSelectCustomerTypeDropdownAndClickFirstOptionToSecondOption() {
        customerTransObjectProd.setChangeCustomerType();
    }

    @And("user select Country india to UAE")
    public void userSelectCountryIndiaToUAE() {
        customerTransObjectProd.UAECountryOption();
    }

    @And("user select State Dubai")
    public void userSelectStateDubai() {
        customerTransObjectProd.StateOptionDubai();
    }

    @And("user select City Dubai")
    public void userSelectCityDubai() {
        customerTransObjectProd.DubaiCityOption();
    }

    @And("user select timezone dropdown and click on first option to second option")
    public void userSelectTimezoneDropdownAndClickOnFirstOptionToSecondOption() {
        customerTransObjectProd.EditTimeZone_Dropdown();
    }

    @And("user select select gender and click first option to second option")
    public void userSelectSelectGenderAndClickFirstOptionToSecondOption() {
    }

    @And("user click calender button and click current date")
    public void userClickCalenderButtonAndClickCurrentDate() {

        customerTransObjectProd.setEditCalender_button();
        extenetReporterNG.flush();
        ReportEmailSender reportEmailSender = new ReportEmailSender();
        reportEmailSender.sendEmailWithAttachment();
    }
}
