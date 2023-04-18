package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegisterPage;

public class US01_PasswordSpaceStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Kullanici Password {string} girer ve Register_Register butonunu tiklar.")
    public void kullaniciPasswordGirerVeRegister_RegisterButonunuTiklar(String string) {
        registerPage.password_Box_Register.sendKeys(Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE);
    }
    @Then("Kullanici Register isleminin basarili oldugunu gösteren popupı görüntüler..")
    public void kullaniciRegisterIslemininBasariliOldugunuGösterenPopupıGörüntüler() {
        Assert.assertTrue(!registerPage.alert_Register.isDisplayed());
    }
}
