package stepdefinitions.UI_Tests.US01;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import pages.RegisterPage;

public class US01_TC17_SSNAraliksizStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    Long ssn = Faker.instance().number().numberBetween(10000000000l, 99999999999l);
    @And("Goksel Ssn {string} araliksiz girer")
    public void gokselSsnAraliksizGirer(String string) {
        registerPage.ssn_Box_Register.sendKeys(ssn+"");
    }
}
