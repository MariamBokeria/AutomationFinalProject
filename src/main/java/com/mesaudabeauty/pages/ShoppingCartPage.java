package com.mesaudabeauty.pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.mesaudabeauty.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div[4]/div[2]/header/div[1]/div/div/div/div/a[3]/svg")
    WebElement chart;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div/div/div/form/div[2]/h1")
    WebElement chartHeader;
    public void goToShoppingChart(){
        clickToElement(chart);
    }
    public String shoppingChartPageDisplay(){
        return getElementText(chartHeader);
    }
}
