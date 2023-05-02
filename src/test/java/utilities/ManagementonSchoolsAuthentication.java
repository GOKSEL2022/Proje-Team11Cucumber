package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ManagementonSchoolsAuthentication {

    public static String generateToken(String password,String username) {
        String url="http://164.92.252.42:8080/auth/login";
        Map<String, Object>token=new HashMap<>();
        token.put( "password", password);
        token.put("username", username);
        Response response=given().contentType(ContentType.JSON).body(token).post(url);
        response.prettyPrint();
        return response.jsonPath().getString("token");
    }

}
