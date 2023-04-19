package stepdefinitions.UI_Tests.US17;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.StudentInfoPage;

;import java.util.ArrayList;
import java.util.List;

public class AC02_TC01_DevamsizlikStepDefs {
   int devamsizlik= Faker.instance().number().numberBetween(0,99);
    StudentInfoPage studentInfoPage =new StudentInfoPage();

    @And("kullanici55 absentee ye devamsizlik girer ve gorur")
    public void kullanici55AbsenteeYeDevamsizlikGirer() {
        studentInfoPage.absentee_box_studentInfo.sendKeys(devamsizlik+"");
      Assert.assertEquals(3,studentInfoPage.requiredAbsente_text_studentInfo.size());

    }


    @Then("kullanici55 student Info saved succesfully popup yazisini gorur\\(gormez)")
    public void kullanici55StudentInfoSavedSuccesfullyPopupYazisiniGorurGormez() {
        Assert.assertTrue(!studentInfoPage.studentSaved_alert_studentInfo.isDisplayed());
    }
}
