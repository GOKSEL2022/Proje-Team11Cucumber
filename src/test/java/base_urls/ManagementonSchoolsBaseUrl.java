package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilities.AuthenticationManagementonSchools.generateToken;

public class ManagementonSchoolsBaseUrl {
    public static RequestSpecification spec;


    public static void managementonschoolsSetUp(){
        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                setBaseUri("https://www.managementonschools.com").
                addHeader("Authorization","Bearer "+ generateToken() ).
                build();

    }
}
