package com.saucedemo.pages;

import com.saucedemo.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[3]/a")
    WebElement cartIcon;
    @FindBy(id = "item_0_title_link")
    WebElement item;
    public void goToCartPage(){
        clickToElement(cartIcon);
    }
    public String checkItem(){
        return getElementText(item);
    }
}
