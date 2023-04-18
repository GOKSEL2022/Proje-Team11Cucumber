package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegisterPage;

public class US01_SurnameSpaceStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Kullanici Surname {string}  girer.")
    public void kullaniciSurnameGirer(String string) {
        registerPage.surname_Box_Register.sendKeys(Keys.SPACE,Keys.SPACE);
    }
    @Then("Kullanici Register işleminin basarili oldugunu gösteren popupı görüntüler")
    public void kullaniciRegisterIşlemininBasariliOldugunuGösterenPopupıGörüntüler() {
        Assert.assertTrue(!registerPage.alert_Register.isDisplayed());
    }
}
