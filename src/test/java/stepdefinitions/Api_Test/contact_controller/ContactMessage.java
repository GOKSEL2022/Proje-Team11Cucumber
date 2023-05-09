package stepdefinitions.Api_Test.contact_controller;

import base_urls.ManagementonSchoolsBaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.MessagePostPojo;
import pojos.MessageSavePojo;

import java.util.HashMap;
import java.util.Map;

import static base_urls.ManagementonSchoolsBaseUrl.*;
import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class ContactMessage {

    Response response;
    MessageSavePojo saveMessage;
    Faker faker= new Faker();
    String fakeEmail=faker.internet().emailAddress();

    MessagePostPojo actualData;
    Map<String,Object> expectedData;



    @Given("Set the Url post message")
    public void setTheUrlPostMessage() {
        ManagementonSchoolsBaseUrl.schoolsetupAdmin();
        specAdmin.pathParams("first","contactMessages","second","save");

    }

    @And("Set the expected data post message")
    public void setTheExpectedDataPostMessage() {
        expectedData= new HashMap<>();
        expectedData.put("name","rabiaa");
        expectedData.put("email",fakeEmail);
        expectedData.put("subject","us03 için yazılan deneme mesajıdır dikkate almayınız:)");
        expectedData.put("message","boş mesajlar gitsin");
        System.out.println("expectedData = " + expectedData);

      //  saveMessage=new MessageSavePojo("rabiaa",fakeEmail,"us03 için yazılan deneme mesajıdır dikkate almayınız:)","boş mesaj gitsin");
      // actualData=new MessagePostPojo(expectedData,"Contact Message Created Successfully","CREATED");
    }


    @When("Send the request and get the response post message")
    public void sendTheRequestAndGetTheResponsePostMessage() {
        response=given(specAdmin).when().body(expectedData).post("{first}/{second}");
        response.prettyPrint();
      //  actualData=response.as(MessagePostPojo.class);
    }

    @Then("Do assertion post message")
    public void doAssertionPostMessage() {

        Assert.assertEquals(200,response.statusCode());

        Assert.assertEquals(saveMessage.getName(),actualData.getObject().getName());
//        Assert.assertEquals(expectedData.getObject().getEmail(),actualData.getObject().getEmail());
//        Assert.assertEquals(expectedData.getObject().getMessage(),actualData.getObject().getMessage());
//        Assert.assertEquals(expectedData.getObject().getSubject(),actualData.getObject().getSubject());
//        Assert.assertEquals(expectedData.getObject().getMessage(),actualData.getMessage());
//        Assert.assertEquals(expectedData.getHttpStatus(),actualData.getHttpStatus());
//        Assert.assertEquals(expectedData.getMessage(),actualData.getMessage());

    }

/////////////////////////////////////////////////////////////////////////////////////////////////

    @Given("Set the Url contact_message_getAll")
    public void setTheUrlContact_message_getAll() {

        schoolsetupDean();
        specDean.pathParams("first","contactMessages","second","getAll").
                queryParams("size","10000");

    }


    @When("Send the request and get the response contact_message_getAll")
    public void sendTheRequestAndGetTheResponseContact_message_getAll() {
    response=given(specDean).when().get("/{first}/{second}");
    response.prettyPrint();
    }



    @Then("Do assertion body name={string}, email={string}, subject={string}, message={string}, date={string}")
    public void doAssertionBodyNameEmailSubjectMessageDate(String name, String email, String subject, String message, String date) {

      JsonPath jsonPath = response.jsonPath();
        String actName = jsonPath.getList("content.findAll{it.email=='sdfasdfasf@ksjs.com'}.name").get(0).toString();
       String actEmail = jsonPath.getList("content.findAll{it.email=='sdfasdfasf@ksjs.com'}.email").get(0).toString();
       String actSubject = jsonPath.getList("content.findAll{it.email=='sdfasdfasf@ksjs.com'}.subject").get(0).toString();
       String actMessage = jsonPath.getList("content.findAll{it.email=='sdfasdfasf@ksjs.com'}.message").get(0).toString();
       String actDate = jsonPath.getList("content.findAll{it.email=='sdfasdfasf@ksjs.com'}.date").get(0).toString();

       assertEquals(200,response.statusCode());
        assertEquals(name,actName);
       assertEquals(email,actEmail);
       assertEquals(subject,actSubject);
      assertEquals(message,actMessage);
      assertEquals(date,actDate);
    }


    @Given("Set the Url contact_message_get_searchByEmail")
    public void setTheUrlContact_message_get_searchByEmail() {

        schoolsetupDean();
        specDean.pathParams("first","contactMessages","second","searchByEmail").
                queryParam("email","rabia123@gmail.com");
    }

    @When("Send the request and get the response contact_message_get_searchByEmail")
    public void sendTheRequestAndGetTheResponseContact_message_get_searchByEmail() {
        response=given(specDean).when().get("/{first}/{second}");
        response.prettyPrint();

    }

    @Then("Do assertion contact_message_get_searchByEmail")
    public void doAssertionContact_message_get_searchByEmail() {
        response.then().statusCode(200);
        assertTrue(response.asString().contains("message")); //boş gelmediğinin kanıtıdır

    }
/////////////////////////////////////////////////////////////////////////////////////////////////

    @Given("Set the Url contact_message_get_searchBySubject")
    public void setTheUrlContact_message_get_searchBySubject() {
        schoolsetupDean();
        specDean.pathParams("first","contactMessages","second","searchBySubject").
                queryParam("subject","İletişim");
    }

    @When("Send the request and get the response contact_message_get_searchBySubject")
    public void sendTheRequestAndGetTheResponseContact_message_get_searchBySubject() {
        response=given(specDean).when().get("/{first}/{second}");
        response.prettyPrint();
    }

    @Then("Do assertion contact_message_get_searchBySubject")
    public void doAssertionContact_message_get_searchBySubject() {
        response.then().statusCode(200);
        assertTrue(response.asString().contains("message")); //boş gelmediğinin kanıtıdır

    }







}
