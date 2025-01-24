package com.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void enterText(WebElement locator, String text){
        //wait ნაწილი არის აქ
        waitForElementToBeClickable(locator);
        locator.sendKeys(text);
    }

    public void clickToElement(WebElement locator){
        waitForElementToBeClickable(locator);
        locator.click();
    }

    public String getElementText(WebElement locator) {
        waitForElementToBeVisible(locator);
        return locator.getText();
    }

    public void waitForElementToBeClickable(WebElement locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForElementToBeVisible(WebElement locator) {
        wait.until(ExpectedConditions.visibilityOf(locator));
    }
}
