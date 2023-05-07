package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


import static io.restassured.RestAssured.given;
import static utilities.ManagementonSchoolsAuthentication.generateToken;
//import static utilities.ManagementonSchoolsAuthentication.generateToken;

public class ManagementonSchoolsBaseUrl  {
    public static RequestSpecification specAdmin;
    public static RequestSpecification specTeacher;
    public static RequestSpecification specDean;
    public static RequestSpecification specViceDean;
    public static RequestSpecification specStudent;

    public  static void schoolsetupAdmin(){
        specAdmin=new RequestSpecBuilder().setContentType(ContentType.JSON).
                addHeader("Authorization",generateToken("12345678","GokselCelik"))
                .setBaseUri("http://164.92.252.42:8080").build();
    }
    public  static void schoolsetupTeacher(){
        specTeacher=new RequestSpecBuilder().setContentType(ContentType.JSON).
                addHeader("Authorization",generateToken("12345678","team11emin"))
                .setBaseUri("http://164.92.252.42:8080").build();
    }
    public  static void schoolsetupDean(){
        specDean=new RequestSpecBuilder().setContentType(ContentType.JSON).
                addHeader("Authorization",generateToken("12345678","gooddean"))
                .setBaseUri("http://164.92.252.42:8080").build();
    }
    public  static void schoolsetupViceDean(){
        specViceDean=new RequestSpecBuilder().setContentType(ContentType.JSON).
                addHeader("Authorization",generateToken("12345678","yildizselcuk"))
                .setBaseUri("http://164.92.252.42:8080").build();
    }

    public  static void schoolsetupStudent(){
        specStudent=new RequestSpecBuilder().setContentType(ContentType.JSON).
                addHeader("Authorization",generateToken("12345678","team11"))
                .setBaseUri("http://164.92.252.42:8080").build();
    }
}


