package stepdefinitions.UI_Tests.US08;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.US08_Pages.ViceDeanLessonPage;

public class US08_TC03_StepDefinitions {
  ;
    ViceDeanLessonPage viceDeanLessonPage = new ViceDeanLessonPage();



  @And("Kullanici Credit Score Kutusuna tiklar")
  public void kullaniciCreditScoreKutusunaTiklar() {
    viceDeanLessonPage.creditScore.click();

  }

  @And("Kullanici Credit score {string} girer")
  public void kullaniciCreditScoreGirer(String string) {

    viceDeanLessonPage.creditScore.sendKeys(string);
  }

//  @Then("Kullanici Submit butonuna tiklar")
//  public void kullaniciSubmitButonunaTiklar() {
//    viceDeanLessonPage.lessonSubmit.click();
//  }


}
