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

import java.io.IOException;

public class US05_AC03_TC07_SurnameRakamGir {
    EditDeanPage editDeanPage = new EditDeanPage();
    @And("Ali Surname alanina rakam girer")
    public void kullaniciSurnameAlaninaRakamGirer() throws InterruptedException {
        editDeanPage.surname_Edit_Dean.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        Thread.sleep(1000);
        editDeanPage.surname_Edit_Dean.sendKeys("12345");
        Thread.sleep(1000);
        editDeanPage.female_Checkbox_Edit_Dean.click();
    }

        @And("Ali password alanina gecerli sifre girer.")
        public void aliPasswordAlaninaGecerliSifreGirer() throws InterruptedException {

            editDeanPage.password_Edit_Dean.sendKeys("12345678");
            editDeanPage.submit_Button_Edit_Dean.click();
            Assert.assertTrue(editDeanPage.dean_Saved_message_Surname_Edit_Dean.isDisplayed());
            Thread.sleep(1000);
        }
    }



