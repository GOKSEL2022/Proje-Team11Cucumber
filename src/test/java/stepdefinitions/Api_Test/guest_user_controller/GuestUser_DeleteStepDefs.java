package stepdefinitions.Api_Test.guest_user_controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import utilities.ObjectMapperUtils;

import java.util.HashMap;
import java.util.Map;

import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;
import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class GuestUser_DeleteStepDefs {
    /*
   "message": " Guest User deleted Successful",
   "httpStatus": "OK"
   "Status code should be 200"
    */
        //http://164.92.252.42:8080/guestUser/delete/354
    Response response;
    String expectedData;
    @Given("Set the url GuestUser_Delete")
    public void set_the_url_guest_user_delete() {
        specAdmin.pathParams("first","guestUser","second","delete","thirt",354);

    }
    @When("Set the expected data GuestUser_Delete")
    public Map<String, String> set_the_expected_data_guest_user_delete() {
        Map<String, String> expectedData = new HashMap<>();
        expectedData.put("message"," Guest User deleted Successful");
        expectedData.put("httpStatus","OK");
        expectedData.put("statusCode","200");

        return expectedData;


    }
    @When("Send the request and get the response GuestUser_Delete")
    public void send_the_request_and_get_the_response_guest_user_delete() {
        response=given(specAdmin).delete("{first}/{second}/{thirt}");

    }
    @Then("Do assertion GuestUser_Delete")
    public void do_assertion_guest_user_delete() {
        Map<String, String> actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), HashMap.class);

        assertEquals(expectedData,actualData);
    }

    /*
    "message": " Guest User deleted Successful",
    "httpStatus": "OK"
    "Status code should be 200"
     */
}

