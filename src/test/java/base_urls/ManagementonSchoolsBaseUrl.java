package base_urls;

import io.restassured.builder.RequestSpecBuilder;

import io.restassured.specification.RequestSpecification;


import static utilities.ManagementonSchoolsAuthentication.generateToken;

public class ManagementonSchoolsBaseUrl  {


    public static RequestSpecification spec;

    public static void setUp(){
        spec = new RequestSpecBuilder().
                addHeader("Authorization","Bearer "+generateToken()).
                setBaseUri("http://209.38.244.227/").
                build();
    }
}
