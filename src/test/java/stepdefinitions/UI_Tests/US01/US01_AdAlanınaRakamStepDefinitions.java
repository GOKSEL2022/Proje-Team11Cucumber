package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegisterPage;
public class US01_AdAlanınaRakamStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Kullanici Name {string} i girer")
    public void kullaniciNameIGirer(String string) {
        registerPage.name_Box_Register.sendKeys(string);
    }
    @Then("Kullanici Register islemi gerceklestiremez")
    public void kullaniciRegisterIslemiGerceklestiremez() {
        Assert.assertTrue(!registerPage.alert_Register.isDisplayed());
    }
}
