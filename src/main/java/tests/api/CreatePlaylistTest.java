package tests.api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class CreatePlaylistTest {
    private final static String URL2 = "https://api.spotify.com/";

    // https://dogapi.dog/api/v2/breeds

    private static String accessToken;

    @Test
    public void checkIdInPlaylistTest() {

        Specifications.installSpecification(Specifications.requestSpec(URL2), Specifications.responseSpecError401());
        String id = "4";
        String description = "my new playlist";

        // extract in our class

        PostExample playlist = new PostExample("new description request", "New new playlist", true);
        CreatePlaylistTest createPlaylistTest = given()
                .body(playlist)
                .when()
                .post("users/smedjan/playlists")
                .then().log().all()
                .extract().as(CreatePlaylistTest.class);

        Assert.assertEquals(id, createPlaylistTest.getClass());


    }
}
