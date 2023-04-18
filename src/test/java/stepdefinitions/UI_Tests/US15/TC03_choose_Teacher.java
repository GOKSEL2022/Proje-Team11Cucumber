package stepdefinitions.UI_Tests.US15;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.Vice_DeanPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class TC03_choose_Teacher {

    HomePage homePage = new HomePage();
    LoginPage loginPage =new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Vice_DeanPage vice_deanPage = new Vice_DeanPage();



    @When("Kullanici acilan sayfada choose teacher butonunu tiklar")
    public void kullanici_acilan_sayfada_choose_teacher_butonunu_tiklar() {

        ReusableMethods.clickByJS(vice_deanPage.chooseTeacher);

    }

    @When("Kullanicin acilan drapdowndan ogrencinin danisman ogretmenini secer")
    public void kullanicin_acilan_drapdowndan_ogrencinin_danisman_ogretmenini_secer() {

        Select select = new Select(vice_deanPage.chooseTeacher);
        select.selectByVisibleText("Mehmet Emin team11");


    }

    @When("Kullanici danisman ogretmenin secildigini dogrular")
    public void kullanici_danisman_ogretmenin_secildigini_dogrular() {

    }




}
