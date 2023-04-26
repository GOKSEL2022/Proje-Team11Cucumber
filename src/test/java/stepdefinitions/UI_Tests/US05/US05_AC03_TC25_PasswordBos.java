package stepdefinitions.UI_Tests.US05;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.*;
import utilities.Driver;

public class US05_AC03_TC25_PasswordBos {
    EditDeanPage editDeanPage = new EditDeanPage();
    @And("Ali password alanini siler.")
    public void AliPasswordAlaniniSiler() {
        editDeanPage.password_Edit_Dean.clear();
        Assert.assertTrue(editDeanPage.Required_edit_Dean_Password.isDisplayed());
    }
}
