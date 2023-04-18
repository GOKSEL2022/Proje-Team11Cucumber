package stepdefinitions.UI_Tests.US08;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.LoginPage;
import pages.US08_Pages.ViceDeanLessonPage;
import utilities.Driver;

public class US08_TC01_StepDefinitions {

    HomePage homePage=new HomePage();
    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();
    ViceDeanLessonPage viceDeanLessonPage = new ViceDeanLessonPage();

    @Given("Kullanici {string} url ye gider")
    public void kullaniciUrlYeGider(String string) {
        Driver.getDriver().get(string);

    }
    @And("Kullanici bir saniye bekler")
    public void kullaniciBirSaniyeBekler() throws InterruptedException {
        Thread.sleep(1000);
    }

    @And("Kullanici anasayfa login butonuna tiklar")
    public void kullaniciAnasayfaLoginButonunaTiklar() {
        homePage.login_Button_Home.click();

    }

    @And("Kullanici username {string} girer")
    public void kullaniciUsernameGirer(String string) {
        loginPage.username_Box_Login.sendKeys(string);
    }

    @And("Kullanici password {string} girer")
    public void kullaniciPasswordGirer(String string) {
        loginPage.password_Box_Login.sendKeys(string);
    }

    @And("Kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        loginPage.login_Button_Login.click();
    }


    @And("Kullanici Lessons a tiklar")
    public void kullaniciLessonsATiklar() {
        viceDeanLessonPage.lessons.click();
    }

    @And("Kullanici Lesson Name kismina tiklar")
    public void kullaniciLessonNameKisminaTiklar() {
        viceDeanLessonPage.lessonName.click();
    }

    @Then("Kullanici Lesson name {string} girer")
    public void kullaniciLessonNameGirer(String string) {
        viceDeanLessonPage.lessonName.sendKeys(string);
    }


}
