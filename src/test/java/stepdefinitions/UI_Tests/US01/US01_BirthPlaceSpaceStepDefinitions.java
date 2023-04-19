package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegisterPage;

public class US01_BirthPlaceSpaceStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Goksel Birth Place {string} girer.")
    public void GokselBirthPlaceGirer(String string) {
        registerPage.birthPlace_Box_Register.sendKeys(Keys.SPACE,Keys.SPACE);
    }
    @Then("Goksel Register olmaz")
    public void GokselRegisterOlmaz() {
        Assert.assertTrue(!registerPage.alert_Register.isDisplayed());
    }
}
