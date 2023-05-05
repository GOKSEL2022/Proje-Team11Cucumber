package stepdefinitions.UI_Tests.US19;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.MainMenuPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class AC01_TC01_OgrenciSecebilmeStepDefinition {

    HomePage homePage =new HomePage();
    LoginPage loginpage = new LoginPage();
    MainMenuPage mainMenuPage = new MainMenuPage();

    Faker faker = new Faker();

    @Given("Emin anasayfaya {string} gider")
    public void Emin_anasayfaya_gider(String string) {
        Driver.getDriver().get(string);
        ReusableMethods.waitFor(1);
    }

    @When("Emin login butonuna tiklar")
    public void Emin_login_butonuna_tiklar() {
     homePage.login_Button_Home.click();
        ReusableMethods.waitFor(1);
    }
    @When("Emin User Name alanina teacher bilgileri {string} ile girer")
    public void Emin_user_name_alanina_teacher_bilgileri_ile_girer(String string) {
        loginpage.username_Box_Login.sendKeys(string);
        ReusableMethods.waitFor(1);
    }
    @When("Emin Password alanina sifresini {string} girer")
    public void Emin_password_alanina_sifresini_girer(String string) {
    loginpage.password_Box_Login.sendKeys(string);
        ReusableMethods.waitFor(1);
    }
    @When("Emin login_login butonuna tiklar")
    public void Emin_login_login_butonuna_tiklar() {
        loginpage.login_Button_Login.click();
        ReusableMethods.waitFor(1);
    }
    @When("Emin menuu butonuna tiklar")
    public void Emin_menuu_butonuna_tiklar() {
       // mainMenuPage.menu_button.click();
        ReusableMethods.clickByJS(mainMenuPage.menu_button);
        ReusableMethods.waitFor(1);
    }


    @When("Emin Meet Management butonuna tiklar")
    public void Emin_meet_management_butonuna_tiklar() {
     ReusableMethods.clickByJS(mainMenuPage.meet_management_button);
        ReusableMethods.waitFor(2);
    }
    @When("Emin choose student alanindan ogrenci secer")
    public void Emin_choose_student_alanindan_ogrenci_secer() throws InterruptedException {
        mainMenuPage.choose_students.click();
        Thread.sleep(2000);
        Actions action=new Actions(Driver.getDriver());
        action.keyDown(Keys.ARROW_DOWN).sendKeys("Huseyin Kemal Bulat",Keys.ENTER).perform();
         ReusableMethods.waitFor(2);
    }
    @Then("Emin secilen ogrenciyi dogrular")
    public void Emin_secilen_ogrenciyi_dogrular() {

        Assert.assertTrue(mainMenuPage.student_dogrulama.isDisplayed());
        ReusableMethods.waitFor(2);
    }



}

