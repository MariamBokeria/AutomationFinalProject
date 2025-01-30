package com.saucedemo.tests;

import com.saucedemo.BaseTest;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTest extends BaseTest {
    InventoryPage inventoryPage = new InventoryPage(driver);
    CartPage cartPage = new CartPage(driver);
    // ნივთის კალათში დამატების ტესტი
    @Test
    public void addItemToCartCheckTest(){
        inventoryPage.addToCart();
        cartPage.goToCartPage();
        String expectedItem = "Sauce Labs Bike Light";
        String actualItem = cartPage.checkItem();
        Assert.assertEquals(actualItem, expectedItem, "Item mismatch");
    }
    // კალათში გადასვლის ტესტი
    @Test
    public void cartPageCheckTest(){
        String expectedHeader = "Your Cart";
        String actualHeader = cartPage.goToCartPage();
        Assert.assertEquals(actualHeader, expectedHeader, "Wrong page");
    }
}
