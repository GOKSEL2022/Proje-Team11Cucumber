package stepdefinitions.Api_Test.dean_controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Dean_Controller_Post_GetAll_StepDefs {

    Response response;
    @Given("Ali Get request ile tum Deanleri al")
    public void get_request_ile_tum_deanleri_al() {
        specAdmin.pathParams("first","dean","second","getAll");
        response = given(specAdmin).get("{first}/{second}");
        //response.prettyPrint();
    }
    @Then("Ali bodyi dogrula: userId={string}, username={string}, name={string}, surname={string}, birthDay={string}, ssn={string}, birthPlace={string}, phoneNumber={string}, gender={string}")
    public void bodyi_dogrula_user_id_username_name_surname_birth_day_ssn_birth_place_phone_number_gender(String userId, String username, String name, String surname, String birthDay, String ssn, String birthPlace, String phoneNumber, String gender) {
        JsonPath jsonPath = response.jsonPath();
        //findAll{} list dönen noktadan itibaren kullanılır. Body direkt list döndüğü için findAll{} ile başlıyoruz.
        String actUserId = jsonPath.getList("findAll{it.username=='hasan'}.userId").get(0).toString();
        String actUsername = jsonPath.getList("findAll{it.username=='hasan'}.username").get(0).toString();
        String actName = jsonPath.getList("findAll{it.username=='hasan'}.name").get(0).toString();
        String actSurname = jsonPath.getList("findAll{it.username=='hasan'}.surname").get(0).toString();
        String actBirthDay = jsonPath.getList("findAll{it.username=='hasan'}.birthDay").get(0).toString();
        String actSsn = jsonPath.getList("findAll{it.username=='hasan'}.ssn").get(0).toString();
        String actBirthPlace = jsonPath.getList("findAll{it.username=='hasan'}.birthPlace").get(0).toString();
        String actPhoneNumber = jsonPath.getList("findAll{it.username=='hasan'}.phoneNumber").get(0).toString();
        String actGender = jsonPath.getList("findAll{it.username=='hasan'}.gender").get(0).toString();


        //assertEquals(200,response.statusCode());
        assertEquals(userId, actUserId);
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























































