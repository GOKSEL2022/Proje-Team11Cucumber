package stepdefinitions.UI_Tests.US24;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AdminManagementPage;
import pages.HomePage;
import pages.LoginPage;
import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AC01_TC01_Tüm_bilgiler_doğru_girilir {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AdminManagementPage adminManagementPage = new AdminManagementPage();

    TeacherPage teacherPage = new TeacherPage();

    static String name_box_teacher = Faker.instance().name().firstName();
    static String surname_box_teacher = Faker.instance().name().lastName();
    static String birthPlace_box_teacher = Faker.instance().address().city();
    static String email_box_teacher = Faker.instance().internet().emailAddress();
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



    @Given("Kuullanici {string} gider")
    public void kullaniciGider(String string) {
        Driver.getDriver().get(string);
        homePage.login_Button_Home.click();
        ReusableMethods.waitFor(1);
        loginPage.username_Box_Login.sendKeys(ConfigReader.getProperty("admin_username"));
        ReusableMethods.waitFor(1);
        loginPage.password_Box_Login.sendKeys(ConfigReader.getProperty("admin_password"));
        ReusableMethods.waitFor(2);
        loginPage.login_Button_Login.click();
        ReusableMethods.waitFor(1);
        ReusableMethods.clickWithTimeOut( adminManagementPage.menu_button_adminmanagement,2);
        adminManagementPage.teachermanagement_button_adminmanagement.click();
        ReusableMethods.waitFor(1);


    }


    @When("Kuullanici Add Teacher sayfasının acildigini goruntuler")
    public void kullaniciAddTeacherSayfasınınAcildiginiGoruntuler() {
        Assert.assertTrue(teacherPage.addteacher_text_teacher.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @And("Kuullanıcı Choose Lessons butonuna tıklar")
    public void kullanıcıChooseLessonsButonunaTıklar() {
        teacherPage.chooseLessons_dropBox_teacher.click();
        ReusableMethods.waitFor(4);
    }

    @And("Kuullanıcı açılan listeden belirtilen dersi seçer.")
    public void kullanıcıAcılanListedenBelirtilenDersiSecer() {
        teacherPage.chooseLessons_dropBox_teacher.sendKeys(Keys.PAGE_DOWN,Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @And("Kuullanıcı Name textboxına geçerli bir değer girer")
    public void kullanıcıNameTextboxınaGecerliBirDegerGirer() {
        teacherPage.name_box_teacher.sendKeys(Faker.instance().name().firstName());
    }

    @And("Kuullanıcı Surname textboxına geçerli bir değer girer")
    public void kullanıcıSurnameTextboxınaGecerliBirDegerGirer() {
        teacherPage.surname_box_teacher.sendKeys(Faker.instance().name().lastName());
    }

    @And("Kuullanıcı Birth Place textboxına geçerli bir değer girer")
    public void kullanıcıBirthPlaceTextboxınaGecerliBirDegerGirer() {
        teacherPage.birthPlace_box_teacher.sendKeys(Faker.instance().address().city());
    }

    @And("Kuullanıcı Email textboxına geçerli bir değer girer")
    public void kullanıcıEmailTextboxınaGecerliBirDegerGirer() {
        teacherPage.email_box_teacher.sendKeys(Faker.instance().internet().emailAddress());
    }

    @And("Kuullanıcı Phone textboxına geçerli bir değer girer")
    public void kullanıcıPhoneTextboxınaGecerliBirDegerGirer() {
        teacherPage.phoneNumber_box_teacher.sendKeys(phoneNo1+"-"+phoneNo2+"-"+phoneNo3);
    }

    @And("Kuullanıcı  Is Advisor Teacher seçeneğini tıklar")
    public void kullanıcıIsAdvisorTeacherSeceneginiTıklar() {
        teacherPage.isAdvisorTeacher_checkBox_teacher.click();
    }

    @And("Kuullanıcı Gender seçeneklerinden male seçeneğini tıklar")
    public void kullanıcıGenderSeceneklerindenMaleSeceneginiTıklar() {
        teacherPage.male_checkBox_teacher.click();
    }

    @And("Kuullanıcı Date of Birth kutusuna geçerli bir değer girer")
    public void kullanıcıDateOfBirthKutusunaGecerliBirDegerGirer() {
        teacherPage.birthDay_box_teacher.sendKeys(gun+"."+ay+"."+yil);
    }

    @And("Kuullanıcı Ssn textboxına geçerli bir değer girer")
    public void kullanıcıSsnTextboxınaGecerliBirDegerGirer() {
        teacherPage.ssn_box_teacher.sendKeys(ssnNo1+"-"+ssnNo2+"-"+ssnNo3);
    }

    @And("Kuullanıcı User Name textboxına geçerli bir değer girer")
    public void kullanıcıUserNameTextboxınaGecerliBirDegerGirer() {
        teacherPage.username_box_teacher.sendKeys(usernameTeacher);
    }

    @And("Kuullanıcı Password textboxına geçerli bir değer girer")
    public void kullanıcıPasswordTextboxınaGecerliBirDegerGirer() {
        teacherPage.password_box_teacher.sendKeys(passwordTeacher);
    }

    @And("Kuullanıcı Submit butonuna tıklar")
    public void kullanıcıSubmitButonunaTıklar() {
        teacherPage.submit_button_teacher.click();

    }

    @Then("Kuullanici  isleminin basarili oldugunu gösteren popupı görüntüler")
    public void kullaniciIslemininBasariliOldugunuGosterenPopupıGoruntuler() {
        try {
            Assert.assertTrue( teacherPage.teacherSaved_alert_teacher.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail("Element not found: " + teacherPage.teacherSaved_alert_teacher);
        }
        ReusableMethods.waitFor(1);

    }
}
