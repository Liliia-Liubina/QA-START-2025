package org.prog.session9;

//TODO: add check for location.street.number
//TODO: add check for location.street.name
//TODO: add check for location.coordinates.latitude
//TODO: add check for location.coordinates.longitude

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class RestTestsHW9 {

    @Test
    public void locationRestTest() {
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://randomuser.me/");
        requestSpecification.basePath("api/");
        requestSpecification.queryParam("inc", "location");
        requestSpecification.queryParam("results", 3);
        requestSpecification.queryParam("noninfo");

        Response response = requestSpecification.get();
        response.prettyPrint();

        ValidatableResponse validatableResponse = response.then();
        validatableResponse.statusCode(200);
        validatableResponse.contentType(ContentType.JSON);
        validatableResponse.body("results.location.street.number", Matchers.hasItem(Matchers.notNullValue()));
        validatableResponse.body("results.location.street.name", Matchers.hasItem(Matchers.notNullValue()));
        validatableResponse.body("results.location.coordinates.latitude",Matchers.hasItem(Matchers.notNullValue()));
        validatableResponse.body("results.location.coordinates.longitude",Matchers.hasItem(Matchers.notNullValue()));


    }


    @Test
    public void locationRestTest2() {
        RestAssured.given()
                .baseUri("https://randomuser.me/")
                .basePath("api/")
                .queryParam("inc", "location")
                .queryParam("results", 3)
                .queryParam("noninfo")
                .get()
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("results.location.street.number", Matchers.hasItem(Matchers.notNullValue()))
                .body("results.location.street.name", Matchers.hasItem(Matchers.notNullValue()))
                .body("results.location.coordinates.latitude", Matchers.hasItem(Matchers.notNullValue()))
                .body("results.location.coordinates.longitude", Matchers.hasItem(Matchers.notNullValue()));



    }





}

