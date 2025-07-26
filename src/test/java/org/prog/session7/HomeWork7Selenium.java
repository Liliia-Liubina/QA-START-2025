package org.prog.session7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomeWork7Selenium {

    private WebDriver driver;

    @BeforeSuite
    public void initWebDriver() {
        driver = new ChromeDriver();
    }

    @Test
    public void myAlloTest() {
        driver.get("https://allo.ua/");

        WebElement search = driver.findElement(By.cssSelector("input.search-form__input"));
        search.sendKeys("Iphone");
        search.sendKeys(Keys.ENTER);
    }


    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
