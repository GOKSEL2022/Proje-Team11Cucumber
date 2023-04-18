package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegisterPage;

public class US01_SsnSpaceStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Kullanici Ssn {string} girer.")
    public void kullaniciSsnGirer(String string) {
        registerPage.ssn_Box_Register.sendKeys(Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE);
    }
    @Then("Kullanici register isleminin basarili oldugunu gösteren popupı görüntüler")
    public void kullaniciRegisterIslemininBasariliOldugunuGösterenPopupıGörüntüler() {
        Assert.assertTrue(!registerPage.alert_Register.isDisplayed());
    }
}
