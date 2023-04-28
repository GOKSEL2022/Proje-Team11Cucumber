package stepdefinitions.Api_Test.teacher_controller;

import base_urls.ManagementonSchoolsBaseUrl;
import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.ObjectPojo;
import pojos.TeacherPojo;

import java.util.HashMap;
import java.util.Map;


import static base_urls.ManagementonSchoolsBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;



public class GetTeacherByIdStepDefs {
    Response response;
    TeacherPojo expectedData;
    ObjectPojo objectPojo;
    String username;
    String password;

    @Given("send get request to get teacher")
    public void send_get_request_to_get_teacher() {
        //Set the url
        spec.pathParams("first","teachers","second","getSavedTeacherById","third",35);

        //Set the expected data
        objectPojo = new ObjectPojo(35,"alican","Ali","Can","2000-01-05", "222-55-9977","Ankara","333-333-9955","MALE","ali.can@gmail.com");
        expectedData = new TeacherPojo(objectPojo,"Teacher successfully found","OK");
        System.out.println("expectedData = " + expectedData);

        //Send the request and get the response
        response = given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();

    }
    @Then("validate body")
    public void validate_body() throws JsonProcessingException {

        //1. Validation:
        response.then().statusCode(200).
                body("object.username",equalTo(objectPojo.getUsername()),
                        "object.name",equalTo(objectPojo.getName()),
                        "object.surname",equalTo(objectPojo.getSurname()),
                        "object.birthDay",equalTo(objectPojo.getBirthDay()),//Diğerleri Ödev...
                        "message",equalTo(expectedData.getMessage()));

        //2. Validation
        JsonPath jsonPath = response.jsonPath();

        assertEquals(200,response.getStatusCode());
        assertEquals(objectPojo.getUsername(), jsonPath.getString("object.username"));
        assertEquals(objectPojo.getName(), jsonPath.getString("object.name"));//Gerisi Ödev


        assertEquals(expectedData.getHttpStatus(), jsonPath.getString("httpStatus"));
        assertEquals(expectedData.getMessage(), jsonPath.getString("message"));

        //3. Validation
        Map<String, Object> actualDataMap = response.as(HashMap.class);

        assertEquals(200,response.getStatusCode());
        assertEquals(objectPojo.getUsername(),  ((Map)actualDataMap.get("object")).get("username"));
        assertEquals(objectPojo.getName(),  ((Map)actualDataMap.get("object")).get("name"));//Gerisi Ödev

        assertEquals(expectedData.getMessage(), actualDataMap.get("message"));
        assertEquals(expectedData.getHttpStatus(), actualDataMap.get("httpStatus"));

        //4. Validation
        TeacherPojo actualTeacherPojo = response.as(TeacherPojo.class);

        assertEquals(objectPojo.getUsername(), actualTeacherPojo.getObject().getUsername());
        assertEquals(objectPojo.getName(), actualTeacherPojo.getObject().getName());
        assertEquals(objectPojo.getSurname(), actualTeacherPojo.getObject().getSurname());//Gerisi Ödev

        assertEquals(expectedData.getMessage(),actualTeacherPojo.getMessage());
        assertEquals(expectedData.getHttpStatus(),actualTeacherPojo.getHttpStatus());

        //5. Validation
        TeacherPojo actualDataPojoMapper = new ObjectMapper().readValue(response.asString(), TeacherPojo.class);

        assertEquals(objectPojo.getUsername(), actualDataPojoMapper.getObject().getUsername());
        assertEquals(objectPojo.getName(), actualDataPojoMapper.getObject().getName());
        assertEquals(objectPojo.getSurname(), actualDataPojoMapper.getObject().getSurname());//Gerisi Ödev

        assertEquals(expectedData.getMessage(),actualDataPojoMapper.getMessage());
        assertEquals(expectedData.getHttpStatus(),actualDataPojoMapper.getHttpStatus());

        //6. Validation
        TeacherPojo actualDataPojoGson = new Gson().fromJson(response.asString(), TeacherPojo.class);

        assertEquals(objectPojo.getUsername(), actualDataPojoGson.getObject().getUsername());
        assertEquals(objectPojo.getName(), actualDataPojoGson.getObject().getName());
        assertEquals(objectPojo.getSurname(), actualDataPojoGson.getObject().getSurname());//Gerisi Ödev

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
