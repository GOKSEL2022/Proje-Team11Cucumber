package stepdefinitions.UI_Tests.US21;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.US19_US20_US21_Pages.ChooseLessonManagement;
import pages.US19_US20_US21_Pages.MainMenuPage;

public class AC01_TC06_danismanin_notunu_gorebilme {
    HomePage homePage =new HomePage();
    LoginPage loginpage = new LoginPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    ChooseLessonManagement chooseLessonManagement = new ChooseLessonManagement();
    @When("kullanici menuuu butonuna tiklar")
    public void kullanici_menuuu_butonuna_tiklar() {
        mainMenuPage.menu_button.click();
    }
    @When("kullanici Gradess and Announcements yazisina tiklar")
    public void kullanici_gradess_and_announcements_yazisina_tiklar() {
        chooseLessonManagement.grades_and_announcements.click();
    }
    @Then("kullanici danismanin olusturdugu dersi dogrular")
    public void kullanici_danismanin_olusturdugu_dersi_dogrular() {
        Assert.assertTrue(chooseLessonManagement.danisman_dogrulama.isDisplayed());
    }


}
