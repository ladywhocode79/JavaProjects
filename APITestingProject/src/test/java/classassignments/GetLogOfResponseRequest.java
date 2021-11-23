package classassignments;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetLogOfResponseRequest {
    @Test
    public void testLogAll(){
        given().
                log().all().
                when().
                get("http://api.bart.gov/api/route.aspx?cmd=routes&key=MW9S-E7SL-26DU-VV8V&json=y").
                then().log()
                        .body();

    }
}
