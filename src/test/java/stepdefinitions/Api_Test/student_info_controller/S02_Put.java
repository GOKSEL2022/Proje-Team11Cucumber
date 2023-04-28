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

import static base_urls.ManagementonSchoolsBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static stepdefinitions.Api_Test.student_info_controller.S01_Post.student_info_id;

public class S02_Put {

    static int absente_update = Faker.instance().number().numberBetween(4,99);
    static int educationTermId =  Faker.instance().number().numberBetween(1,2);
    static double finalExam_update =  Faker.instance().number().randomDouble(1,1,99);
    static String infoNote_update =  Faker.instance().lorem().sentence(11);
    static int lessonId =  Faker.instance().number().numberBetween(1,2);
    static double midtermExam_update =  Faker.instance().number().randomDouble(1,1,99);
    static int studentId =  Faker.instance().number().numberBetween(4,305);
    Response response;
    StudentInfoPojo expectedData;
    @Given("teacher sends the student info data_PUT")
    public void teacherSendsTheStudentInfoData_PUT() {

        spec.pathParams("first", "studentInfo", "second", "save","third",student_info_id);
        expectedData = new StudentInfoPojo(absente_update,
                educationTermId,
                finalExam_update,
                infoNote_update,
                lessonId,
                midtermExam_update,
                studentId);
        System.out.println("expectedData = " + expectedData);
        response = given().spec(spec).when().body(expectedData).put("{first}/{second}/{third}");
        response.prettyPrint();

    }

    @Then("teacher gets the student info data and assert_PUT")
    public void teacherGetsTheStudentInfoDataAndAssert_PUT() {
        StudentInfoRootPojo actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), StudentInfoRootPojo.class);
        System.out.println("actualData = " + actualData);

        assertEquals(200,response.statusCode());

        assertEquals(expectedData.getAbsentee(),actualData.getStudentInfoObjectPojo().getAbsentee());
        assertEquals(expectedData.getEducationTermId(),actualData.getStudentInfoObjectPojo().getEducationTerm());
        assertEquals(expectedData.getFinalExam(),actualData.getStudentInfoObjectPojo().getFinalExam());
        assertEquals(expectedData.getInfoNote(),actualData.getStudentInfoObjectPojo().getInfoNote());







    }
}
