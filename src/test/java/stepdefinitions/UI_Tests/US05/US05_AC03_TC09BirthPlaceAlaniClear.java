package stepdefinitions.UI_Tests.US05;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utilities.Driver;
import pages.*;
public class US05_AC03_TC09BirthPlaceAlaniClear {
    EditDeanPage editDeanPage = new EditDeanPage();
    HomePage homePage = new HomePage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    @And("Ali Menu butonuna tiklar.")
    public void aliMenuButonunaTiklar() {
        homePage.menuButton.click();

    }
    @And("Ali Birth Place textboxinin icindeki veriyi siler.")
    public void AliBirthPlaceTextboxininIcindekiVeriyiSiler() throws InterruptedException {
        editDeanPage.birthPlace_Edit_Dean.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        Thread.sleep(1000);
        editDeanPage.female_Checkbox_Edit_Dean.click();
        editDeanPage.submit_Button_Edit_Dean.click();
    }
    @And("Ali Required mesajini birth placede gorur.")
    public void aliRequiredMesajiniBirthPlacedeGorur() {
        Assert.assertTrue(editDeanPage.Required_edit_Dean_BirthPlace.isDisplayed());
    }
}
