package stepdefinitions.UI_Tests.US21;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.ChooseLessonManagement;
import pages.MainMenuPage;

public class AC01_TC06_danismanin_notunu_gorebilme {
    HomePage homePage =new HomePage();
    LoginPage loginpage = new LoginPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    ChooseLessonManagement chooseLessonManagement = new ChooseLessonManagement();
    @When("Emin menuuu butonuna tiklar")
    public void Emin_menuuu_butonuna_tiklar() {
        mainMenuPage.menu_button.click();
    }
    @When("Emin Gradess and Announcements yazisina tiklar")
    public void Emin_gradess_and_announcements_yazisina_tiklar() {
        chooseLessonManagement.grades_and_announcements.click();
    }
    @Then("Emin danismanin olusturdugu dersi dogrular")
    public void Emin_danismanin_olusturdugu_dersi_dogrular() {
        Assert.assertTrue(chooseLessonManagement.danisman_dogrulama.isDisplayed());
    }


}
