package stepdefinitions.Api_Test.student_info_controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static base_urls.ManagementonSchoolsBaseUrl.specTeacher;
import static io.restassured.RestAssured.given;
import static stepdefinitions.Api_Test.student_info_controller.S01_Post.student_info_id;

public class S03_Delete {
    Map<String,String> expectedData;
    Response response;
    @Given("teacher sends the student info data_DELETE")
    public void teacherSendsTheStudentInfoData_DELETE() {   //{{baseUrl}}/studentInfo/delete/:studentInfoId
        specTeacher.pathParams("first", "studentInfo", "second", "delete","third",student_info_id);

         expectedData = new HashMap<>();
        expectedData.put("message","Student Info deleted Successfully");
        expectedData.put("httpStatus","OK");
    }

    @Then("teacher gets the student info data and assert_DELETE")
    public void teacherGetsTheStudentInfoDataAndAssert_DELETE() {
        response = given().spec(specTeacher).when().delete("{first}/{second}/{third}");
        response.prettyPrint();

        Map<String,String> actualData = response.as(HashMap.class);
        System.out.println("actualData = " + actualData);

        Assert.assertEquals(200,response.statusCode());
        Assert.assertEquals(expectedData.get("message"),actualData.get("message"));
        Assert.assertEquals(expectedData.get("httpStatus"),actualData.get("httpStatus"));

    }
}
