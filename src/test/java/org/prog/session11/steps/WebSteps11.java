package org.prog.session11.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.prog.session11.DataHolder11;
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

    @When("I am setting search to {string}")
    public void iSetSearchToMyRandomPersonName(String alias) {
        if (DataHolder11.MYDATA.containsKey(alias)) {
            googlePage.setSearchFieldValue((String) DataHolder11.MYDATA.get(alias));
        } else {
            googlePage.setSearchFieldValue(alias);
        }
    }

    @Then("My search field contains {string}")
    public void searchFieldContainsMyRandomPersonsName(String alias) {
        Assert.assertEquals(
                googlePage.getSearchFieldValue(),
                DataHolder11.MYDATA.get(alias),
                "Search field expected to contain my random persons name");
    }


}
