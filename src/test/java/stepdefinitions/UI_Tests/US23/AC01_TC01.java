package stepdefinitions.UI_Tests.US23;

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
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    LogoutPage logoutPage = new LogoutPage();

    @Given("Nilufer {string} url'ine git")
    public void url_ine_git(String string) {
        Driver.getDriver().get(string);
    }

    @Given("Nilufer Home sayfasindaki Login buttonuna tikla")
    public void home_sayfasindaki_login_buttonuna_tikla() {
        homePage.login_Button_Home.click();
    }

    @Given("Nilufer Admin olarak User Name'i gir")
    public void admin_olarak_user_name_i_gir() {
        loginPage.username_Box_Login.sendKeys(ConfigReader.getProperty("admin_username"));
    }

    @Given("Nilufer Admin olarak Password'u gir")
    public void admin_olarak_password_u_gir() {
        loginPage.password_Box_Login.sendKeys(ConfigReader.getProperty("admin_password"));
    }

    @Given("Nilufer Login buttonuna tikla")
    public void login_buttonuna_tikla() {
        loginPage.login_Button_Login.click();
    }

    @Given("Nilufer Vice Dean Management sayfasinda oldugunu dogrula")
    public void Vice_Dean_Management_sayfasinda_oldugunu_dogrula() {
        assertTrue(adminViceDeanPage.Admin_Vice_Dean_Text.isDisplayed());
    }

    @When("Nilufer Name alanina valid bir {string} gir")
    public void name_alanina_valid_bir_gir(String string) {
        adminViceDeanPage.Admin_Vice_Dean_Name.sendKeys(string);
    }

    @When("Nilufer Surname alanina valid bir {string} gir")
    public void surname_alanina_valid_bir_gir(String string) {
        adminViceDeanPage.Admin_Vice_Dean_Surname.sendKeys(string);
    }

    @When("Nilufer Birth Place alanina valid bir {string} gir")
    public void birth_place_alanina_valid_bir_gir(String string) {
        adminViceDeanPage.Admin_Vice_Dean_BirthPlace.sendKeys(string);
    }

    @When("Nilufer Gender alanina valid bir Gender sec")
    public void gender_alanina_valid_bir_gender_sec() {
        adminViceDeanPage.Admin_Vice_Dean_Female_Radio_Button.click();
    }

    @When("Nilufer Date Of Birth alanina valid bir {string} gir")
    public void date_of_birth_alanina_valid_bir_gir(String string) {
        adminViceDeanPage.Admin_Vice_Dean_Date_Of_Birth.sendKeys(string);
    }

    @When("Nilufer Phone alanina valid bir {string} gir")
    public void phone_alanina_valid_bir_gir(String string) {
        adminViceDeanPage.Admin_Vice_Dean_PhoneNumber.sendKeys(string);
    }

    @When("Nilufer Ssn alanina valid bir {string} gir")
    public void ssn_alanina_valid_bir_gir(String string) {
        adminViceDeanPage.Admin_Vice_Dean_Ssn.sendKeys(string);
    }

    @When("Nilufer User Name alanina valid bir {string} gir")
    public void user_name_alanina_valid_bir_gir(String string) {
        adminViceDeanPage.Admin_Vice_Dean_Username.sendKeys(string);
    }

    @When("Nilufer Password alanina valid bir {string} gir")
    public void password_alanina_valid_bir_gir(String string) {
        adminViceDeanPage.Admin_Vice_Dean_Password.sendKeys(string);
    }

    @When("Nilufer Submit butonuna tikla")
    public void submit_butonuna_tikla() {

        adminViceDeanPage.Admin_Vice_Dean_Submit_Button.click();
    }

    @When("Nilufer Admin olarak Vice Dean olusturdugunu dogrula")
    public void kullanici_admin_olarak_vice_dean_olusturdugunu_dogrula() {
        assertTrue(adminViceDeanPage.Admin_Vice_Dean_Vice_dean_Saved.isDisplayed());
    }
    @Then("Nilufer Menu buttonuna tikla")
    public void menuButtonunaTiklar() {
        mainMenuPage.menu_button.click();
    }

    @Then("Nilufer Logout yap")
    public void logoutYapar() {
        logoutPage.logout_button_logout.click();
    }

}
