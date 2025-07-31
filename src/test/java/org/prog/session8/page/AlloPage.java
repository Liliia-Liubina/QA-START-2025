package org.prog.session8.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlloPage {

        private final WebDriver driver;
        private final WebDriverWait wait;

        public AlloPage(WebDriver driver) {
            this.driver = driver;
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        public void loadPage() {
            driver.get("https://allo.ua/");
        }


        public void searchForElement() {
            WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search-form__input']")));
            search.sendKeys("Iphone");
            search.sendKeys(Keys.ENTER);
        }

        public boolean isPriceWithHryvniaSymbolPresent() {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='currency' and contains(text(), '₴')]")));
            return true;
        }

    }


