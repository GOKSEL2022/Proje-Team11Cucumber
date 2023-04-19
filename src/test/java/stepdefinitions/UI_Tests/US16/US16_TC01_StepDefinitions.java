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





    @And("MDogan Contact Get All sekmesine tiklar")
    public void MDoganContactGetAllSekmesineTiklar() {
        homePage.contactGetAll.click();
    }

    @And("MDogan mesajlari goruntuler")
    public void MDoganMesajlariGoruntuler() {
        Assert.assertTrue(homePage.contactMessage.isDisplayed());

    }

    @And("MDogan mesaj yazarini \\(name) goruntuler")
    public void MDoganMesajYazariniNameGoruntuler() {
        Assert.assertTrue(homePage.contactName.isDisplayed());
    }

    @And("MDogan e maillerini goruntuler")
    public void MDoganEMailleriniGoruntuler() {
       Assert.assertTrue( homePage.contactEmail.isDisplayed());
    }

    @And("MDogan gonderilme tarihini \\(date) goruntuler")
    public void MDoganGonderilmeTarihiniDateGoruntuler() {
       Assert.assertTrue( homePage.contactDate.isDisplayed());
    }

    @Then("MDogan subject bilgilerini goruntuler")
    public void MDoganSubjectBilgileriniGoruntuler() {
       Assert.assertTrue( homePage.contactSubject.isDisplayed());
    }
}
