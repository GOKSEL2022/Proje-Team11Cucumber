package stepdefinitions.UI_Tests.US21;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.US19_US20_US21_Pages.ChooseLessonManagement;
import pages.US19_US20_US21_Pages.MainMenuPage;

public class AC01_TC02_DersSecme {
    HomePage homePage =new HomePage();
    LoginPage loginpage = new LoginPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    ChooseLessonManagement chooseLessonManagement = new ChooseLessonManagement();

    @Then("kullanici Choose Lesson yazisinin altindaki ders kutucuklarini tiklar")
    public void kullanici_choose_lesson_yazisinin_altindaki_ders_kutucuklarini_tiklar() {
       chooseLessonManagement.kutucuk.click();
    }
    @Then("kullanici tiklandigini dogrular")
    public void kullanici_tiklandigini_dogrular() {
        Assert.assertTrue(chooseLessonManagement.kutucuk.isSelected());
    }

}
