package stepdefinitions.Api_Test.student_info_controller;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.StudentInfoPojo;
import utilities.ObjectMapperUtils;

import static base_urls.ManagementonSchoolsBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class StudentInfoStepDefs {
    Response response;
    StudentInfoPojo expectedData;
    @Given("teacher sends the student info data_POST")
    public void teacherSendsTheStudentInfoData() {
        spec.pathParams("first", "studentInfo", "second", "save");
        StudentInfoPojo expectedData = new StudentInfoPojo(1,
                1,
                70.2,
                "omurdedigin",
                2,
                85.5,
                Faker.instance().number().numberBetween(4,305));
        System.out.println("expectedData = " + expectedData);
        response = given().spec(spec).when().body(expectedData).post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("teacher gets the student info data and assert_POST")
    public void teacherGetsTheStudentInfoDataAndAssert() {
        JsonPath jsonPath = response.jsonPath();
        Assert.assertEquals(200,response.statusCode());


        Assert.assertEquals(expectedData.getAbsentee(),jsonPath.getInt("object.absentee"));
        Assert.assertEquals(expectedData.getEducationTermId(),jsonPath.getInt("object.educationTermId"));
        Assert.assertEquals(expectedData.getFinalExam(),jsonPath.getInt("object.finalExam"),0);
        Assert.assertEquals(expectedData.getInfoNote(),jsonPath.getString("object.infoNote"));
        Assert.assertEquals(expectedData.getLessonId(),jsonPath.getInt("object.lessonId"));
        Assert.assertEquals(expectedData.getMidtermExam(),jsonPath.getInt("object.midtermExam"),0);
        Assert.assertEquals(expectedData.getStudentId(),jsonPath.getInt("object.studentId"));

        assertEquals("CREATED", jsonPath.getString("httpStatus"));
        assertEquals("Student Info saved Successfully", jsonPath.getString("message"));
    }
}
