package com.saucedemo.tests;

import com.saucedemo.BaseTest;
import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    // გვერდის ინიციალიზაცია
    LoginPage loginPage = new LoginPage(driver);
    InventoryPage inventoryPage = new InventoryPage(driver);

    // ავტორიზაციის ტესტი ვალიდური კრედენშიალებით
    @Test
    public void testValidLogin(){
        loginPage.login("standard_user ", "secret_sauce");
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Login Faieled");
    }

    // ავტორიზაციის ტესტი არავალიდური კრედენშიალებით
    @Test
    public void testInvalidLogin(){
        String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
        String actualMessage = loginPage.invalidLogin("invalidusername", "InvalidPassword");
        Assert.assertEquals(actualMessage, expectedMessage, "Incorrect error message");
    }

    // სისტემიდან გამოსვლის ტესტი
    @Test
    public void logOutTest(){
        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.goToBurgerMenu();
        inventoryPage.logout();
        String expectedUrl = "https://www.saucedemo.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Couldn't log out");
    }

}
