package stepdefinitions.UI_Tests.US17;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.StudentInfoPage;

public class AC02_TC02_DevamsizlikEksiDegerStepDefs {

    StudentInfoPage studentInfoPage =new StudentInfoPage();
    @Then("kullanici absentee ye devamsizliga eksi deger girer {string} ve gorur")
    public void kullaniciAbsenteeYeDevamsizligaEksiDegerGirerVeGorur(String arg0) {
        studentInfoPage.absentee_box_studentInfo.sendKeys(arg0);
        Assert.assertTrue( studentInfoPage.absentee_box_studentInfo.getText().contains(arg0));
        System.out.println("studentInfoPage.absentee_box_studentInfo.getText() = " + studentInfoPage.absentee_box_studentInfo.getText());
    }



}
