package stepdefinitions.UI_Tests.US02;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
public class US02_TC01_StepDefinitions {
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
        loginPage.username_Box_Login.sendKeys(ConfigReader.getProperty("admin_username"));
    }

    @And("Goksel Password {string} girer")
    public void GokselPasswordGirer(String string) {
        loginPage.password_Box_Login.sendKeys(ConfigReader.getProperty("admin_password"));
    }

    @Then("Goksel login isleminin basarili oldugunu dogrular")
    public void GokselLoginIslemininBasariliOldugunuDogrular() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("http://139.59.159.36:3000/"));

    }



}

