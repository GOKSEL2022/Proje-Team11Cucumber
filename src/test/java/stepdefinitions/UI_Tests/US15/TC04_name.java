package stepdefinitions.UI_Tests.US15;

import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.Vice_DeanPage;

import static org.junit.Assert.assertFalse;

public class TC04_name {

    HomePage homePage = new HomePage();
    LoginPage loginPage =new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Vice_DeanPage vice_deanPage = new Vice_DeanPage();
    @And("Kullanici name alanini bos birakir")
    public void kullaniciNameAlaniniBosBirakir() {

    vice_deanPage.student_name.sendKeys(" ", Keys.TAB);
    }

    @And("Kullanici bos birakilan name alanindaki required yazisini dogrular")
    public void kullaniciBosBirakilanNameAlanindakiRequiredYazisiniDogrular() {
        assertFalse(vice_deanPage.required1.isDisplayed());



    }
}
