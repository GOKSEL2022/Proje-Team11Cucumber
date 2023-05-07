package stepdefinitions.Api_Test.dean_controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Dean_Controller_Put_GetId_StepDefs {
    Response response;
    @Given("Ali guncelledigin deani by id ile al id={string}")
    public void aliGuncellediginDeaniByIdIleAlId(String id) {
        specAdmin.pathParams("first","dean","second","getManagerById","third","29");

        response = given(specAdmin).get("{first}/{second}/{third}");
        response.prettyPrint();

    }
    @Then("Ali body should be:id={string} username={string} name={string} surname={string} birthDay={string} ssn={string} birthPlace={string} phoneNumber={string} gender={string}")
    public void ali_body_should_be_username_ssn_name_surname_birth_day_birth_place_phone_number_gender(String userId, String username, String name, String surname, String birthDay, String ssn, String birthPlace, String phoneNumber, String gender) {
    //   JsonPath jsonPath = response.jsonPath();
    //   //findAll{} list dönen noktadan itibaren kullanılır. Body direkt list döndüğü için findAll{} ile başlıyoruz.
    //   String actUserId = jsonPath.getList("findAll{it.username=='hasanPut'}.userId").get(0).toString();
    //   String actUsername = jsonPath.getList("findAll{it.username=='hasanPut'}.username").get(0).toString();
    //   String actName = jsonPath.getList("findAll{it.username=='hasanPut'}.name").get(0).toString();
    //   String actSurname = jsonPath.getList("findAll{it.username=='hasanPut'}.surname").get(0).toString();
    //   String actBirthDay = jsonPath.getList("findAll{it.username=='hasanPut'}.birthDay").get(0).toString();
    //   String actSsn = jsonPath.getList("findAll{it.username=='hasanPut'}.ssn").get(0).toString();
    //   String actBirthPlace = jsonPath.getList("findAll{it.username=='hasanPut'}.birthPlace").get(0).toString();
    //   String actPhoneNumber = jsonPath.getList("findAll{it.username=='hasanPut'}.phoneNumber").get(0).toString();
    //   String actGender = jsonPath.getList("findAll{it.username=='hasanPut'}.gender").get(0).toString();


    //   assertEquals(200,response.statusCode());
    //   assertEquals(userId, actUserId);
    //   assertEquals(username,actUsername);
    //   assertEquals(name,actName);
    //   assertEquals(surname,actSurname);
    //   assertEquals(birthDay,actBirthDay);
    //   assertEquals(ssn,actSsn);
    //   assertEquals(birthPlace,actBirthPlace);
    //   assertEquals(phoneNumber,actPhoneNumber);
    //   assertEquals(gender,actGender);

    }



    }




