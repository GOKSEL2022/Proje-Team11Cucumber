package stepdefinitions.Api_Test.dean_controller;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.Dean_Object_Pojo;
import pojos.Dean_Pojo;

import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

public class Dean_Controller_PostStepDefs {

    Response response;
    Dean_Object_Pojo dean_object_pojo;
    Dean_Pojo expectedData;
    /*
    put dean update userid

    http://164.92.252.42:8080/dean/update/29
    {
    "object": {
        "userId": 29,
        "username": "hasanPut",
        "name": "veliPut",
        "surname": "tarikPut",
        "birthDay": "2000-01-01",
        "ssn": "415-48-6721",
        "birthPlace": "van",
        "phoneNumber": "230-545-2974",
        "gender": "MALE"
    },
    "message": "Dean updated Successful",
    "httpStatus": "OK"
}

------POST dean save--------
http://164.92.252.42:8080/dean/save
gelen body response
{
    "object": {
        "userId": 200,
        "username": "hasan36",
        "name": "veli",
        "surname": "tarik",
        "birthDay": "2000-01-01",
        "ssn": "405-47-6721",
        "birthPlace": "van",
        "phoneNumber": "230-545-2004",
        "gender": "MALE"
    },
    "message": "Dean Saved",
    "httpStatus": "CREATED"
}
post gonderdigim bilgi reguest----------
{
  "birthDay": "2000-01-01",
  "birthPlace": "van",
  "gender": "MALE",
  "name": "veli",
  "password": "987654321",
  "phoneNumber": "230-545-2004",
  "ssn": "405-47-6721",
  "surname": "tarik",
  "username": "hasan36"
}

----------dean/getAll--------
http://164.92.252.42:8080/dean/getAll

-------dean/search--------------
http://164.92.252.42:8080/dean/search?page=&size=&sort=&type=

------------dean delete----------------------
http://164.92.252.42:8080/dean/delete/userid(29)
----------------------------------------------------------------------------------------

     */
//http://164.92.252.42:8080/dean/save
    @Given("Ali dean olusturmak icin data istegi gonder ve gelen datayi al")
    public void aliDeanOlusturmakIcinDataIstegiGonderVeGelenDatayi() {
        specAdmin.pathParams("first","dean","second","save");

        dean_object_pojo=new Dean_Object_Pojo(200,"hasan36","veli","tarik","2000-01-01","405-47-6721","van","230-545-2004","MALE");
        expectedData = new Dean_Pojo(dean_object_pojo,"Dean Saved","CREATED");

        response=given(specAdmin).get("{first}/{second}");
        response.prettyPrint();
    }

    @And("Ali gelen datalari test et")
    public void aliGelenDatalariTestEt() {
        Dean_Pojo actualDeanPojo = response.as(Dean_Pojo.class);

        assertEquals(dean_object_pojo.getUsername(), actualDeanPojo.getObject().getUsername());
        assertEquals(dean_object_pojo.getName(), actualDeanPojo.getObject().getName());
        assertEquals(dean_object_pojo.getSurname(), actualDeanPojo.getObject().getSurname());
        assertEquals(dean_object_pojo.getBirthDay(), actualDeanPojo.getObject().getBirthDay());
        assertEquals(dean_object_pojo.getSsn(), actualDeanPojo.getObject().getSsn());
        assertEquals(dean_object_pojo.getBirthPlace(), actualDeanPojo.getObject().getBirthPlace());
        assertEquals(dean_object_pojo.getPhoneNumber(), actualDeanPojo.getObject().getPhoneNumber());
        assertEquals(dean_object_pojo.getGender(), actualDeanPojo.getObject().getGender());


        assertEquals(expectedData.getMessage(),actualDeanPojo.getMessage());
        assertEquals(expectedData.getHttpStatus(),actualDeanPojo.getHttpStatus());
    }



    {
       /* "birthDay": "2000-01-01",
            "birthPlace": "van",
            "gender": "MALE",
            "name": "veli",
            "password": "987654321",
            "phoneNumber": "230-545-2004",
            "ssn": "405-47-6721",
            "surname": "tarik",
            "username": "hasan36"

        */
    }


    }






