package stepdefinitions.Api_Test.vice_dean_controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.Vice_Dean_Controller_Object_Pojo;
import pojos.Vice_Dean_Controller_Root_Pojo;


import java.util.HashMap;
import java.util.Map;

import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class ViceDeanPost {
    Response response;


    Map<String, Object> expectedData;
    static int viceDeanUserId;

    @Given("Nilufer post yapabilmeli")
    public void nilufer_post_yapabilmeli() {
        specAdmin.pathParams("first", "vicedean", "second", "save");
        expectedData = new HashMap<>();
        expectedData.put("birthDay", "1995-04-04");
        expectedData.put("birthPlace", "izmir");
        expectedData.put("password", "123123Nn");
        expectedData.put("phoneNumber", "157-123-9052");
        expectedData.put("gender", "FEMALE");
        expectedData.put("surname", "niluozkul");
        expectedData.put("name", "lulus");
        expectedData.put("ssn", "456-01-0123");
        expectedData.put("username", "lulusozkul");
        System.out.println("expectedData = " + expectedData);

        response = given(specAdmin).body(expectedData).post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Nilufer assertion yapar")
    public void nilufer_assertion_yapar() {
        JsonPath jsonPath = response.jsonPath();
      assertEquals(200, response.statusCode());
      assertEquals(expectedData.get("birthDay"), jsonPath.getString("object.birthDay"));
      assertEquals(expectedData.get("birthPlace"), jsonPath.getString("object.birthPlace"));
      assertEquals(expectedData.get("password"), jsonPath.getString("object.password"));
      assertEquals(expectedData.get("phoneNumber"), jsonPath.getString("object.phoneNumber"));
      assertEquals(expectedData.get("gender"), jsonPath.getString("object.gender"));
      assertEquals(expectedData.get("surname"), jsonPath.getString("object.surname"));
      assertEquals(expectedData.get("name"), jsonPath.getString("object.name"));
      assertEquals(expectedData.get("ssn"), jsonPath.getString("object.ssn"));
      assertEquals("Vice dean Saved", jsonPath.getString("message"));
      assertEquals("CREATED", jsonPath.getString("httpStatus"));

      viceDeanUserId = jsonPath.getInt("userId");
    }
}