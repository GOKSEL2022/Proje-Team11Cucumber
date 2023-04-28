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

public class US05_AC03_TC11_BirthPlaceRakamGir {
    EditDeanPage editDeanPage = new EditDeanPage();
    @And("Ali Birth Place textboxinin icine rakam girer")
    public void kullanıcıBirthPlaceTextboxininIcineRakamGirer() {

        editDeanPage.birthPlace_Edit_Dean.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        editDeanPage.birthPlace_Edit_Dean.sendKeys("12345");
        editDeanPage.female_Checkbox_Edit_Dean.click();
        Assert.assertTrue(editDeanPage.dean_Saved_message_Birth_Place_Edit_Dean.isDisplayed());

    }
}
