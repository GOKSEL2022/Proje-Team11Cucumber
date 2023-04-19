package stepdefinitions.UI_Tests.US21;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.ChooseLessonManagement;
import pages.MainMenuPage;
import utilities.ReusableMethods;

public class AC01_TC04_DerslerLessonProgramdaGorulmeli {
    HomePage homePage =new HomePage();
    LoginPage loginpage = new LoginPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    ChooseLessonManagement chooseLessonManagement = new ChooseLessonManagement();

    @When("Emin Choose Lesson yazisinin altindaki  ders kutucuklarini tiklar")
    public void Emin_choose_lesson_yazisinin_altindaki_ders_kutucuklarini_tiklar() {
        ReusableMethods.clickByJS(chooseLessonManagement.kutucuk15);
    }
    @When("Emin submitte butonuna tiklar")
    public void Emin_submitte_butonuna_tiklar() {
        ReusableMethods.clickByJS(chooseLessonManagement.submit_button);
    }

    @Then("Emin Program listi dogrular")
    public void Emin_program_listi_dogrular() {
        ReusableMethods.clickByJS(chooseLessonManagement.program_list);
    }

}
