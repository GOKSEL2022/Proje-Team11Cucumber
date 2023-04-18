package stepdefinitions.UI_Tests.US05;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.Admin_ManagementPage;
import pages.DeanManagementPage;
import pages.EditDeanPage;
import utilities.Driver;

public class US05_AC03_TC05_SurnameAlaniBos {
    Actions actions = new Actions(Driver.getDriver());
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Admin_ManagementPage admin_managementPage = new Admin_ManagementPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    EditDeanPage editDeanPage = new EditDeanPage();
    int ssnNo1 = Faker.instance().number().numberBetween(100,999);
    int ssnNo2= Faker.instance().number().numberBetween(10,99);
    int ssnNo3 = Faker.instance().number().numberBetween(1000,9999);
    int phoneNo1= Faker.instance().number().numberBetween(100,999);
    int phoneNo2= Faker.instance().number().numberBetween(100,999);
    int phoneNo3 = Faker.instance().number().numberBetween(1000,9999);
    Faker faker = new Faker();

    @And("Kullanici Surname alanina veri girmez")
    public void kullaniciSurnameAlaninaVeriGirmez() throws InterruptedException {
        while(!editDeanPage.name_Edit_Dean.getAttribute("value").equals("")){
             editDeanPage.name_Edit_Dean.sendKeys(Keys.BACK_SPACE);
         }
        Thread.sleep(1000);

    }
    @Then("Kullanici Edit Dean alaninda Surname textboxinin altinda Required uyari mesajini gorur.")
    public void kullaniciEditDeanAlanindaSurnameTextboxininAltindaRequiredUyariMesajiniGorur() throws InterruptedException {
        Assert.assertTrue(editDeanPage.Required_edit_Dean_Surname.isDisplayed());
        Thread.sleep(1000);
    }

    @And("Kullanici Gender alaninda checkbox`a tiklar")
    public void kullaniciGenderAlanindaGerekliCheckboxATiklar() {
        editDeanPage.female_Checkbox_Edit_Dean.click();
    }

}
