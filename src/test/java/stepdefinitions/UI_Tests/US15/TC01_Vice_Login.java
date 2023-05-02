package stepdefinitions.UI_Tests.US15;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.Vice_DeanPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class TC01_Vice_Login {

    HomePage homePage = new HomePage();
    LoginPage loginPage =new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Vice_DeanPage vice_deanPage = new Vice_DeanPage();

    @Given("Fatih anasayfaya belirtilen URL'ye gider")
    public void FatihAnasayfayaBelirtilenURLYeGider() {

        Driver.getDriver().get(ConfigReader.getProperty("managementonschools"));
        ReusableMethods.waitForClickablility(homePage.login_Button_Home,15);
        homePage.login_Button_Home.click();
    }


    @When("Fatih anasayfanın acildigini goruntuler")
    public void Fatih_anasayfanın_acildigini_goruntuler() {
        ReusableMethods.waitForClickablility(homePage.login_Button_Home,15);
        assertTrue(homePage.Home_isDisplayed.isDisplayed());



    }

    @When("Fatih Login butonuna tiklar")
    public void Fatih_login_butonuna_tiklar() {
        homePage.login_Button_Home.click();


    }
    @When("Fatih Login menusunun altinda doldurulacak alanlari goruntuler")
    public void Fatih_login_menusunun_altinda_doldurulacak_alanlari_goruntuler() {

       // assertTrue(loginPage.login_isDisplayed.isDisplayed());


    }
    @When("Fatih User Name bilgisini girer")
    public void Fatih_user_name_bilgisini_girer() {
        loginPage.username_Box_Login.sendKeys(ConfigReader.getProperty("vice_username"));



    }
    @When("Fatih en az sekiz karakterli bir Password bilgisini girer")
    public void Fatih_en_az_sekiz_karakterli_bir_password_bilgisini_girer() {

        loginPage.password_Box_Login.sendKeys(ConfigReader.getProperty("vice_password"));


    }
    @When("Fatih login isleminin basarili oldugunu dogrular")
    public void Fatih_login_isleminin_basarili_oldugunu_dogrular() {

        ReusableMethods.clickByJS(loginPage.login_Button_Login);


    }
}
