package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegisterPage;

public class US01_SurnameSembolStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Kullanici Surname e {string}  girer")
    public void kullaniciSurnameEGirer(String string) {
        registerPage.surname_Box_Register.sendKeys(string);
    }
    @Then("Kullanici Register isleminin basarili oldugunu gösteren popupı görüntüle-r")
    public void kullaniciRegisterIslemininBasariliOldugunuGösterenPopupıGörüntüleR() {
        Assert.assertTrue(!registerPage.alert_Register.isDisplayed());
    }
}
