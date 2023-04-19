package stepdefinitions.UI_Tests.US05;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.Admin_ManagementPage;
import pages.DeanManagementPage;
import pages.EditDeanPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.time.LocalDateTime;

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
    @And("Alı Name {string} alanina rakam girer.")
    public void AlıNameAlaninaRakamGirer(String arg0) throws InterruptedException, IOException {
        editDeanPage.name_Edit_Dean.sendKeys(arg0);
        Thread.sleep(1000);
        Assert.assertFalse(editDeanPage.dean_Saved_message_name_Edit_Dean.isDisplayed());
        LocalDateTime currentTime =  LocalDateTime.now();
        ReusableMethods.getScreenshot("FAIL");

    }
    

    @And("Alı password {string} alanina gecerli sifre girer.")
    public void AlıPasswordAlaninaGecerliSifreGirer(String arg0) {
        editDeanPage.password_Edit_Dean.sendKeys(arg0);
    }
}
