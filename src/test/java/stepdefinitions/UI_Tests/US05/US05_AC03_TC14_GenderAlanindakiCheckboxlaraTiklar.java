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

public class US05_AC03_TC14_GenderAlanindakiCheckboxlaraTiklar {
    
    Actions actions = new Actions(Driver.getDriver());
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Admin_ManagementPage admin_managementPage = new Admin_ManagementPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    EditDeanPage editDeanPage = new EditDeanPage();
    @And("Alı Gender alaninda female checkboxini tiklar")
    public void AlıGenderAlanindaFemaleCheckboxiniTiklar() {
        editDeanPage.female_Checkbox_Edit_Dean.click();
    }

    @And("Alı female checkboxinin secildigini dogrular")
    public void AlıFemaleCheckboxininSecildiginiDogrular() {
        Assert.assertTrue(editDeanPage.female_Checkbox_Edit_Dean.isSelected());
    }

    @And("Alı Gender alaninda male checkboxini tiklar")
    public void AlıGenderAlanindaMaleCheckboxiniTiklar() {
        editDeanPage.male_Checkbox_Edit_Dean.click();

    }

    @And("Alı male checkboxinin secildigini dogrular")
    public void AlıMaleCheckboxininSecildiginiDogrular() {
        Assert.assertTrue(editDeanPage.male_Checkbox_Edit_Dean.isSelected());
    }

    @Then("Alı Dean Save kayit mesajini gorur.")
    public void AlıDeanSaveKayitMesajiniGorur() {
        Assert.assertTrue(editDeanPage.dean_Saved_message_female_Edit_Dean.isDisplayed());
        Assert.assertTrue(editDeanPage.dean_Saved_message_male_Edit_Dean.isDisplayed());
    }
}
