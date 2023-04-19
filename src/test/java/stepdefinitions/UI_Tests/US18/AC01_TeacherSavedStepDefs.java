package stepdefinitions.UI_Tests.US18;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.StudentInfoPage;
import utilities.ReusableMethods;

public class AC01_TeacherSavedStepDefs {
    StudentInfoPage studentInfoPage =new StudentInfoPage();
    @And("kullanici55 submit buton a tiklar")
    public void kullanici55SubmitButonATiklar() {
        studentInfoPage.submit_button_studentInfo.click();
    }
    @Then("kullanici55 student Info saved succesfully popup yazisini gorur")
    public void kullanici55StudentInfoSavedSuccesfullyPopupYazisiniGorur() {
        try {
            Assert.assertTrue( studentInfoPage.studentSaved_alert_studentInfo.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail("Element not found: " + studentInfoPage.studentSaved_alert_studentInfo);
        }
        ReusableMethods.waitFor(1);

    }
}
