package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ManagementonSchoolsAuthentication {

    public static String generateToken(String password,String username) {
        String url="http://209.38.244.227/auth/login";
        Map<String, Object>token=new HashMap<>();
        token.put( "password", password);
        token.put("username", username);
        Response response=given().contentType(ContentType.JSON).body(token).post(url);
        response.prettyPrint();
        return response.jsonPath().getString("token");
    }
}
