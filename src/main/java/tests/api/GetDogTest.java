package tests.api;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GetDogTest {

    private final static String URL = "https://dogapi.dog";

    // https://dogapi.dog/api/v2/breeds

    private static String accessToken;

    @Test
    public void checkIdInGetDogsTest() {

        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        List<ApiExample> dogs = given()
                .when()
                .get("/api/v2/breeds")
                .then().log().all()
                .extract().body().jsonPath().getList("data", ApiExample.class);


        // Check if all dog names are not empty
        dogs.forEach(x -> Assert.assertTrue(x.getName() != null && !x.getName().isEmpty()));

        // Define the expected name
        String expectedName = "Caucasian Shepherd Dog";

        // Check if any dog name matches the expected name
        Assert.assertTrue(dogs.stream().anyMatch(x -> expectedName.equals(x.getName())),
                "No dog with the name '" + expectedName + "' found in the response.");
    }
        //Assert.assertTrue(dogs.stream().anyMatch(x -> x.getName().equals("Caucasian Shepherd Dog")));
        // Check if at least one dog has the name "Caucasian Shepherd Dog"
        //Assert.assertTrue(dogs.stream().anyMatch(x -> "Caucasian Shepherd Dog".equals(x.getName())));



        //Assert.assertTrue(dogs.stream().anyMatch(x -> x.getName().equals("Caucasian Shepherd Dog")));
        //dogs.forEach(x -> Assert.assertTrue(x.getId().contains(x.getId().toString())));
        //Assert.assertTrue(dogs.stream().allMatch(x->x.getId().contains("68f47c5a")));

        //dogs.forEach(x -> Assert.assertTrue(x.getName().contains(x.getName())));
        //Assert.assertTrue(dogs.stream().allMatch(x->x.getName().contains("Caucasian Shepherd Dog")));

        //List<String> ids = dogs.stream().map(x->x.getName().collect(Collectors.toList());

    }



