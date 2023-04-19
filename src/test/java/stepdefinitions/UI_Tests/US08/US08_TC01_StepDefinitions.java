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

    @Given("MDogan {string} url ye gider")
    public void MDoganUrlYeGider(String string) {
        Driver.getDriver().get(string);

    }
    @And("MDogan bir saniye bekler")
    public void MDoganBirSaniyeBekler() throws InterruptedException {
        Thread.sleep(1000);
    }

    @And("MDogan anasayfa login butonuna tiklar")
    public void MDoganAnasayfaLoginButonunaTiklar() {
        homePage.login_Button_Home.click();

    }

    @And("MDogan username {string} girer")
    public void MDoganUsernameGirer(String string) {
        loginPage.username_Box_Login.sendKeys(string);
    }

    @And("MDogan password {string} girer")
    public void MDoganPasswordGirer(String string) {
        loginPage.password_Box_Login.sendKeys(string);
    }

    @And("MDogan login butonuna tiklar")
    public void MDoganLoginButonunaTiklar() {
        loginPage.login_Button_Login.click();
    }


    @And("MDogan Lessons a tiklar")
    public void MDoganLessonsATiklar() {
        viceDeanLessonPage.lessons.click();
    }

    @And("MDogan Lesson Name kismina tiklar")
    public void MDoganLessonNameKisminaTiklar() {
        viceDeanLessonPage.lessonName.click();
    }

    @Then("MDogan Lesson name {string} girer")
    public void MDoganLessonNameGirer(String string) {
        viceDeanLessonPage.lessonName.sendKeys(string);
    }


}
