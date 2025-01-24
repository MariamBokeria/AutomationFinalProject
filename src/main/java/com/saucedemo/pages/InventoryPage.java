package com.saucedemo.pages;

import com.saucedemo.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage {
    public InventoryPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement addToCartButton;
    @FindBy(id = "react-burger-menu-btn")
    WebElement burgerMenuButton;
    @FindBy(id = "logout_sidebar_link")
    WebElement logoutButton;
    public void addToCart(){
        clickToElement(addToCartButton);
    }
    public void goToBurgerMenu(){
        clickToElement(burgerMenuButton);
    }
    public void logout(){
        clickToElement(logoutButton);
    }
}
