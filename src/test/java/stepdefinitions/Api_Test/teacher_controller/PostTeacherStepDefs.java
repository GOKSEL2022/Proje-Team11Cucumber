package stepdefinitions.Api_Test.teacher_controller;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.*;

import static base_urls.ManagementonSchoolsBaseUrl.*;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class PostTeacherStepDefs {
    Response response;
    TeacherPojo expectedData;
    TeacherObjectPojo teacherObjectPojo;

//{{baseUrl}}/teachers/save
    @Given("Set the Url teacher_post")
    public void set_the_url_teacher_post() {

        specTeacher.pathParams("firsth","teachers","second","save");
    }
   @And("Set the expected data teacher_post")
   public void set_the_expected_data_teacher_post() {
      teacherObjectPojo=new TeacherObjectPojo(662,"mehmeeet","elazıglı","emiinn","2000-01-01","785-36-1452","Elazıg","542-369-7742","MALE","elazıg@gmail.com");
      expectedData=new TeacherPojo(teacherObjectPojo,"Teacher saved successfully","CREATED");

   }
   @When("Send the request and get the response teacher_post")
   public void send_the_request_and_get_the_response_teacher_post() {
        response=given(specTeacher).when().body(expectedData).post("{firsth}/{second}");
   }
   @Then("Do assertion teacher_post")
   public void do_assertion_teacher_post() {
        TeacherPojo actuelData=response.as(TeacherPojo.class);
        assertEquals(200,response.statusCode());
        assertEquals("Teacher saved successfully",actuelData.getMessage());
        assertEquals("CREATED",actuelData.getHttpStatus());
        assertEquals(expectedData.getObject().getUserId(),actuelData.getObject().getUserId());
        assertEquals(expectedData.getObject().getUsername(),actuelData.getObject().getUsername());
        assertEquals(expectedData.getObject().getName(),actuelData.getObject().getName());
        assertEquals(expectedData.getObject().getSurname(),actuelData.getObject().getSurname());
        assertEquals(expectedData.getObject().getBirthDay(),actuelData.getObject().getBirthDay());
        assertEquals(expectedData.getObject().getSsn(),actuelData.getObject().getSsn());
        assertEquals(expectedData.getObject().getBirthPlace(),actuelData.getObject().getBirthPlace());
        assertEquals(expectedData.getObject().getPhoneNumber(),actuelData.getObject().getPhoneNumber());
        assertEquals(expectedData.getObject().getGender(),actuelData.getObject().getGender());
        assertEquals(expectedData.getObject().getEmail(),actuelData.getObject().getEmail());

   }
}
//{"object": {
//        "userId": 669,
//        "username": "mehmeeet",
//        "name": "elazıglı",
//        "surname": "emiinn",
//        "birthDay": "2000-01-01",
//        "ssn": "785-36-1452",
//        "birthPlace": "Elazıg",
//        "phoneNumber": "542-369-7742",
//        "gender": "MALE",
//        "email": "elazıg@gmail.com"
//    },
//    "message": "Teacher saved successfully",
//    "httpStatus": "CREATED"
//}
//    "object": {
//        "userId": 576,
//        "username": "alime",
//        "name": "emin",
//        "surname": "mehm",
//        "birthDay": "2000-01-06",
//        "ssn": "458-45-1254",
//        "birthPlace": "ankara",
//        "phoneNumber": "152-458-2365",
//        "gender": "MALE",
//        "email": "eminn@gmail.com"
//    },
//    "message": "Teacher saved successfully",
//    "httpStatus": "CREATED"
//}
//{
//   {
//    "object": {
//        "userId": 585,
//        "username": "halimee",
//        "name": "emin",
//        "surname": "mehm",
//        "birthDay": "2002-01-06",
//        "ssn": "458-45-1246",
//        "birthPlace": "ankara",
//        "phoneNumber": "122-458-2265",
//        "gender": "MALE",
//        "email": "eminne@gmail.com"
//    },
//    "message": "Teacher saved successfully",
//    "httpStatus": "CREATED"
//}
//}