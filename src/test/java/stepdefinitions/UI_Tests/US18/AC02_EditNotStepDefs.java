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
    @And("kullanici edit buton a tiklar")
    public void kullaniciEditButonATiklar() {
        Driver.clickWithJS(studentInfoPage.edit_button_studentInfo);

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
       studentInfoPage.edit_midtermExam_studentInfo.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
         studentInfoPage.edit_midtermExam_studentInfo.sendKeys(guncelNot);
    }


    @And("kullanici edit student Info sayfasinda submit butona tiklar")
    public void kullaniciEditStudentInfoSayfasindaSubmitButonaTiklar() {
        studentInfoPage.edit_submitButton_studentInfo.click();
    }

    @Then("kullanici Student Info updadet Successfully popup yazisini gorur")
    public void kullaniciStudentInfoUpdadetSuccessfullyPopupYazisiniGorur() {

      Driver.waitForVisibility( studentInfoPage.edit_alert_text_studentInfo,5);

       try {
            Assert.assertTrue( studentInfoPage.edit_alert_text_studentInfo.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail("Element not found: " + studentInfoPage.edit_alert_text_studentInfo);
        }
        Driver.waitForVisibility( studentInfoPage.edit_alert_text_studentInfo,5);

    }



}
