package stepdefinitions.Api_Test.admin_controller;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Admin_Object_Pojo;
import pojos.Admin_Pojo;

import static base_urls.ManagementonSchoolsBaseUrl.*;
import static io.restassured.RestAssured.given;

public class Admin_Controller_PostStepDefs {
    Response response;
    Admin_Pojo expectedData;
    Admin_Object_Pojo admin_object_pojo;
    @Given("Set the Url admin_post")
    public void setTheUrlAdmin_post() {
        //{{baseUrl}}/admin/save
        specViceDean.pathParams("firsth","admin","second","save");
    }
    @And("Set the expected data admin_post")
    public void setTheExpectedDataAdmin_post() {
        admin_object_pojo=new Admin_Object_Pojo(45,"Mustafa","Atatürk","Kemal","null","188-11-9380","null","938-938-3838","MALE");
        expectedData=new Admin_Pojo(admin_object_pojo,"Admin Saved","CREATED");
        System.out.println("expectedData = " + expectedData);
    }
    @When("Send the request and get the response admin_post")
    public void sendTheRequestAndGetTheResponseAdmin_post() {
        response=given(specAdmin).when().body(expectedData).post("{firsth}/{second}");
        response.prettyPrint();
    }
    @Then("Do assertion admin_post")
    public void doAssertionAdmin_post() {

        Admin_Pojo actualData=response.as(Admin_Pojo.class);

        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals("CREATED",actualData.getHttpStatus());
        Assert.assertEquals("Admin Saved",actualData.getMessage());
        Assert.assertEquals(expectedData.getObject().getUserId(),admin_object_pojo.getUserId());
        Assert.assertEquals(expectedData.getObject().getUsername(),admin_object_pojo.getUsername());
        Assert.assertEquals(expectedData.getObject().getName(),admin_object_pojo.getName());
        Assert.assertEquals(expectedData.getObject().getSurname(),admin_object_pojo.getSurname());
        Assert.assertEquals(expectedData.getObject().getBirthDay(),admin_object_pojo.getBirthDay());
        Assert.assertEquals(expectedData.getObject().getSsn(),admin_object_pojo.getSsn());
        Assert.assertEquals(expectedData.getObject().getBirthPlace(),admin_object_pojo.getBirthPlace());
        Assert.assertEquals(expectedData.getObject().getPhoneNumber(),admin_object_pojo.getPhoneNumber());
        Assert.assertEquals(expectedData.getObject().getGender(),admin_object_pojo.getGender());


        /*
   {
    "object": {
        "userId": 45,
        "username": "Mustafa",
        "name": "Atatürk",
        "surname": "Kemal",
        "birthDay": null,
        "ssn": "188-11-9380",
        "birthPlace": null,
        "phoneNumber": "938-938-3838",
        "gender": "MALE"
    },
    "message": "Admin Saved",
    "httpStatus": "CREATED"
}

         */


    }
}