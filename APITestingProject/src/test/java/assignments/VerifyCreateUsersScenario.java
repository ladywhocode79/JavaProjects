package assignments;

import assignments.data.UserCreationResponseDetails;
import assignments.data.UserDataClass;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

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
        String userNameOne = userOneDataDetails.getUsername();
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
        String userNameTwo = userTwoDataDetails.getUsername();
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

        //verify that above userOne is created using GET method, using username
        String userOneDetails = given().log().all().
                when().get("/v2/user/"+userNameOne).then().assertThat().log().all().
                body("username",equalTo(userNameOne)).
                body("firstName",equalTo(userOneDataDetails.getFirstName())).statusCode(200).
                extract().response().asString();

        JsonPath userOneDetailsJsonPath = new JsonPath(userOneDetails);
        //verify lastname from response equals to lastname fetched in response of GET method
        String userOnelastName = userOneDetailsJsonPath.getString("lastName");
        Assert.assertEquals(userOneDataDetails.getLastName(),userOnelastName);
        //verify that above userTwo is created using GET method, using username
        String userTwoDetails = given().log().all().
                when().get("/v2/user/"+userNameTwo).then().assertThat().log().all().
                body("username",equalTo(userNameTwo)).
                body("firstName",equalTo(userTwoDataDetails.getFirstName())).statusCode(200).
                extract().response().asString();

        JsonPath userTwoDetailsJsonPath = new JsonPath(userTwoDetails);
        //verify lastname from response equals to lastname fetched in response of GET method
        String lastNameUserTwo = userTwoDetailsJsonPath.getString("lastName");
        Assert.assertEquals(userTwoDataDetails.getLastName(),lastNameUserTwo);
    }

}
