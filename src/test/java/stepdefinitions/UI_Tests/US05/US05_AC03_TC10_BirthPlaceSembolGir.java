package stepdefinitions.UI_Tests.US05;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.*;
import utilities.Driver;

import java.io.IOException;

public class US05_AC03_TC10_BirthPlaceSembolGir {
    EditDeanPage editDeanPage = new EditDeanPage();
    @And("Ali Birth Place textboxinin icine sembol girer")
    public void kullanıcıBirthPlaceTextboxininIcineSembolGirer() {
        editDeanPage.birthPlace_Edit_Dean.clear();
        editDeanPage.birthPlace_Edit_Dean.sendKeys("*****");
        Assert.assertTrue(editDeanPage.dean_Saved_message_Birth_Place_Edit_Dean.isDisplayed());
    }
}
