package com.example.demo;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestTests {

    @Test
    public void testItemTitle() {

        when()
                .get("http://localhost:8080/demos")
        .then()
                .body("[2].status", equalTo("BAD_CLIENT"));
    }
}
