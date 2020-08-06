package com.flamexander.demo.rest;

import com.flamexander.demo.rest.entities.Item;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Iterator;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredTest {

    @ParameterizedTest
    @CsvSource({
            "2,4,8",
            "3,6,18"
    })
    public void testWithParam(int a, int b, int c) {
        given()
                .param("a", a)
                .param("b", b)

        .when()
                .get("http://localhost:8189/rest_service/api/v1/math/mult")
                .then()
                .statusCode(200)
                .extract().response().body().print();
    }

    @Test
    public void testAddItem() {
        Item item = new Item();
        item.setTitle("Item");
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(item)
                .post("http://localhost:8189/rest_service/api/v1/itemst")
                .then()
                .body("id", notNullValue());


    }

}
