package stepdefinitions.UI_Tests.US05;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;





import pages.*;


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

public class US05_AC03_TC06SurnameAlaninaSembolgir {
    Actions actions = new Actions(Driver.getDriver());
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Admin_ManagementPage admin_managementPage = new Admin_ManagementPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    EditDeanPage editDeanPage = new EditDeanPage();

    @And("Kullanici Surname alanina sembol girer")
    public void kullaniciSurnameAlaninaSembolGirer() throws IOException {
        editDeanPage.surname_Edit_Dean.clear();
        editDeanPage.surname_Edit_Dean.sendKeys("*****");
        Assert.assertTrue(editDeanPage.dean_Saved_message_Surname_Edit_Dean.isDisplayed());
        LocalDateTime currentTime =  LocalDateTime.now();
        ReusableMethods.getScreenshot("FAIL");
    }
}
