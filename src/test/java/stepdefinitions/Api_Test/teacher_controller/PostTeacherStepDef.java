package stepdefinitions.Api_Test.teacher_controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;
import static base_urls.ManagementonSchoolsBaseUrl.specTeacher;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class PostTeacherStepDef {
    Response response;
    @Given("emin Get request ile tum Teacher al")
    //http:////164.92.252.42:8080/teachers/save
    public void eminGetRequestIleTumTeacherAl() {
        specAdmin.pathParams("first","teachers","second","save");
        response = given(specAdmin).post("{first}/{second}");
       response.prettyPrint();
    }

    @Then("emin bodyi dogrula: userId={string}, username={string}, name={string}, surname={string}, birthDay={string}, ssn={string}, birthPlace={string}, phoneNumber={string}, gender={string},email={string}")
    public void eminBodyiDogrulaUserIdUsernameNameSurnameBirthDaySsnBirthPlacePhoneNumberGenderEmail(String userId, String username, String name, String surname, String birthDay, String ssn, String birthPlace, String phoneNumber, String gender) {
        JsonPath jsonPath = response.jsonPath();


        String actUserId = jsonPath.getList("findAll{it.username=='mehmet'}.userId").get(0).toString();
        String actUsername = jsonPath.getList("findAll{it.username=='mehmet'}.username").get(0).toString();
        String actName = jsonPath.getList("findAll{it.username=='mehmet'}.name").get(0).toString();
        String actSurname = jsonPath.getList("findAll{it.username=='mehmet'}.surname").get(0).toString();
        String actBirthDay = jsonPath.getList("findAll{it.username=='mehmet'}.birthDay").get(0).toString();
        String actSsn = jsonPath.getList("findAll{it.username=='mehmet'}.ssn").get(0).toString();
        String actBirthPlace = jsonPath.getList("findAll{it.username=='mehmet'}.birthPlace").get(0).toString();
        String actPhoneNumber = jsonPath.getList("findAll{it.username=='mehmet'}.phoneNumber").get(0).toString();
        String actGender = jsonPath.getList("findAll{it.username=='mehmet'}.gender").get(0).toString();


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
//    "object": {
//        "userId": 1352,
//        "username": "mehmet",
//        "name": "team11",
//        "surname": "alican",
//        "birthDay": "2002-01-01",
//        "ssn": "145-45-4589",
//        "birthPlace": "alaman",
//        "phoneNumber": "123-145-7896",
//        "gender": "MALE",
//        "email": "xcgh@gmail.com"
//    },
//    "message": "Teacher saved successfully",
//    "httpStatus": "CREATED"
//}