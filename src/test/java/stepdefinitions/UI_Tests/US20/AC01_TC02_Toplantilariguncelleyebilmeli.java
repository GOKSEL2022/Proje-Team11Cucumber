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



    @When("kullanici olusturmus oldugu meet listesindeki edit butonunu tiklar")
    public void kullanici_olusturmus_oldugu_meet_listesindeki_edit_butonunu_tiklar() {
        ReusableMethods.clickByJS(mainMenuPage.edit_button);
    }
    @When("kullanici acilan sayfada  yeni duzenlemeler {string} yapar")
    public void kullanici_acilan_sayfada_yeni_duzenlemeler_yapar(String string) throws InterruptedException {
        mainMenuPage.choose_students.click();
        Thread.sleep(2000);
        Actions action=new Actions(Driver.getDriver());
        action.keyDown(Keys.ARROW_DOWN).sendKeys("Ogrenci 23",Keys.ENTER).perform();
        mainMenuPage.date_of_meet.sendKeys(string);
        mainMenuPage.start_time.sendKeys(string);
    }
    @When("kullanici submitt butonuna tiklar")
    public void kullanici_submitt_butonuna_tiklar() {
       mainMenuPage.edit_submit.click();
    }
    @Then("kullanici meet update successfull yazisini gormelidir")
    public void kullanici_meet_update_successfull_yazisini_gormelidir() {
Assert.assertTrue(mainMenuPage.Updated_Successfully.isDisplayed());
    }

}
