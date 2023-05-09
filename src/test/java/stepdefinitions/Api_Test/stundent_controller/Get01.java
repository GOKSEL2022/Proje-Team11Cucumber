package stepdefinitions.Api_Test.stundent_controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.Student_Post_Object_Pojo;

import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;
import static io.restassured.RestAssured.given;

public class Get01 {

    Response response;
    Student_Post_Object_Pojo expectedData;



    @Given("Fatih admin sends the student data_GET userId {string}")
    public void fatihAdminSendsTheStudentData_GETUserId(String string) {
        //http://164.92.252.42:8080/students/getStudentById?id=662

        specAdmin.pathParams("first","students","second","getStudentById").pathParam("id","662");
        expectedData = new Student_Post_Object_Pojo(662,"kalmelikatmet","username","kaskkc","1999-09-12",
                "konya","235-524-8872","MALE",1658,
                "ummu","aliosman","fatih987@hotmail.com",true);

//        response = given(specAdmin).when().body(expectedData).get("{first}/{second}");

                    /*

    {
    "id": 662,
    "username": "kalmelikatmet",
    "ssn": "453-44-3984",
    "name": "username",
    "surname": "kaskkc",
    "birthDay": "1999-09-12",
    "birthPlace": "konya",
    "phoneNumber": "235-524-8872",
    "gender": "MALE",
    "motherName": "ummu",
    "fatherName": "aliosman",
    "studentNumber": 1658,
    "email": "fatih987@hotmail.com",
    "active": true
     */





    }

    @Then("Fatih admin gets the student data and and assert_GET username={string} name={string} surname={string} birthDay={string} birthPlace={string} phoneNumber={string} gender={string} studentNumber={string} motherName ={string} fatherName = {string} email={string} active={string}")
    public void fatihAdminGetsTheStudentDataAndAndAssert_GETUsernameNameSurnameBirthDayBirthPlacePhoneNumberGenderStudentNumberMotherNameFatherNameEmailActive(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11) {
    }


}
