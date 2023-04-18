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

public class US05_AC03_TC06SurnameAlaninaSembolgir {
    Actions actions = new Actions(Driver.getDriver());
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Admin_ManagementPage admin_managementPage = new Admin_ManagementPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    EditDeanPage editDeanPage = new EditDeanPage();

    @And("Kullanici Surname alanina sembol girer")
    public void kullaniciSurnameAlaninaSembolGirer() {
        editDeanPage.surname_Edit_Dean.clear();
        editDeanPage.surname_Edit_Dean.sendKeys("*****");
        Assert.assertTrue(editDeanPage.dean_Saved_message_Surname_Edit_Dean.isDisplayed());
    }
}
