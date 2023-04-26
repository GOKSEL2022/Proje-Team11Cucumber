package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


import static io.restassured.RestAssured.given;
import static utilities.ManagementonSchoolsAuthentication.generateToken;
//import static utilities.ManagementonSchoolsAuthentication.generateToken;

public class ManagementonSchoolsBaseUrl  {

    public static RequestSpecification spec;
    public  static void schoolsetupAdmin(){
        spec=new RequestSpecBuilder().setContentType(ContentType.JSON).
                addHeader("Authorization",generateToken("485424698","Admin"))
                .setBaseUri("http://209.38.244.227").build();
    }
    public  static void schoolsetupTeacher(){
        spec=new RequestSpecBuilder().setContentType(ContentType.JSON).
                addHeader("Authorization",generateToken("12345678","emin"))
                .setBaseUri("http://209.38.244.227").build();
    }
    public  static void schoolsetupDean(){
        spec=new RequestSpecBuilder().setContentType(ContentType.JSON).
                addHeader("Authorization",generateToken("12345678","Team11Proje"))
                .setBaseUri("http://209.38.244.227").build();
    }
    public  static void schoolsetupViceDean(){
        spec=new RequestSpecBuilder().setContentType(ContentType.JSON).
                addHeader("Authorization",generateToken("123456789","Team11Cucumber"))
                .setBaseUri("http://209.38.244.227").build();
    }
    public  static void schoolsetupStudent(){
        spec=new RequestSpecBuilder().setContentType(ContentType.JSON).
                addHeader("Authorization",generateToken("12345678","m.emin"))
                .setBaseUri("http://209.38.244.227").build();
    }
}
