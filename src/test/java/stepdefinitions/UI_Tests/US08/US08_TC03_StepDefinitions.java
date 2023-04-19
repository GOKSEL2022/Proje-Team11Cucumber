package stepdefinitions.UI_Tests.US08;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.US08_Pages.ViceDeanLessonPage;

public class US08_TC03_StepDefinitions {
  ;
    ViceDeanLessonPage viceDeanLessonPage = new ViceDeanLessonPage();



  @And("MDogan Credit Score Kutusuna tiklar")
  public void MDoganCreditScoreKutusunaTiklar() {
    viceDeanLessonPage.creditScore.click();

  }

  @And("MDogan Credit score {string} girer")
  public void MDoganCreditScoreGirer(String string) {

    viceDeanLessonPage.creditScore.sendKeys(string);
  }

  @Then("MDogan Submit butonuna tiklar")
  public void MDoganSubmitButonunaTiklar() {
    viceDeanLessonPage.lessonSubmit.click();
  }


}
