package classassignments;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetColorValue {
    @Test
    public void testGetStationDataOn15thAprilAndValidateForStatusCode(){
        given().
                when().
                get("http://api.bart.gov/api/route.aspx?cmd=routes&key=MW9S-E7SL-26DU-VV8V&json=y").
                then().
               assertThat().body("root.routes.route[0].color",equalTo("BEIGE"))
                .body("root.routes.route[1].color",equalTo("BEIGE"))
                .body("root.routes.route[2].color",equalTo("BEIGE"))
                .body("root.routes.route.routeID",not(hasItem("ROUTE 210")))
                .body("root.routes.route.routeID",hasItem("ROUTE 20"));

    }
}
