package classassignments.pojoclassassignment.data;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class GetUsersList {
    //url https://reqres.in/api/users?page=2
    @Test
    public void verifyCreatedUserDetails() {
        ObjectMapper mapper = new ObjectMapper();
        List<UserDetails> participantJsonList;
        String name = "Sunny";
        String job = "Marketing";
        UserDetails createUser = new UserDetails();
        createUser.setName(name);
        createUser.setJob(job);

        CreatedUserDetails userDetails = new CreatedUserDetails();
        userDetails =
                given().
                        contentType(ContentType.JSON).
                        body(createUser).
                        log().body().
                        when().
                        post("https://reqres.in/api/users?page=2").
                        as(CreatedUserDetails.class);


        System.out.println("Checking response after user creation: " + userDetails.toString());
        Assert.assertEquals("Sunny", userDetails.getName());

    }
}