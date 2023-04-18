package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegisterPage;

public class US01_BirthPalceSembolStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Kullanici Birth Place e {string} girer")
    public void kullaniciBirthPlaceEGirer(String string) {
        registerPage.birthPlace_Box_Register.sendKeys(string);
    }
    @Then("Kullanici Register islemi yapamaz.")
    public void kullaniciRegisterIslemiYapamaz() {
        Assert.assertTrue(!registerPage.alert_Register.isDisplayed());
    }
}
