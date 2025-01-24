package com.mesaudabeauty.tests;

import com.mesaudabeauty.BaseTest;
import com.mesaudabeauty.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    // გვერდის ინიციალიზაცია
    LoginPage loginPage = new LoginPage(driver);

    @Test
    public void testValidLogin(){
        loginPage.login("marytest@yopmail.com", "Testtest123@");
        String expectedUrl = "https://mesaudabeauty.com/account";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "URL mismatch");
    }

    @Test
    public void testInvalidLogin(){
        String expectedMessage = "Email o password errati.";
        String actualMessage = loginPage.invalidLogin("invalidemail@mail.com", "InvalidPassword");
        Assert.assertEquals(actualMessage, expectedMessage, "Incorrect error message");
    }

}
