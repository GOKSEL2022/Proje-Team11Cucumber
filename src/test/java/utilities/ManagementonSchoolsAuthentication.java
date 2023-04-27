package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ManagementonSchoolsAuthentication {



        public static void main(String[] args) {
          System.out.println(generateToken( ));
        }

    public static String generateToken(){
        Map<String, Object> postBody = new HashMap<>();
       postBody.put("password","485424698");
        postBody.put("username","Admin");

        Response response = given().contentType(ContentType.JSON).body(postBody).post("http://209.38.244.227/auth/login");

        return response.jsonPath().getString("token");

    }



}
