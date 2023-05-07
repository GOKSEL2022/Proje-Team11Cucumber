package stepdefinitions.UI_Tests.US03;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ContactPage;
import utilities.ConfigReader;
import utilities.Driver;


public class AC01_NameBoxCheck {

    ContactPage contactPage = new ContactPage();
    Faker faker = new Faker();


    @Given("rabia ana sayfaya gider.")
    public void kullaniciAnaSayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschools"));
    }

    @When("rabia Contact butonuna tıklar.")
    public void rabiaContactButonunaTiklar() {
        contactPage.contact_Button.click();
    }

    @Then("rabia Name kutusuna tıklar.")
    public void rabiaNameKutusunaTiklar() {
        contactPage.yourName_textBox.click();
    }

    @And("rabia name kutusuna {string} girer.")
    public void rabiaNameKutusunaGirer(String arg0) {
        contactPage.yourName_textBox.sendKeys(arg0);
    }


    @And("rabia mail kutusuna {string} girer")
    public void rabiaMailKutusunaGirer(String arg0) {
        contactPage.yourEmail_textBox.sendKeys(faker.internet().emailAddress());
    }

    @And("rabia subject  kutusuna {string} girer")
    public void rabiaSubjectKutusunaGirer(String arg0) {
        contactPage.subject_textBox.sendKeys(faker.lorem().sentence(1));
    }

    @And("rabia message kutusuna {string} girer.")
    public void rabiaMessageKutusunaGirer(String arg0) {
        contactPage.message_textBox.sendKeys(faker.lorem().paragraph());
    }


    @And("rabia send message butonuna tıklar")
    public void rabiaSendMessageButonunaTiklar() {
        Driver.clickWithJS(contactPage.sendMessage_Button);
    }


    @And("rabia bir saniye bekler")
    public void rabiaBirSaniyeBekler() throws InterruptedException {
        Thread.sleep(2000);
    }

    @And("rabia mesajın iletildiğine dair pop-up mesajını görüntüler.")
    public void rabiaMesajinIletildigineDairPopUpMesajiniGörüntuler() {
        Assert.assertTrue(contactPage.successfully_alert_css.isDisplayed());
    }

    @And("rabia mesajın iletilemediğini doğrular.")
    public void rabiaMesajınIletilemediğiniDoğrular() {
        Assert.assertTrue(!contactPage.successfully_alert_css.isDisplayed());
    }




}