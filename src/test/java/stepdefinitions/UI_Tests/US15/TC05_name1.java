package stepdefinitions.UI_Tests.US15;

import io.cucumber.java.en.And;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.Vice_DeanPage;
import utilities.ConfigReader;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TC05_name1 {
    HomePage homePage = new HomePage();
    LoginPage loginPage =new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Vice_DeanPage vice_deanPage = new Vice_DeanPage();
    @And("Fatih name alanina gecerli bir isim girer")
    public void FatihNameAlaninaGecerliBirIsimGirer() {
        vice_deanPage.student_name.sendKeys(ConfigReader.getProperty("student_name"));

    }

    @And("Fatih required yazisinin kayboldugunu dogrular")
    public void FatihRequiredYazisininKayboldugunuDogrular() {

        assertFalse(vice_deanPage.required1.isDisplayed());
    }
}
