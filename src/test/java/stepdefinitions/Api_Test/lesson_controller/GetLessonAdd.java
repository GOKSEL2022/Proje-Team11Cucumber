package stepdefinitions.Api_Test.lesson_controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


import static base_urls.ManagementonSchoolsBaseUrl.specViceDean;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;


public class GetLessonAdd {
    Response response;

    @Given("Mdogan Send query to get guest user by lessonId={string}")
    public void mdogan_send_query_to_get_guest_user_by_lesson_ıd(String lessonId) {

        //{{baseUrl}}/lessons/getAll
        specViceDean.pathParams("first", "lessons", "second", "getAll");
        response = given(specViceDean).get("{first}/{second}");
         response.prettyPrint();


    }

    @Then("Mdogan body should be like : lessonId={string} lessonName={string} creditScore={string} compulsory={string}")
    public void mdogan_body_should_be_like_lesson_name_lesson_name_credit_score_compulsory(String lessonId, String lessonName, String creditScore, String compulsory) {

        JsonPath jsonPath = response.jsonPath();
        String actualLessonID = jsonPath.get("contact.findAll{it.lessonId==209}.lessonId").toString();
        String actuallessonName = jsonPath.get("contact.findAll{it.lessonId==209}.lessonName").toString();
        String actualcreditScore = jsonPath.get("contact.findAll{it.lessonId==209}.creditScore").toString();
        String actualcompulsory = jsonPath.get("contact.findAll{it.lessonId==209}.compulsory").toString();

        assertEquals(200, response.statusCode());
        assertEquals(lessonId, actualLessonID);


        assertEquals(lessonName, actuallessonName);
        assertEquals(creditScore, actualcreditScore);
        assertEquals(compulsory, actualcompulsory);


    }
}



