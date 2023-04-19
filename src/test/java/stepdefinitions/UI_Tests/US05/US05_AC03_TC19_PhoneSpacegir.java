package stepdefinitions.UI_Tests.US05;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.*;
import utilities.Driver;

public class US05_AC03_TC19_PhoneSpacegir {

    Actions actions = new Actions(Driver.getDriver());
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Admin_ManagementPage admin_managementPage = new Admin_ManagementPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    EditDeanPage editDeanPage = new EditDeanPage();
    @And("Kullanici Phone alanini space girer.")
    public void kullaniciPhoneAlaniniSpaceGirer() {
        editDeanPage.phoneNumber_Edit_Dean.sendKeys(Keys.SPACE);
        Assert.assertTrue(deanManagementPage.phoneNumber_PleaseEntervalidPhoneNumber_Character_Message_Add_Dean.isDisplayed());
    }
}
