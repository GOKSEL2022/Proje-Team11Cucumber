package stepdefinitions.UI_Tests.US18;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.StudentInfoPage;

public class AC01_TeacherSavedStepDefs {
    StudentInfoPage studentInfoPage =new StudentInfoPage();
    @And("kullanici submit buton a tiklar")
    public void kullaniciSubmitButonATiklar() {
        studentInfoPage.submit_button_studentInfo.click();
    }
    @Then("kullanici student Info saved succesfully popup yazisini gorur")
    public void kullaniciStudentInfoSavedSuccesfullyPopupYazisiniGorur() {
        Assert.assertTrue(studentInfoPage.studentSaved_alert_studentInfo.isDisplayed());
    }
}
