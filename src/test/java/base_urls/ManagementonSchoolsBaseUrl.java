package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


import static io.restassured.RestAssured.given;

public class ManagementonSchoolsBaseUrl  {
   //static String username ;
   //static String password ;
   //static String postBody;
   //public static RequestSpecification spec;
   //public static void setUp(){
   //    spec = new RequestSpecBuilder().
   //            setContentType(ContentType.JSON).
   //            setBaseUri("http://209.38.244.227/").
   //          addHeader("Authorization","Bearer "+ generateToken(username, password) ).
   //            build();


   // }
   // public static void main(String[] args) {
   //     System.out.println(generateToken("AdminB103","12345678"));
   // }

   // public static String generateToken(String username1, String password1){
   //     username = username1;
   //     password = password1;
//
   //     postBody = "{ \"password\": "+password+",  \"username\": "+username+" }";
//
   //     Response response = given().contentType(ContentType.JSON).body(postBody).post("http://209.38.244.227/auth/login");
//
   //     return response.jsonPath().getString("token");
//
//
   // }

    public static RequestSpecification spec;

    public static void setUp(){
        spec = new RequestSpecBuilder().
                addHeader("Authorization","Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBZG1pbiIsImlhdCI6MTY4MjQ0NzczMSwiZXhwIjoxNjgyNDU2MzcxfQ.KWrkIWZW1-yuoDBmF7PowdU1Eu5QOCVXVRz085LkMMqpYU4NoC7yXh6Q9u8oO55EORLyUPYCLF3PBcS3rV7syA").
                setBaseUri("http://209.38.244.227/").
                build();
    }
}
