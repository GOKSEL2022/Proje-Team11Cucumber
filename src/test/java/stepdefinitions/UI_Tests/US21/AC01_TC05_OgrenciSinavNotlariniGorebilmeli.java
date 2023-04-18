package stepdefinitions.UI_Tests.US21;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.ChooseLessonManagement;
import pages.MainMenuPage;

public class AC01_TC05_OgrenciSinavNotlariniGorebilmeli {
    HomePage homePage =new HomePage();
    LoginPage loginpage = new LoginPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    ChooseLessonManagement chooseLessonManagement = new ChooseLessonManagement();

    @When("kullanici mennu butonuna tiklar")
    public void kullanici_mennu_butonuna_tiklar() {
        mainMenuPage.menu_button.click();
    }
    @When("kullanici Grades and Announcements yazisina tiklar")
    public void kullanici_grades_and_announcements_yazisina_tiklar() {
        chooseLessonManagement.grades_and_announcements.click();
    }

    @Then("kullanici ders notlarini dogrular")
    public void kullanici_ders_notlarini_dogrular() {
        Assert.assertTrue(chooseLessonManagement.kalem_exam_dogrulama.isDisplayed());
    }

}
