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
     //http://164.92.252.42:8080/teachers/save
        //Set the url     http://164.92.252.42:8080/teachers/getSavedTeacherById/148


        specTeacher.pathParams("first","teachers","second","getSavedTeacherById","third",148);


        //Set the expected data
        teacher_object_pojo = new Teacher_Object_Pojo(148,"team111","mehmet","emin","2000-12-12", "888-22-3698","elazig","555-444-6666","MALE","alican@gmail.com");
         expectedData = new TeacherrPojo(teacher_object_pojo,"Teacher successfully found","OK");
        System.out.println("expectedData = " + expectedData);

//    // {
//        "userId": 148,
//        "username": "team111",
//        "name": "mehmet",
//        "surname": "emin",
//        "birthDay": "2000-12-12",
//        "ssn": "888-22-3698",
//        "birthPlace": "elazig",
//        "phoneNumber": "555-444-6666",
//        "gender": "MALE",
//        "email": "alican@gmail.com"
//    },


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
