package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegisterPage;

public class US01_SSNAralıksızStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Goksel Ssn {string} girer..")
    public void GokselSsnGirer(String string) {
        registerPage.ssn_Box_Register.sendKeys(string);
    }
}
