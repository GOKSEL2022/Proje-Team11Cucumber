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
import pages.US04_US05_Pages.Admin_ManagementPage;
import pages.US04_US05_Pages.DeanManagementPage;
import pages.US04_US05_Pages.EditDeanPage;
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

    @Given("Kullanici {string} sayfasina gider")
    public void kullaniciGider(String arg0) {
        Driver.getDriver().get(arg0);
    }

    @And("Kullanıcı bır sanıye bekler")
    public void kullaniciBirSaniyeBekler() throws InterruptedException {
        Thread.sleep(1000);
    }

    @When("Kullanici Login butonuna tiklar.")
    public void kullaniciLoginButonunaTiklar() {
        homePage.login_Button_Home.click();
    }

    @And("Kullanici Admin olarak Username {string} girer")
    public void kullaniciAdminOlarakUsernameGirer(String arg0) {
        loginPage.username_Box_Login.sendKeys(arg0);
    }

    @And("Kullanici Admin olarak Password {string} girer")
    public void kullaniciAdminOlarakPasswordGirer(String arg0) {
        loginPage.password_Box_Login.sendKeys(arg0);
    }


    @And("Kullanici Login sayfasinda Login butona tiklar.")
    public void kullaniciLoginSayfasindaLoginButonaTiklar() {

        loginPage.login_Button_Login.click();
    }

    @And("Kullanici Menu butonuna tiklar")
    public void kullaniciMenuButonunaTiklar() {
        admin_managementPage.menu_button_Admin_Management.click();
    }

    @And("Kullanici Main Menu listinin acildigini gorur")
    public void kullaniciMainMenuListininAcildiginiGorur() {
        Assert.assertTrue(admin_managementPage.main_Menu_text_Admin_Management.isDisplayed());
    }

    @And("Kullanici Main Menu Listinden Dean Management text`ine tiklar")
    public void kullaniciMainMenuListindenDeanManagementTextIneTiklar() {
        admin_managementPage.dean_Management_button_Main_Menu.click();
    }

    @And("Kullanici Dean Management alaninin goruldugunu dogrular")
    public void kullaniciDeanManagementAlanininGoruldugunuDogrular() {
        Assert.assertTrue(deanManagementPage.text_Dean_Management.isDisplayed());
    }

    @And("Kullanici Dean Management`in altinda Add Dean alaninin goruldugunu dogrular")
    public void kullaniciDeanManagementInAltindaAddDeanAlanininGoruldugunuDogrular() throws InterruptedException {
        Assert.assertTrue(deanManagementPage.text_Add_Dean.isDisplayed());
        Thread.sleep(1000);

    }

    @And("Kullanici Name {string} alanina veri girer")
    public void kullaniciNameAlaninaVeriGirer(String arg0) throws InterruptedException {
        deanManagementPage.name_Add_Dean.sendKeys(arg0);
        Thread.sleep(1000);
    }

    @And("Kullanici Surname {string} alanina veri girer")
    public void kullaniciSurnameAlaninaVeriGirer(String arg0) {
        deanManagementPage.surname_Add_Dean.sendKeys(arg0);
    }

    @And("Kullanici Bırth Place {string} alanina veri girer")
    public void kullaniciBırthPlaceAlaninaVeriGirer(String arg0) {
        deanManagementPage.birthPlace_Add_Dean.sendKeys(arg0);
    }

    @And("Kullanici Gender alaninda gerekli checkbox`a tiklar")
    public void kullaniciGenderAlanindaGerekliCheckboxATiklar() {
        deanManagementPage.female_Checkbox_Add_Dean.click();
    }

    @And("Kullanici Date Of Bırth {string} alanina tarih girer")
    public void kullaniciDateOfBırthAlaninaTarihGirer(String arg0) {
        deanManagementPage.dateOfBirth_Add_Dean.sendKeys(arg0);
    }

    @And("Kullanici Phone alanina istenilen formatta veri girer")
    public void kullaniciPhoneAlaninaIstenilenFormattaVeriGirer() {
        deanManagementPage.phoneNumber_Add_Dean.sendKeys(phoneNo1+"-"+phoneNo2+"-"+phoneNo3);
    }


    @And("Kullanici Ssn alanina istenilen formatta veri girer")
    public void kullaniciSsnAlaninaIstenilenFormattaVeriGirer() {
        deanManagementPage.ssn_Add_Dean.sendKeys(ssnNo1+"-"+ssnNo2+"-"+ssnNo3);
    }

    @And("Kullanici User Name alanina veri girer")
    public void kullaniciUserNameAlaninaVeriGirer() {
        deanManagementPage.username_Add_Dean.sendKeys(faker.name().username());
    }

    @And("Kullanici password alanina gecerli sifre girer")
    public void kullaniciPasswordAlaninaGecerliSifreGirer() {
        deanManagementPage.password_Add_Dean.sendKeys(faker.internet().password(8,10));
    }

    @When("Kullanici Submit butonuna tiklar")
    public void kullaniciSubmitButonunaTiklar() throws InterruptedException {
        deanManagementPage.submit_Button_Add_Dean.click();
        Thread.sleep(1000);
    }

    @Then("Kullanici Dean List bolumunde Dean kaydi gorulur")
    public void kullaniciDeanListBolumundeDeanKaydiGorulur() throws InterruptedException {
        Assert.assertTrue(deanManagementPage.text_Dean_List.isDisplayed());


    }


}
