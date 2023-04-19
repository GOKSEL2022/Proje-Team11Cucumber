package stepdefinitions.UI_Tests.US17;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;

import org.junit.Assert;

import pages.StudentInfoPage;


public class AC04_InfoNotuStepDefs {
    StudentInfoPage studentInfoPage = new StudentInfoPage();

    @And("kullanici55 info note a bilgi notu girer ve gorur")
    public void kullanici55InfoNoteABilgiNotuGirerVeGorur() {
        studentInfoPage.infoNote_box_studentInfo.sendKeys(Faker.instance().lorem().paragraph());
        Assert.assertTrue(!studentInfoPage.requiredinfoNote_text_studentInfo.isDisplayed());

    }
}