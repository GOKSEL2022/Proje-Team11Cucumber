package stepdefinitions.UI_Tests.US17;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AC01_DersOgrenciDonemSecmeStepDefs {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    LogoutPage logoutPage = new LogoutPage();
    StudentInfoPage studentInfoPage = new StudentInfoPage();

    @Given("kullanici url e gider")
    public void kullaniciUrlEGider() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschools"));
    }

    @When("kullanici ana sayfada login butonuna tiklar")
    public void kullaniciAnaSayfadaLoginButonunaTiklar() {
        homePage.login_Button_Home.click();
        ReusableMethods.waitFor(1);
    }


    @And("kullanici teacher olarak username girer")
    public void kullaniciTeacherOlarakUsernameGirer() {
        loginPage.username_Box_Login.sendKeys(ConfigReader.getProperty("usernameTeacher"));
        ReusableMethods.waitFor(1);
    }

    @And("kullanici teacher olarak password girer")
    public void kullaniciTeacherOlarakPasswordGirer() {
        loginPage.password_Box_Login.sendKeys(ConfigReader.getProperty("passwordTeacher"));
        ReusableMethods.waitFor(1);
    }
    @And("kullanici login sayfasinda login butona tiklar")
    public void kullaniciLoginSayfasindaLoginButonaTiklar() {
        loginPage.login_Button_Login.click();
        ReusableMethods.waitFor(1);
    }

    @And("kullanici student info management yazisini gorur")
    public void kullaniciStudentInfoManagementYazisiniGorur() {
       Assert.assertTrue(studentInfoPage.studentInfoList_text_studentInfo.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @And("kullanici choose lesson dan bir ders secer")
    public void kullaniciChooseLessonDanBirDersSecer() {
        Select select = new Select(studentInfoPage.chooseLesson_dropDown_studentInfo);
        ReusableMethods.selectRandomTextFromDropdown(select);
        ReusableMethods.waitFor(1);
    }

    @And("kullaninin sectigi dersi gorur")
    public void kullanininSectigiDersiGorur() {
        ReusableMethods.waitForVisibility(studentInfoPage.chooseLesson_text_studentInfo,5);
      Assert.assertTrue(studentInfoPage.chooseLesson_text_studentInfo.isDisplayed());
        ReusableMethods.waitFor(1);

    }

    @And("kullanici choose student den bir ogrenci secer ve gorur")
    public void kullaniciChooseStudentDenBirOgrenciSecer() {
        Select select = new Select(studentInfoPage.chooseStudent_dropDown_studentInfo);
        ReusableMethods.selectRandomTextFromDropdown(select);
       Assert.assertTrue(select.getFirstSelectedOption().isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @And("kullanici choose education term den donem secer ve gorur")
    public void kullaniciChooseEducationTermDenDonemSecer() {
        Select select = new Select(studentInfoPage.educationTerm_dropDown_studentInfo);
        ReusableMethods.selectRandomTextFromDropdown(select);
        Assert.assertTrue(select.getFirstSelectedOption().isDisplayed());
        ReusableMethods.waitFor(1);

    }

}
