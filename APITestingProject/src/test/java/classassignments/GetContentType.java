package classassignments;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetContentType {
    @Test
    public void testGetContentType(){
        given().
                when().
                get("http://api.bart.gov/api/route.aspx?cmd=routes&key=MW9S-E7SL-26DU-VV8V&json=y").
                then().assertThat().contentType(ContentType.JSON);

    }

}
