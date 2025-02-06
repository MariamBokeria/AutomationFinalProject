package com.saucedemo.tests;

import com.saucedemo.BaseTest;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTest extends BaseTest {

    // ნივთის კალათში დამატების ტესტი
    @Test
    public void addItemToCartCheckTest(){
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.addToCart();
        cartPage.goToCartPage();
        String expectedItem = "Sauce Labs Bike Light";
        String actualItem = cartPage.checkItem();
        Assert.assertEquals(actualItem, expectedItem, "Item mismatch");
    }
    // კალათში გადასვლის ტესტი
    @Test
    public void cartPageCheckTest(){
        LoginPage loginPage = new LoginPage(driver);
        CartPage cartPage = new CartPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        cartPage.goToCartPage();
        String expectedUrl = "https://www.saucedemo.com/cart.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Wrong page");
    }
}
