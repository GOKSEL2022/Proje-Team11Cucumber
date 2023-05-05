package stepdefinitions.Api_Test.dean_controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Dean_Controller_Delete_GetAll_StepDefs {
    Response response;


    @Given("Ali get requset ile tum dean'leri cagir")
    public void ali_get_requset_ile_tum_dean_leri_cagir() {
        specAdmin.pathParams("first","dean","second","getAll");

        response = given(specAdmin).get("{first}/{second}");
        //response.prettyPrint();


    }
    @Then("Ali gelen bodyde dean username {string} bulunmamali")
    public void ali_gelen_bodyde_dean_username_bulunmamalı(String username) {
        JsonPath jsonPath = response.jsonPath();

        List<Object> actBodylist = jsonPath.getList("findAll{it.username=='"+username+"'}");

        assertEquals(200,response.statusCode());
        assertTrue(actBodylist.isEmpty());


    }
}
