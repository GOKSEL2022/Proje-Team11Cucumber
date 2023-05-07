package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import pages.RegisterPage;

public class US01_TC05_SurnameSembolStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Goksel Surname e {string}  girer")
    public void GokselSurnameEGirer(String string) {
        registerPage.surname_Box_Register.sendKeys(string);
    }
}
