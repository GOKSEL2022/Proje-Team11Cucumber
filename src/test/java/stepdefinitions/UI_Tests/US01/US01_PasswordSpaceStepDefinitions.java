package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegisterPage;

public class US01_PasswordSpaceStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Goksel Password {string} girer ve Register_Register butonunu tiklar.")
    public void GokselPasswordGirerVeRegister_RegisterButonunuTiklar(String string) {
        registerPage.password_Box_Register.sendKeys(Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE);
    }
    @Then("Goksel Register isleminin basarili oldugunu gösteren popupi goruntuler..")
    public void GokselRegisterIslemininBasariliOldugunuGösterenpopupigoruntuler() {
        Assert.assertTrue(!registerPage.alert_Register.isDisplayed());
    }
}
