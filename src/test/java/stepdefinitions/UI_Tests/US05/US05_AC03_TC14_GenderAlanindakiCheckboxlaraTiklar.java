package stepdefinitions.UI_Tests.US05;

import io.cucumber.java.en.And;
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

public class US05_AC03_TC14_GenderAlanindakiCheckboxlaraTiklar {
    Actions actions = new Actions(Driver.getDriver());
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Admin_ManagementPage admin_managementPage = new Admin_ManagementPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    EditDeanPage editDeanPage = new EditDeanPage();
    @And("Kullanici Gender alaninda female checkboxini tiklar")
    public void kullaniciGenderAlanindaFemaleCheckboxiniTiklar() {
        editDeanPage.female_Checkbox_Edit_Dean.click();
    }

    @And("Kullanici female checkboxinin secildigini dogrular")
    public void kullaniciFemaleCheckboxininSecildiginiDogrular() {
        Assert.assertTrue(editDeanPage.female_Checkbox_Edit_Dean.isSelected());
    }

    @And("Kullanici Gender alaninda male checkboxini tiklar")
    public void kullaniciGenderAlanindaMaleCheckboxiniTiklar() {
        editDeanPage.male_Checkbox_Edit_Dean.click();

    }

    @And("Kullanici male checkboxinin secildigini dogrular")
    public void kullaniciMaleCheckboxininSecildiginiDogrular() {
        Assert.assertTrue(editDeanPage.male_Checkbox_Edit_Dean.isSelected());
    }

    @Then("Kullanici Dean Save kayit mesajini gorur.")
    public void kullaniciDeanSaveKayitMesajiniGorur() {
        Assert.assertTrue(editDeanPage.dean_Saved_message_female_Edit_Dean.isDisplayed());
        Assert.assertTrue(editDeanPage.dean_Saved_message_male_Edit_Dean.isDisplayed());
    }
}
