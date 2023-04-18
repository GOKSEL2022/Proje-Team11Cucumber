package stepdefinitions.UI_Tests.US05;

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

public class US05_AC03_TC26_Password7KarakterGir {
    Actions actions = new Actions(Driver.getDriver());
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Admin_ManagementPage admin_managementPage = new Admin_ManagementPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    EditDeanPage editDeanPage = new EditDeanPage();
    @And("Kullanıcı password alanina {int} karakter veri girer.")
    public void kullaniciPasswordAlaninaKarakterVeriGirer(int arg0) {
        editDeanPage.password_Edit_Dean.clear();
        editDeanPage.password_Edit_Dean.sendKeys("9876543");
        Assert.assertTrue(deanManagementPage.password_Minimum8Character_Message_Add_Dean.isDisplayed());
    }
}
