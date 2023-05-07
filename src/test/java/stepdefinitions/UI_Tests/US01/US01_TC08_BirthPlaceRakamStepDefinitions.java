package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegisterPage;

public class US01_TC08_BirthPlaceRakamStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Goksel Birth Place {string} e girer")
    public void GokselBirthPlaceEGirer(String string) {
        registerPage.birthPlace_Box_Register.sendKeys(string);
    }
    @Then("Goksel Register islemi yapamaz")
    public void GokselRegisterIslemiYapamaz() {
        Assert.assertTrue(registerPage.alert_Register.isDisplayed());
    }

}
