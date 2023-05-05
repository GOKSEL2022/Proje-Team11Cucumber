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
import pages.Admin_ManagementPage;
import pages.DeanManagementPage;
import pages.EditDeanPage;

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


    @And("Ali Gender alaninda gerekli checkbox`a tiklamaz.")
    public void AliGenderAlanindaGerekliCheckboxATiklamaz() {
    deanManagementPage.female_Checkbox_Add_Dean.sendKeys(Keys.TAB);
    }

    @Then("Ali Dean Kaydi yapilmadigi gorulur")
    public void AliDeanKaydiYapilmadigiGorulur() {

    }



}
