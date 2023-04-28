package stepdefinitions.UI_Tests.US05;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
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

public class US05_AC03_TC02_EditDeanNameAlaninaSembolGir {


    Actions actions = new Actions(Driver.getDriver());
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Admin_ManagementPage admin_managementPage = new Admin_ManagementPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    EditDeanPage editDeanPage = new EditDeanPage();
    Faker faker = new Faker();
    @And("Ali Name {string} alanina sembol girer")
    public void AlıNameAlaninaSembolGirer(String arg0)  {
        editDeanPage.name_Edit_Dean.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        editDeanPage.name_Edit_Dean.sendKeys(arg0);

    }

    @And("Ali Gender female checkboxini tiklar")
    public void aliGenderFemaleCheckboxiniTiklar() {
        editDeanPage.female_Checkbox_Edit_Dean.click();
    }

    @Then("Ali dean Saved uyari mesajini gorur")
    public void aliDeanSavedUyariMesajiniGorur() throws IOException {
        Assert.assertFalse(editDeanPage.dean_Saved_message_name_Edit_Dean.isDisplayed());
        LocalDateTime currentTime =  LocalDateTime.now();
        ReusableMethods.getScreenshot("FAIL");
    }


}
