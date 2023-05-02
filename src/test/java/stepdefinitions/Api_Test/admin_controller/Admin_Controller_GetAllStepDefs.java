package stepdefinitions.Api_Test.admin_controller;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import pojos.Admin_GetAll_Pojo;
import pojos.Admin_Object_Pojo;
import pojos.Admin_Pojo;

import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;
import static io.restassured.RestAssured.given;

public class Admin_Controller_GetAllStepDefs {
    /*
      spec.pathParam("first", "booking").queryParams("firstname", "Sally","lastname", "Brown");
     */
    Response response;
    Admin_GetAll_Pojo expectedData;
    @Given("Set the Url admin_getAll")
    public void setTheUrlAdmin_getAll() {
        //http://164.92.252.42:8080/admin/getAll?page=0&size=10&sort=name&type=des
        specAdmin.pathParams("first","admin","second","getAll").queryParams("page","0","size","10","sort","name","type","des");


    }
    @And("Set the expected data admin_getAll")
    public void setTheExpectedDataAdmin_getAll() {
        expectedData=new Admin_GetAll_Pojo(208,"bruno.deckow","522-86-9390","aaaaaaaa","McGlynn","2020-02-02","West Cordieberg","985-719-1499","MALE",false);
        System.out.println("expectedData = " + expectedData);
    }
    @When("Send the request and get the response admin_getAll")
    public void sendTheRequestAndGetTheResponseAdmin_getAll() {
        response=given(specAdmin).when().get("{first}/{second}");
        response.prettyPrint();
        /*
        List<Integer> getid = response.jsonPath().getList("findAll{it.studentResponse.userId==42}.id");
        System.out.println("getid = " + getid);
        getId = getid.get(0);

         */

    }

    @Then("Do assertion admin_getAll")
    public void doAssertionAdmin_getAll() {
        Admin_GetAll_Pojo actualData=response.as(Admin_GetAll_Pojo.class);

        Assert.assertEquals(200,response.statusCode());
        Assert.assertEquals(expectedData.getId(),actualData.getId());
        Assert.assertEquals(expectedData.getUsername(),actualData.getUsername());
        Assert.assertEquals(expectedData.getSsn(),actualData.getSsn());
        Assert.assertEquals(expectedData.getName(),actualData.getName());
        Assert.assertEquals(expectedData.getSurname(),actualData.getSurname());
        Assert.assertEquals(expectedData.getBirthDay(),actualData.getBirthDay());
        Assert.assertEquals(expectedData.getBirthPlace(),actualData.getBirthPlace());
        Assert.assertEquals(expectedData.getPhoneNumber(),actualData.getPhoneNumber());
        Assert.assertEquals(expectedData.getGender(),actualData.getGender());
        Assert.assertEquals(expectedData.isBuilt_in(),actualData.isBuilt_in());

    }
}

/*
{
            "id": 208,
            "username": "bruno.deckow",
            "ssn": "522-86-9390",
            "name": "aaaaaaaa",
            "surname": "McGlynn",
            "birthDay": "2020-02-02",
            "birthPlace": "West Cordieberg",
            "phoneNumber": "985-719-1499",
            "gender": "MALE",
            "built_in": false
        }
 */
