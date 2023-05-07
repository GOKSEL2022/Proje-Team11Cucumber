package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegisterPage;
public class US01_TC03_NameRakamStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Goksel Name {string} i girer")
    public void GokselNameIGirer(String string) {
        registerPage.name_Box_Register.sendKeys(string);
    }
    @Then("Goksel Register islemi gerceklestiremez")
    public void GokselRegisterIslemiGerceklestiremez() {
        Assert.assertTrue(!registerPage.alert_Register.isDisplayed());
    }
}
