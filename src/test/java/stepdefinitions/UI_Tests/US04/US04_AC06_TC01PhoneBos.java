package stepdefinitions.UI_Tests.US04;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class US04_AC06_TC01PhoneBos {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Admin_ManagementPage admin_managementPage = new Admin_ManagementPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    EditDeanPage editDeanPage = new EditDeanPage();
    int ssnNo1 = Faker.instance().number().numberBetween(100,999);
    int ssnNo2= Faker.instance().number().numberBetween(10,99);
    int ssnNo3 = Faker.instance().number().numberBetween(1000,9999);

    Faker faker = new Faker();
    @And("Kullanici Phone {string} alanina istenilen formatta veri girer")
    public void kullaniciPhoneAlaninaIstenilenFormattaVeriGirer(String arg0) {
        deanManagementPage.phoneNumber_Add_Dean.sendKeys(arg0);


    }

    @Then("Kullanici kayit olunamadigi mesaji alir")
    public void kullaniciKayitOlunamadigiMesajiAlir() {
        Assert.assertTrue(deanManagementPage.phoneNumber_Required_Message_Add_Dean.isDisplayed());

    }
}
