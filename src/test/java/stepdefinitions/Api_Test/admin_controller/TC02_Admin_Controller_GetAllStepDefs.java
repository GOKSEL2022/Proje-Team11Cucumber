package stepdefinitions.Api_Test.admin_controller;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static base_urls.ManagementonSchoolsBaseUrl.specAdmin;
import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class TC02_Admin_Controller_GetAllStepDefs {
    Response response;
    @Given("Send Adminn_GetAll request by id {string}")
    public void send_adminn_get_all_request_by_id(String string) {
       // http://164.92.252.42:8080/admin/getAll?page=0&size=1000&sort=name&type=desc
        specAdmin.pathParams("first","admin","second","getAll").queryParams("page","0","size","1000","sort","name","type","desc");
        response=given(specAdmin).when().get("{first}/{second}");
    }
    @Then("Admin_GetAll body should be: username={string} ssn={string} name={string} surname={string} birthDay={string} birthPlace={string} phoneNumber={string} gender={string} built_in={string}")
    public void admin_get_all_body_should_be_username_ssn_name_surname_birth_day_birth_place_phone_number_gender_built_in(String username, String ssn, String name, String surname, String birthDay, String birthPlace, String phoneNumber, String gender, String built_in) {

        JsonPath jsonPath=response.jsonPath();
        String actualUsername=jsonPath.getList("content.findAll{it.id==45}.username").get(0).toString();
        String actualSsn=jsonPath.getList("content.findAll{it.id==45}.ssn").get(0).toString();
        String actualName=jsonPath.getList("content.findAll{it.id==45}.name").get(0).toString();
        String actualSurname=jsonPath.getList("content.findAll{it.id==45}.surname").get(0).toString();
        String actualBirthDay=jsonPath.getList("content.findAll{it.id==45}.birthDay").get(0).toString();
        String actualBirthPlace=jsonPath.getList("content.findAll{it.id==45}.birthPlace").get(0).toString();
        String actualPhoneNumber=jsonPath.getList("content.findAll{it.id==45}.phoneNumber").get(0).toString();
        String actualGender=jsonPath.getList("content.findAll{it.id==45}.gender").get(0).toString();
        String actualBuilt_in=jsonPath.getList("content.findAll{it.id==45}.built_in").get(0).toString();

        assertEquals(200,response.statusCode());
        assertEquals(username,actualUsername);
        assertEquals(ssn,actualSsn);
        assertEquals(name,actualName);
        assertEquals(surname,actualSurname);
        assertEquals(birthDay,actualBirthDay);
        assertEquals(birthPlace,actualBirthPlace);
        assertEquals(phoneNumber,actualPhoneNumber);
        assertEquals(gender,actualGender);
        assertEquals(built_in,actualBuilt_in);
    }
}
/*          {
            "id": 45,
            "username": "Mustafa",
            "ssn": "188-11-9380",
            "name": "Atatürk",
            "surname": "Kemal",
            "birthDay": "1881-05-05",
            "birthPlace": "selanik",
            "phoneNumber": "938-938-3838",
            "gender": "MALE",
            "built_in": false
        }
        }
 */
