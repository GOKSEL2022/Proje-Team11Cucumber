package stepdefinitions.UI_Tests.US05;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.Admin_ManagementPage;
import pages.DeanManagementPage;
import pages.EditDeanPage;
import utilities.Driver;

public class US05_AC03_TC13_GenderAlaniBos {
    
    Actions actions = new Actions(Driver.getDriver());
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Admin_ManagementPage admin_managementPage = new Admin_ManagementPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    EditDeanPage editDeanPage = new EditDeanPage();
    @Then("Alı Json parse error uyari mesajini gorur.")
    public void AlıJsonParseErrorUyariMesajiniGorur() {
        Assert.assertTrue(editDeanPage.json_parse_error_message_Edit_Dean.isDisplayed());

    }
}
