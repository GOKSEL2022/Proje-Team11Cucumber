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

    @Given("kullanici anasayfaya {string} gider")
    public void kullanici_anasayfaya_gider(String string) {
        Driver.getDriver().get(string);
        ReusableMethods.waitFor(1);
    }

    @When("kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
     homePage.login_Button_Home.click();
        ReusableMethods.waitFor(1);
    }
    @When("kullanici User Name alanina teacher bilgileri {string} ile girer")
    public void kullanici_user_name_alanina_teacher_bilgileri_ile_girer(String string) {
        loginpage.username_Box_Login.sendKeys(string);
        ReusableMethods.waitFor(1);
    }
    @When("kullanici Password alanina sifresini {string} girer")
    public void kullanici_password_alanina_sifresini_girer(String string) {
    loginpage.password_Box_Login.sendKeys(string);
        ReusableMethods.waitFor(1);
    }
    @When("kullanici login_login butonuna tiklar")
    public void kullanici_login_login_butonuna_tiklar() {
        loginpage.login_Button_Login.click();
        ReusableMethods.waitFor(1);
    }
    @When("kullanici menuu butonuna tiklar")
    public void kullanici_menuu_butonuna_tiklar() {
        mainMenuPage.menu_button.click();
        ReusableMethods.waitFor(1);
    }


    @When("kullanici Meet Management butonuna tiklar")
    public void kullanici_meet_management_butonuna_tiklar() {
     mainMenuPage.meet_management_button.click();
        ReusableMethods.waitFor(2);
    }
    @When("kullanici choose student alanindan ogrenci secer")
    public void kullanici_choose_student_alanindan_ogrenci_secer() throws InterruptedException {
        mainMenuPage.choose_students.click();
        Thread.sleep(2000);
        Actions action=new Actions(Driver.getDriver());
        action.keyDown(Keys.ARROW_DOWN).sendKeys("Ogrenci 23",Keys.ENTER).perform();
         ReusableMethods.waitFor(2);
    }
    @Then("kullanici secilen ogrenciyi dogrular")
    public void kullanici_secilen_ogrenciyi_dogrular() {

        Assert.assertTrue(mainMenuPage.student_dogrulama.isDisplayed());
        ReusableMethods.waitFor(2);
    }



}

