package assignments;
/*https://petstore.swagger.io/ This is swagger documentation.
Explore petstore api doc and get familiar. Write automation tests for below
POST /user
POST /user/createWithArray
Hint: try Try it out and execute buttons. This will help you get the total url and others to hit (edited) */

import assignments.data.UserCreationResponseDetails;
import assignments.data.UserDataClass;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import org.junit.Test;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class VerifyCreateUserScenario {
    //https://petstore.swagger.io/v2/user
    @Test
    public void createUser(){
        //create single user
        //https://petstore.swagger.io/v2/user
        baseURI ="https://petstore.swagger.io";
        UserDataClass userDataDetails = new UserDataClass();
        UserCreationResponseDetails userCreationResponseDetails = new UserCreationResponseDetails();
        userDataDetails.setId(0);
        userDataDetails.setUsername("sonaldds");
        String userName = userDataDetails.getUsername();
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
                        post("/v2/user").
                        as(UserCreationResponseDetails.class);
        int statusCode = 200;
        System.out.println("Checking response after user creation: "+userCreationResponseDetails.toString());
        //verify returned success status code as 200
        Assert.assertEquals(statusCode,userCreationResponseDetails.getCode());

        //verify that above user is created using GET method using username
        String userDetails = given().log().all().
                when().get("/v2/user/"+userName).then().assertThat().log().all().
                body("username",equalTo(userName)).
                body("firstName",equalTo(userDataDetails.getFirstName())).statusCode(200).
                extract().response().asString();

        JsonPath userDetailsJsonPath = new JsonPath(userDetails);
        //verify lastname from response equals to lastname fetched in response of GET method
        String lastName = userDetailsJsonPath.getString("lastName");
        Assert.assertEquals(userDataDetails.getLastName(),lastName);

    }

}
