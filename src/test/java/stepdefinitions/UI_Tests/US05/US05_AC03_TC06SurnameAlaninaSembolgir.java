package stepdefinitions.UI_Tests.US05;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages. * ;
import utilities.Driver;

import java.io.IOException;

public class US05_AC03_TC06SurnameAlaninaSembolgir {
    EditDeanPage editDeanPage = new EditDeanPage();

    @And("Ali name alanina veri girer")
    public void aliNameAlaninaVeriGirer() {
        editDeanPage.name_Edit_Dean.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        editDeanPage.name_Edit_Dean.sendKeys("Sevilay");
    }
        @And("Ali Surname alanina sembol girer")
        public void kullaniciSurnameAlaninaSembolGirer () throws InterruptedException {
            editDeanPage.surname_Edit_Dean.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
            editDeanPage.surname_Edit_Dean.sendKeys("*****");

            editDeanPage.female_Checkbox_Edit_Dean.click();
            editDeanPage.password_Edit_Dean.sendKeys("12345678");
            editDeanPage.submit_Button_Edit_Dean.click();

        }
    @Then("Ali dean Update mesajini gorur")
    public void aliDeanUpdateMesajiniGorur() throws InterruptedException {
        Assert.assertTrue(editDeanPage.dean_Saved_message_Surname_Edit_Dean.isDisplayed());
        Thread.sleep(1000);
    }
}