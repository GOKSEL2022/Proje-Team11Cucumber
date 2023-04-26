package stepdefinitions.Api_Test.vice_dean_controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import pojos.Vice_Dean_Controller_Object_Pojo;
import pojos.Vice_Dean_Controller_Root_Pojo;
import test_data.ManagementonSchoolsTestData;
import utilities.ObjectMapperUtils;

import java.io.IOException;
import java.util.Map;


import static base_urls.ManagementonSchoolsBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Get01 {
    /*
    Given
     1) Url : http://209.38.244.227/vicedean/save
     2) {
          "birthDay": "1341-08-06",
          "birthPlace": "Izmir",
          "gender": "MALE",
          "name": "Nilufer",
          "password": "123123Ee",
          "phoneNumber": "896-865-4545",
          "ssn": "761-25-3434",
          "surname": "ozkul",
          "username": "niloz"
        }
             I send POST Request to the Url
        Then
            Status code is 200
        And
            response body is like     {
                                        "object": {
                                            "userId": 8,
                                            "username": "niloz",
                                            "name": "Nilufer",
                                            "surname": "ozkul",
                                            "birthDay": "1341-08-06",
                                            "ssn": "761-25-3434",
                                            "birthPlace": "Izmir",
                                            "phoneNumber": "896-865-4545",
                                            "gender": "MALE"
                                        },
                                        "message": "Vice dean Saved",
                                        "httpStatus": "CREATED"
                                       }

     */
    Response response;

  Vice_Dean_Controller_Object_Pojo expectedData;

    @Given("user sends get request for vice_dean data")
    public void user_sends_post_request_for_vice_dean_data() {
        // http://209.38.244.227/vicedean/getAll
        //Set the url
        spec.pathParams("first", "vicedean", "second", "save");


        //Set the expected data
        expectedData = new Vice_Dean_Controller_Object_Pojo("1341-08-06","Izmir",
                "MALE", "Nilufer","123123Ee","896-865-4545","761-25-3434","ozkul",
                "niloz");

        //Send the request and get the response
        response = given(spec).body(expectedData).post("{first}/{second}");
        response.prettyPrint();
        System.out.println("response = " + response);
    }

    @Then("user gets the vice_dean data and assert")
    public void user_gets_the_vice_dean_data_and_assert() throws IOException {
        Vice_Dean_Controller_Object_Pojo actualData = ObjectMapperUtils.convertJsonToJava(response.asString(),Vice_Dean_Controller_Object_Pojo.class);
        System.out.println("actualData = " + actualData);
        assertEquals(200, response.statusCode());
        assertEquals(expectedData.getBirthDay(), actualData.getBirthDay());
        assertEquals(expectedData.getBirthPlace(), actualData.getBirthPlace());
        assertEquals(expectedData.getGender(), actualData.getGender());
        assertEquals(expectedData.getName(), actualData.getName());
        assertEquals(expectedData.getPassword(), actualData.getPassword());
        assertEquals(expectedData.getPhoneNumber(), actualData.getPhoneNumber());
        assertEquals(expectedData.getSsn(), actualData.getSsn());
        assertEquals(expectedData.getSurname(), actualData.getSurname());
        assertEquals(expectedData.getUsername(), actualData.getUsername());


    }
}
