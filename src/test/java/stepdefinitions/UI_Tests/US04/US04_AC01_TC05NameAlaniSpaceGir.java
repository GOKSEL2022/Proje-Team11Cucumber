package stepdefinitions.UI_Tests.US04;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;


public class US04_AC01_TC05NameAlaniSpaceGir {

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

    @And("Kullanici Name alanina veri girer.")
    public void kullaniciNameAlaninaVeriGirer() {
        deanManagementPage.name_Add_Dean.sendKeys(Keys.SPACE,Keys.TAB);


    }


    @Then("Kullanici Dean Save mesajini gorur.")
    public void kullaniciDeanSaveMesajiniGorur() {
        Assert.assertFalse(deanManagementPage.dean_Saved_message.isDisplayed());
    }
}
