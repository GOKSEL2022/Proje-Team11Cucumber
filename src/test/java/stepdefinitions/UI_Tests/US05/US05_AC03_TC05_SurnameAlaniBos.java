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

public class US05_AC03_TC05_SurnameAlaniBos {
    EditDeanPage editDeanPage = new EditDeanPage();

    @And("Ali name {string} alanina veri girer.")
    public void aliNameAlaninaVeriGirer(String arg0) {
        editDeanPage.name_Edit_Dean.sendKeys(arg0,Keys.TAB,Keys.DELETE);
    }
    @And("Ali Surname alanina veri girmez")
    public void AlıSurnameAlaninaVeriGirmez() throws InterruptedException {
        editDeanPage.surname_Edit_Dean.clear();
        Thread.sleep(2000);
    }

        @And("Ali Gender alaninda checkbox`a tiklar")
        public void AlıGenderAlanindaGerekliCheckboxATiklar() {
            editDeanPage.female_Checkbox_Edit_Dean.click();
        }


    @And("Ali Edit Dean alanindaki Submit butonuna tiklar.")
    public void aliEditDeanAlanindakiSubmitButonunaTiklar() {

        editDeanPage.submit_Button_Edit_Dean.click();
    }
    @Then("Ali Edit Dean alaninda Surname textboxinin altinda Required uyari mesajini gorur.")
    public void AlıEditDeanAlanindaSurnameTextboxininAltindaRequiredUyariMesajiniGorur() throws InterruptedException {
        Assert.assertTrue(editDeanPage.Required_edit_Dean_Surname.isDisplayed());
        Thread.sleep(1000);
    }
}
