package stepdefinitions.UI_Tests.US05;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.*;
import utilities.Driver;

public class US05_AC03_TC13_GenderAlaniBos {
    EditDeanPage editDeanPage = new EditDeanPage();
    @Then("Ali Json parse error uyari mesajini gorur.")
    public void AlıJsonParseErrorUyariMesajiniGorur() {
        Assert.assertTrue(editDeanPage.json_parse_error_message_Edit_Dean.isDisplayed());

    }
}
