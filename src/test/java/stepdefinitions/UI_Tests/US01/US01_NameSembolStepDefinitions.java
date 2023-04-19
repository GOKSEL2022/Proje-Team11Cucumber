package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegisterPage;

public class US01_NameSembolStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Goksel Name e {string} girer")
    public void GokselNameEGirer(String string) {
        registerPage.name_Box_Register.sendKeys(string);
    }
    @Then("Goksel Register olmaz.")
    public void GokselRegisterOlmaz() {
        Assert.assertTrue(!registerPage.alert_Register.isDisplayed());
    }
}
