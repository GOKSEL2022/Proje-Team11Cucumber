package stepdefinitions.UI_Tests.US19;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.MainMenuPage;

public class AC01_TC04_Descriptiongirilebilmeli {
    HomePage homePage =new HomePage();
    LoginPage loginpage = new LoginPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    Faker faker = new Faker();

    @When("kullanici Description alanina validd bir deger {string} girer")
    public void kullanici_description_alanina_validd_bir_deger_girer(String string) {
        mainMenuPage.description.sendKeys(string);
    }
    @Then("kullanici Description alanini dogrular")
    public void kullanici_description_alanini_dogrular() {
        Assert.assertTrue(mainMenuPage.description_dogrulama.isDisplayed());
    }

}
