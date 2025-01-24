package com.mesaudabeauty;

import com.mesaudabeauty.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = DriverManager.getDriver();
        driver.manage().window().maximize();
        driver.get("https://mesaudabeauty.com/account/login?return_url=%2Faccount");
    }

    @AfterMethod
    public void Close(){
        DriverManager.quit();
    }
}
