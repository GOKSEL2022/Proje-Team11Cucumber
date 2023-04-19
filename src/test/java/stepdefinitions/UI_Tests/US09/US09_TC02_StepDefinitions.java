package stepdefinitions.UI_Tests.US09;

import io.cucumber.java.en.Then;
import pages.ViceDeanLessonPage;

public class US09_TC02_StepDefinitions {
    ViceDeanLessonPage viceDeanLessonPage = new ViceDeanLessonPage();


    @Then("Kullanici Ders Listesindeki Sil Butonuna Tiklar")
    public void kullaniciDersListesindekiSilButonunaTiklar() {
        viceDeanLessonPage.lessonDelete.click();
    }
}





