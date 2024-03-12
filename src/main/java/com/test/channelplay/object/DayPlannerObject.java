package com.test.channelplay.object;
import com.test.channelplay.utils.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DayPlannerObject extends DriverBase {
    @FindBy(xpath = "//input[@formcontrolname=\"email\"]")
    private WebElement email_field;

    @FindBy(xpath = "//input[@formcontrolname=\"password\"]")
    private WebElement password_field;

    @FindBy(xpath = "//button[text()=\"Sign In\"]")
    private WebElement SignIn_button;

    @FindBy(xpath = "//span[text()=\" CRM \"]")
    private WebElement CRM_Menu;

    @FindBy(xpath = "//span[text()=\" Day Planner \"]")
    private WebElement DayPlanner_Menu;

    @FindBy(xpath ="")
    private WebElement Select_date;

    @FindBy(xpath = "//span[text()=\"Save\"]")
    private WebElement Save_button;

    @FindBy(xpath = "//span[text()=\" Activities \"]")
    private WebElement Activities_Menu;

    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    private WebElement Search_Field;

    @FindBy(xpath = "//span[contains(text(),'Team')]")
    private WebElement team_Option;





    public DayPlannerObject() {
        PageFactory.initElements(getDriver(), this);

    }

    public String CustomerNameHolder;

    public void login(String username, String password) {
        email_field.sendKeys(username);
        password_field.sendKeys(password);
        SignIn_button.click();
        sleep(10000);
        CRM_Menu.click();
        sleep(1000);
        DayPlanner_Menu.click();
        sleep(5000);
    }

    public int CurrentDay(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
        String day =  simpleDateFormat.format(date);
        return Integer.parseInt(day);
    }


    public void UserSelectADateForASingleUser(){
        CustomerNameHolder = getDriver().
                findElement(By.xpath("//div[@ref=\"eBodyViewport\"]//div[@role=\"row\"]/div[1]/kt-day-planner-customer-name-row/span")).getText();
        sleep(2000);
        int CurrentDay = CurrentDay();

        if(CurrentDay>16){
            WebElement sideScroll_button = getDriver().findElement(By.xpath("//div[@class=\"ag-body-horizontal-scroll\"]/div[2]"));
            Actions move = new Actions(getDriver());
            move.moveToElement(sideScroll_button).clickAndHold();
            move.moveByOffset(350, 0);
            move.release();
            move.perform();
        }
        sleep(2000);
        WebElement Select_date = getDriver().findElement(By.xpath("//div[@role=\"grid\"]/div[3]/div[2]//div[@aria-colindex='"+(CurrentDay+2)+"']//mat-checkbox"));
        WebElement Select_date_input = getDriver().findElement(By.xpath("//div[@role=\"grid\"]/div[3]/div[2]//div[@aria-colindex='"+(CurrentDay+2)+"']//mat-checkbox//input"));
        if(!Select_date_input.isSelected()) {
            Select_date.click();
        }
        sleep(3000);
    }

    public void UserWillClickOnTheSaveButton(){
        Save_button.click();
        sleep(4000);
    }

    public void UserWillGotoActivitiesMenuUnderCRMMenu() {
        CRM_Menu.click();
        Activities_Menu.click();
        sleep(4000);
    }

    public boolean UserWillSeeTheNewlyCreatedDayPlannerActivityInTheList (){
        Search_Field.sendKeys(CustomerNameHolder);
        sleep(5000);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String ExpectedDate =  simpleDateFormat.format(date);
        boolean result = false;
        List<WebElement> Users = getDriver().findElements(By.xpath("//div[text()='"+CustomerNameHolder+"']"));
        if(Users.size()<1){
            getDriver().findElement(By.xpath("//mat-select-trigger/ancestor::div[2]")).click();
            team_Option.click();
            sleep(5000);
        }
        for (int i = 1; i<=Users.size(); i++) {
            String ActualDate = getDriver().
                    findElement(By.xpath("//div[@ref=\"centerContainer\"]//div[@ref=\"eContainer\"]/div['" + i + "']/div[5]")).getText();
            System.out.println("Actual : "+ActualDate+"   Expected : "+ExpectedDate);
            if (ActualDate.contains(ExpectedDate)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public void sleep(long s) {
        try {
            Thread.sleep(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}