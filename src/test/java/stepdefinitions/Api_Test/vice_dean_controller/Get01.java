package stepdefinitions.Api_Test.vice_dean_controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
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
    }
    @Then("Nilufer body should be like : username={string} name={string} surname={string} birthDay={string} sss={string} birthPlace={string} phoneNumber\"{int}-{int}-{int}\" gender=\"MALE\"")
    public void nilufer_body_should_be_like_username_name_surname_birth_day_sss_birth_place_phone_number_gender_male(String string, String string2, String string3, String string4, String string5, String string6, Integer int1, Integer int2, Integer int3) {

    }
}
