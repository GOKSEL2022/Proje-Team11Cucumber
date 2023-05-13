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



    @When("Fatih acilan sayfada choose teacher butonunu tiklar")
    public void Fatih_acilan_sayfada_choose_teacher_butonunu_tiklar() {

        ReusableMethods.clickByJS(vice_deanPage.chooseTeacher);

    }

    @When("Fatihn acilan drapdowndan ogrencinin danisman ogretmenini secer")
    public void Fatihn_acilan_drapdowndan_ogrencinin_danisman_ogretmenini_secer() {

        Select select = new Select(vice_deanPage.chooseTeacher);
        select.selectByVisibleText("tevfik ozen");


    }

    @When("Fatih danisman ogretmenin secildigini dogrular")
    public void Fatih_danisman_ogretmenin_secildigini_dogrular() {

    }




}
