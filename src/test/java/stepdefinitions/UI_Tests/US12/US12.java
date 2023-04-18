package stepdefinitions.UI_Tests.US12;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.LessonProgramPage;
import pages.LoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US12 {
    LessonProgramPage lessonProgramPage = new LessonProgramPage();

    WebElement driver;
    @Then("Kullanıcı submit butonuna tıklar")
    public void kullanıcı_submit_butonuna_tıklar() {
    lessonProgramPage.button1.click();

    }

    @Then("Lesson Program Assignment alanında choose lessons bölümünde dersin geldiğini görür")
    public void lessonProgramAssignmentAlanındaChooseLessonsBölümündeDersinGeldiğiniGörür() {

        Actions action=new Actions(Driver.getDriver());
        action.sendKeys(Keys.END,Keys.PAGE_UP).perform();
        WebElement a=lessonProgramPage.assigmentlesson.get(lessonProgramPage.assigmentlesson.size()-1);
        System.out.println(a.getText());
    }

    @When("Lesson Program Assignment alanında choose lessons bölümünde olusturulan dersi seçer")
    public void lessonProgramAssignmentAlanındaChooseLessonsBölümündeOlusturulanDersiSeçer() {
        Actions action=new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_UP).perform();
        lessonProgramPage.lessonCheckBoxButton.get(lessonProgramPage.lessonCheckBoxButton.size()-1).click();

    }

    @When("Seçilen derse choose teacher kısmından öğretmen ataması yapılabilmelidir")
    public void seçilenDerseChooseTeacherKısmındanÖğretmenAtamasıYapılabilmelidir() throws InterruptedException {
//        Actions action= new Actions(Driver.getDriver());
//        WebElement teacherButton=lessonProgramPage.teacherId;
//        teacherButton.click();
//       // teacherButton.sendKeys(Keys.ENTER,Keys.TAB,Keys.ENTER);
//        Actions action=new Actions(Driver.getDriver());
//        action.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();
//        action.keyDown(Keys.ARROW_DOWN).sendKeys(lessonProgramPage.teacherId,Keys.ARROW_DOWN,Keys.ENTER).perform();
        Select select = new Select(lessonProgramPage.teacherId);
        select.selectByIndex(1);
        Thread.sleep(1000);
        lessonProgramPage.teacherId.sendKeys(Keys.TAB,Keys.ENTER);
        Thread.sleep(1000);



    }
}
