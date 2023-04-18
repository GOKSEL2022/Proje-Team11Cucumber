package stepdefinitions.UI_Tests.US06;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.US06_Pages.DeanViceDeanPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class AC01_TC01 {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();
    @Given("Kullanici {string} url'ine gider")
    public void kullanici_url_ine_gider(String string) {
        Driver.getDriver().get(string);
    }
    @Given("Kullanici Home sayfasindaki Login buttonuna tiklar")
    public void kullanici_home_sayfasindaki_login_buttonuna_tiklar() {
      homePage.login_Button_Home.click();
    }
    @Given("Kullanici Dean olarak User Name'i girer")
    public void kullanici_dean_olarak_user_name_i_girer() {
       loginPage.username_Box_Login.sendKeys(ConfigReader.getProperty("dean_username"));
    }
    @Given("Kullanici Dean olarak Password'u girer")
    public void kullanici_dean_olarak_password_u_girer() {
        loginPage.password_Box_Login.sendKeys(ConfigReader.getProperty("dean_password"));

    }
    @Given("Kullanici Login buttonuna tiklar")
    public void kullanici_login_buttonuna_tiklar() {

        loginPage.login_Button_Login.click();
    }
    @Given("Kullanici {string} sayfasinda oldugunu dogrular")
    public void kullanici_sayfasinda_oldugunu_dogrular(String string) {
        assertTrue(deanViceDeanPage.Admin_Vice_Dean_Text.isDisplayed());
    }
    @When("Kullanici Name alanina valid bir {string} girer")
    public void kullanici_name_alanina_valid_bir_girer(String string) {
        deanViceDeanPage.Admin_Vice_Dean_Name.sendKeys(string);
    }
    @When("Kullanici Surname alanina valid bir {string} girer")
    public void kullanici_surname_alanina_valid_bir_girer(String string) {
       deanViceDeanPage.Admin_Vice_Dean_Surname.sendKeys(string);
    }
    @When("Kullanici Birth Place alanina valid bir {string} girer")
    public void kullanici_birth_place_alanina_valid_bir_girer(String string) {
        deanViceDeanPage.Admin_Vice_Dean_BirthPlace.sendKeys(string);
    }

    @And("Kullanici Gender alanina valid bir Gender secer")
    public void kullaniciGenderAlaninaValidBirGenderSecer() {
        deanViceDeanPage.Admin_Vice_Dean_Female_Radio_Button.click();
    }

    @And("Kullanici Date Of Birth alanina valid bir {string} girer")
    public void kullaniciDateOfBirthAlaninaValidBirGirer(String string) {
        deanViceDeanPage.Admin_Vice_Dean_Date_Of_Birth.sendKeys(string);
    }


    @When("Kullanici Phone alanina valid bir {string} girer")
    public void kullanici_phone_alanina_valid_bir_girer(String string) {
         deanViceDeanPage.Admin_Vice_Dean_PhoneNumber.sendKeys(string);
    }
    @When("Kullanici Ssn alanina valid bir {string} girer")
    public void kullanici_ssn_alanina_valid_bir_girer(String string) {
         deanViceDeanPage.Admin_Vice_Dean_Ssn.sendKeys(string);
    }
    @When("Kullanici User Name alanina valid bir {string} girer")
    public void kullanici_user_name_alanina_valid_bir_girer(String string) {
         deanViceDeanPage.Admin_Vice_Dean_Username.sendKeys(string);
    }
    @When("Kullanici Password alanina valid bir {string} girer")
    public void kullanici_password_alanina_valid_bir_girer(String string) {
         deanViceDeanPage.Admin_Vice_Dean_Password.sendKeys(string);
    }
    @When("Kullanici Submit butonuna tiklar")
    public void kullanici_submit_butonuna_tiklar() {

        deanViceDeanPage.Admin_Vice_Dean_Submit_Button.click();
    }
    @When("Kullanici Dean olarak Vice Dean olusturdugunu dogrular")
    public void kullanici_dean_olarak_vice_dean_olusturdugunu_dogrular() {
          assertTrue(deanViceDeanPage.Admin_Vice_Dean_Vice_dean_Saved.isDisplayed());
    }



}
