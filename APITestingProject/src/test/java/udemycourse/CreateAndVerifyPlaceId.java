package udemycourse;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.Test;



import static io.restassured.RestAssured.*;
import static udemycourse.payload.Payload.payloadForCreateUser;
import static org.hamcrest.Matchers.*;

public class CreateAndVerifyPlaceId {
  @Test
  public void createAndVerifyPlaceId(){
    //base url address of api server
    baseURI ="https://rahulshettyacademy.com/";
  /* String response = given().log().all().queryParam("key","qaclick123").
            header("Content-Type","application/json").
            body(payloadForCreateUser()).
            when().post("/maps/api/place/add/json").
            then().log().all().assertThat().statusCode(200).
    body("scope",equalTo("APP")).
    extract().response().asString();*/
    String response = given().log().all().queryParam("key","qaclick123").
            header("Content-Type","application/json").
            body(payloadForCreateUser()).
            when().post("/maps/api/place/add/json").
            then().assertThat().statusCode(200).
            body("scope",equalTo("APP")).
            extract().response().asString();
    //took response as string and now extract response value place_id
    System.out.printf(response);
    JsonPath jsonPath = new JsonPath(response); //parse Json
    String placeId = jsonPath.get("place_id");
    System.out.printf("place id: "+placeId);



  }

}
