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

public class US05_AC03_TC20_Ssn_Bos {
    EditDeanPage editDeanPage = new EditDeanPage();
    @And("Ali Ssn alanini siler.")
    public void AlıSsnAlaniniSiler() {
        editDeanPage.female_Checkbox_Edit_Dean.click();
        editDeanPage.ssn_Edit_Dean.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        Assert.assertTrue(editDeanPage.Required_edit_Dean_Ssn.isDisplayed());
    }
}


