package stepdefinitions.UI_Tests.US17;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.StudentInfoPage;

public class AC03_MidtermFinalNotuStepDefs {
    StudentInfoPage studentInfoPage = new StudentInfoPage();

    @And("kullanici midterm exam a not girer ve gorur")
    public void kullaniciMidtermExamANotGirerVeGorur() {

        studentInfoPage.midtermExam_box_studentInfo.sendKeys(Faker.instance().number().numberBetween(0, 100)+"");
        Assert.assertEquals(2,studentInfoPage.requiredAbsente_text_studentInfo.size());
    }

    @And("kullanici final exam a not girer ve gorur")
    public void kullaniciFinalExamANotGirerVeGorur() {
        studentInfoPage.finalExam_box_studentInfo.sendKeys(Faker.instance().number().numberBetween(0, 100) + "");
        Assert.assertEquals(1,studentInfoPage.requiredAbsente_text_studentInfo.size());
    }
}
