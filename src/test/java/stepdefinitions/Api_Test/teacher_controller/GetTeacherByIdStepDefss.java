
package stepdefinitions.Api_Test.teacher_controller;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import pojos.Teacher_Object_Pojo;
import pojos.TeacherrPojo;

import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;
import static base_urls.ManagementonSchoolsBaseUrl.specTeacher;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class GetTeacherByIdStepDefss {
    Response response;
    TeacherrPojo expectedData;
    Teacher_Object_Pojo teacher_object_pojo;
    String username;
    String password;

    @Given("send get request to get teacher")
    public void send_get_request_to_get_teacher() {
     //164.92.252.42:8080/teachers/getSavedTeacherById/179

        specAdmin.pathParams("first","teachers","second","getSavedTeacherById","third",179);

        //Set the expected data
        teacher_object_pojo = new Teacher_Object_Pojo(179,"Elbert772","Hilma","Batz"
                ,"2000-01-01", "333-61-4435","Customer-focused","387-939-3856","MALE","Morris725@gmail.com");
         expectedData = new TeacherrPojo(teacher_object_pojo,"Teacher successfully found","OK");
        System.out.println("expectedData = " + expectedData);

        //Send the request and get the response
        response = given(specAdmin).get("{first}/{second}/{third}");
        response.prettyPrint();
    }
    @Then("validate body")
    public void validate_body() throws JsonProcessingException {

        //1. Validation:
        response.then().statusCode(200).
                body("object.username",equalTo(teacher_object_pojo.getUsername()),
                        "object.name",equalTo(teacher_object_pojo.getName()),
                        "object.surname",equalTo(teacher_object_pojo.getSurname()),
                        "object.birthDay",equalTo(teacher_object_pojo.getBirthDay()),
                        "object.ssn",equalTo(teacher_object_pojo.getSsn()),
                        "object.birthPlace",equalTo(teacher_object_pojo.getBirthPlace()),
                        "object.phoneNumber",equalTo(teacher_object_pojo.getPhoneNumber()),
                        "object.gender",equalTo(teacher_object_pojo.getGender()),
                        "object.email",equalTo(teacher_object_pojo.getEmail()),
                        "message",equalTo(expectedData.getMessage()));
    }
}
//{
//    "object": {
//        "userId": 179,
//        "username": "Elbert772",
//        "name": "Hilma",
//        "surname": "Batz",
//        "birthDay": "2000-01-01",
//        "ssn": "333-61-4435",
//        "birthPlace": "Customer-focused",
//        "phoneNumber": "387-939-3856",
//        "gender": "MALE",
//        "email": "Morris725@gmail.com"
//    },
//    "message": "Teacher successfully found",
//    "httpStatus": "OK"
//}

