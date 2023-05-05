package stepdefinitions.Api_Test.student_info_controller;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.StudentInfoPojo;
import pojos.StudentInfoRootPojo;
import utilities.ObjectMapperUtils;


import static base_urls.ManagementonSchoolsBaseUrl.specTeacher;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class S01_Post {
    static int student_info_id;
    Response response;
    StudentInfoPojo expectedData;

    static int absente = Faker.instance().number().numberBetween(4, 99);
    static int educationTermId = Faker.instance().number().numberBetween(1, 2);
    static double finalExam = Faker.instance().number().randomDouble(1, 1, 99);
    static String infoNote = Faker.instance().lorem().sentence(11);
    static int lessonId = Faker.instance().number().numberBetween(1, 2);
    static double midtermExam = Faker.instance().number().randomDouble(1, 1, 99);
    static int studentId = Faker.instance().number().numberBetween(4, 305);

    @Given("teacher sends the student info data_POST")
    public void teacherSendsTheStudentInfoData() {
        specTeacher.pathParams("first", "studentInfo", "second", "save");
        expectedData = new StudentInfoPojo(absente,
                educationTermId,
                finalExam,
                infoNote,
                lessonId,
                midtermExam,
                studentId);
        System.out.println("expectedData = " + expectedData);
        response = given().spec(specTeacher).when().body(expectedData).post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("teacher gets the student info data and assert_POST")
    public void teacherGetsTheStudentInfoDataAndAssert() {
        JsonPath jsonPath = response.jsonPath();

        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(absente, jsonPath.getInt("object.absentee"));
        Assert.assertEquals(expectedData.getFinalExam(), jsonPath.getDouble("object.finalExam"), 0);
        Assert.assertEquals(expectedData.getInfoNote(), jsonPath.getString("object.infoNote"));
        Assert.assertEquals(expectedData.getMidtermExam(), jsonPath.getDouble("object.midtermExam"), 0);
        assertEquals("CREATED", jsonPath.getString("httpStatus"));
        assertEquals("Student Info saved Successfully", jsonPath.getString("message"));

        student_info_id = jsonPath.getInt("object.id");


    }
}
