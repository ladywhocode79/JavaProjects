package classassignments.pojoclassassignment;

import classassignments.pojoclassassignment.data.CreatedUserDetails;
import classassignments.pojoclassassignment.data.UserDetails;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.hasItem;

public class CreateUser {
    @Test
    public void createUser(){

        String name ="Sonal";
        String job = "Testing";
        UserDetails createUser = new UserDetails();
        createUser.setName(name);
        createUser.setJob(job);
       Response response = given().
                contentType(ContentType.JSON).
                body(createUser).
                log().body().
                when().
                post("https://reqres.in/api/users").
                then().
                assertThat().
                statusCode(201).
                extract().response();
        System.out.println("Checking response after user creation: "+response.asPrettyString());
    }

    @Test
    public void verifyCreatedUserDetails(){

        String name ="Sunny";
        String job = "Marketing";
        UserDetails createUser = new UserDetails();
        createUser.setName(name);
        createUser.setJob(job);

        CreatedUserDetails userDetails ;
        userDetails =
         given().
                contentType(ContentType.JSON).
                body(createUser).
                log().body().
                when().
                post("https://reqres.in/api/users").
                as(CreatedUserDetails.class);


       System.out.println("Checking response after user creation: "+userDetails.toString());
        Assert.assertEquals("Sunny",userDetails.getName());
    }

}
