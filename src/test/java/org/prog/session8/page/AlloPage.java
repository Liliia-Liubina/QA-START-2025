package org.prog.session8.page;

import org.openqa.selenium.*;
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


        public void searchForElement(String query) {
            WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.
                    xpath("//input[@id='search-form__input']")));
            search.sendKeys(query);
            search.sendKeys(Keys.ENTER);
        }

        public boolean isPriceWithCurrencyPresent(String currencySymbol) {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//span[@class='currency' and contains(text(), '₴')]")));

                return true;
            } catch (TimeoutException e) {
                return false;
            }
        }

    }


