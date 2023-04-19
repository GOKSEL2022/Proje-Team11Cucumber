package stepdefinitions.UI_Tests.US16;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.ViceDeanLessonPage;

public class US16_TC01_StepDefinitions {

    HomePage homePage=new HomePage();
    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();
    ViceDeanLessonPage viceDeanLessonPage = new ViceDeanLessonPage();





    @And("Kullanici Contact Get All sekmesine tiklar")
    public void kullaniciContactGetAllSekmesineTiklar() {
        homePage.contactGetAll.click();
    }

    @And("Kullanici mesajlari goruntuler")
    public void kullaniciMesajlariGoruntuler() {
        Assert.assertTrue(homePage.contactMessage.isDisplayed());

    }

    @And("Kullanici mesaj yazarini \\(name) goruntuler")
    public void kullaniciMesajYazariniNameGoruntuler() {
        Assert.assertTrue(homePage.contactName.isDisplayed());
    }

    @And("Kullanici e maillerini goruntuler")
    public void kullaniciEMailleriniGoruntuler() {
       Assert.assertTrue( homePage.contactEmail.isDisplayed());
    }

    @And("Kullanici gonderilme tarihini \\(date) goruntuler")
    public void kullaniciGonderilmeTarihiniDateGoruntuler() {
       Assert.assertTrue( homePage.contactDate.isDisplayed());
    }

    @Then("Kullanici subject bilgilerini goruntuler")
    public void kullaniciSubjectBilgileriniGoruntuler() {
       Assert.assertTrue( homePage.contactSubject.isDisplayed());
    }
}
