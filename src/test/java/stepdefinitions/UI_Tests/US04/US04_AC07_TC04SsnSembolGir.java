package stepdefinitions.UI_Tests.US04;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.Admin_ManagementPage;
import pages.DeanManagementPage;
import pages.EditDeanPage;

public class US04_AC07_TC04SsnSembolGir {
    
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Admin_ManagementPage admin_managementPage = new Admin_ManagementPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    EditDeanPage editDeanPage = new EditDeanPage();
    int phoneNo1= Faker.instance().number().numberBetween(100,999);
    int phoneNo2= Faker.instance().number().numberBetween(100,999);
    int phoneNo3 = Faker.instance().number().numberBetween(1000,9999);

    Faker faker = new Faker();
    @And("Ali Ssn {string} alanina sembol girer")
    public void AlıSsnAlaninaSembolGirer(String arg0) {
        deanManagementPage.ssn_Add_Dean.sendKeys(arg0);
    }

    @Then("Ali textbox altinda uyari mesaji gorur")
    public void AlıTextboxAltindaUyariMesajiGorur() {
        Assert.assertTrue(deanManagementPage.ssn_PleaseEnterValidSsnNumber_Message_Add_Dean.isDisplayed());

    }
}
