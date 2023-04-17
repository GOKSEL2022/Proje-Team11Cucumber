package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegisterPage;

public class US01_SsnAralıksızStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Kullanici Ssn {string} girer..")
    public void kullaniciSsnGirer(String string) {
        registerPage.ssn_Box_Register.sendKeys(string);
    }
    @Then("Kullanicı Register isleminin basarili oldugunu gösteren popupı görüntüler")
    public void kullanicıRegisterIslemininBasariliOldugunuGösterenPopupıGörüntüler() {
        Assert.assertTrue(!registerPage.alert_Register.isDisplayed());
    }
}
