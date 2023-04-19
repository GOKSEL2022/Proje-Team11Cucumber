package stepdefinitions.UI_Tests.US07;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DeanPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class Verification {

    DeanPage deanPage = new DeanPage();

    @Given("rabia dean olarak giris yapar")
    public void rabiaDeanOlarakGirisYapar() {
        ReusableMethods.login("gooddean","12345678");


    }

    @When("rabia dean olarak giris yaptığını dogrular.")
    public void rabiaDeanOlarakGirisYaptığınıDogrular() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("vicedean"));
    }

    @And("rabia menu butonuna tıklar.")
    public void rabiaMenuButonunaTıklar() {
        deanPage.menu_button.click();
    }

    @And("rabia açılan sekmede Contact Get All linkine tıklar.")
    public void rabiaAçılanSekmedeContactGetAllLinkineTıklar() {
        deanPage.contact_getAll_button.click();
    }

    @And("rabia contact-getAll sayfasındadır.")
    public void rabiaContactGetAllSayfasındadır() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("contact-getAll"));

    }

    @Then("rabia sayfada mesajları görüntüler.")
    public void rabiaSayfadaMesajlarıGörüntüler() {
        Assert.assertTrue(deanPage.message_column.isDisplayed());
    }

    @Then("rabia sayfada mesajların yazarlarını göründügünü dogrular")
    public void rabiaSayfadaMesajlarınYazarlarınıGöründügünüDogrular() {
        Assert.assertTrue(deanPage.name_column_2.isDisplayed());
    }

    @Then("rabia sayfada mesajları  mesaj gönderenlerin emaillerinin görüntülendigini dogrular")
    public void rabiaSayfadaMesajlarıMesajGönderenlerinEmaillerininGörüntülendiginiDogrular() {
        Assert.assertTrue(deanPage.email_column.isDisplayed());
    }

    @Then("Dean'in, mesajların gönderilme tarihini görüntüledigini dogrular")
    public void deanInMesajlarınGönderilmeTarihiniGörüntülediginiDogrular() {
        Assert.assertTrue(deanPage.date_column_2.isDisplayed());
    }

    @Then("rabia sayfada mesajların subject bilgilerini görüntüledigini dogrular")
    public void rabiaSayfadaMesajlarınSubjectBilgileriniGörüntülediginiDogrular() {
        Assert.assertTrue(deanPage.subject_column.isDisplayed());
    }



}
