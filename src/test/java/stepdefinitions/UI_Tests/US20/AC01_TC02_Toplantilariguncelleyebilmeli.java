package stepdefinitions.UI_Tests.US20;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.MainMenuPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class AC01_TC02_Toplantilariguncelleyebilmeli {
    HomePage homePage =new HomePage();
    LoginPage loginpage = new LoginPage();

    MainMenuPage mainMenuPage = new MainMenuPage();



    @When("Emin olusturmus oldugu meet listesindeki edit butonunu tiklar")
    public void Emin_olusturmus_oldugu_meet_listesindeki_edit_butonunu_tiklar() {
        ReusableMethods.clickByJS(mainMenuPage.edit_button);
    }
    @When("Emin acilan sayfada  yeni duzenlemeler {string} yapar")
    public void Emin_acilan_sayfada_yeni_duzenlemeler_yapar(String string) throws InterruptedException {
        mainMenuPage.choose_students.click();
        Thread.sleep(2000);
        Actions action=new Actions(Driver.getDriver());
        action.keyDown(Keys.ARROW_DOWN).sendKeys("Huseyin Kemal Bulat",Keys.ENTER).perform();
        mainMenuPage.date_of_meet.sendKeys(string);
        mainMenuPage.start_time.sendKeys(string);
    }
    @When("Emin submitt butonuna tiklar")
    public void Emin_submitt_butonuna_tiklar() {
       mainMenuPage.edit_submit.click();
    }
    @Then("Emin meet update successfull yazisini gormelidir")
    public void Emin_meet_update_successfull_yazisini_gormelidir() {
Assert.assertFalse(mainMenuPage.Updated_Successfully.isDisplayed());
    }

}
