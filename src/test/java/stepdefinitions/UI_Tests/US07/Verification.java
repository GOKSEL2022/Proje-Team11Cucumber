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

    @Given("Kullanıcı dean olarak giris yapar")
    public void kullanıcıDeanOlarakGirisYapar() {
        ReusableMethods.login("gooddean","12345678");


    }

    @When("Kullanıcı dean olarak giris yaptığını dogrular.")
    public void kullanıcıDeanOlarakGirisYaptığınıDogrular() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("vicedean"));
    }

    @And("Kullanıcı menu butonuna tıklar.")
    public void kullanıcıMenuButonunaTıklar() {
        deanPage.menu_button.click();
    }

    @And("Kullanıcı açılan sekmede Contact Get All linkine tıklar.")
    public void kullanıcıAçılanSekmedeContactGetAllLinkineTıklar() {
        deanPage.contact_getAll_button.click();
    }

    @And("Kullanıcı contact-getAll sayfasındadır.")
    public void kullanıcıContactGetAllSayfasındadır() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("contact-getAll"));

    }

    @Then("Kullanıcı sayfada mesajları görüntüler.")
    public void kullanıcıSayfadaMesajlarıGörüntüler() {
        Assert.assertTrue(deanPage.message_column.isDisplayed());
    }

    @Then("Kullanıcı sayfada mesajların yazarlarını göründügünü dogrular")
    public void kullanıcıSayfadaMesajlarınYazarlarınıGöründügünüDogrular() {
        Assert.assertTrue(deanPage.name_column_2.isDisplayed());
    }

    @Then("Kullanıcı sayfada mesajları  mesaj gönderenlerin emaillerinin görüntülendigini dogrular")
    public void kullanıcıSayfadaMesajlarıMesajGönderenlerinEmaillerininGörüntülendiginiDogrular() {
        Assert.assertTrue(deanPage.email_column.isDisplayed());
    }

    @Then("Dean'in, mesajların gönderilme tarihini görüntüledigini dogrular")
    public void deanInMesajlarınGönderilmeTarihiniGörüntülediginiDogrular() {
        Assert.assertTrue(deanPage.date_column_2.isDisplayed());
    }

    @Then("Kullanıcı sayfada mesajların subject bilgilerini görüntüledigini dogrular")
    public void kullanıcıSayfadaMesajlarınSubjectBilgileriniGörüntülediginiDogrular() {
        Assert.assertTrue(deanPage.subject_column.isDisplayed());
    }



}
