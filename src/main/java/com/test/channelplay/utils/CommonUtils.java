package com.test.channelplay.utils;

import com.test.channelplay.object.CRMloginObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import org.openqa.selenium.interactions.Action;

import static java.lang.System.lineSeparator;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toCollection;

public class CommonUtils extends DriverBase {

    private static final Logger logger = LoggerFactory.getLogger(CommonUtils.class);


    public void validatePage(String title) {
        waitForPageToLoad();
        verifyOnCorrectPage(title);
        logger.info("On page titled {}", getDriver().getTitle());

    }

    public void waitForPageToLoad() {
        new WebDriverWait(getDriver(), Duration.ofSeconds(com.test.channelplay.utils.Constants.TIMINGS_EXPLICIT_TIMEOUT))
                .until(driver -> (JavascriptExecutor) driver)
                .executeScript("return document.readyState == 'complete'");
    }

    private void verifyOnCorrectPage(String title) {
        boolean correctPageDisplayed = getDriver().getTitle().equalsIgnoreCase(title);
        if (correctPageDisplayed) {
            return;
        }
        List<String> lines = Stream.of(
                "Failed to create " + getClass().getSimpleName(),
                "Expected title: " + title,
                "Actual title: " + getDriver().getTitle(),
                "Actual url: " + getDriver().getCurrentUrl()
        ).collect(toCollection(ArrayList::new));
        throw new RuntimeException(lines.stream().collect(joining(lineSeparator())));
    }

    public String generateRandomString(int n){
        String alphaString = "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int index  = (int)(alphaString.length() * Math.random());
            sb.append(alphaString.charAt(index));
        }
        return sb.toString();
    }
    public void dragAndDrop(WebElement fromElement, WebElement toElement){
        Actions builder = new Actions(getDriver());
        Action DragAndDrop = builder.clickAndHold(fromElement).moveToElement(toElement).release(toElement).build();
        sleep(1000);
       DragAndDrop.perform();
    }

    public void sleep(long s) {
        try {
            Thread.sleep(s);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

}
