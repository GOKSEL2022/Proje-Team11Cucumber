package stepdefinitions.UI_Tests.US06;
import com.github.javafaker.Faker;
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
    public void niluferUrlIneGider(String arg0) {
        Driver.getDriver().get(arg0);
    }

    @Given("Nilufer Home sayfasindaki Login buttonuna tiklar")
    public void niluferHomeSayfasindakiLoginButtonunaTiklar() {
        homePage.login_Button_Home.click();
    }

    @Given("Nilufer Dean olarak User Name'i girer")
    public void niluferDeanOlarakUserNameIGirer() {
        Driver.getDriver().get(ConfigReader.getProperty("dean_username"));
    }

    @Given("Nilufer Dean olarak Password'u girer")
    public void niluferDeanOlarakPasswordUGirer() {
        Driver.getDriver().get(ConfigReader.getProperty("dean_password"));
    }

    @Given("Nilufer Login buttonuna tiklar")
    public void niluferLoginButtonunaTiklar() {
        loginPage.login_Button_Login.click();
    }

    @Given("Nilufer Vice Dean Management sayfasinda oldugunu dogrular")
    public void niluferViceDeanManagementSayfasindaOldugunuDogrular() {
        assertTrue(deanViceDeanPage.Admin_Vice_Dean_Text.isDisplayed());
    }

    @When("Nilufer Name alanina valid bir deger girer")
    public void niluferNameAlaninaValidBirDegerGirer() {
        deanViceDeanPage.Admin_Vice_Dean_Name.sendKeys((CharSequence) Faker.instance().name());
    }

    @And("Nilufer Surname alanina valid bir deger girer")
    public void niluferSurnameAlaninaValidBirDegerGirer() {
    }

    @And("Nilufer Birth Place alanina valid bir deger girer")
    public void niluferBirthPlaceAlaninaValidBirDegerGirer() {
    }

    @And("Nilufer Gender alanina valid bir Gender secer")
    public void niluferGenderAlaninaValidBirGenderSecer() {
    }

    @And("Nilufer Date Of Birth alanina valid bir deger girer")
    public void niluferDateOfBirthAlaninaValidBirDegerGirer() {
    }

    @And("Nilufer Phone alanina valid bir deger girer")
    public void niluferPhoneAlaninaValidBirDegerGirer() {
    }

    @And("Nilufer Ssn alanina valid bir deger girer")
    public void niluferSsnAlaninaValidBirDegerGirer() {
    }

    @And("Nilufer User Name alanina valid bir deger girer")
    public void niluferUserNameAlaninaValidBirDegerGirer() {
    }

    @And("Nilufer Password alanina valid bir deger girer")
    public void niluferPasswordAlaninaValidBirDegerGirer() {
    }

    @And("Nilufer Submit butonuna tiklar")
    public void niluferSubmitButonunaTiklar() {
    }

    @And("Nilufer Dean olarak Vice Dean olusturdugunu dogrular")
    public void niluferDeanOlarakViceDeanOlusturdugunuDogrular() {
    }

    @Then("Nilufer Menu buttonuna tiklar")
    public void niluferMenuButtonunaTiklar() {
    }

    @Then("Nilufer Logout yapar")
    public void niluferLogoutYapar() {
    }
}
