package stepdefinitions.UI_Tests.US04;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class US04_AC02_TC02SurnameSembolGir {
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

    @And("Kullanici Surname {string} alanina sembol girer")
    public void kullaniciSurnameAlaninaSembolGirer(String arg0) {
       deanManagementPage.surname_Add_Dean.sendKeys(arg0);

    }


    @Then("Kullanici  DeanSave kaydi gorulur")
    public void kullaniciDeanSaveKaydiGorulur() {
        Assert.assertFalse(deanManagementPage.dean_Saved_message.isDisplayed());
    }
}

