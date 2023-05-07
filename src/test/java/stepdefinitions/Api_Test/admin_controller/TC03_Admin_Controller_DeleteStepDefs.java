package stepdefinitions.Api_Test.admin_controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Test;

import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;
import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;


public class TC03_Admin_Controller_DeleteStepDefs {
    String expectedData;
    /*
       Given
            http://164.92.252.42:8080/admin/delete/100
       When
           Send delete request
       Then
           Status code should be 200
       And
           Body should be "Admin deleted Successful"
        */
    Response response;

    @Given("Set the url Admin_Delete")
    public void set_the_url_admin_delete() {
        //http://164.92.252.42:8080/admin/delete/208
        specAdmin.pathParams("first","admin","second","delete","thirt","100");

    }
    @When("Set the expected data Admin_Delete")
    public void set_the_expected_data_admin_delete() {
        expectedData="Admin deleted Successful";

    }
    @When("Send the request and get the response Admin_Delete")
    public void send_the_request_and_get_the_response_admin_delete() {
      response=given(specAdmin).when().delete("{first}/{second}/{thirt}");

    }
    @Then("Do assertion Admin_Delete")
    public void do_assertion_admin_delete() {
        assertEquals(200, response.statusCode());
        //assertEquals(500, response.statusCode());
        assertEquals(expectedData, response.asString());

    }

}



