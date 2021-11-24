package assignments;
/*https://petstore.swagger.io/ This is swagger documentation.
Explore petstore api doc and get familiar. Write automation tests for below
POST /user
POST /user/createWithArray
Hint: try Try it out and execute buttons. This will help you get the total url and others to hit (edited) */

import assignments.data.UserCreationResponseDetails;
import assignments.data.UserDataClass;
import classassignments.pojoclassassignment.data.CreatedUserDetails;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class VerifyCreateUserScenario {
    //https://petstore.swagger.io/v2/user
    @Test
    public void createUser(){
        UserDataClass userDataDetails = new UserDataClass();
        UserCreationResponseDetails userCreationResponseDetails = new UserCreationResponseDetails();
        userDataDetails.setId(0);
        userDataDetails.setUsername("ssds");
        userDataDetails.setFirstName("Sonal");
        userDataDetails.setLastName("Singh");
        userDataDetails.setEmail("ssd@ss.com");
        userDataDetails.setPassword("123456");
        userDataDetails.setPhone("444-00-444");
        userDataDetails.setUserStatus(0);

        userCreationResponseDetails =
                given().
                        contentType(ContentType.JSON).
                        body(userDataDetails).
                        log().body().
                        when().
                        post("https://petstore.swagger.io/v2/user").
                        as(UserCreationResponseDetails.class);

        System.out.println("Checking response after user creation: "+userCreationResponseDetails.toString());
        Assert.assertEquals(200,userCreationResponseDetails.getCode());

    }
    @Test
    public void createUsers(){
        UserDataClass userDataDetails = new UserDataClass();
        UserCreationResponseDetails userCreationResponseDetails = new UserCreationResponseDetails();
        userDataDetails.setId(0);
        userDataDetails.setUsername("ssds");
        userDataDetails.setFirstName("Sonal");
        userDataDetails.setLastName("Singh");
        userDataDetails.setEmail("ssd@ss.com");
        userDataDetails.setPassword("123456");
        userDataDetails.setPhone("444-00-444");
        userDataDetails.setUserStatus(0);

        userCreationResponseDetails =
                given().
                        contentType(ContentType.JSON).
                        body(userDataDetails).
                        log().body().
                        when().
                        post("https://petstore.swagger.io/v2/user").
                        as(UserCreationResponseDetails.class);

        System.out.println("Checking response after user creation: "+userCreationResponseDetails.toString());
        Assert.assertEquals(200,userCreationResponseDetails.getCode());

    }
}