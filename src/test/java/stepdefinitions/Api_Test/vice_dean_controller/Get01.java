package stepdefinitions.Api_Test.vice_dean_controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import org.codehaus.jackson.map.ObjectMapper;
import pojos.Vice_Dean_Controller_Object_Pojo;
import pojos.Vice_Dean_Controller_Root_Pojo;
import test_data.ManagementonSchoolsTestData;
import utilities.ObjectMapperUtils;

import java.io.IOException;
import java.util.Map;

import static base_urls.ManagementonSchoolsBaseUrl.specViceDean;

import static io.restassured.RestAssured.given;
import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;


public class Get01 {
    //http://164.92.252.42:8080/vicedean/getAll
    Response response;

    @Given("Nilufer Send query to get guest user by userId={string}")
    public void nilufer_send_query_to_get_guest_user_by_user_id(String string) {
       specAdmin.pathParams("first","vicedean","second","getAll");
       response = given(specAdmin).get("{first}/{second}");
       response.prettyPrint();


    Vice_Dean_Controller_Object_Pojo expectedData;

    @Given("user sends get request for vice_dean data")
    public void user_sends_post_request_for_vice_dean_data() {
        // http://209.38.244.227/vicedean/getAll
        //Set the url
        specViceDean.pathParams("first", "vicedean", "second", "save");


        //Set the expected data
        expectedData = new Vice_Dean_Controller_Object_Pojo("1341-08-06","Izmir",
                "MALE", "Nilufer","123123Ee","896-865-4545","761-25-3434","ozkul",
                "niloz");

        //Send the request and get the response
        response = given(specViceDean).body(expectedData).post("{first}/{second}");
        response.prettyPrint();
        System.out.println("response = " + response);

    }
    @Then("Nilufer body should be like : username={string} name={string} surname={string} birthDay={string} sss={string} birthPlace={string} phoneNumber\"{int}-{int}-{int}\" gender=\"MALE\"")
    public void nilufer_body_should_be_like_username_name_surname_birth_day_sss_birth_place_phone_number_gender_male(String string, String string2, String string3, String string4, String string5, String string6, Integer int1, Integer int2, Integer int3) {

    }
}