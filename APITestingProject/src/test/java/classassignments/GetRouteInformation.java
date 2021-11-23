package classassignments;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRouteInformation {
    @Test
    public void testGetStationDataOn15thAprilAndValidateForStatusCode(){
        //https://api.bart.gov/api/route.aspx?cmd=routeinfo&route=all&key=MW9S-E7SL-26DU-VV8V&date=04/16/2021&json=y
        //https://api.bart.gov/api/route.aspx?cmd=routeinfo&route=all&key=MW9S-E7SL-26DU-VV8V&json=y

        Response response  = (Response) given().
                when().
                get("https://api.bart.gov/api/route.aspx?cmd=routes&key=MW9S-E7SL-26DU-VV8V&date=04/15/2021&json=y");

        //assert status code
         int statusCode =response.getStatusCode();
        Assert.assertEquals("Status code didn't matched "+statusCode,"200",String.valueOf(statusCode));
         //assert status line
        /*During a success scenario a status line will look something like this "HTTP/1.1 200 OK".
        First part is Http protocol (HTTP/1.1). Second is Status Code (200). Third is the Status message (OK).*/
        String statusLine = response.getStatusLine();
        Assert.assertEquals("InCorrect status code returned",
                "HTTP/1.1 200 OK" /*expected value*/,statusLine /*actual value*/);




    }
}
