package stepdefinitions.UI_Tests.US05;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.*;
import utilities.Driver;

public class US05_AC03_TC15Date_Of_BirthAlaniSilinir {
    Actions actions = new Actions(Driver.getDriver());
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Admin_ManagementPage admin_managementPage = new Admin_ManagementPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    EditDeanPage editDeanPage = new EditDeanPage();
    @And("Kullanici Date Of Bırth alanini siler")
    public void kullaniciDateOfBirthAlaniniSiler() {
        editDeanPage.dateOfBirth_Edit_Dean.click();
        editDeanPage.dateOfBirth_Edit_Dean.sendKeys(Keys.DELETE,Keys.TAB,Keys.DELETE,Keys.TAB,Keys.DELETE);

    }
    @Then("Kullanici Required mesajini gorur.")
    public void kullaniciRequiredMesajiniGorur() {
        Assert.assertTrue(editDeanPage.Required_edit_Dean_DateOfBirth.isDisplayed());
    }
}
