package stepdefinitions.UI_Tests.US11;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.LessonProgramPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US11 {
    LessonProgramPage lessonProgramPage = new LessonProgramPage();

    @When("Kullanıcı Lesson Program List'e sayfayı sürükler")
    public void kullanıcı_lesson_program_list_e_sayfayı_sürükler() {
        Actions action=new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();

    }
    @When("Kullanıcı {string} görmeelidir")
    public void kullanıcı_görmeelidir(String lessonProgramList) {
        ReusableMethods.waitForVisibility(lessonProgramPage.lessonProgramListElement,15);
        assert lessonProgramList.equals(lessonProgramPage.lessonProgramListElement.getText());
    }

    @And("Kullanıcı Lesson Program List tablosundaki {string},{string},{string},{string} görür")
    public void kullanıcıLessonProgramListTablosundakiGörür(String lesson, String day, String startTime, String stopTime) {

        assert lesson.equals(lessonProgramPage.lessonProgramListLesson.getText());
        assert day.equals(lessonProgramPage.lessonProgramListDay.getText());
        assert startTime.equals(lessonProgramPage.lessonProgramListStartTime.getText());
        assert stopTime.equals(lessonProgramPage.lessonProgramListStopTime.getText());


    }

    @And("Kullanıcı Lesson Program List tablosu içerisindeki {string},{string},{string},{string} görür")
    public void kullanıcıLessonProgramListTablosuIçerisindekiGörür(String functionalAnalysis, String monday, String baslama, String bitis) {

        String a =lessonProgramPage.functional.getText();
        System.out.println(a);
        assert functionalAnalysis.equals(lessonProgramPage.functional.getText());
        assert monday.equals(lessonProgramPage.gunMonday.getText());
        assert baslama.equals(lessonProgramPage.baslamaSaati.getText());
        assert bitis.equals(lessonProgramPage.bitisSaati.getText());
    }
}
