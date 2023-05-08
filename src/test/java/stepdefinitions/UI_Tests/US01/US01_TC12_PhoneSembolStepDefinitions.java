package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegisterPage;

public class US01_TC12_PhoneSembolStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Goksel Phone {string} i girer")
    public void GokselPhoneIGirer(String string) {
        registerPage.phoneNumber_Box_Register.sendKeys(string);
    }
    @Then("Goksel Register isleminin basarili oldugunu gösteren popupi goruntulerr")
    public void GokselRegisterIslemininBasariliOldugunuGösterenpopupigoruntulerr() {
        Assert.assertTrue(!registerPage.alert_Register.isDisplayed());
    }
}
