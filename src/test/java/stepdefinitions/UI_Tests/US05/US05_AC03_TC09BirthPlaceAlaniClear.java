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
    @And("Ali surname alanina veri girer")
    public void aliSurnameAlaninaVeriGirer() throws InterruptedException {
        deanManagementPage.text_Dean_Management.click();
        editDeanPage.edit_Button_Team_Hasan.click();
        editDeanPage.surname_Edit_Dean.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        editDeanPage.surname_Edit_Dean.sendKeys("ozyilmaz");
        editDeanPage.female_Checkbox_Edit_Dean.click();
        Thread.sleep(1000);
    }
    @And("Ali Birth Place textboxinin icindeki veriyi siler.")
    public void AliBirthPlaceTextboxininIcindekiVeriyiSiler() throws InterruptedException {
        editDeanPage.birthPlace_Edit_Dean.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

        Thread.sleep(1000);
        editDeanPage.female_Checkbox_Edit_Dean.click();
        editDeanPage.password_Edit_Dean.sendKeys("12345678");
        Assert.assertTrue(editDeanPage.Required_edit_Dean_BirthPlace.isDisplayed());
    }



}
