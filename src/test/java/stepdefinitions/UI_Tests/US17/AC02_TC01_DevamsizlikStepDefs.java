package stepdefinitions.UI_Tests.US17;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.StudentInfoPage;

;import java.util.ArrayList;
import java.util.List;

public class AC02_TC01_DevamsizlikStepDefs {
   int devamsizlik= Faker.instance().number().numberBetween(0,99);
    StudentInfoPage studentInfoPage =new StudentInfoPage();

    @And("kullanici absentee ye devamsizlik girer ve gorur")
    public void kullaniciAbsenteeYeDevamsizlikGirer() {
        studentInfoPage.absentee_box_studentInfo.sendKeys(devamsizlik+"");

        //  Assert.assertFalse(studentInfoPage.requiredAbsente_text_studentInfo.isDisplayed());


    }


}
