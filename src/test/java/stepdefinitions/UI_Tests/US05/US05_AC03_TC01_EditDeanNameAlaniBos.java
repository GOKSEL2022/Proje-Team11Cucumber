package stepdefinitions.UI_Tests.US05;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US05_AC03_TC01_EditDeanNameAlaniBos {
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
    @And("Kullanici Dean List alanindaki Edit butonuna tiklar")
    public void kullaniciDeanListAlanindakiEditButonunaTiklar() throws InterruptedException {

        //editDeanPage.edit_Button_Team_Hasan.click();
        ReusableMethods.clickWithJS(editDeanPage.edit_Button_Team_Hasan);
        Thread.sleep(1000);
        Assert.assertTrue(editDeanPage.edit_Button_Team_Hasan.isDisplayed());
        Thread.sleep(1000);

    }

    @And("Kullanici Edit Dean bolumunun acildigini gorur")
    public void kullaniciEditDeanBolumununAcildiginiGorur() throws InterruptedException {
        Assert.assertTrue(editDeanPage.text_Edit_Dean.isDisplayed());
        Thread.sleep(1000);
    }

        @And("Kullanici Name alanini siler.")
        public void kullaniciNameAlaniniSiler () throws InterruptedException {
        editDeanPage.name_Edit_Dean.clear();
        Thread.sleep(1000);
        }
        @Then("Kullanici Edit Dean alaninda name textboxinin altinda Required uyari mesajini gorur kaydi gorulur")
        public void kullaniciEditDeanAlanindaNameTextboxininAltindaRequiredUyariMesajiniGorurKaydiGorulur () {
            Assert.assertTrue(editDeanPage.Required_edit_Dean_Name.isDisplayed());

        }
    @And("Kullanici password {string} alanina gecerli sifre girer")
    public void kullaniciPasswordAlaninaGecerliSifreGirer(String arg0) {
        editDeanPage.password_Edit_Dean.sendKeys(arg0);

    }

    @When("Kullanici Edit Dean alanindaki Submit butonuna tiklar")
    public void kullaniciEditDeanAlanindakiSubmitButonunaTiklar() {
        ReusableMethods.clickWithJS(editDeanPage.submit_Button_Edit_Dean);
    }
}
