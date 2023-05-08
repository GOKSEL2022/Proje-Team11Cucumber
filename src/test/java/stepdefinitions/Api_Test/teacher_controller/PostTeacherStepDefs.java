package stepdefinitions.Api_Test.teacher_controller;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.*;

import java.util.ArrayList;

import static base_urls.ManagementonSchoolsBaseUrl.*;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class PostTeacherStepDefs {
    Response response;
    TeacherPojo actualData;
    TeacherObjectPojo teacherObjectPojo;
    TeacherRootPojo expectedata;

//{{baseUrl}}/teachers/save
    @Given("Set the Url teacher_post")
    public void set_the_url_teacher_post() {

        specAdmin.pathParams("firsth","teachers","second","save");
    }
   @And("Set the expected data teacher_post")
   public void set_the_expected_data_teacher_post() {
       ArrayList<Integer> lessonsIdList=new ArrayList<>();
       lessonsIdList.add(1);
      // lessonsIdList.add(2);
        TeacherRootPojo expectedata = new TeacherRootPojo
        ("2002-01-01","alaman","xchggh@gmail.com","MALE",
                true,lessonsIdList,"team11","12345678",
                "123-545-7886","144-45-8589","alican","mehmettt");
       System.out.println("expectetData"+expectedata);
     //  {
       //////  "birthDay": "2002-01-01",
       //////  "birthPlace": "alaman",
       //////  "email": "xchgh@gmail.com",
       //////  "gender": "MALE",
       //////  "isAdvisorTeacher": "true",
       //////  "lessonsIdList": [
       //////    3,
       //////    2
       //////  ],
       //////  "name": "team11",
       //////  "password": "12345678",
       //////  "phoneNumber": "123-145-7886",
       //////  "ssn": "144-45-4589",
       //////  "surname": "alican",
       //////  "username": "mehmett"

   }
   @When("Send the request and get the response teacher_post")
   public void send_the_request_and_get_the_response_teacher_post() {
        response=given(specAdmin).body(expectedata).post("{firsth}/{second}");
        response.prettyPrint();
   }
   @Then("Do assertion teacher_post")
   public void do_assertion_teacher_post() {

        TeacherPojo actuelData=response.as(TeacherPojo.class);
        assertEquals(200,response.statusCode());
       assertEquals("Teacher saved successfully",actuelData.getMessage());
       assertEquals("CREATED",actuelData.getHttpStatus());
       assertEquals(actualData.getObject().getUserId(),actuelData.getObject().getUserId());
       assertEquals(actualData.getObject().getUsername(),actuelData.getObject().getUsername());
       assertEquals(actualData.getObject().getName(),actuelData.getObject().getName());
       assertEquals(actualData.getObject().getSurname(),actuelData.getObject().getSurname());
       assertEquals(actualData.getObject().getBirthDay(),actuelData.getObject().getBirthDay());
       assertEquals(actualData.getObject().getSsn(),actuelData.getObject().getSsn());
       assertEquals(actualData.getObject().getBirthPlace(),actuelData.getObject().getBirthPlace());
       assertEquals(actualData.getObject().getPhoneNumber(),actuelData.getObject().getPhoneNumber());
       assertEquals(actualData.getObject().getGender(),actuelData.getObject().getGender());
       assertEquals(actualData.getObject().getEmail(),actuelData.getObject().getEmail());

   }
}
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
