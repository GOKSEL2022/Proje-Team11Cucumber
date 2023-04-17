package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegisterPage;

public class US01_PhoneSembolStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Kullanici Phone {string} i girer")
    public void kullaniciPhoneIGirer(String string) {
        registerPage.phoneNumber_Box_Register.sendKeys(string);
    }
    @Then("Kullanici Register isleminin basarili oldugunu gösteren popupı görüntülerr")
    public void kullaniciRegisterIslemininBasariliOldugunuGösterenPopupıGörüntülerr() {
        Assert.assertTrue(!registerPage.alert_Register.isDisplayed());
    }
}
