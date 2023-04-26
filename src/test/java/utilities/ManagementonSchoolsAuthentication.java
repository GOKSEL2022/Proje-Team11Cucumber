package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ManagementonSchoolsAuthentication {

    //  public static void main(String[] args) {
    //      System.out.println(generateToken());
    //  }

     //  public static String generateToken(String username, String password){
     //      String postBody = "{ \"password\": "+password+"",  \"username\": "+username+"}";

     //      Response response = given().contentType(ContentType.JSON).body(postBody).post("http://209.38.244.227/auth/login");

     //      return response.jsonPath().getString("token");

     //  }

   //public static String generateToken(String username1, String password1){
   //    username = username1;
   //    password = password1;

   //    postBody = "{ \"password\": "+password+",  \"username\": "+username+" }";

   //    Response response = given().contentType(ContentType.JSON).body(postBody).post("http://209.38.244.227/auth/login");

   //    return response.jsonPath().getString("token");


   //}


        public static void main(String[] args) {
            System.out.println(generateToken());
        }

        public static String generateToken(){
            Map<String, Object> postBody = new HashMap<>();
            postBody.put("password","485424698");
            postBody.put("username","Admin");

            Response response = given().contentType(ContentType.JSON).body(postBody).post("http://209.38.244.227/auth/login");

            return response.jsonPath().getString("token");

        }

}
