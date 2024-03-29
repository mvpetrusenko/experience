package tests.api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

// what we expect in response (what url, content type, what response status code
// method build to collect
public class Specifications {

    public static RequestSpecification requestSpec(String url) {
        return new RequestSpecBuilder()
                .setBaseUri(url)
                .setContentType(ContentType.JSON)
                .build();

    }


    public static ResponseSpecification responseSpecOK200() {
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
    }

    public static ResponseSpecification responseSpecError401() {
        return new ResponseSpecBuilder()
                .expectStatusCode(401)
                .build();

        }




    public static void installSpecification(RequestSpecification request, ResponseSpecification response) {

        RestAssured.requestSpecification = request;
        RestAssured.responseSpecification = response;

    }

    }


