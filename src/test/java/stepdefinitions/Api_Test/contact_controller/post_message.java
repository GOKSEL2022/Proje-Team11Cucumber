package stepdefinitions.Api_Test.contact_controller;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.MessageSavePojo;
import pojos.MessagePostPojo;

import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;
import static io.restassured.RestAssured.given;

public class post_message {

    Response response;
    MessagePostPojo expectedData;
    MessageSavePojo saveMessage;

    @Given("Set the Url post message")
    public void setTheUrlPostMessage() {
        specAdmin.pathParams("first","contactMessages","second","save");
    }

    @And("Set the expected data post message")
    public void setTheExpectedDataPostMessage() {
        saveMessage=new MessageSavePojo("rabiaa","rabiaa@gmail.com","devamsızlık","boş mesaj","2023-04-26");
        expectedData=new MessagePostPojo(saveMessage,"Contact Message Created Successfully","CREATED");
    }


    @When("Send the request and get the response post message")
    public void sendTheRequestAndGetTheResponsePostMessage() {
        response=given(specAdmin).when().body(expectedData).post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Do assertion post message")
    public void doAssertionPostMessage() {
        MessagePostPojo actualData=response.as(MessagePostPojo.class);

        Assert.assertEquals(200,response.statusCode());

        Assert.assertEquals(saveMessage.getName(),actualData.getObject().getName());
        Assert.assertEquals(saveMessage.getEmail(),actualData.getObject().getEmail());
        Assert.assertEquals(saveMessage.getMessage(),actualData.getObject().getMessage());
        Assert.assertEquals(saveMessage.getSubject(),actualData.getObject().getSubject());
        Assert.assertEquals(saveMessage.getDate(),actualData.getObject().getDate());
        Assert.assertEquals(expectedData.getMessage(),actualData.getMessage());
        Assert.assertEquals(expectedData.getHttpStatus(),actualData.getHttpStatus());


    }
}
