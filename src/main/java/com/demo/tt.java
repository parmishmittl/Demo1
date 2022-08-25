package com.demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class tt {
    public static final String GET_BY_ID = "/users/2";

    @Test
    @Parameters("base_url")
    public void testGetUserById(String base_url) {
        given()
                .when().get(base_url+GET_BY_ID)
                .then().statusCode(200);
    }
}
