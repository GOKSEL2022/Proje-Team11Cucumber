package stepdefinitions.UI_Tests.US06;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DeanViceDeanPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import org.junit.Assert;

import static org.junit.Assert.assertTrue;


public class AC01_TC01 {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();

    int gun= Faker.instance().number().numberBetween(1,29);
    int ay= Faker.instance().number().numberBetween(1,12);
    int yil= Faker.instance().number().numberBetween(1900,1915);
    int ssn1= Faker.instance().number().numberBetween(100,999);
    int ssn2= Faker.instance().number().numberBetween(10,90);
    int ssn3= Faker.instance().number().numberBetween(1000,9999);

    int phone1= Faker.instance().number().numberBetween(100,999);
    int phone2= Faker.instance().number().numberBetween(100,900);
    int phone3= Faker.instance().number().numberBetween(1000,9999);

    Faker faker = new Faker();
    @Given("Nilufer {string} url'ine gider")
    public void niluferUrlIneGider(String arg0) {
        Driver.getDriver().get(arg0);
        ReusableMethods.waitFor(2);
    }

    @When("Nilufer Home sayfasindaki Login buttonuna tiklar")
    public void niluferHomeSayfasindakiLoginButtonunaTiklar() {
        homePage.login_Button_Home.click();
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Dean olarak User Name'i girer")
    public void niluferDeanOlarakUserNameIGirer() {
        loginPage.username_Box_Login.sendKeys(ConfigReader.getProperty("dean_username"));
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Dean olarak Password'u girer")
    public void niluferDeanOlarakPasswordUGirer() {
        loginPage.password_Box_Login.sendKeys(ConfigReader.getProperty("dean_password"));
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Login buttonuna tiklar")
    public void niluferLoginButtonunaTiklar() {
        loginPage.login_Button_Login.click();
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Vice Dean Management sayfasinda oldugunu dogrular")
    public void niluferViceDeanManagementSayfasindaOldugunuDogrular() {
        assertTrue(deanViceDeanPage.Admin_Vice_Dean_Text.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Name alanina valid bir deger girer")
    public void niluferNameAlaninaValidBirDegerGirer() {
        deanViceDeanPage.Admin_Vice_Dean_Name.sendKeys(faker.name().firstName());
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Surname alanina valid bir deger girer")
    public void niluferSurnameAlaninaValidBirDegerGirer() {
        deanViceDeanPage.Admin_Vice_Dean_Surname.sendKeys(faker.name().lastName());
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Birth Place alanina valid bir deger girer")
    public void niluferBirthPlaceAlaninaValidBirDegerGirer() {
        deanViceDeanPage.Admin_Vice_Dean_BirthPlace.sendKeys(faker.country().capital());
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Gender alanina valid bir Gender secer")
    public void niluferGenderAlaninaValidBirGenderSecer() {
        deanViceDeanPage.Admin_Vice_Dean_Female_Radio_Button.click();
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Date Of Birth alanina valid bir deger girer")
    public void niluferDateOfBirthAlaninaValidBirDegerGirer() {
        deanViceDeanPage.Admin_Vice_Dean_Date_Of_Birth.sendKeys(gun+"."+ay+"."+yil);
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Phone alanina valid bir deger girer")
    public void niluferPhoneAlaninaValidBirDegerGirer() {
        deanViceDeanPage.Admin_Vice_Dean_PhoneNumber.sendKeys(phone1+"-"+phone2+"-"+phone3);
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Ssn alanina valid bir deger girer")
    public void niluferSsnAlaninaValidBirDegerGirer() {
        deanViceDeanPage.Admin_Vice_Dean_Ssn.sendKeys(ssn1+"-"+ssn2+"-"+ssn3);
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer User Name alanina valid bir deger girer")
    public void niluferUserNameAlaninaValidBirDegerGirer() {
        deanViceDeanPage.Admin_Vice_Dean_Username.sendKeys(faker.name().username());
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Password alanina valid bir deger girer")
    public void niluferPasswordAlaninaValidBirDegerGirer() {
        deanViceDeanPage.Admin_Vice_Dean_Password.sendKeys(faker.phoneNumber().phoneNumber());
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Submit butonuna tiklar")
    public void niluferSubmitButonunaTiklar() {
        deanViceDeanPage.Admin_Vice_Dean_Submit_Button.click();
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Dean olarak Vice Dean olusturdugunu dogrular")
    public void niluferDeanOlarakViceDeanOlusturdugunuDogrular() {
        assertTrue(deanViceDeanPage.Admin_Vice_Dean_Text.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("close the application")
    public void closeTheApplication() {
        Driver.closeDriver();
    }
}
