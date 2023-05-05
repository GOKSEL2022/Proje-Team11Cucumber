package stepdefinitions.UI_Tests.US20;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.MainMenuPage;
import utilities.ReusableMethods;

public class AC01_TC01_ToplantilarinDateStartTimeStopTimeDescriptionGorulmeli {

    HomePage homePage =new HomePage();
    LoginPage loginpage = new LoginPage();

    MainMenuPage mainMenuPage = new MainMenuPage();

    @When("Emin edit butonununa tiklar")
    public void Emin_edit_butonununa_tiklar() {
      ReusableMethods.clickByJS(mainMenuPage.edit_button);
     // mainMenuPage.edit_button.click();
    }
    @Then("Emin olusturmus oldugu Date, Start Time ve Descriptionu dogrular")
    public void Emin_olusturmus_oldugu_date_start_time_ve_descriptionu_dogrular() {
       Assert.assertTrue(mainMenuPage.description_dogrulama.isDisplayed());
    }



}
