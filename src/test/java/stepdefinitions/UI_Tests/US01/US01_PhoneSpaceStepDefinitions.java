package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegisterPage;

public class US01_PhoneSpaceStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Kullanici Phone {string} girer.")
    public void kullaniciPhoneGirer(String string) {
        registerPage.phoneNumber_Box_Register.sendKeys(Keys.SPACE,Keys.SPACE);
    }
    @Then("Kullanici Register isleminin basarili oldugunu gösteren popupı görüntüler.")
    public void kullaniciRegisterIslemininBasariliOldugunuGösterenPopupıGörüntüler() {
        Assert.assertTrue(!registerPage.alert_Register.isDisplayed());
    }
}
