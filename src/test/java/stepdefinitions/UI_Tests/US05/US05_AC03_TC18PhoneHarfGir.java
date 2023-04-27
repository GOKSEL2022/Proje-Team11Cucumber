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

public class US05_AC03_TC18PhoneHarfGir {
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    EditDeanPage editDeanPage = new EditDeanPage();
    @And("Ali Phone alanini harf girer.")
    public void AlıPhoneAlaniniHarfGirer() {
        editDeanPage.female_Checkbox_Edit_Dean.click();
        editDeanPage.phoneNumber_Edit_Dean.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        editDeanPage.phoneNumber_Edit_Dean.sendKeys("phone");
        Assert.assertTrue(deanManagementPage.phoneNumber_PleaseEntervalidPhoneNumber_Character_Message_Add_Dean.isDisplayed());



    }
}
