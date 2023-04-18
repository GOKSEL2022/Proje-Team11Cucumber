package stepdefinitions.UI_Tests.US13;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AC01_TC01 {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AdminManagementPage adminManagementPage = new AdminManagementPage();
    ViceDeanTeacherPage viceDeanTeacherPage = new ViceDeanTeacherPage();


    static String name_box_teacher = Faker.instance().name().firstName();
    static String surname_box_teacher = Faker.instance().name().lastName();
    static String birthPlace_box_teacher = Faker.instance().address().city();
    static String viceemail_box_teacher = Faker.instance().internet().emailAddress();
    static String birthDay_box_teacher = Faker.instance().date().birthday().toString();
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
    @Given("Kullanici {string} gider")
    public void kullaniciGider(String string) {

        Driver.getDriver().get(string);
        homePage.login_Button_Home.click();
        ReusableMethods.waitFor(1);
        loginPage.username_Box_Login.sendKeys(ConfigReader.getProperty("vice_dean_username"));
        ReusableMethods.waitFor(1);
        loginPage.password_Box_Login.sendKeys(ConfigReader.getProperty("vice_dean_password"));
        ReusableMethods.waitFor(2);
        loginPage.login_Button_Login.click();
        ReusableMethods.waitFor(1);
        ReusableMethods.clickWithTimeOut( adminManagementPage.menu_button_adminmanagement,2);
        adminManagementPage.teachermanagement_button_adminmanagement.click();
        ReusableMethods.waitFor(1);


    }

    @When("Kullanici Add Teacher sayfasının acildigini goruntuler")
    public void kullaniciAddTeacherSayfasınınAcildiginiGoruntuler()

     {
         Assert.assertTrue(viceDeanTeacherPage.vice_dean_add_teacher_text_teacher.isDisplayed());
         ReusableMethods.waitFor(1);

    }

    @And("Kullanıcı Choose Lessons butonuna tıklar")
    public void kullanıcıChooseLessonsButonunaTıklar() {
        viceDeanTeacherPage.vice_dean_chooseLessons_dropBox_teacher.click();
        ReusableMethods.waitFor(4);



    }

    @And("Kullanıcı açılan listeden belirtilen dersi seçer.")
    public void kullanıcıAcılanListedenBelirtilenDersiSecer() {
        viceDeanTeacherPage.vice_dean_chooseLessons_dropBox_teacher.sendKeys(Keys.PAGE_DOWN,Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @And("Kullanıcı Name textboxına geçerli bir değer girer")
    public void kullanıcıNameTextboxınaGecerliBirDegerGirer() {
        viceDeanTeacherPage.vice_name_box_teacher.sendKeys(Faker.instance().name().firstName());
    }

    @And("Kullanıcı  Surname textboxına geçerli bir değer girer")
    public void kullanıcıSurnameTextboxınaGecerliBirDegerGirer() {
        viceDeanTeacherPage.vice_surname_box_teacher.sendKeys(Faker.instance().name().lastName());
    }

    @And("Kullanıcı Birth Place textboxına geçerli bir değer girer")
    public void kullanıcıBirthPlaceTextboxınaGecerliBirDegerGirer() {
        viceDeanTeacherPage.vice_birthPlace_box_teacher.sendKeys(Faker.instance().address().city());
    }

    @And("Kullanıcı Email textboxına geçerli bir değer girer")
    public void kullanıcıEmailTextboxınaGecerliBirDegerGirer() {
        viceDeanTeacherPage.vice_email_box_teacher.sendKeys(Faker.instance().internet().emailAddress());
    }

    @And("Kullanıcı Phone textboxına geçerli bir değer girer")
    public void kullanıcıPhoneTextboxınaGecerliBirDegerGirer() {
        viceDeanTeacherPage.vice_phoneNumber_box_teacher.sendKeys(phoneNo1+"-"+phoneNo2+"-"+phoneNo3);
    }

    @And("Kullanıcı  Is Advisor Teacher seçeneğini tıklar")
    public void kullanıcıIsAdvisorTeacherSeceneginiTıklar() {
        viceDeanTeacherPage.vice_isAdvisorTeacher_checkBox_teacher.click();
    }

    @And("Kullanıcı Gender seçeneklerinden male seçeneğini tıklar")
    public void kullanıcıGenderSeceneklerindenMaleSeceneginiTıklar() {
        viceDeanTeacherPage.vice_male_checkBox_teacher.click();
    }

    @And("Kullanıcı Date of Birth kutusuna geçerli bir değer girer")
    public void kullanıcıDateOfBirthKutusunaGecerliBirDegerGirer() {
        viceDeanTeacherPage.vice_birthDay_box_teacher.sendKeys(gun+"."+ay+"."+yil);
    }

    @And("Kullanıcı Ssn textboxına geçerli bir değer girer")
    public void kullanıcıSsnTextboxınaGecerliBirDegerGirer() {
        viceDeanTeacherPage.vice_ssn_box_teacher.sendKeys(ssnNo1+"-"+ssnNo2+"-"+ssnNo3);
    ReusableMethods.waitFor(1);
    }

    @And("Kullanıcı User Name textboxına geçerli bir değer girer")
    public void kullanıcıUserNameTextboxınaGecerliBirDegerGirer() {
        viceDeanTeacherPage.vice_username_box_teacher.sendKeys(Faker.instance().name().username());
    }

    @And("Kullanıcı Password textboxına geçerli bir değer girer")
    public void kullanıcıPasswordTextboxınaGecerliBirDegerGirer() {
        viceDeanTeacherPage.vice_password_box_teacher.sendKeys(passwordTeacher);
    }

    @And("Kullanıcı Submit butonuna tıklar")
    public void kullanıcıSubmitButonunaTıklar() {
        viceDeanTeacherPage.vice_submit_button_teacher.click();
    }

    @Then("Kullanici  isleminin basarili oldugunu gösteren popupı görüntüler")
    public void kullaniciIslemininBasariliOldugunuGosterenPopupıGoruntuler() {
        try {
            Assert.assertTrue( viceDeanTeacherPage.vice_teacherSaved_alert_teacher.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail("Element not found: " + viceDeanTeacherPage.vice_teacherSaved_alert_teacher);
        }
        ReusableMethods.waitFor(1);
    }



}




