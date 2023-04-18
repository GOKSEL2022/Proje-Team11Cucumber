package stepdefinitions.UI_Tests.US14;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AdminManagementPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ViceDeanTeacherPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AC01_TC01_Gorunme {
    ViceDeanTeacherPage viceDeanTeacherPage = new ViceDeanTeacherPage();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AdminManagementPage adminManagementPage = new AdminManagementPage();
    @Given("Kuullanici {string} giider")
    public void kuullaniciGiider(String string) {
        Driver.getDriver().get(string);
        homePage.login_Button_Home.click();
        ReusableMethods.waitFor(1);
        loginPage.username_Box_Login.sendKeys(ConfigReader.getProperty("vice_dean_username"));
        ReusableMethods.waitFor(1);
        loginPage.password_Box_Login.sendKeys(ConfigReader.getProperty("vice_dean_password"));
        ReusableMethods.waitFor(2);
        loginPage.login_Button_Login.click();
        ReusableMethods.waitFor(1);
        ReusableMethods.clickWithTimeOut(adminManagementPage.menu_button_adminmanagement, 2);
        adminManagementPage.teachermanagement_button_adminmanagement.click();
        ReusableMethods.waitFor(1);
    }
    @When("Kullanici Teacher Management sayfasının acildigini goruntuler")
    public void kullaniciTeacherManagementSayfasınınAcildiginiGoruntuler() {
        Assert.assertTrue(viceDeanTeacherPage.vice_name_box_teacher.isDisplayed());
        ReusableMethods.waitFor(1);


    }

    @And("Kullanıcı Oluşturulan kullanıcılardan birine giriş yapar")
    public void kullanıcıOlusturulanKullanıcılardanBirineGirisYapar() {
        Assert.assertTrue(viceDeanTeacherPage.vice_dean_add_teacher_text_teacher.isDisplayed());
        ReusableMethods.waitFor(4);

    }

    @And("Kullanıcı Teacher listten seçilen öğretmenin Edit butonuna tıklar")
    public void kullanıcıTeacherListtenSecilenOgretmeninEditButonunaTıklar() {
        viceDeanTeacherPage.editButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Oluşturulann revetment Name, Phone Number, SSN,User Name bilgileri görülebilmeli")
    public void olusturulannRevetmentNamePhoneNumberSSNUserNameBilgileriGorulebilmeli() {
        Assert.assertTrue(viceDeanTeacherPage.editNameTextBox.isDisplayed());
        ReusableMethods.waitFor(1);
        Assert.assertTrue(viceDeanTeacherPage.editPhoneTextbox.isDisplayed());
        ReusableMethods.waitFor(1);
        Assert.assertTrue(viceDeanTeacherPage.editSsnTextbox.isDisplayed());
        ReusableMethods.waitFor(1);
        Assert.assertTrue(viceDeanTeacherPage.editUsernameTextbox.isDisplayed());
        ReusableMethods.waitFor(1);

    }


}
