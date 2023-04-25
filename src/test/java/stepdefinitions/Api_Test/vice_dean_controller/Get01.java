package stepdefinitions.Api_Test.vice_dean_controller;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import pojos.Vice_Dean_Controller;

import java.io.IOException;


import static base_urls.ManagementonSchoolsBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Get01 {
    Response response;
    Vice_Dean_Controller expectedData;

    @Given("user sends get request for vice_dean data")
    public void user_sends_post_request_for_vice_dean_data() {
        //Set the url
        spec.pathParams("first", "vicedean", "second", "getAll");

        //Set the expected data
        expectedData = new Vice_Dean_Controller("06.08.1965 ","Izmir","Female","Nilufer",
                "552-919-2222","103-13-1031","Ozkul","niloz ");
        //Send the request and get the response
        response = given(spec).body(expectedData).post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("user gets the vice_dean data and assert")
    public void user_gets_the_vice_dean_data_and_assert() throws IOException {
        assertEquals(200, response.statusCode());
        // Validation
       Vice_Dean_Controller actualDataObjectMapper = new ObjectMapper().readValue(response.asString(), Vice_Dean_Controller.class);

        assertEquals(expectedData.getBirthDay(), actualDataObjectMapper.getBirthDay());
        assertEquals(expectedData.getBirthPlace(), actualDataObjectMapper.getBirthPlace());
        assertEquals(expectedData.getGender(), actualDataObjectMapper.getGender());
        assertEquals(expectedData.getName(), actualDataObjectMapper.getName());
        assertEquals(expectedData.getPhoneNumber(), actualDataObjectMapper.getPhoneNumber());
        assertEquals(expectedData.getSsn(), actualDataObjectMapper.getSsn());
        assertEquals(expectedData.getSurname(), actualDataObjectMapper.getSurname());
        assertEquals(expectedData.getUsername(), actualDataObjectMapper.getUsername());



    }
}
