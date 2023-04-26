package stepdefinitions.Api_Test.admin_controller;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.Admin_Object_Pojo;
import pojos.Admin_Pojo;

public class Admin_Controller_GetAllStepDefs {
    Response response;
    Admin_Pojo expectedData;
    Admin_Object_Pojo admin_object_pojo;
    @Given("Set the Url admin_getAll")
    public void setTheUrlAdmin_getAll() {
    }


    @And("Set the expected data admin_getAll")
    public void setTheExpectedDataAdmin_getAll() {

    }

    @When("Send the request and get the response admin_getAll")
    public void sendTheRequestAndGetTheResponseAdmin_getAll() {

    }

    @Then("Do assertion admin_getAll")
    public void doAssertionAdmin_getAll() {

    }
}
/*
   {
        "object": {
        "userId": 53,
                "username": "Gelsin",
                "name": "Adem",
                "surname": "Bahar",
                "birthDay": null,
                "ssn": "542-23-7852",
                "birthPlace": null,
                "phoneNumber": "745-258-1236",
                "gender": "MALE"
    },
        "message": "Admin Saved",
            "httpStatus": "CREATED"
    }
 */
