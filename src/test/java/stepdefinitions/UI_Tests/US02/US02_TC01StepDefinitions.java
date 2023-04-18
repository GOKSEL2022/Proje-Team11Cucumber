package stepdefinitions.UI_Tests.US02;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;
public class US02_TC01StepDefinitions {
     HomePage homePage = new HomePage();
     LoginPage loginPage = new LoginPage();

    @And("Goksel Login butonunun sayfada yer aldigini goruntuler")
    public void GokselLoginButonununSayfadaYerAldiginiGoruntuler() {
        Assert.assertTrue(homePage.login_Button_Home.isDisplayed());
    }

    @And("Goksel Login butonuna tiklar")
    public void GokselLoginButonunaTiklar() {
        homePage.login_Button_Home.click();
    }

    @And("Goksel Login menusunde doldurulacak alanlar  icin required yazisini goruntuler")
    public void GokselLoginMenusundeDoldurulacakAlanlarIcinRequiredYazisiniGoruntuler() {

        loginPage.username_Box_Login.click();
        loginPage.login_Text_Login.click();
        Assert.assertTrue(loginPage.required_Text_Username_Login.isDisplayed());
    }

    @And("Goksel User Name e {string} girer")
    public void GokselUserNameEGirer(String string) {
        loginPage.username_Box_Login.sendKeys(string);
    }

    @And("Goksel Password {string} girer")
    public void GokselPasswordGirer(String string) {
        loginPage.password_Box_Login.sendKeys(string);
    }

    @Then("Goksel login isleminin basarili oldugunu dogrular")
    public void GokselLoginIslemininBasariliOldugunuDogrular() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("management"));

    }

    @Given("Goksel {string} gider")
    public void gokselGider(String arg0) {
        
    }

    @When("Goksel anasayfanın acildigini goruntuler")
    public void gokselAnasayfanınAcildiginiGoruntuler() {
    }
}

