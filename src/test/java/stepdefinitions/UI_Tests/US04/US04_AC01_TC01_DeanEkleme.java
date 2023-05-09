package stepdefinitions.UI_Tests.US04;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.Admin_ManagementPage;
import pages.DeanManagementPage;
import pages.EditDeanPage;
import utilities.Driver;

public class US04_AC01_TC01_DeanEkleme {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Admin_ManagementPage admin_managementPage = new Admin_ManagementPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    EditDeanPage editDeanPage = new EditDeanPage();
    int ssnNo1 = Faker.instance().number().numberBetween(100,999);
    int ssnNo2= Faker.instance().number().numberBetween(10,99);
    int ssnNo3 = Faker.instance().number().numberBetween(1000,9999);
    int phoneNo1= Faker.instance().number().numberBetween(100,999);

    int phoneNo2= Faker.instance().number().numberBetween(100,999);
    int phoneNo3 = Faker.instance().number().numberBetween(1000,9999);
    Faker faker = new Faker();
    @Given("Ali {string} sayfasina gider")
    public void AliGider(String arg0) {
        Driver.getDriver().get(arg0);
    }
    @And("Ali bır sanıye bekler")
    public void AliBirSaniyeBekler() throws InterruptedException {
        Thread.sleep(1000);
    }
    @When("Ali Login butonuna tiklar")
    public void AliLoginButonunaTiklar() {

        homePage.login_Button_Home.click();
    }
    @And("Ali Admin olarak Username {string} girer")
    public void AliAdminOlarakUsernameGirer(String arg0) {

        loginPage.username_Box_Login.sendKeys(arg0);
    }

    @And("Ali Admin olarak Password {string} girer")
    public void AliAdminOlarakPasswordGirer(String arg0) {

        loginPage.password_Box_Login.sendKeys(arg0);
    }

    @And("Ali Login sayfasinda Login butona tiklar.")
    public void AlıLoginSayfasindaLoginButonaTiklar() {

        loginPage.login_Button_Login.click();
    }

    @And("Ali Menu butonuna tiklar")
    public void AlıMenuButonunaTiklar() {
        admin_managementPage.menu_button_Admin_Management.click();
    }

    @And("Ali Main Menu listinin acildigini gorur")
    public void AlıMainMenuListininAcildiginiGorur() {
        Assert.assertTrue(admin_managementPage.main_Menu_text_Admin_Management.isDisplayed());
    }

    @And("Ali Main Menu Listinden Dean Management text`ine tiklar")
    public void AlıMainMenuListindenDeanManagementTextIneTiklar() {
        admin_managementPage.dean_Management_button_Main_Menu.click();
    }

    @And("Ali Dean Management alaninin goruldugunu dogrular")
    public void AlıDeanManagementAlanininGoruldugunuDogrular() {
        Assert.assertTrue(deanManagementPage.text_Dean_Management.isDisplayed());
    }

    @And("Ali Dean Management`in altinda Add Dean alaninin goruldugunu dogrular")
    public void AlıDeanManagementInAltindaAddDeanAlanininGoruldugunuDogrular() throws InterruptedException {
        Assert.assertTrue(deanManagementPage.text_Add_Dean.isDisplayed());
        Thread.sleep(1000);

    }

    @And("Ali Name {string} alanina veri girer")
    public void AlıNameAlaninaVeriGirer(String arg0) throws InterruptedException {
        deanManagementPage.name_Add_Dean.sendKeys(arg0);
        Thread.sleep(1000);
    }

    @And("Ali Surname {string} alanina veri girer")
    public void AlıSurnameAlaninaVeriGirer(String arg0) {

        deanManagementPage.surname_Add_Dean.sendKeys(arg0);
    }

    @And("Ali Bırth Place {string} alanina veri girer")
    public void AlıBırthPlaceAlaninaVeriGirer(String arg0) {
        deanManagementPage.birthPlace_Add_Dean.sendKeys(arg0);
    }

    @And("Ali Gender alaninda gerekli checkbox`a tiklar")
    public void AlıGenderAlanindaGerekliCheckboxATiklar() {

        deanManagementPage.female_Checkbox_Add_Dean.click();
    }

    @And("Ali Date Of Bırth {string} alanina tarih girer")
    public void AlıDateOfBırthAlaninaTarihGirer(String arg0) {
        deanManagementPage.dateOfBirth_Add_Dean.sendKeys(arg0);
    }

    @And("Ali Phone alanina istenilen formatta veri girer")
    public void AlıPhoneAlaninaIstenilenFormattaVeriGirer() {
        deanManagementPage.phoneNumber_Add_Dean.sendKeys(phoneNo1+"-"+phoneNo2+"-"+phoneNo3);
    }


    @And("Ali Ssn alanina istenilen formatta veri girer")
    public void AlıSsnAlaninaIstenilenFormattaVeriGirer() {
        deanManagementPage.ssn_Add_Dean.sendKeys(ssnNo1+"-"+ssnNo2+"-"+ssnNo3);
    }

    @And("Ali User Name alanina veri girer")
    public void AlıUserNameAlaninaVeriGirer() {
        deanManagementPage.username_Add_Dean.sendKeys(faker.name().username());
    }

    @And("Ali password alanina gecerli sifre girer")
    public void AlıPasswordAlaninaGecerliSifreGirer() {
        deanManagementPage.password_Add_Dean.sendKeys(faker.internet().password(8,10));
    }

    @When("Ali Submit butonuna tiklar")
    public void AlıSubmitButonunaTiklar() throws InterruptedException {
        deanManagementPage.submit_Button_Add_Dean.click();
        Thread.sleep(1000);
    }

    @Then("Ali Dean Save kayit mesaji Alinir")
    public void ali_dean_save_kayit_mesaji_alinir() {
        Assert.assertTrue(deanManagementPage.text_Dean_List.isDisplayed());

    }


}
