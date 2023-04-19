package stepdefinitions.UI_Tests.US15;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.Vice_DeanPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class TC02_Menu {
    HomePage homePage = new HomePage();
    LoginPage loginPage =new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Vice_DeanPage vice_deanPage = new Vice_DeanPage();



    @When("Fatih sag kosede Menu butonuna tiklar")
    public void Fatih_sag_kosede_menu_butonuna_tiklar() throws InterruptedException {
  ReusableMethods.clickByJS(vice_deanPage.menu_buton);
       Thread.sleep(3000);


    }

    @When("Fatih Menu butonunun altinda acilan alt munude student management butonunu tiklar")
    public void Fatih_menu_butonunun_altinda_acilan_alt_munude_student_management_butonunu_tiklar() {
        ReusableMethods.clickByJS(vice_deanPage.student_menu);
    }

    @When("Fatih student management sayfasinin acildigini dogrular")
    public void Fatih_student_management_sayfasinin_acildigini_dogrular() {
       assertTrue(vice_deanPage.add_student_text.isDisplayed());
    }








}
