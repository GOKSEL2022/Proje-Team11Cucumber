package stepdefinitions.UI_Tests.US04;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class US04_AC05_TC01DateOfBirthBos {
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

    @And("Kullanici Date Of Bırth alanini bos birakir")
    public void kullaniciDateOfBırthAlaniniBosBirakir() {
        deanManagementPage.dateOfBirth_Add_Dean.sendKeys(Keys.TAB);
    }


    @Then("Kullanici kayit olunamadigi required mesajini alir")
    public void kullaniciKayitOlunamadigiRequiredMesajiniAlir() {
        Assert.assertFalse(deanManagementPage.dateOfBirth_Required_Message_Add_Dean.isDisplayed());
    }


}
