package stepdefinitions.Api_Test.stundent_controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.StudentResponsePojo;
import pojos.Student_Post_Object_Pojo;
import pojos.Student_Post_Pojo;

import java.util.HashMap;
import java.util.Map;

import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Post01 {
    Response response;
    Map<String, Object> expectedData;
    static int viceDeanUserId;

    Faker faker = new Faker();
    String name =faker.name().firstName();
    String email = name+"@gmail.com";



    int ssnNo1 = Faker.instance().number().numberBetween(100,999);
    int ssnNo2= Faker.instance().number().numberBetween(10,99);
    int ssnNo3 = Faker.instance().number().numberBetween(1000,9999);


    int phoneNo1= Faker.instance().number().numberBetween(100,999);
    int phoneNo2= Faker.instance().number().numberBetween(100,999);
    int phoneNo3 = Faker.instance().number().numberBetween(1000,9999);






    @Given("Fatih admin sends the student data_POST")
    public void fatih_admin_sends_the_student_data_post() {
        //http://164.92.252.42:8080/students/save
          /*
    {
    "advisorTeacherId": "20",
  "birthDay": "1999-09-12",
  "birthPlace": "konya",
  "email": "fatih987@hotmail.com",
  "fatherName": "aliosman",
  "gender": "MALE",
  "motherName": "ummu",
  "name": "username",
  "password": "klem28736",
  "phoneNumber": "235-524-8872",
  "ssn": "453-44-3984",
  "surname": "kaskkc",
  "username": "kalmelikatmet"
}
     */
        specAdmin.pathParams("first", "students", "second", "save");
        expectedData = new HashMap<>();
        expectedData.put("advisorTeacherId", 20);
        expectedData.put("birthDay", "1999-09-12");
        expectedData.put("birthPlace", "konya");
        expectedData.put("email", email);
        expectedData.put("fatherName", "aliooosman");
        expectedData.put("gender", "MALE");
        expectedData.put("motherName", "umnmu");
        expectedData.put("name", "username");
        expectedData.put("password", "klem28736");
        expectedData.put("phoneNumber", phoneNo1+"-"+phoneNo2+"-"+phoneNo3);
        expectedData.put("ssn", ssnNo1+"-"+ssnNo2+"-"+ssnNo3);
        expectedData.put("surname", "kaskkc");
        expectedData.put("username", name);

        System.out.println("expectedData = " + expectedData);

        response = given(specAdmin).body(expectedData).post("{first}/{second}");
        response.prettyPrint();

    }
    @Then("Fatih admin gets the student data and assert_POST")
    public void fatih_admin_gets_the_student_data_and_assert_post() throws JsonProcessingException {


        JsonPath jsonPath = response.jsonPath();
        assertEquals(200, response.statusCode());
        assertEquals(expectedData.get("username"), jsonPath.getString("object.username"));
        assertEquals(expectedData.get("name"), jsonPath.getString("object.name"));
        assertEquals(expectedData.get("surname"), jsonPath.getString("object.surname"));
        assertEquals(expectedData.get("birthDay"), jsonPath.getString("object.birthDay"));
        assertEquals(expectedData.get("birthPlace"), jsonPath.getString("object.birthPlace"));
        assertEquals(expectedData.get("phoneNumber"), jsonPath.getString("object.phoneNumber"));
        assertEquals(expectedData.get("gender"), jsonPath.getString("object.gender"));
        //assertEquals(expectedData.get("studentNumber"), jsonPath.getString("object.studentNumber"));
        assertEquals(expectedData.get("motherName"), jsonPath.getString("object.motherName"));
        assertEquals(expectedData.get("fatherName"), jsonPath.getString("object.fatherName"));
        assertEquals(expectedData.get("email"), jsonPath.getString("object.email"));
        //assertEquals(expectedData.get("active"), jsonPath.getString("object.active"));
        assertEquals("Student saved Successfully", jsonPath.getString("message"));
        //assertEquals("CREATED", jsonPath.getString("httpStatus"));

        //viceDeanUserId = jsonPath.getInt("userId");

        /*

        {
    "object": {
        "userId": 1545,
        "username": "kalmeppkatmt",
        "name": "username",
        "surname": "kaskkc",
        "birthDay": "1999-09-12",
        "birthPlace": "konya",
        "phoneNumber": "225-124-8802",
        "gender": "MALE",
        "studentNumber": 2291,
        "motherName": "umnmu",
        "fatherName": "aliooosman",
        "email": "fatig98@hotmail.com",
        "active": true
    },
    "message": "Student saved Successfully"
}


         */



    }

}
