package stepdefinitions.UI_Tests.US06;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class AC01_TC01 {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    LogoutPage logoutPage = new LogoutPage();
    @Given("Nilufer {string} url'ine gider")
    public void kullanici_url_ine_gider(String string) {
        Driver.getDriver().get(string);
    }
    @Given("Nilufer Home sayfasindaki Login buttonuna tiklar")
    public void kullanici_home_sayfasindaki_login_buttonuna_tiklar() {
      homePage.login_Button_Home.click();
    }
    @Given("Nilufer Dean olarak User Name'i girer")
    public void kullanici_dean_olarak_user_name_i_girer() {
       loginPage.username_Box_Login.sendKeys(ConfigReader.getProperty("dean_username"));
    }
    @Given("Nilufer Dean olarak Password'u girer")
    public void kullanici_dean_olarak_password_u_girer() {
        loginPage.password_Box_Login.sendKeys(ConfigReader.getProperty("dean_password"));

    }
    @Given("Nilufer Login buttonuna tiklar")
    public void kullanici_login_buttonuna_tiklar() {

        loginPage.login_Button_Login.click();
    }
    @Given("Nilufer {string} sayfasinda oldugunu dogrular")
    public void kullanici_sayfasinda_oldugunu_dogrular(String string) {
        assertTrue(deanViceDeanPage.Admin_Vice_Dean_Text.isDisplayed());
    }
    @When("Nilufer Name alanina valid bir {string} girer")
    public void kullanici_name_alanina_valid_bir_girer(String string) {
        deanViceDeanPage.Admin_Vice_Dean_Name.sendKeys(string);
    }
    @When("Nilufer Surname alanina valid bir {string} girer")
    public void kullanici_surname_alanina_valid_bir_girer(String string) {
       deanViceDeanPage.Admin_Vice_Dean_Surname.sendKeys(string);
    }
    @When("Nilufer Birth Place alanina valid bir {string} girer")
    public void kullanici_birth_place_alanina_valid_bir_girer(String string) {
        deanViceDeanPage.Admin_Vice_Dean_BirthPlace.sendKeys(string);
    }

    @And("Nilufer Gender alanina valid bir Gender secer")
    public void kullaniciGenderAlaninaValidBirGenderSecer() {
        deanViceDeanPage.Admin_Vice_Dean_Female_Radio_Button.click();
    }

    @And("Nilufer Date Of Birth alanina valid bir {string} girer")
    public void kullaniciDateOfBirthAlaninaValidBirGirer(String string) {
        deanViceDeanPage.Admin_Vice_Dean_Date_Of_Birth.sendKeys(string);
    }


    @When("Nilufer Phone alanina valid bir {string} girer")
    public void kullanici_phone_alanina_valid_bir_girer(String string) {
         deanViceDeanPage.Admin_Vice_Dean_PhoneNumber.sendKeys(string);
    }
    @When("Nilufer Ssn alanina valid bir {string} girer")
    public void kullanici_ssn_alanina_valid_bir_girer(String string) {
         deanViceDeanPage.Admin_Vice_Dean_Ssn.sendKeys(string);
    }
    @When("Nilufer User Name alanina valid bir {string} girer")
    public void kullanici_user_name_alanina_valid_bir_girer(String string) {
         deanViceDeanPage.Admin_Vice_Dean_Username.sendKeys(string);
    }
    @When("Nilufer Password alanina valid bir {string} girer")
    public void kullanici_password_alanina_valid_bir_girer(String string) {
         deanViceDeanPage.Admin_Vice_Dean_Password.sendKeys(string);
    }
    @When("Nilufer Submit butonuna tiklar")
    public void kullanici_submit_butonuna_tiklar() {

        deanViceDeanPage.Admin_Vice_Dean_Submit_Button.click();
    }
    @When("Nilufer Dean olarak Vice Dean olusturdugunu dogrular")
    public void kullanici_dean_olarak_vice_dean_olusturdugunu_dogrular() {
          assertTrue(deanViceDeanPage.Admin_Vice_Dean_Vice_dean_Saved.isDisplayed());
    }


    @Then("Nilufer Menu buttonuna tiklar")
    public void menuButtonunaTiklar() {
        mainMenuPage.menu_button.click();
    }

    @Then("Nilufer Logout yapar")
    public void logoutYapar() {
        logoutPage.logout_button_logout.click();
    }
}
