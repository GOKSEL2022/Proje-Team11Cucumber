package stepdefinitions.UI_Tests.US21;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.US19_US20_US21_Pages.ChooseLessonManagement;
import pages.US19_US20_US21_Pages.MainMenuPage;
import utilities.ReusableMethods;

public class AC01_TC04_DerslerLessonProgramdaGorulmeli {
    HomePage homePage =new HomePage();
    LoginPage loginpage = new LoginPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    ChooseLessonManagement chooseLessonManagement = new ChooseLessonManagement();

    @When("kullanici Choose Lesson yazisinin altindaki  ders kutucuklarini tiklar")
    public void kullanici_choose_lesson_yazisinin_altindaki_ders_kutucuklarini_tiklar() {
        ReusableMethods.clickByJS(chooseLessonManagement.kutucuk15);
    }
    @When("kullanici submitte butonuna tiklar")
    public void kullanici_submitte_butonuna_tiklar() {
        ReusableMethods.clickByJS(chooseLessonManagement.submit_button);
    }

    @Then("kullanici Program listi dogrular")
    public void kullanici_program_listi_dogrular() {
        ReusableMethods.clickByJS(chooseLessonManagement.program_list);
    }

}
