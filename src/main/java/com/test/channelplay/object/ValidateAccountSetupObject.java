package com.test.channelplay.object;

import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.WebDriverUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.security.cert.X509Certificate;
import java.time.Duration;
import java.util.List;

public class ValidateAccountSetupObject extends DriverBase {


    @FindBy(xpath = "//input[@formcontrolname=\"email\"]")
    private WebElement username_field;

    @FindBy(xpath = "//input[@formcontrolname=\"password\"]")
    private WebElement password_field;

    @FindBy(xpath = "//button[text()=\"Sign In\"]")
    private WebElement submit_button;

    @FindBy(xpath = "//span[text()=\" Settings \"]")
    private WebElement settings_menu;

    @FindBy(xpath = "//span[text()=\" System \"]")
    private WebElement system_subMenu;

    @FindBy(xpath = "//span[text()=\" Account Setup \"]")
    private WebElement accountSetup_subMenu;

    @FindBy(xpath = "//div[@role=\"tablist\"]/div/div[2]")
    private WebElement customerSettings_tab;

    @FindBy(xpath = "//label[text()=\"Rename Customer?\"]/parent::div/following-sibling::div//input")
    private WebElement renameCustomer_field;

    @FindBy(xpath = "//label[text()=\"What would be the plural?\"]/parent::div/following-sibling::div//input")
    private WebElement pluralCustomer_field;

    @FindBy(xpath = "//button[text()=\"Save\"]")
    private WebElement save_button;

    @FindBy(xpath = "//kt-topbar//div/div")
    private WebElement UserProfile_section;

    @FindBy(xpath = "//a[text()=\" Sign Out \"]")
    private WebElement signOut_Button;

    @FindBy(xpath = "//span[text()=\" Settings \"]/ancestor::li//span[text()=\" CRM \"]")
    private WebElement CRM_subMenu;

    @FindBy(xpath = "//span[text()=\" CRM \"]")
    private WebElement CRM_menu;



    @FindBy(xpath = "//div[@role=\"tablist\"]/div/div[4]")
    private WebElement ContactSetting_tab;

    @FindBy(xpath = "//label[text()=\"Rename Contact?\"]/parent::div/following-sibling::div//input")
    private WebElement renameContact_field;

    @FindBy(xpath = "//label[text()=\"What would be the plural?\"]/parent::div/following-sibling::div//input")
    private WebElement pluralContact_field;



    @FindBy(xpath = "//div[@role=\"tablist\"]/div/div[3]")
    private WebElement OpportunitySetting_tab;

    @FindBy(xpath = "//label[text()=\"Rename Opportunity?\"]/parent::div/following-sibling::div//input")
    private WebElement renameOpportunity_field;

    @FindBy(xpath = "//label[text()=\"What would be the plural?\"]/parent::div/following-sibling::div//input")
    private WebElement pluralOpportunity_field;


    @FindBy(xpath = "//label[text()=\"Enable Opportunity Feature\"]/parent::div/following-sibling::div//input")
    private WebElement enableOpportunityFeature_checkbox;

    @FindBy(xpath = "//span[text()=\" Customers \"]")
    private WebElement customer_subMenu;


    CommonUtils commonUtils = new CommonUtils();
    WebDriverUtils webDriverUtils = new WebDriverUtils();

    public String originalFieldData;
    public String newFieldData;
    public String originalFieldData_plural;
    public String newFieldData_plural;


    public ValidateAccountSetupObject(){
        PageFactory.initElements(getDriver(), this);
    }

    public void login(String username, String password){
        username_field.sendKeys(username);
        password_field.sendKeys(password);
        submit_button.click();
        commonUtils.sleep(10000);
        webDriverUtils.waitUntilVisible(getDriver(), settings_menu, Duration.ofSeconds(30000));
        settings_menu.click();
        commonUtils.sleep(1000);
        system_subMenu.click();
        accountSetup_subMenu.click();
        commonUtils.sleep(5000);
    }

    public void UserSelectCustomerSettingsTab(){
        customerSettings_tab.click();
        commonUtils.sleep(2000);
    }

    public void ChangeValueInTheFieldRenameCustomer(){
        originalFieldData = renameCustomer_field.getAttribute("value");
        System.out.println(originalFieldData+"----------------------------------------------------------->");
        renameCustomer_field.clear();
        newFieldData = "Changed Customer";
        renameCustomer_field.sendKeys(newFieldData);
    }

    public void ChangeValueInTheFieldWhatWouldBeThePluralCustomer(){
        originalFieldData_plural = pluralCustomer_field.getAttribute("value");
        System.out.println(originalFieldData_plural+"----------------------------------------------------------->");
        pluralCustomer_field.clear();
        commonUtils.sleep(1000);
        newFieldData_plural = "Changed Customers";
        pluralCustomer_field.sendKeys(newFieldData_plural);
    }

    public void HitSaveButtonOnAccountSetupScreen(){
        webDriverUtils.actionsToMoveToElement(getDriver(), save_button);
        save_button.click();
        commonUtils.sleep(4000);
    }

    public void SignOutTheAccountAndLogInAgain(String username, String password){
        UserProfile_section.click();
        commonUtils.sleep(2000);
        signOut_Button.click();
        commonUtils.sleep(4000);
        username_field.sendKeys(username);
        password_field.sendKeys(password);
        submit_button.click();
        commonUtils.sleep(10000);
        webDriverUtils.waitUntilVisible(getDriver(), settings_menu, Duration.ofSeconds(30000));
    }

    public void SelectCRMSubMenuUnderSettingsMenu(){
        settings_menu.click();
        commonUtils.sleep(1000);
        CRM_subMenu.click();
        commonUtils.sleep(2000);
    }

    public void InTheCRMDropdownRenamedCustomerWillShow(){
        WebElement newField = getDriver().findElement
                (By.xpath("//span[text()=\" Settings \"]/ancestor::li//span[contains(text(), '"+newFieldData+"')]"));
        Assert.assertTrue(newField.isDisplayed());
    }

    public void SelectCRMMenu(){
        CRM_menu.click();
        commonUtils.sleep(1000);
    }

    public void ChangedCustomerForPluralWillShowInTheSubMenu(){
        WebElement newField = getDriver().findElement
                (By.xpath("//span[contains(text(), '"+newFieldData_plural+"')]"));
        Assert.assertTrue(newField.isDisplayed());
    }

    public void RenameThatFieldsWithOriginalNameForCustomer(String username, String password){
        settings_menu.click();
        commonUtils.sleep(1000);
        system_subMenu.click();
        accountSetup_subMenu.click();
        commonUtils.sleep(5000);

        customerSettings_tab.click();
        commonUtils.sleep(3000);
        renameCustomer_field.clear();
        renameCustomer_field.sendKeys(originalFieldData);

        pluralCustomer_field.clear();
        commonUtils.sleep(1000);
        pluralCustomer_field.sendKeys(originalFieldData_plural);
        HitSaveButtonOnAccountSetupScreen();
        SignOutTheAccountAndLogInAgain(username, password);
    }

    public void FieldsNameWillBeChangedSuccessfully(){
        SelectCRMSubMenuUnderSettingsMenu();
        WebElement newField = getDriver().findElement
                (By.xpath("//span[text()=\" Settings \"]/ancestor::li//span[contains(text(), '"+originalFieldData+"')]"));
        Assert.assertTrue(newField.isDisplayed());

        SelectCRMMenu();
        WebElement newField_plural = getDriver().findElement
                (By.xpath("//span[contains(text(), '"+originalFieldData_plural+"')]"));
        Assert.assertTrue(newField_plural.isDisplayed());
    }




    public void UserSelectContactSettingsTab(){
        ContactSetting_tab.click();
        commonUtils.sleep(2000);
    }

    public void ChangeValueInTheFieldRenameContact(){
        originalFieldData = renameContact_field.getAttribute("value");
        System.out.println(originalFieldData+"----------------------------------------------------------->");
        renameContact_field.clear();
        newFieldData = "Changed Contact";
        renameContact_field.sendKeys(newFieldData);
    }

    public void ChangeValueInTheFieldWhatWouldBeThePluralContact(){
        originalFieldData_plural = pluralContact_field.getAttribute("value");
        System.out.println(originalFieldData_plural+"----------------------------------------------------------->");
        pluralContact_field.clear();
        commonUtils.sleep(1000);
        newFieldData_plural = "Changed Contacts";
        pluralContact_field.sendKeys(newFieldData_plural);
    }

    public void RenameThatFieldsWithOriginalNameForContact(String username, String password){
        settings_menu.click();
        commonUtils.sleep(1000);
        system_subMenu.click();
        accountSetup_subMenu.click();
        commonUtils.sleep(5000);

        ContactSetting_tab.click();
        commonUtils.sleep(3000);
        renameContact_field.clear();
        renameContact_field.sendKeys(originalFieldData);

        pluralContact_field.clear();
        commonUtils.sleep(1000);
        pluralContact_field.sendKeys(originalFieldData_plural);
        HitSaveButtonOnAccountSetupScreen();
        SignOutTheAccountAndLogInAgain(username, password);
    }



    public void UserSelectOpportunitySettingsTab(){
        OpportunitySetting_tab.click();
        commonUtils.sleep(4000);
    }

    public void ChangeValueInTheFieldRenameOpportunity(){
        originalFieldData = renameOpportunity_field.getAttribute("value");
        System.out.println(originalFieldData+"----------------------------------------------------------->");
        renameOpportunity_field.clear();
        newFieldData = "Changed Opportunity";
        renameOpportunity_field.sendKeys(newFieldData);
    }

    public void ChangeValueInTheFieldWhatWouldBeThePluralOpportunity(){
        originalFieldData_plural = pluralOpportunity_field.getAttribute("value");
        System.out.println(originalFieldData_plural+"----------------------------------------------------------->");
        pluralOpportunity_field.clear();
        commonUtils.sleep(1000);
        newFieldData_plural = "Changed Opportunities";
        pluralOpportunity_field.sendKeys(newFieldData_plural);
    }

    public void RenameThatFieldsWithOriginalNameForOpportunity(String username, String password){
        settings_menu.click();
        commonUtils.sleep(1000);
        system_subMenu.click();
        accountSetup_subMenu.click();
        commonUtils.sleep(5000);

        OpportunitySetting_tab.click();
        commonUtils.sleep(3000);
        renameOpportunity_field.clear();
        renameOpportunity_field.sendKeys(originalFieldData);

        pluralOpportunity_field.clear();
        commonUtils.sleep(1000);
        pluralOpportunity_field.sendKeys(originalFieldData_plural);
        HitSaveButtonOnAccountSetupScreen();
        SignOutTheAccountAndLogInAgain(username, password);
    }


    public boolean DisableTheOpportunityFeature(){
        commonUtils.sleep(2000);
        if(enableOpportunityFeature_checkbox.isSelected()){
            getDriver().findElement
                    (By.xpath("//label[text()=\"Enable Opportunity Feature\"]/parent::div/following-sibling::div//mat-checkbox")).click();
            return true;
        }

        return false;
    }

    public void OpportunitySubMenuWillNotAppear(){
        List<WebElement> opportunities = getDriver().
                findElements(By.xpath("//span[text()=\" Settings \"]/ancestor::li//span[contains(text(), 'Opportunity')]"));
        Assert.assertEquals(0, opportunities.size());
    }

    public void OpportunityPluralSubMenuWillNotAppear(){
        List<WebElement> opportunity = getDriver().
                findElements(By.xpath("//span[contains(text(), 'Opportunities')]"));
        Assert.assertEquals(0, opportunity.size());
    }

    public void AgainStartTheOpportunityFeature(){
        settings_menu.click();
        commonUtils.sleep(1000);
        system_subMenu.click();
        accountSetup_subMenu.click();
        commonUtils.sleep(5000);
        UserSelectOpportunitySettingsTab();
        getDriver().findElement
                (By.xpath("//label[text()=\"Enable Opportunity Feature\"]/parent::div/following-sibling::div//mat-checkbox")).click();
        HitSaveButtonOnAccountSetupScreen();
    }


}
