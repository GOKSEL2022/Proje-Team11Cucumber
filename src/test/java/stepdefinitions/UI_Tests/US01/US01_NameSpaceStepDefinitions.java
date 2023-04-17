package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegisterPage;

public class US01_NameSpaceStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Kullanici Name {string} alanina girer")
    public void kullaniciNameAlaninaGirer(String string) {
        registerPage.name_Box_Register.sendKeys(Keys.SPACE,Keys.SPACE);
    }
    @Then("Kullanici Register değil")
    public void kullaniciRegisterDeğil() {
        Assert.assertTrue(!registerPage.alert_Register.isDisplayed());
    }
}
