package stepdefinitions.UI_Tests.US18;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.StudentInfoPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class AC02_EditNotStepDefs {
    StudentInfoPage studentInfoPage = new StudentInfoPage();
    @And("kullanici55 edit buton a tiklar")
    public void kullanici55EditButonATiklar() {
        Driver.clickWithJS(studentInfoPage.edit_button_studentInfo);

    }

    @And("kullanici55 edit yapacagi dersi secer")
    public void kullanici55EditYapacagiDersiSecer() {
        Select select =new Select(studentInfoPage.edit_chooseLesson_studentInfo);
        ReusableMethods.selectRandomTextFromDropdown(select);
    }

    @And("kullanici55 edit yapacagi donemi secer")
    public void kullanici55EditYapacagiDonemiSecer() {
        Select select =new Select(studentInfoPage.edit_educationTerm_studentInfo);
        ReusableMethods.selectRandomTextFromDropdown(select);
    }


    @And("kullanici55 ogrencinin guncel final notunu {string} girer")
    public void kullanici55OgrencininGuncelFinalNotunuGirer(String guncelNot) {
       studentInfoPage.edit_midtermExam_studentInfo.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
         studentInfoPage.edit_midtermExam_studentInfo.sendKeys(guncelNot);
    }


    @And("kullanici55 edit student Info sayfasinda submit butona tiklar")
    public void kullanici55EditStudentInfoSayfasindaSubmitButonaTiklar() {
        studentInfoPage.edit_submitButton_studentInfo.click();
    }

    @Then("kullanici55 Student Info updadet Successfully popup yazisini gorur")
    public void kullanici55StudentInfoUpdadetSuccessfullyPopupYazisiniGorur() {

      Driver.waitForVisibility( studentInfoPage.edit_alert_text_studentInfo,5);

       try {
            Assert.assertTrue( studentInfoPage.edit_alert_text_studentInfo.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail("Element not found: " + studentInfoPage.edit_alert_text_studentInfo);
        }
        Driver.waitForVisibility( studentInfoPage.edit_alert_text_studentInfo,5);

    }



}
