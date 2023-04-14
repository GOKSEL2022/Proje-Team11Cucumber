package stepdefinitions.UI_Tests.US03;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AC01 {
    ContactPage contactPage = new ContactPage();
    //Faker faker=new Faker();


    @Given("Kullanıcı ana sayfaya gider.")
    public void kullanıcıAnaSayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschools"));
    }

    @When("Kullanıcı Contact butonuna tıklar.")
    public void kullanıcıContactButonunaTıklar() {
        contactPage.contact_Button.click();


    }

    @Then("Kullanıcı Name kutusuna tıklar.")
    public void kullanıcıNameKutusunaTıklar() {
        contactPage.yourName_textBox.click();
    }

    @And("Kullanıcı Name kutusuna {string} girer.")
    public void kullanıcıNameKutusunaGirer(String arg0) {
        contactPage.yourName_textBox.sendKeys(arg0);
    }

    @And("Kullanıcı mail kutusuna {string} girer")
    public void kullanıcıMailKutusunaGirer(String arg0) {
        contactPage.yourEmail_textBox.sendKeys(arg0);
    }

    @And("Kullanıcı subject  kutusuna {string} girer")
    public void kullanıcıSubjectKutusunaGirer(String arg0) {
        contactPage.subject_textBox.sendKeys(arg0);
    }

    @And("Kullanıcı message kutusuna {string} girer.")
    public void kullanıcıMessageKutusunaGirer(String arg0) {
    }

    @And("Kullanıcı send message butonuna tıklar")
    public void kullanıcıSendMessageButonunaTıklar() {
    }

    @And("Kullanıcı bir saniye bekler")
    public void kullanıcıBirSaniyeBekler() {
    }

    @And("Kullanıcı mesajın iletildiğine dair pop-up mesajını görüntüler.")
    public void kullanıcıMesajınIletildiğineDairPopUpMesajınıGörüntüler() {
    }

}