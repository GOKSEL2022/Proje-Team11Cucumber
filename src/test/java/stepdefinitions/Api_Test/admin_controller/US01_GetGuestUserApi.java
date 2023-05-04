package stepdefinitions.Api_Test.admin_controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US01_GetGuestUserApi {

    Response response;

    @Given("Send get request by id {string}")
    public void sendGetRequestById(String id) {
        //http://164.92.252.42:8080/guestUser/getAll?size=10000&sort=id
        specAdmin.pathParams("first","guestUser","second","getAll").
                queryParams("size","10000");

        response = given(specAdmin).get("{first}/{second}");
        // response.prettyPrint();
    }

    @Then("body should be: username={string} ssn={string} name={string} surname={string} birthDay={string} birthPlace={string} phoneNumber={string} gender={string}")
    public void bodyShouldBeUsernameSsnNameSurnameBirthDayBirthPlacePhoneNumberGender(String username, String ssn, String name, String surname, String birthDay, String birthPlace, String phoneNumber, String gender) {

        JsonPath jsonPath = response.jsonPath();
        String actUsername = jsonPath.getList("content.findAll{it.id==150}.username").get(0).toString();
        String actSsn = jsonPath.getList("content.findAll{it.id==150}.ssn").get(0).toString();
        String actName = jsonPath.getList("content.findAll{it.id==150}.name").get(0).toString();
        String actSurname= jsonPath.getList("content.findAll{it.id==150}.surname").get(0).toString();
        String actBirthDay= jsonPath.getList("content.findAll{it.id==150}.birthDay").get(0).toString();
        String actBirthPlace= jsonPath.getList("content.findAll{it.id==150}.birthPlace").get(0).toString();
        String actPhoneNumber= jsonPath.getList("content.findAll{it.id==150}.phoneNumber").get(0).toString();
        String actGender= jsonPath.getList("content.findAll{it.id==150}.gender").get(0).toString();

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
