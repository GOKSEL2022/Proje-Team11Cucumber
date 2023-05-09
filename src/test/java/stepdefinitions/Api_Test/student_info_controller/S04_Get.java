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

public class S04_Get {
    Map<String,Object> expectedData;
    Response response;
    @Given("teacher sends the student info data_GET")
    public void teacherSendsTheStudentInfoData_GET() {

        specTeacher.pathParams("first","studentInfo","second","get","third",student_info_id);

       expectedData = new HashMap<>();
       expectedData.put("message","Error: Student Info with id "+student_info_id+" Not found");
       expectedData.put("statusCode", 404);
    }
    @Then("teacher gets the student info data and assert_GET")
    public void teacherGetsTheStudentInfoDataAndAssert_GET() {

        response = given().spec(specTeacher).when().get("{first}/{second}/{third}");
        response.prettyPrint();

        Map<String,Object> actualData = response.as(HashMap.class);
        System.out.println("actualData = " + actualData);

       Assert.assertEquals(404,response.statusCode());
        Assert.assertEquals(expectedData.get("message"),actualData.get("message"));


    }
}
