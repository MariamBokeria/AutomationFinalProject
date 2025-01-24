package com.mesaudabeauty.pages;

import com.mesaudabeauty.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "CustomerEmail")
    WebElement emailField;
    @FindBy(id = "CustomerPassword")
    WebElement passwordField;
    @FindBy(xpath = "//*[@id='customer_login']/input[3]")
    WebElement confirmButton;
    @FindBy(xpath = "/html/body/div[4]/div[3]/main/section/div/div[2]/form/div/div[1]/div/ul/li")
    WebElement errorMessage;

    public void login(String email, String password){
        enterText(emailField, email);
        enterText(passwordField, password);
        clickToElement(confirmButton);
    }
    public String invalidLogin(String email, String password){
        enterText(emailField, email);
        enterText(passwordField, password);
        clickToElement(confirmButton);
        return getElementText(errorMessage);
    }
}
