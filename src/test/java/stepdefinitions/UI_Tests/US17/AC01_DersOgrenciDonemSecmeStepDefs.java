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
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AC01_DersOgrenciDonemSecmeStepDefs {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AdminManagementPage adminManagementPage = new AdminManagementPage();
    TeacherPage teacherPage = new TeacherPage();
    LogoutPage logoutPage = new LogoutPage();
    StudentInfoPage studentInfoPage = new StudentInfoPage();
    static String usernameTeacher = Faker.instance().name().username();
    static String passwordTeacher = Faker.instance().internet().password();
    int ssnNo1 = Faker.instance().number().numberBetween(100,999);
    int ssnNo2= Faker.instance().number().numberBetween(10,99);
    int ssnNo3 = Faker.instance().number().numberBetween(1000,9999);
    int phoneNo1= Faker.instance().number().numberBetween(100,999);
    int phoneNo2= Faker.instance().number().numberBetween(100,999);
    int phoneNo3 = Faker.instance().number().numberBetween(1000,9999);
    int gun= Faker.instance().number().numberBetween(1,29);
    int ay= Faker.instance().number().numberBetween(1,12);
    int yil= Faker.instance().number().numberBetween(1950,2000);

    @Given("kullanici url e gider")
    public void kullaniciUrlEGider() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschools"));
    }


    @When("kullanici ana sayfada login butonuna tiklar")
    public void kullaniciAnaSayfadaLoginButonunaTiklar() {
        homePage.login_Button_Home.click();
        ReusableMethods.waitFor(1);
    }

    @And("kullanici admin olarak username girer")
    public void kullaniciAdminOlarakUsernameGirer() {
        loginPage.username_Box_Login.sendKeys(ConfigReader.getProperty("admin_username"));
        ReusableMethods.waitFor(1);
    }

    @And("kullanici admin olarak password girer")
    public void kullaniciAdminOlarakPasswordGirer() {
        loginPage.password_Box_Login.sendKeys(ConfigReader.getProperty("admin_password"));
        ReusableMethods.waitFor(1);
    }

    @And("kullanici login sayfasinda login butona tiklar")
    public void kullaniciLoginSayfasindaLoginButonaTiklar() {
        loginPage.login_Button_Login.click();
        ReusableMethods.waitFor(1);
    }

    @And("kullanici menu butonuna tiklar")
    public void kullaniciMenuButonunaTiklar() {

        ReusableMethods.clickWithTimeOut( adminManagementPage.menu_button_adminmanagement,2);
          }

    @And("kullanici teacher management butona tiklar")
    public void kullaniciTeacherManagementButonaTiklar() {
        adminManagementPage.teachermanagement_button_adminmanagement.click();
        ReusableMethods.waitFor(1);
    }

    @And("teacher sayfasinda add teacher yazisi gorulur")
    public void teacherSayfasindaAddTeacherYazisiGorulur() {
        Assert.assertTrue(teacherPage.addteacher_text_teacher.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @And("kullanici add teacher alanina bilgileri girer ve submit butona tiklar")
    public void kullaniciAddTeacherAlaninaBilgileriGirerVeSubmitButonaTiklar() {

        teacherPage.chooseLessons_dropBox_teacher.click();
        teacherPage.chooseLessons_dropBox_teacher.sendKeys(Keys.PAGE_DOWN,Keys.ENTER);
        ReusableMethods.waitFor(1);

        teacherPage.name_box_teacher.sendKeys(Faker.instance().name().firstName());
        teacherPage.surname_box_teacher.sendKeys(Faker.instance().name().lastName());
        teacherPage.birthPlace_box_teacher.sendKeys(Faker.instance().address().city());
        teacherPage.email_box_teacher.sendKeys(Faker.instance().internet().emailAddress());
        teacherPage.phoneNumber_box_teacher.sendKeys(phoneNo1+"-"+phoneNo2+"-"+phoneNo3);
        teacherPage.isAdvisorTeacher_checkBox_teacher.click();
        teacherPage.male_checkBox_teacher.click();
        teacherPage.birthDay_box_teacher.sendKeys(gun+"."+ay+"."+yil);

        teacherPage.ssn_box_teacher.sendKeys(ssnNo1+"-"+ssnNo2+"-"+ssnNo3);

        teacherPage.username_box_teacher.sendKeys(usernameTeacher);
        teacherPage.password_box_teacher.sendKeys(passwordTeacher);
       teacherPage.submit_button_teacher.click();

    }

    @Then("kullanici teacher saved successfully pup up yazisini gorur")
    public void kullaniciTeacherSavedSuccessfullyPupUpYazisiniGorur() {

        try {
            Assert.assertTrue( teacherPage.teacherSaved_alert_teacher.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail("Element not found: " + teacherPage.teacherSaved_alert_teacher);
        }
        ReusableMethods.waitFor(1);


    }

    @And("kullanici logout butonuna tiklar ve")
    public void kullaniciLogoutButonunaTiklarVe() {
        teacherPage.logout_button_teacher.click();
        ReusableMethods.waitFor(1);
    }

    @And("kullanici yes butona tiklayarak cikis yapar")
    public void kullaniciYesButonaTiklayarakCikisYapar() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", logoutPage.yes_button_logout);
        ReusableMethods.waitFor(1);
    }

    @And("kullanici teacher olarak username girer")
    public void kullaniciTeacherOlarakUsernameGirer() {
        loginPage.username_Box_Login.sendKeys(usernameTeacher);
        ReusableMethods.waitFor(1);
    }

    @And("kullanici teacher olarak password girer")
    public void kullaniciTeacherOlarakPasswordGirer() {
        loginPage.password_Box_Login.sendKeys(passwordTeacher);
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
        ReusableMethods.waitForVisibility(studentInfoPage.chooseLesson_text_studentInfo,10);
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
