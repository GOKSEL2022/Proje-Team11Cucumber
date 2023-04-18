package stepdefinitions.UI_Tests.US02;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;
public class US02_TC01StepDefinitions {
     HomePage homePage = new HomePage();
     LoginPage loginPage = new LoginPage();

    @And("Kullanici Login butonunun sayfada yer aldigini goruntuler")
    public void kullaniciLoginButonununSayfadaYerAldiginiGoruntuler() {
        Assert.assertTrue(homePage.login_Button_Home.isDisplayed());
    }

    @And("Kullanici Login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        homePage.login_Button_Home.click();
    }

    @And("Kullanici Login menusunde doldurulacak alanlar  icin required yazisini goruntuler")
    public void kullaniciLoginMenusundeDoldurulacakAlanlarIcinRequiredYazisiniGoruntuler() {

     //  loginPage.username_Box_Login.click();
     //  loginPage.login_Text_Login.click();
     //  Assert.assertTrue(loginPage.required_Text_Username_Login.isDisplayed());
    }

    @And("Kullanici User Name e {string} girer")
    public void kullaniciUserNameEGirer(String string) {
        loginPage.username_Box_Login.sendKeys(string);
    }

    @And("Kullanici Password {string} girer")
    public void kullaniciPasswordGirer(String string) {
        loginPage.password_Box_Login.sendKeys(string);
    }

    @Then("Kullanici login isleminin basarili oldugunu dogrular")
    public void kullaniciLoginIslemininBasariliOldugunuDogrular() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("management"));

    }

}

