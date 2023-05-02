package stepdefinitions.Api_Test.teacher_controller;

import base_urls.ManagementonSchoolsBaseUrl;
import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.Teacher_Object_Pojo;
import pojos.TeacherrPojo;
import java.util.HashMap;
import java.util.Map;

import static base_urls.ManagementonSchoolsBaseUrl.specTeacher;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;



public class GetTeacherByIdStepDefs {
    Response response;
    TeacherrPojo expectedData;
    Teacher_Object_Pojo teacher_object_pojo;
    String username;
    String password;

    //@Given("get a token with {string} username and {string} password")
    //public void get_a_token_with_username_and_password(String string, String string2) {
    //    // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
    //}

    @Given("send get request to get teacher")
    public void send_get_request_to_get_teacher() {

        //Set the url
        specTeacher.pathParams("first","teachers","second","getSavedTeacherById","third",35);


        //Set the url     http://164.92.252.42:8080/teachers/getSavedTeacherById/148

        specTeacher.pathParams("first","teachers","second","getSavedTeacherById","third",148);


        //Set the expected data
        teacher_object_pojo = new Teacher_Object_Pojo(148,"team111","mehmet","emin","2000-12-12", "888-22-3698","elazig","555-444-6666","MALE","alican@gmail.com");
         expectedData = new TeacherrPojo(teacher_object_pojo,"Teacher successfully found","OK");
        System.out.println("expectedData = " + expectedData);

        //Send the request and get the response
        response = given(specTeacher).get("{first}/{second}/{third}");
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

        //2. Validation
        JsonPath jsonPath = response.jsonPath();

        assertEquals(200,response.getStatusCode());
        assertEquals(teacher_object_pojo.getUsername(), jsonPath.getString("object.username"));
        assertEquals(teacher_object_pojo.getName(), jsonPath.getString("object.name"));


        assertEquals(expectedData.getHttpStatus(), jsonPath.getString("httpStatus"));
        assertEquals(expectedData.getMessage(), jsonPath.getString("message"));

        //3. Validation
        Map<String, Object> actualDataMap = response.as(HashMap.class);

        assertEquals(200,response.getStatusCode());
        assertEquals(teacher_object_pojo.getUsername(),  ((Map)actualDataMap.get("object")).get("username"));
        assertEquals(teacher_object_pojo.getName(),  ((Map)actualDataMap.get("object")).get("name"));

        assertEquals(expectedData.getMessage(), actualDataMap.get("message"));
        assertEquals(expectedData.getHttpStatus(), actualDataMap.get("httpStatus"));

        //4. Validation
        TeacherrPojo actualTeacherPojo = response.as(TeacherrPojo.class);

        assertEquals(teacher_object_pojo.getUsername(), actualTeacherPojo.getObject().getUsername());
        assertEquals(teacher_object_pojo.getName(), actualTeacherPojo.getObject().getName());
        assertEquals(teacher_object_pojo.getSurname(), actualTeacherPojo.getObject().getSurname());

        assertEquals(expectedData.getMessage(),actualTeacherPojo.getMessage());
        assertEquals(expectedData.getHttpStatus(),actualTeacherPojo.getHttpStatus());

        //5. Validation
        TeacherrPojo actualDataPojoMapper = new ObjectMapper().readValue(response.asString(), TeacherrPojo.class);

        assertEquals(teacher_object_pojo.getUsername(), actualDataPojoMapper.getObject().getUsername());
        assertEquals(teacher_object_pojo.getName(), actualDataPojoMapper.getObject().getName());
        assertEquals(teacher_object_pojo.getSurname(), actualDataPojoMapper.getObject().getSurname());

        assertEquals(expectedData.getMessage(),actualDataPojoMapper.getMessage());
        assertEquals(expectedData.getHttpStatus(),actualDataPojoMapper.getHttpStatus());

        //6. Validation
        TeacherrPojo actualDataPojoGson = new Gson().fromJson(response.asString(), TeacherrPojo.class);

        assertEquals(teacher_object_pojo.getUsername(), actualDataPojoGson.getObject().getUsername());
        assertEquals(teacher_object_pojo.getName(), actualDataPojoGson.getObject().getName());
        assertEquals(teacher_object_pojo.getSurname(), actualDataPojoGson.getObject().getSurname());

        assertEquals(expectedData.getMessage(),actualDataPojoGson.getMessage());
        assertEquals(expectedData.getHttpStatus(),actualDataPojoGson.getHttpStatus());

    }

    //@Given("get a token with {string} username and {string} password")
    //public void getATokenWithUsernameAndPassword(String arg0, String arg1) {
    //     username = arg0;
    //     password = arg1;
    //    generateToken(username, password);

    //}
}
