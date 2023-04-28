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

public class US05_AC03_TC03NameAlaniRakamgir {
    EditDeanPage editDeanPage = new EditDeanPage();
    @And("Ali Name {string} alanina rakam girer.")
    public void AlıNameAlaninaRakamGirer(String arg0)  {
        editDeanPage.name_Edit_Dean.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        editDeanPage.name_Edit_Dean.sendKeys(arg0);
        editDeanPage.female_Checkbox_Edit_Dean.click();

    }
    @And("Ali password {string} alanina gecerli sifre girer.")
    public void AlıPasswordAlaninaGecerliSifreGirer(String arg0) throws IOException, InterruptedException {
        editDeanPage.password_Edit_Dean.sendKeys(arg0);
        editDeanPage.submit_Button_Edit_Dean.click();
        Thread.sleep(1000);


    }

    @Then("Ali dean Saved uyari mesajini gorur,")
    public void aliDeanSavedUyariMesajiniGorur() throws IOException, InterruptedException {
        Assert.assertFalse(editDeanPage.dean_Saved_message_name_Edit_Dean.isDisplayed());
        LocalDateTime currentTime =  LocalDateTime.now();
        ReusableMethods.getScreenshot("FAIL");
        Thread.sleep(1000);
    }
}

