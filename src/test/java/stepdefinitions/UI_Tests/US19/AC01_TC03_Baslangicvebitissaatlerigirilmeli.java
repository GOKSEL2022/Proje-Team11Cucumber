package stepdefinitions.UI_Tests.US19;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.MainMenuPage;

public class AC01_TC03_Baslangicvebitissaatlerigirilmeli {
    HomePage homePage =new HomePage();
    LoginPage loginpage = new LoginPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    Faker faker = new Faker();


    @When("Emin Date Of Meet alanina  bir tarih {string} girer")
    public void Emin_date_of_meet_alanina_bir_tarih_girer(String string) {
       mainMenuPage.date_of_meet.sendKeys(string);
    }
    @When("Emin Start Time alanina validd bir deger {string} girer")
    public void Emin_start_time_alanina_validd_bir_deger_girer(String string) {
        mainMenuPage.start_time.sendKeys(string);
    }
    @When("Emin Stop Time alanina valid bir deger {string} girer")
    public void Emin_stop_time_alanina_valid_bir_deger_girer(String string) {
       mainMenuPage.stop_time.sendKeys(string);
    }
    @Then("Emin Star time Stop time alanlarini dogrular")
    public void Emin_star_time_stop_time_alanlarini_dogrular() {
        Assert.assertTrue(mainMenuPage.start_time_dogrulama.isDisplayed());
    }

}
