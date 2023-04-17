package stepdefinitions.UI_Tests.US05;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.US04_US05_Pages.Admin_ManagementPage;
import pages.US04_US05_Pages.DeanManagementPage;
import pages.US04_US05_Pages.EditDeanPage;
import utilities.Driver;

public class US05_AC03_TC03NameAlaniRakamgir {

    Actions actions = new Actions(Driver.getDriver());
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
    @And("Kullanici Name {string} alanina rakam girer.")
    public void kullaniciNameAlaninaRakamGirer(String arg0) throws InterruptedException {
        editDeanPage.name_Edit_Dean.sendKeys(arg0);
        Thread.sleep(1000);
        Assert.assertFalse(editDeanPage.dean_Saved_message_name_Edit_Dean.isDisplayed());

    }

    @And("Kullanici password {string} alanina gecerli sifre girer.")
    public void kullaniciPasswordAlaninaGecerliSifreGirer(String arg0) {
        editDeanPage.password_Edit_Dean.sendKeys(arg0);
    }
}
