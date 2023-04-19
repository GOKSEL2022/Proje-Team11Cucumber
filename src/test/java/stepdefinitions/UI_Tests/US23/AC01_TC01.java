package stepdefinitions.UI_Tests.US23;

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
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    LogoutPage logoutPage = new LogoutPage();
    @Given("Nilufer {string} url'ine git")
    public void niluferUrlIneGit(String arg0) {
        Driver.getDriver().get(arg0);
    }

    @Given("Nilufer Home sayfasindaki Login buttonuna tikla")
    public void niluferHomeSayfasindakiLoginButtonunaTikla() {
        homePage.login_Button_Home.click();
    }

    @Given("Nilufer Admin olarak User Name'i gir")
    public void niluferAdminOlarakUserNameIGir() {
        Driver.getDriver().get(ConfigReader.getProperty("admin_username"));
    }

    @Given("Nilufer Admin olarak Password'u gir")
    public void niluferAdminOlarakPasswordUGir() {
        Driver.getDriver().get(ConfigReader.getProperty("admin_password"));
    }

    @Given("Nilufer Login buttonuna tikla")
    public void niluferLoginButtonunaTikla() {
        loginPage.login_Button_Login.click();
    }

    @Given("Nilufer Vice Dean Management sayfasinda oldugunu dogrula")
    public void niluferViceDeanManagementSayfasindaOldugunuDogrula() {
        assertTrue(adminViceDeanPage.Admin_Vice_Dean_Text.isDisplayed());
    }

    @When("Nilufer Name alanina valid bir deger gir")
    public void niluferNameAlaninaValidBirDegerGir() {
    }

    @And("Nilufer Surname alanina valid bir deger gir")
    public void niluferSurnameAlaninaValidBirDegerGir() {
    }

    @And("Nilufer Birth Place alanina valid bir deger gir")
    public void niluferBirthPlaceAlaninaValidBirDegerGir() {
    }

    @And("Nilufer Gender alanina valid bir Gender sec")
    public void niluferGenderAlaninaValidBirGenderSec() {
    }

    @And("Nilufer Date Of Birth alanina valid bir deger gir")
    public void niluferDateOfBirthAlaninaValidBirDegerGir() {
    }

    @And("Nilufer Phone alanina valid bir deger gir")
    public void niluferPhoneAlaninaValidBirDegerGir() {
    }

    @And("Nilufer Ssn alanina valid bir deger gir")
    public void niluferSsnAlaninaValidBirDegerGir() {
    }

    @And("Nilufer User Name alanina valid bir deger gir")
    public void niluferUserNameAlaninaValidBirDegerGir() {
    }

    @And("Nilufer Password alanina valid bir deger gir")
    public void niluferPasswordAlaninaValidBirDegerGir() {
    }

    @And("Nilufer Submit butonuna tikla")
    public void niluferSubmitButonunaTikla() {

    }

    @And("Nilufer Admin olarak Vice Dean olusturdugunu dogrula")
    public void niluferAdminOlarakViceDeanOlusturdugunuDogrula() {

    }

    @Then("Nilufer Menu buttonuna tikla")
    public void niluferMenuButtonunaTikla() {

    }

    @Then("Nilufer Logout yap")
    public void niluferLogoutYap() {

    }

}
