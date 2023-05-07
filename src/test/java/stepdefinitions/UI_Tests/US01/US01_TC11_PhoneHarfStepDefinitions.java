package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegisterPage;

public class US01_TC11_PhoneHarfStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Goksel Phone {string} girer..")
    public void GokselPhoneGirer(String string) {
        registerPage.phoneNumber_Box_Register.sendKeys(string);
    }
    @Then("Goksel Register isleminin basarili oldugunu gösteren popupi goruntuler...")
    public void GokselRegisterIslemininBasariliOldugunuGösterenpopupigoruntuler() {
        Assert.assertTrue(!registerPage.alert_Register.isDisplayed());
    }
}
