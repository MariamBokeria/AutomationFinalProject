package com.mesaudabeauty.pages;

import com.mesaudabeauty.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MakeUpPage extends BasePage {
    public MakeUpPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div[4]/div[2]/header/div[1]/div/div/div/nav/ul/li[2]/a")
    WebElement makeup;
    @FindBy(xpath = "/html/body/div[4]/div[3]/main/div[1]/div/div/h1")
    WebElement makeUpHeader;
    @FindBy(xpath = "/html/body/div[4]/div[3]/main/div[2]/section/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/div[2]/a")
    WebElement itemInfo;
    @FindBy(name = "add")
    WebElement addButton;

    public void makeUpPageOpen(){
        clickToElement(makeup);
    }
    public String getMakeUpHeaderText(){
        return getElementText(makeUpHeader);
    }
    public void quickOpenItem(){
        clickToElement(itemInfo);
    }
    public String getAddButton(){
        return getElementText(addButton);
    }
    public void addToCartItem(){
        clickToElement(addButton);
    }
}
