package stepdefinitions.Api_Test.vice_dean_controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.Vice_Dean_Controller_Object_Pojo;
import pojos.Vice_Dean_Controller_Root_Pojo;

import java.io.IOException;

import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;

import static io.restassured.RestAssured.given;

import static org.junit.Assert.assertEquals;


public class ViceDeanPost {
    //http://164.92.252.42:8080/vicedean/getAll?size=10000
    Response response;
    @Given("Nilufer Get request ile tum Deanleri al")
    public void nilufer_get_request_ile_tum_deanleri_al() {
        specAdmin.pathParams("first","vicedean","second","getAll");

        response = given(specAdmin).get("{first}/{second}");
        //response.prettyPrint();
    }
    @Then("Nilufer bodyi dogrula: userId={string}, username={string}, name={string}, surname={string}, birthDay={string}, ssn={string}, birthPlace={string}, phoneNumber={string}, gender={string}")
    public void bodyi_dogrula_user_id_username_name_surname_birth_day_ssn_birth_place_phone_number_gender(String userId, String username, String name, String surname, String birthDay, String ssn, String birthPlace, String phoneNumber, String gender) {
        JsonPath jsonPath = response.jsonPath();
        //findAll{} list dönen noktadan itibaren kullanılır. Body direkt list döndüğü için findAll{} ile başlıyoruz.
        String actUserId = jsonPath.getList("findAll{it.username=='yildizselcuk'}.userId").get(0).toString();
        String actUsername = jsonPath.getList("findAll{it.username=='yildizselcuk'}.username").get(0).toString();
        String actName = jsonPath.getList("findAll{it.username=='yildizselcuk'}.name").get(0).toString();
        String actSurname = jsonPath.getList("findAll{it.username=='yildizselcuk'}.surname").get(0).toString();
        String actBirthDay = jsonPath.getList("findAll{it.username=='yildizselcuk'}.birthDay").get(0).toString();
        String actSsn = jsonPath.getList("findAll{it.username=='yildizselcuk'}.ssn").get(0).toString();
        String actBirthPlace = jsonPath.getList("findAll{it.username=='yildizselcuk'}.birthPlace").get(0).toString();
        String actPhoneNumber = jsonPath.getList("findAll{it.username=='yildizselcuk'}.phoneNumber").get(0).toString();
        String actGender = jsonPath.getList("findAll{it.username=='yildizselcuk'}.gender").get(0).toString();

        assertEquals(200,response.statusCode());
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
//{
//  "birthDay": "1995-01-01",
//  "birthPlace": "Istanbul",
//  "gender": "MALE",
//  "name": "Selcuk",
//  "password": "12345678",
//  "phoneNumber": "211-110-8904",
//  "ssn": "211-11-8904",
//  "surname": "Yildiz",
//  "username": "yildizselcuk"
//}

//{
//    "object": {
//        "userId": 360,
//        "username": "yildizselcuk",
//        "name": "Selcuk",
//        "surname": "Yildiz",
//        "birthDay": "1995-01-01",
//        "ssn": "211-11-8904",
//        "birthPlace": "Istanbul",
//        "phoneNumber": "211-110-8904",
//        "gender": "MALE"
//    },
//    "message": "Vice dean Saved",
//    "httpStatus": "CREATED"
//}