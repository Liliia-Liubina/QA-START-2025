package org.prog.session11.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.prog.session8.page.GooglePage;
import org.testng.Assert;

public class WebSteps11 {

    public static WebDriver driver;
    private GooglePage googlePage = new GooglePage(driver);


    @Given("I load my google page")
    public void iLoadMyGooglePage() {
        googlePage.loadPage();
    }

    @Given("I accept cookies if they are present on the page")
    public void iAcceptMyCookiesIfTheyArePresent() {
        if (googlePage.isCookiesPresent()) {
            googlePage.acceptCookiesIfPresent();
        }

    }

    @When("I set search to random persons name")
    public void iSetSearchToMyRandomPersonName() {
        googlePage.setSearchFieldValue(DBSteps11.randomPersonName);
    }

    @Then("Search field contains random persons name")
    public void searchFieldContainsMyRandomPersonsName() {
        Assert.assertEquals(googlePage.getSearchFieldValue(),
                DBSteps11.randomPersonName,
                "Search field expected to contain my random persons name");
    }


}
