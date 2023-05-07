package stepdefinitions.Api_Test.guest_user_controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;
import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;


public class TC02_GuestUser_GetAllStepDefinitions {
    Response response;
    //http://164.92.252.42:8080/guestUser/getAll?size=10&sort=name =309
    @Given("Send GuestUser_GetAll request by id {string}")
    public void sendGuestUser_GetAllRequestById(String id) {
        specAdmin.pathParams("first","guestUser","second","getAll").queryParams("size","10","sort","name");
        response=given(specAdmin).get("{first}/{second}");


    }

    @Then("GuestUser_GetAll body should be: username={string} ssn={string} name={string} surname={string} birthDay={string} birthPlace={string} phoneNumber={string} gender={string}")
    public void guestuser_getallBodyShouldBeUsernameSsnNameSurnameBirthDayBirthPlacePhoneNumberGender(String username, String ssn, String name, String surname, String birthDay, String birthPlace, String phoneNumber, String gender) {

        JsonPath jsonPath = response.jsonPath();
        String actUsername = jsonPath.getList("content.findAll{it.id==309}.username").get(0).toString();
        String actSsn = jsonPath.getList("content.findAll{it.id==309}.ssn").get(0).toString();
        String actName = jsonPath.getList("content.findAll{it.id==309}.name").get(0).toString();
        String actSurname= jsonPath.getList("content.findAll{it.id==309}.surname").get(0).toString();
        String actBirthDay= jsonPath.getList("content.findAll{it.id==309}.birthDay").get(0).toString();
        String actBirthPlace= jsonPath.getList("content.findAll{it.id==309}.birthPlace").get(0).toString();
        String actPhoneNumber= jsonPath.getList("content.findAll{it.id==309}.phoneNumber").get(0).toString();
        String actGender= jsonPath.getList("content.findAll{it.id==309}.gender").get(0).toString();

        assertEquals(200,response.statusCode());
        assertEquals(username,actUsername);
        assertEquals(ssn,actSsn);
        assertEquals(name,actName);
        assertEquals(surname,actSurname);
        assertEquals(birthDay,actBirthDay);
        assertEquals(birthPlace,actBirthPlace);
        assertEquals(phoneNumber,actPhoneNumber);
        assertEquals(gender,actGender);
    }
}
