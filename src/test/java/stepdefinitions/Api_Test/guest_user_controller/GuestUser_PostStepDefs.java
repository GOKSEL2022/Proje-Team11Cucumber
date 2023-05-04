package stepdefinitions.Api_Test.guest_user_controller;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import pojos.Guest_User_Object_Pojo;
import pojos.Guest_User_Pojo;

import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;
import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class GuestUser_PostStepDefs {
    Response response;
    Guest_User_Object_Pojo guest_user_object_pojo;
    Guest_User_Pojo expectedData;
    @Given("Set the Url GuestUser_post")
    public void setTheUrlGuestUser_post() {
        specAdmin.pathParams("first","guestUser","second","register");
    }

    @And("Set the expected data GuestUser_post")
    public void setTheExpectedDataGuestUser_post() {
        guest_user_object_pojo=new Guest_User_Object_Pojo(198,"Goksel","Goksel","Celik","null","258-45-7852","null","542-453-8523","MALE");
        expectedData=new Guest_User_Pojo(guest_user_object_pojo,"Guest User registered.","CREATED");
    }

    @When("Send the request and get the response GuestUser_post")
    public void sendTheRequestAndGetTheResponseGuestUser_post() {
        response=given(specAdmin).when().body(expectedData).post("{first}/{second}");
    }

    @Then("Do assertion GuestUser_post")
    public void doAssertionGuestUser_post() {
        JsonPath jsonPath = response.jsonPath();
        String actUserId = jsonPath.getList("content.findAll{it.username=='Goksel'}.userId").get(0).toString();
        String actUsername = jsonPath.getList("content.findAll{it.username=='Goksel'}.username").get(0).toString();
        String actSsn = jsonPath.getList("content.findAll{it.username=='Goksel'}.ssn").get(0).toString();
        String actName = jsonPath.getList("content.findAll{it.username=='Goksel'}.name").get(0).toString();
        String actSurname= jsonPath.getList("content.findAll{it.username=='Goksel'}.surname").get(0).toString();
        String actBirthDay= jsonPath.getList("content.findAll{it.username=='Goksel'}.birthDay").get(0).toString();
        String actBirthPlace= jsonPath.getList("content.findAll{it.username=='Goksel'}.birthPlace").get(0).toString();
        String actPhoneNumber= jsonPath.getList("content.findAll{it.username=='Goksel'}.phoneNumber").get(0).toString();
        String actGender= jsonPath.getList("content.findAll{it.username=='Goksel'}.gender").get(0).toString();
        String actMessage= jsonPath.getList("content.findAll{it.username=='Goksel'}.message").get(0).toString();
        String actHttpStatus= jsonPath.getList("content.findAll{it.username=='Goksel'}.httpStatus").get(0).toString();

        assertEquals(200,response.statusCode());
        assertEquals(expectedData.getObject().getUserId(),actUserId);
        assertEquals(expectedData.getObject().getSsn(),actSsn);
        assertEquals(expectedData.getObject().getName(),actName);
        assertEquals(expectedData.getObject().getSurname(),actSurname);
        assertEquals(expectedData.getObject().getBirthDay(),actBirthDay);
        assertEquals(expectedData.getObject().getBirthPlace(),actBirthPlace);
        assertEquals(expectedData.getObject().getPhoneNumber(),actPhoneNumber);
        assertEquals(expectedData.getObject().getGender(),actGender);
        assertEquals(expectedData.getMessage(),actMessage);
        assertEquals(expectedData.getHttpStatus(),actHttpStatus);
        /*
    {
    "object": {
        "userId": 198,
        "username": "Goksel",
        "name": "Goksel",
        "surname": "Celik",
        "birthDay": null,
        "ssn": "258-45-7852",
        "birthPlace": null,
        "phoneNumber": "542-453-8523",
        "gender": "MALE"
    },
    "message": "Guest User registered.",
    "httpStatus": "CREATED"
}
     */




        /*
        Guest_User_Pojo actualData=response.as(Guest_User_Pojo.class);

        Assert.assertEquals(200,response.statusCode());
        Assert.assertEquals("Guest User registered.",actualData.getMessage());
        Assert.assertEquals("CREATED",actualData.getHttpStatus());
        Assert.assertEquals(expectedData.getObject().getUserId(),actualData.getObject().getUserId());
        Assert.assertEquals(expectedData.getObject().getUsername(),actualData.getObject().getUsername());
        Assert.assertEquals(expectedData.getObject().getName(),actualData.getObject().getName());
        Assert.assertEquals(expectedData.getObject().getSurname(),actualData.getObject().getSurname());
        Assert.assertEquals(expectedData.getObject().getBirthDay(),actualData.getObject().getBirthDay());
        Assert.assertEquals(expectedData.getObject().getSsn(),actualData.getObject().getSsn());
        Assert.assertEquals(expectedData.getObject().getBirthPlace(),actualData.getObject().getBirthPlace());
        Assert.assertEquals(expectedData.getObject().getPhoneNumber(),actualData.getObject().getPhoneNumber());
        Assert.assertEquals(expectedData.getObject().getGender(),actualData.getObject().getGender());

         */


    }
}

