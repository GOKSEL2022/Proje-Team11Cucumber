package stepdefinitions.UI_Tests.US04;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utilities.Driver;
import pages.US04_US05_Pages.Admin_ManagementPage;
import pages.US04_US05_Pages.DeanManagementPage;
import pages.US04_US05_Pages.EditDeanPage;

public class US04_AC04_TC01GenderdeSecimYapmaz {
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

    @Given("Kullanici {string} gider.")
    public void kullaniciGider(String arg0) {
        Driver.getDriver().get(arg0);
    }
    @And("Kullanici Gender alaninda gerekli checkbox`a tiklamaz.")
    public void kullaniciGenderAlanindaGerekliCheckboxATiklamaz() {
    deanManagementPage.female_Checkbox_Add_Dean.sendKeys(Keys.TAB);
    }

    @Then("Kullanici Dean Kaydi yapilmadigi gorulur")
    public void kullaniciDeanKaydiYapilmadigiGorulur() {

    }



}
