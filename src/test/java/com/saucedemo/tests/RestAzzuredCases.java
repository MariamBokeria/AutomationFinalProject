package com.saucedemo.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RestAzzuredCases {
    public static void main(String[] args){
        RestAssured.baseURI = "https://api.automation.ge/";
        String apiKey = "EGRDHTFYGUY*&^U%$YTERDHFJGHI(*&^%%%UIT&^GOY*H";

        Response response = given()
                .header("X-API-Key", apiKey)
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract()
                .response();

        System.out.println(response.toString());
    }
}
