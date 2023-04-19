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

    @Given("kullanici55 url e gider")
    public void kullanici55UrlEGider() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschools"));
    }

    @When("kullanici55 ana sayfada login butonuna tiklar")
    public void kullanici55AnaSayfadaLoginButonunaTiklar() {
        homePage.login_Button_Home.click();
        ReusableMethods.waitFor(1);
    }


    @And("kullanici55 teacher olarak username girer")
    public void kullanici55TeacherOlarakUsernameGirer() {
        loginPage.username_Box_Login.sendKeys(ConfigReader.getProperty("usernameTeacher"));
        ReusableMethods.waitFor(1);
    }

    @And("kullanici55 teacher olarak password girer")
    public void kullanici55TeacherOlarakPasswordGirer() {
        loginPage.password_Box_Login.sendKeys(ConfigReader.getProperty("passwordTeacher"));
        ReusableMethods.waitFor(1);
    }
    @And("kullanici55 login sayfasinda login butona tiklar")
    public void kullanici55LoginSayfasindaLoginButonaTiklar() {
        loginPage.login_Button_Login.click();
        ReusableMethods.waitFor(1);
    }

    @And("kullanici55 student info management yazisini gorur")
    public void kullanici55StudentInfoManagementYazisiniGorur() {
       Assert.assertTrue(studentInfoPage.studentInfoList_text_studentInfo.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @And("kullanici55 choose lesson dan bir ders secer")
    public void kullanici55ChooseLessonDanBirDersSecer() {
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

    @And("kullanici55 choose student den bir ogrenci secer ve gorur")
    public void kullanici55ChooseStudentDenBirOgrenciSecer() {
        Select select = new Select(studentInfoPage.chooseStudent_dropDown_studentInfo);
        ReusableMethods.selectRandomTextFromDropdown(select);
       Assert.assertTrue(select.getFirstSelectedOption().isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @And("kullanici55 choose education term den donem secer ve gorur")
    public void kullanici55ChooseEducationTermDenDonemSecer() {
        Select select = new Select(studentInfoPage.educationTerm_dropDown_studentInfo);
        ReusableMethods.selectRandomTextFromDropdown(select);
        Assert.assertTrue(select.getFirstSelectedOption().isDisplayed());
        ReusableMethods.waitFor(1);

    }

}
