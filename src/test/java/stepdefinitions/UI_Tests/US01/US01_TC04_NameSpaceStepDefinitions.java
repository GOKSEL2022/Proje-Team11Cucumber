package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegisterPage;

public class US01_TC04_NameSpaceStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Goksel Name {string} alanina girer")
    public void GokselNameAlaninaGirer(String string) {
        registerPage.name_Box_Register.sendKeys(Keys.SPACE,Keys.SPACE);
    }
    @Then("Goksel Register değil")
    public void GokselRegisterDeğil() {
        Assert.assertFalse(registerPage.alert_Register.isDisplayed());
    }
}
