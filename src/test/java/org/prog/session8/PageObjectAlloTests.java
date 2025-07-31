package org.prog.session8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.prog.session8.page.AlloPage;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PageObjectAlloTests {

    private WebDriver driver;
    private AlloPage alloPage;

    @BeforeSuite
    public void initWebDriver() {
        driver = new ChromeDriver();
        alloPage = new AlloPage(driver);
    }


    @Test
    public void alloTest() {
        alloPage.loadPage();
        alloPage.searchForElement();
        boolean priceContainsHryvnia = alloPage.isPriceWithHryvniaSymbolPresent();
        Assert.assertTrue(priceContainsHryvnia, "₴ not found!");
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }






}
