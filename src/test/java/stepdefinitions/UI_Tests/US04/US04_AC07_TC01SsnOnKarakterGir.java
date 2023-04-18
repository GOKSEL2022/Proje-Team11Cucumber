package stepdefinitions.UI_Tests.US04;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.US04_US05_Pages.Admin_ManagementPage;
import pages.US04_US05_Pages.DeanManagementPage;
import pages.US04_US05_Pages.EditDeanPage;

public class US04_AC07_TC01SsnOnKarakterGir {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Admin_ManagementPage admin_managementPage = new Admin_ManagementPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    EditDeanPage editDeanPage = new EditDeanPage();
    int phoneNo1= Faker.instance().number().numberBetween(100,999);
    int phoneNo2= Faker.instance().number().numberBetween(100,999);
    int phoneNo3 = Faker.instance().number().numberBetween(1000,9999);

    Faker faker = new Faker();


    @And("Kullanici Ssn {string} alanina on karakter veri girer")
    public void kullaniciSsnAlaninaOnKarakterVeriGirer(String arg0) {
        deanManagementPage.ssn_Add_Dean.sendKeys(arg0);
    }

    @Then("Kullanici uyari mesajini minimum {int} character gorur")
    public void kullaniciUyariMesajiniMinimumCharacterGorur(int arg0) {
        Assert.assertTrue(deanManagementPage.ssn_Minimum11Character_Message_Add_Dean.isDisplayed());

    }
}
