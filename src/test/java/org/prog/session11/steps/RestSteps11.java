package org.prog.session11.steps;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.prog.session9.Results1Dto;

public class RestSteps11 {

    public static Results1Dto response;

    @Given("request {int} random people from API")
    public void requestMyPersonFromAPI(int amount) {
        Response response = RestAssured.given()
                .baseUri("https://randomuser.me/")
                .basePath("api/")
                .queryParam("inc", "gender,name,location,nat")
                .queryParam("results", amount)
                .queryParam("noinfo")
                .get();
        response.prettyPrint();
        RestSteps11.response = response.as(Results1Dto.class);


    }
}
