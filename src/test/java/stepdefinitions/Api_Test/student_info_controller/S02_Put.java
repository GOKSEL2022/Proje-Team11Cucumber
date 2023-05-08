package stepdefinitions.Api_Test.student_info_controller;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.StudentInfoPojo;
import pojos.StudentInfoRootPojo;
import pojos.StudentInfoUpdatePojo;
import utilities.ObjectMapperUtils;


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
    StudentInfoUpdatePojo expectedData;
    @Given("teacher sends the student info data_PUT")
    public void teacherSendsTheStudentInfoData_PUT() {

        specTeacher.pathParams("first", "studentInfo", "second", "update","third",student_info_id);

        expectedData = new StudentInfoUpdatePojo(5,
                educationTermId,
                5,
                infoNoteUpdate,
                lessonId,
                5);

        System.out.println("expectedData = " + expectedData);

    response = given().spec(specTeacher).body(expectedData).put("/{first}/{second}/{third}");
    response.prettyPrint();

    }

    @Then("teacher gets the student info data and assert_PUT")
    public void teacherGetsTheStudentInfoDataAndAssert_PUT() {

       JsonPath jsonPath = response.jsonPath();

        assertEquals(200,response.statusCode());
        assertEquals("Student Info updated Successfull",jsonPath.getString("message"));
        assertEquals("CREATED",jsonPath.getString("httpStatus"));

        assertEquals(expectedData.getAbsenteeUpdate(),jsonPath.getInt("object.absentee"));
        assertEquals(expectedData.getFinalExamUpdate(),jsonPath.getDouble("object.finalExam"));
        assertEquals(expectedData.getMidtermExamUpdate(),jsonPath.getDouble("object.midtermExam"));
        assertEquals(expectedData.getInfoNoteUpdate(),jsonPath.getString("object.infoNote"));







    }
}
