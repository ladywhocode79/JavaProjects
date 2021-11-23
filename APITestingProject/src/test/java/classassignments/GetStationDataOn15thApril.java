package classassignments;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetStationDataOn15thApril {
    //date
    //https://api.bart.gov/api/route.aspx?cmd=routes&key=MW9S-E7SL-26DU-VV8V&date=04/15/2021&json=y
    //route
    //https://api.bart.gov/api/route.aspx?cmd=routeinfo&route=all&key=MW9S-E7SL-26DU-VV8V&json=y

    @Test
    public void testGetStationDataOn15thAprilAndValidateForStatusCode(){
        given().
        when().
            get("https://api.bart.gov/api/route.aspx?cmd=routeinfo&route=all&key=MW9S-E7SL-26DU-VV8V&json=y").
        then().
            assertThat().statusCode(200);
    }

}
