package stepdefinitions.UI_Tests.US01;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import pages.RegisterPage;

public class US01_TC14_PhoneNumberAraliksizStepDefs {
    RegisterPage registerPage=new RegisterPage();
    Faker faker =new Faker();
    Long phoneNumber = Faker.instance().number().numberBetween(100000000000l, 999999999999l);
    @And("Goksel Phone {string} araliksiz girer")
    public void gokselPhoneAraliksizGirer(String string) {
        registerPage.phoneNumber_Box_Register.sendKeys(phoneNumber+"");
    }
}
