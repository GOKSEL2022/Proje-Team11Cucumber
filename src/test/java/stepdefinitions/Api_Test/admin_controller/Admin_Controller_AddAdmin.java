package stepdefinitions.Api_Test.admin_controller;

import base_urls.ManagementonSchoolsBaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.AddAdminAcPojo;
import pojos.AddAdminExPojo;

import java.util.List;

import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;
import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class Admin_Controller_AddAdmin {


    Faker faker= new Faker();
    String fakeEmail=faker.internet().emailAddress();
    String username=faker.name().username();
    String name=faker.name().firstName();
    String surname=faker.name().lastName();
    int ssnNo1= Faker.instance().number().numberBetween(100,999);
    int ssnNo2=Faker.instance().number().numberBetween(10,99);
    int ssnNo3=Faker.instance().number().numberBetween(1000,9999);
    String ssn=ssnNo1+"-"+ssnNo2+"-"+ssnNo3;
//    String phoneNumber=phoneNo1+"-"+phoneNo2+"-"+phoneNo3;
    int phoneNo1= Faker.instance().number().numberBetween(100,999);

    int phoneNo2= Faker.instance().number().numberBetween(100,999);
    int phoneNo3 = Faker.instance().number().numberBetween(1000,9999);

    Response response;
    AddAdminExPojo addAdminExPojo;
    AddAdminAcPojo addAdminAcPojo;



/*
{
  "birthDay": "1990-05-12",
  "birthPlace": "Izmir",
  "built_in": true,
  "gender": "MALE",
  "name": "ercan",
  "password": "12345678",
  "phoneNumber": "128-113-8492",
  "ssn": "748-93-9213",
  "surname": "yıldız",
  "username": "ercan12"
}
 */

    /*
    {
    "object": {
        "userId": 449,
        "username": "ercan12",
        "name": "ercan",
        "surname": "yıldız",
        "birthDay": null,
        "ssn": "748-93-9213",
        "birthPlace": null,
        "phoneNumber": "128-113-8492",
        "gender": "MALE"
    },
    "message": "Admin Saved",
    "httpStatus": "CREATED"
}
     */


    @Given("Set the Url admin_controller_postAdmin")
    public void setTheUrlAdmin_controller_postAdmin() {
        ManagementonSchoolsBaseUrl.schoolsetupAdmin();
        specAdmin.pathParams("first","admin","second","save");


    }

    @And("Set the expected data admin_controller_postAdmin")
    public void setTheExpectedDataAdmin_controller_postAdmin() {
        addAdminExPojo= new AddAdminExPojo(username,name,surname,
                "1990-05-12",ssnNo1+"-"+ssnNo2+"-"+ssnNo3,"Izmir",
                phoneNo1+"-"+phoneNo2+"-"+phoneNo3,"12345678","MALE");
        System.out.println("addAdminExPojo = " + addAdminExPojo);
    }

    @When("Send the request and get the response admin_controller_postAdmin")
    public void sendTheRequestAndGetTheResponseAdmin_controller_postAdmin() {
        response = given().spec(specAdmin).when().body(addAdminExPojo).post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Do assertion admin_controller_postAdmin")
    public void doAssertionAdmin_controller_postAdmin() {
        AddAdminAcPojo actualData = response.as(AddAdminAcPojo.class);
        System.out.println("actualData = " + actualData);

        assertEquals(200,response.statusCode());
        assertEquals(addAdminExPojo.getUsername(),actualData.getObject().getUsername());
        assertEquals(addAdminExPojo.getName(),actualData.getObject().getName());
        assertEquals(addAdminExPojo.getSurname(),actualData.getObject().getSurname());
        assertEquals(addAdminExPojo.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(addAdminExPojo.getSsn(),actualData.getObject().getSsn());
        assertEquals(addAdminExPojo.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(addAdminExPojo.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(addAdminExPojo.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(addAdminExPojo.getGender(),actualData.getObject().getGender());
        assertEquals(addAdminExPojo.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertTrue(actualData.getMessage().contains("CREATED"));
        assertTrue(actualData.getHttpStatus().contains("Admin Saved"));
    }

    @Given("Set the Url admin_controller_getAll")
    public void setTheUrlAdmin_controller_getAll() {
        ManagementonSchoolsBaseUrl.schoolsetupAdmin();
        specAdmin.pathParams("first","admin","second","getAll");
    }

    @When("Send the request and get the response admin_controller_getAll")
    public void sendTheRequestAndGetTheResponseAdmin_controller_getAll() {
        response=given(specAdmin).when().get("/{first}/{second}");
        response.prettyPrint();
    }

    @Then("Do assertion admin_controller_getAll")
    public void doAssertionAdmin_controller_getAll() {
        assertEquals(200,response.statusCode());

//        String actName = jsonPath.getList("content.findAll{it.phoneNumber=='276-758-7895'}.ssn").get(0).toString();
//        String actSsn = jsonPath.getList("content.findAll{it.phoneNumber=='276-758-7895'}.ssn").get(0).toString();
//        String actUsername = jsonPath.getList("content.findAll{it.phoneNumber=='276-758-7895'}.username").get(0).toString();
//
//
//
//        assertEquals("Hyman Rolfson",actName);
//        assertEquals("754-81-4774",actSsn);
//        assertEquals("Jess.Gorczany74",actUsername);


    }



    @Then("Do assertion this body username={string} ssn={string} name={string} surname={string} birthDay={string} birthPlace={string} phoneNumber={string} gender={string} built_in={string}")
    public void doAssertionThisBodyUsernameSsnNameSurnameBirthDayBirthPlacePhoneNumberGenderBuilt_in(String username, String ssn, String name, String surname, String birthDay, String birthPlace, String phoneNumber, String gender, String built_in) {

        assertEquals(200,response.statusCode());
        JsonPath jsonPath = response.jsonPath();
        List<String> list = jsonPath.getList("content.findAll{it.id>100}.username");
        System.out.println("list = " + list);
        assertTrue(list.contains(username));

    }
}
