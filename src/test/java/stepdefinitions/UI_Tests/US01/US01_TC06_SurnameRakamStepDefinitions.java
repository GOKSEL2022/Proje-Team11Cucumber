package stepdefinitions.UI_Tests.US01;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import pages.RegisterPage;

public class US01_TC06_SurnameRakamStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    Faker faker=new Faker();
    int surname = Faker.instance().number().numberBetween(10000, 99999);
    @And("Goksel Surname {string} rakam  girer")
    public void gokselSurnameRakamGirer(String string) {
        registerPage.surname_Box_Register.sendKeys(surname+"");
    }
}
