package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegisterPage;

public class US01_TC07_SurnameSpaceStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Goksel Surname {string}  girer.")
    public void GokselSurnameGirer(String string) {
        registerPage.surname_Box_Register.sendKeys(Keys.SPACE,Keys.SPACE);
    }
    @Then("Goksel Register işleminin basarili oldugunu gösteren popupi goruntuler")
    public void GokselRegisterIşlemininBasariliOldugunuGösterenpopupigoruntuler() {
        Assert.assertTrue(!registerPage.alert_Register.isDisplayed());
    }
}
