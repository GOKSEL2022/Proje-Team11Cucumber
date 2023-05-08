package stepdefinitions.UI_Tests.US03;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ContactPage;

public class AC03_SubjectBoxCheck {

    ContactPage contactPage = new ContactPage();
    Faker faker=new Faker();

    @And("rabia Subject kutusuna tıklar.")
    public void rabiaSubjectKutusunaTiklar() {
        contactPage.subject_textBox.click();
    }

    @And("rabia subject kutusunu boş bırakır.")
    public void rabiaSubjectKutusunuBosBirakir() {
        contactPage.subject_textBox.sendKeys("");
    }



    @And("rabia subject kutusuna {string} girer.")
    public void rabiaSubjectKutusunaGirer(String arg0) {
        contactPage.subject_textBox.sendKeys("1234567891425262787687424424");

    }

    @Then("Mesaj gönderim işlemi gerçekleşir.")
    public void mesajGonderimIslemiGerceklesir() {
        Assert.assertTrue(contactPage.successfully_alert_css.isDisplayed());
    }


    @When("bos bırakılan kutunun altında required yazısı oldugunu doğrular.")
    public void bos_bırakılan_kutunun_altında_required_yazısı_oldugunu_doğrular() {
        Assert.assertTrue(contactPage.required_name.isDisplayed());
    }

}
