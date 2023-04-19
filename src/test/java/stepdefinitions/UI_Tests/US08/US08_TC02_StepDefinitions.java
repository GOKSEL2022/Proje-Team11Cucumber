package stepdefinitions.UI_Tests.US08;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.LoginPage;
import pages.US08_Pages.ViceDeanLessonPage;
import utilities.Driver;

public class US08_TC02_StepDefinitions {
  ;
    ViceDeanLessonPage viceDeanLessonPage = new ViceDeanLessonPage();



    @Then("MDogan Compulsory kutucugunu tiklar")
    public void MDoganCompulsoryKutucugunuTiklar() {
        viceDeanLessonPage.compulsory.click();
    }
}
