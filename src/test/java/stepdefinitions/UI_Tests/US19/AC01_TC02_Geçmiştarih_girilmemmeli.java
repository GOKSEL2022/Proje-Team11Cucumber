package stepdefinitions.UI_Tests.US19;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.MainMenuPage;

public class AC01_TC02_Geçmiştarih_girilmemmeli {

    HomePage homePage =new HomePage();
    LoginPage loginpage = new LoginPage();
    MainMenuPage mainMenuPage = new MainMenuPage();

    Faker faker = new Faker();
    @When("Emin Date Of Meet alanina gecmis bir tarih {string} girer")
    public void Emin_date_of_meet_alanina_gecmis_bir_tarih_girer(String string) {
       mainMenuPage.date_of_meet.sendKeys(string);
    }
    @And("Emin Start Time alanina valid bir deger {string} girer")
    public void EminStartTimeAlaninaValidBirDegerGirer(String arg0) {
        mainMenuPage.start_time.sendKeys(toString());
    }
    @When("Emin Stop Time alanina valid bir deger \"{int}:{int}\"girer")
    public void Emin_stop_time_alanina_valid_bir_deger_girer(Integer int1, Integer int2) {
       mainMenuPage.stop_time.sendKeys("13:00");
    }
    @When("Emin Description alanina valid bir deger {string} girer")
    public void Emin_description_alanina_valid_bir_deger_girer(String string) {
       mainMenuPage.description.sendKeys(string);
    }
    @When("Emin submit butonuna tiklar")
    public void Emin_submit_butonuna_tiklar() {
       mainMenuPage.add_meet_submit.click();
    }
    @Then("Emin hata mesaji gorur ve toplanti olusturamaz")
    public void Emin_hata_mesaji_gorur_ve_toplanti_olusturamaz() {
        Assert.assertFalse(mainMenuPage.tarih_dogrulama.isDisplayed());
    }

}
