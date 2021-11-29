package assignments;

import assignments.data.UserCreationResponseDetails;
import assignments.data.UserDataClass;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class VerifyCreateUsersScenario {
    @Test
    public void createUsers(){
        //create multiple users
        //https://petstore.swagger.io/v2/user/createWithArray
        baseURI ="https://petstore.swagger.io";
        ArrayList<UserDataClass> userList=new ArrayList<UserDataClass>();//Creating arraylist
        UserDataClass userOneDataDetails = new UserDataClass();
        UserDataClass userTwoDataDetails = new UserDataClass();
        UserCreationResponseDetails userCreationResponseDetails  ;
        //first user object data

        userOneDataDetails.setId(0);
        userOneDataDetails.setUsername("sonal22");
        userOneDataDetails.setFirstName("Sonal");
        userOneDataDetails.setLastName("Singh");
        userOneDataDetails.setEmail("ssd@ss.com");
        userOneDataDetails.setPassword("123456");
        userOneDataDetails.setPhone("444-00-444");
        userOneDataDetails.setUserStatus(0);
        userList.add(userOneDataDetails);

        //second user object data
        userTwoDataDetails.setId(0);
        userTwoDataDetails.setUsername("sonal11");
        userTwoDataDetails.setFirstName("Sonali");
        userTwoDataDetails.setLastName("Singh");
        userTwoDataDetails.setEmail("ssde@ss.com");
        userTwoDataDetails.setPassword("123456");
        userTwoDataDetails.setPhone("444-060-444");
        userTwoDataDetails.setUserStatus(0);
        userList.add(userTwoDataDetails);

        userCreationResponseDetails =
                given().
                        contentType(ContentType.JSON).
                        body(userList).
                        log().body().
                        when().
                        post("/v2/user/createWithArray").
                        as(UserCreationResponseDetails.class);

        System.out.println("Checking response after users creation: "+userCreationResponseDetails.toString());
        Assert.assertEquals(200,userCreationResponseDetails.getCode());


    }


}
