package stepdefinitions.UI_Tests.US05;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.*;
import utilities.Driver;

public class US05_AC03_TC17_PhoneSembolGir {
    
    Actions actions = new Actions(Driver.getDriver());
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Admin_ManagementPage admin_managementPage = new Admin_ManagementPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    EditDeanPage editDeanPage = new EditDeanPage();
    @And("Alı Phone alanini sembol girer.")
    public void AlıPhoneAlaniniSembolGirer() {
        editDeanPage.phoneNumber_Edit_Dean.sendKeys("*****");
    }

    @Then("Alı hata mesajini gorur.")
    public void AlıDeanSavedMesajiniGorur() {
        Assert.assertTrue(editDeanPage.Full_authentication_is_RequiredToAccessThisResource_message_Edit_Dean.isDisplayed());
    }
}
