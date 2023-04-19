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

    @When("Emin mennu butonuna tiklar")
    public void Emin_mennu_butonuna_tiklar() {
        mainMenuPage.menu_button.click();
    }
    @When("Emin Grades and Announcements yazisina tiklar")
    public void Emin_grades_and_announcements_yazisina_tiklar() {
        chooseLessonManagement.grades_and_announcements.click();
    }

    @Then("Emin ders notlarini dogrular")
    public void Emin_ders_notlarini_dogrular() {
        Assert.assertTrue(chooseLessonManagement.kalem_exam_dogrulama.isDisplayed());
    }

}
