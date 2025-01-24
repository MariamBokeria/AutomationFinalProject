package com.mesaudabeauty.tests;

import com.mesaudabeauty.BaseTest;
import com.mesaudabeauty.pages.MakeUpPage;
import com.mesaudabeauty.pages.ShoppingCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeUpTest extends BaseTest {
    MakeUpPage makeupPage = new MakeUpPage(driver);
    ShoppingCartPage shoppingChart = new ShoppingCartPage(driver);

    @Test
    public void goToMakeUpPageTest(){
        makeupPage.makeUpPageOpen();
        makeupPage.getMakeUpHeaderText();
        String expectedHeader = "Make Up";
        String actualHeader = makeupPage.getMakeUpHeaderText();
        Assert.assertEquals(actualHeader, expectedHeader, "You're on the wrong page");
    }

    @Test
    public void quickOpenItemTest(){
        makeupPage.quickOpenItem();
        String expectedDisplay = "AGGIUNGI AL CARRELLO";
        String actualDisplay = makeupPage.getAddButton();
        Assert.assertEquals(actualDisplay, expectedDisplay, "Button mismatch");
    }
    @Test
    public void goToShoppingChartPageTest(){
        shoppingChart.goToShoppingChart();
        String expectedHeader = "shopping bag";
        String actualHeader = shoppingChart.shoppingChartPageDisplay();
        Assert.assertEquals(actualHeader, expectedHeader, "Wrong Header");
    }
}
