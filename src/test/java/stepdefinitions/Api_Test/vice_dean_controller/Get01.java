package stepdefinitions.Api_Test.vice_dean_controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;
import static org.testng.AssertJUnit.assertEquals;


public class Get01 {
    //http://164.92.252.42:8080/vicedean/getAll
    Response response;
    @Given("Nilufer Send query to get guest user by userId={string}")
    public void nilufer_send_query_to_get_guest_user_by_user_id(String string) {
       specAdmin.pathParams("first","vicedean","second","getAll").
               queryParam("size","1000");

       response = given(specAdmin).get("{first}/{second}");
      // response.prettyPrint();
    }
    @Then("Nilufer body should be like : username={string} name={string} surname={string} birthDay={string} sss={string} birthPlace={string} phoneNumber{string} gender={string}")
    public void niluferBodyShouldBeLikeUsernameNameSurnameBirthDaySssBirthPlacePhoneNumberGender(String username,
                                                                                                 String name, String surname,
                                                                                                 String birthDay, String ssn,
                                                                                                 String birthPlace, String phoneNumber,
                                                                                                 String gender) {
        JsonPath jsonPath = response.jsonPath();
        String actUsername = jsonPath.getList("content.findAll{it.userId==2}.username").get(0).toString();
        String actName = jsonPath.getList("content.findAll{it.userId==2}.name").get(0).toString();
        String actSurname= jsonPath.getList("content.findAll{it.userId==2}.surname").get(0).toString();
        String actBirthDay= jsonPath.getList("content.findAll{it.userId==2}.birthDay").get(0).toString();
        String actSsn = jsonPath.getList("content.findAll{it.userId==2}.ssn").get(0).toString();
        String actBirthPlace= jsonPath.getList("content.findAll{it.userId==2}.birthPlace").get(0).toString();
        String actPhoneNumber= jsonPath.getList("content.findAll{it.userId==2}.phoneNumber").get(0).toString();
        String actGender= jsonPath.getList("content.findAll{it.userId==2}.gender").get(0).toString();
        assertEquals(200,response.statusCode());
        assertEquals(username,actUsername);
        assertEquals(name,actName);
        assertEquals(surname,actSurname);
        assertEquals(birthDay,actBirthDay);
        assertEquals(ssn,actSsn);
        assertEquals(birthPlace,actBirthPlace);
        assertEquals(phoneNumber,actPhoneNumber);
        assertEquals(gender,actGender);
    }

}

