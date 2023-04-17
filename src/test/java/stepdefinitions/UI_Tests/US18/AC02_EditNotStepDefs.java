package stepdefinitions.UI_Tests.US18;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.StudentInfoPage;
import utilities.ReusableMethods;

public class AC02_EditNotStepDefs {
    StudentInfoPage studentInfoPage = new StudentInfoPage();
    @And("kullanici edit buton a tiklar")
    public void kullaniciEditButonATiklar() {
studentInfoPage.edit_button_studentInfo.click();

    }

    @And("kullanici edit yapacagi dersi secer")
    public void kullaniciEditYapacagiDersiSecer() {
        Select select =new Select(studentInfoPage.edit_chooseLesson_studentInfo);
        ReusableMethods.selectRandomTextFromDropdown(select);
    }

    @And("kullanici edit yapacagi donemi secer")
    public void kullaniciEditYapacagiDonemiSecer() {
        Select select =new Select(studentInfoPage.edit_educationTerm_studentInfo);
        ReusableMethods.selectRandomTextFromDropdown(select);
    }


    @And("kullanici ogrencinin guncel final notunu {string} girer")
    public void kullaniciOgrencininGuncelFinalNotunuGirer(String guncelNot) {

         studentInfoPage.edit_midtermExam_studentInfo.clear();
         studentInfoPage.edit_midtermExam_studentInfo.sendKeys(guncelNot);
    }


    @And("kullanici edit student Info sayfasinda submit butona tiklar")
    public void kullaniciEditStudentInfoSayfasindaSubmitButonaTiklar() {
        studentInfoPage.edit_submitButton_studentInfo.click();
    }

    @Then("kullanici Student Info updadet Successfully popup yazisini gorur")
    public void kullaniciStudentInfoUpdadetSuccessfullyPopupYazisiniGorur() {


    }



}
