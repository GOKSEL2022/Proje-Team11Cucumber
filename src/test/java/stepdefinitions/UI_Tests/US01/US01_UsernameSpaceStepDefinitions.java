package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegisterPage;

public class US01_UsernameSpaceStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Kullanici User Name {string} girer.")
    public void kullaniciUserNameGirer(String string) {
        registerPage.username_Box_Register.sendKeys(Keys.SPACE,Keys.SPACE,Keys.SPACE);
    }
    @Then("Kullanici Register isleminin basarili olduğunu gösteren popupı görüntüler")
    public void kullaniciRegisterIslemininBasariliOlduğunuGösterenPopupıGörüntüler() {
        Assert.assertTrue(!registerPage.alert_Register.isDisplayed());
    }
}
