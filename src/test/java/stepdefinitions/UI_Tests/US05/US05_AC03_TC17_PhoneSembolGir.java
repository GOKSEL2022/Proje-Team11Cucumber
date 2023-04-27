package stepdefinitions.UI_Tests.US05;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.*;
import utilities.Driver;

public class US05_AC03_TC17_PhoneSembolGir {
    EditDeanPage editDeanPage = new EditDeanPage();
    @And("Ali Phone alanini sembol girer.")
    public void AlıPhoneAlaniniSembolGirer() {
        editDeanPage.female_Checkbox_Edit_Dean.click();
        editDeanPage.phoneNumber_Edit_Dean.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        editDeanPage.phoneNumber_Edit_Dean.sendKeys("*****");
    }

    @Then("Ali hata mesajini gorur.")
    public void AlıDeanSavedMesajiniGorur() {
        Assert.assertTrue(editDeanPage.Full_authentication_is_RequiredToAccessThisResource_message_Edit_Dean.isDisplayed());
    }
}
