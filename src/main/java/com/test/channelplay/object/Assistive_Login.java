package com.test.channelplay.object;

import com.test.channelplay.utils.DriverBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assistive_Login extends DriverBase {

    @FindBy(xpath = "//input[@formcontrolname=\"email\"]")
    WebElement login_username;
    @FindBy(xpath = "//input[@formcontrolname=\"password\"]")
    WebElement login_password;
    @FindBy(xpath = "//button[text()=\"Sign In\"]")
    WebElement SignIn;


    public Assistive_Login() {
        PageFactory.initElements(getDriver(), this);
    }

    public void loginToCRM(String uid, String pass) {
        login_username.clear();
        login_username.sendKeys(uid);
        login_password.clear();
        login_password.sendKeys(pass);
        SignIn.click();
    }
}
