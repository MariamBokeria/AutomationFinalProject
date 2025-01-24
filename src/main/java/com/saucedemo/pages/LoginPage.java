package com.saucedemo.pages;

import com.saucedemo.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "user-name")
    WebElement usernameField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(id = "login-button")
    WebElement loginButton;
    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3")
    WebElement errorMessage;

    public void login(String username, String password){
        enterText(usernameField, username);
        enterText(passwordField, password);
        clickToElement(loginButton);
    }
    public String invalidLogin(String username, String password){
        enterText(usernameField, username);
        enterText(passwordField, password);
        clickToElement(loginButton);
        return getElementText(errorMessage);
    }
}
