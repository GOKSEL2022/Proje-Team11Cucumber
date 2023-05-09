package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegisterPage;

public class US01_TC18_SsnSpaceStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Goksel Ssn {string} girer.")
    public void GokselSsnGirer(String string) {
        registerPage.ssn_Box_Register.sendKeys(Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE);
    }
    @Then("Goksel register isleminin basarili oldugunu gösteren popupi goruntuler")
    public void GokselRegisterIslemininBasariliOldugunuGösterenpopupigoruntuler() {
        Assert.assertTrue(registerPage.alert_Register.isDisplayed());
    }
}
