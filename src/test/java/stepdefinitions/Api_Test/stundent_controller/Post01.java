package stepdefinitions.Api_Test.stundent_controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.StudentResponsePojo;
import pojos.Student_Post_Object_Pojo;
import pojos.Student_Post_Pojo;

import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Post01 {
    Response response;



 Student_Post_Object_Pojo student_post_object_pojo;
 Student_Post_Pojo expectedData;



    @Given("Fatih admin sends the student data_POST")
    public void fatih_admin_sends_the_student_data_post() {
        //http://164.92.252.42:8080/students/save

        specAdmin.pathParams("first","students","second","save");
        student_post_object_pojo= new Student_Post_Object_Pojo(662,"kalmelikatmet",
                "username","kaskkc","1999-09-12","konya","235-524-8872",
                "MALE",1658,"ummu","aliosman","fatih987@hotmail.com",true);

        expectedData=new Student_Post_Pojo(student_post_object_pojo,"Student saved Successfully");
        response= given(specAdmin).when().body(expectedData).post("{first}/{second}");



    }
    @Then("Fatih admin gets the student data and assert_POST")
    public void fatih_admin_gets_the_student_data_and_assert_post() {



        Student_Post_Pojo actualData = response.as(Student_Post_Pojo.class);

        assertEquals(200, response.statusCode());
        assertEquals("Student saved Successfully", actualData.message);
        assertEquals(expectedData.getObject().getUserId(), actualData.getObject().getUserId());
        assertEquals(expectedData.getObject().getUsername(), actualData.getObject().getUsername());
        assertEquals(expectedData.getObject().getName(), actualData.getObject().getName());
        assertEquals(expectedData.getObject().getSurname(), actualData.getObject().getSurname());
        assertEquals(expectedData.getObject().getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(expectedData.getObject().getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getObject().getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getObject().getGender(), actualData.getObject().getGender());
        assertEquals(expectedData.getObject().getStudentNumber(), actualData.getObject().getStudentNumber());
        assertEquals(expectedData.getObject().getMotherName(), actualData.getObject().getMotherName());
        assertEquals(expectedData.getObject().getFatherName(), actualData.getObject().getFatherName());
        assertEquals(expectedData.getObject().getEmail(), actualData.getObject().getEmail());

  /*
    {
    "object": {
        "userId": 662,
        "username": "kalmelikatmet",
        "name": "username",
        "surname": "kaskkc",
        "birthDay": "1999-09-12",
        "birthPlace": "konya",
        "phoneNumber": "235-524-8872",
        "gender": "MALE",
        "studentNumber": 1658,
        "motherName": "ummu",
        "fatherName": "aliosman",
        "email": "fatih987@hotmail.com",
        "active": true
    },
    "message": "Student saved Successfully"
}

     */

    }

}
