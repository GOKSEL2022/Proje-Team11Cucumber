package stepdefinitions.UI_Tests.US03;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ContactPage;

public class AC03_SubjectBoxCheck {

    ContactPage contactPage = new ContactPage();
    Faker faker=new Faker();

    @And("Kullanıcı Subject kutusuna tıklar.")
    public void kullaniciSubjectKutusunaTiklar() {
        contactPage.subject_textBox.click();
    }

    @And("Kullanıcı subject kutusunu boş bırakır.")
    public void kullaniciSubjectKutusunuBosBirakir() {
        contactPage.subject_textBox.sendKeys("");
    }



    @And("Kullanıcı subject kutusuna {string} girer.")
    public void kullaniciSubjectKutusunaGirer(String arg0) {
        contactPage.subject_textBox.sendKeys(faker.lorem().word());

    }

    @Then("Mesaj gönderim işlemi gerçekleşir.")
    public void mesajGonderimIslemiGerceklesir() {
        Assert.assertTrue(contactPage.successfully_alert_css.isDisplayed());
    }
}
