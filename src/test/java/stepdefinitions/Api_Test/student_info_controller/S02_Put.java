package stepdefinitions.Api_Test.student_info_controller;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.MainMenuPage;
import pojos.StudentInfoPojo;
import pojos.StudentInfoRootPojo;
import pojos.StudentInfoUpdatePojo;
import utilities.ObjectMapperUtils;


import java.util.HashMap;
import java.util.Map;

import static base_urls.ManagementonSchoolsBaseUrl.specTeacher;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static stepdefinitions.Api_Test.student_info_controller.S01_Post.*;

public class S02_Put {

     int absenteUpdate = Faker.instance().number().numberBetween(4,99);
    double finalExamUpdate =  Faker.instance().number().randomDouble(1,1,99);
    String infoNoteUpdate =  Faker.instance().lorem().sentence(11);
     double midtermExamUpdate =  Faker.instance().number().randomDouble(1,1,99);
    Response response;
    Map<String,Object> expectedData;

    @Given("teacher sends the student info data_PUT")
    public void teacherSendsTheStudentInfoData_PUT() {

        specTeacher.pathParams("first", "studentInfo", "second", "update","third",student_info_id);

        Map<String,Object> expectedData = new HashMap<>();
        expectedData.put("midtermExam",5.5);
        expectedData.put("finalExam",5.5);
        expectedData.put("infoNote","Please enter extra info");
        expectedData.put("absentee",5);
        expectedData.put("lessonId",1);
        expectedData.put("educationTermId",1);
        System.out.println("expectedData = " + expectedData);


    response = given().spec(specTeacher).body(expectedData).put("/{first}/{second}/{third}");
    response.prettyPrint();

    }

    @Then("teacher gets the student info data and assert_PUT")
    public void teacherGetsTheStudentInfoDataAndAssert_PUT() {

        JsonPath jsonPath = response.jsonPath();

        assertEquals(200,response.statusCode());
        assertEquals("Student Info updated Successfully",jsonPath.getString("message"));
        assertEquals("CREATED",jsonPath.getString("httpStatus"));

        assertEquals(5,jsonPath.getInt("object.absentee"));
        assertEquals("Please enter extra info",jsonPath.getString("object.infoNote"));
       assertEquals(5.5,jsonPath.getDouble("object.finalExam"),0);
       assertEquals(5.5,jsonPath.getDouble("object.midtermExam"),0);



    }
}
