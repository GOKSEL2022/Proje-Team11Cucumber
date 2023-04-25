package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AuthenticationManagementonSchools {
    public static void main(String[] args) {
        System.out.println("generateToken() = " + generateToken());
    }
    public static String generateToken() {
            Map<String, Object> bodyMap = new HashMap<>();
            bodyMap.put("password","12345678");
            bodyMap.put("username","AdminB103");

            //spec'i kullanmadigimiz icin contentType ve endpoint'in tamamini kullanmaliyiz.

            Response response = given().contentType(ContentType.JSON).body(bodyMap).when().post("https://school-management-v1.herokuapp.com/auth/login");
            // response.prettyPrint();
            return response.jsonPath().getString("token"); // burada id_token'a karsilik gelen degeri bize return yapar.
            // jsonPath : key value ikililerinde path olarak ne girilirse girilen path'in value'sunu verir.
        }

}
