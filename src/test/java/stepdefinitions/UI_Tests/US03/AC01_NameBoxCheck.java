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


    @Given("Kullanıcı ana sayfaya gider.")
    public void kullaniciAnaSayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschools"));
    }

    @When("Kullanıcı Contact butonuna tıklar.")
    public void kullaniciContactButonunaTiklar() {
        contactPage.contact_Button.click();
    }

    @Then("Kullanıcı Name kutusuna tıklar.")
    public void kullaniciNameKutusunaTiklar() {
        contactPage.yourName_textBox.click();
    }

    @And("Kullanıcı name kutusuna {string} girer.")
    public void kullaniciNameKutusunaGirer(String arg0) {
        contactPage.yourName_textBox.sendKeys(arg0);
    }


    @And("Kullanıcı mail kutusuna {string} girer")
    public void kullaniciMailKutusunaGirer(String arg0) {
        contactPage.yourEmail_textBox.sendKeys(faker.internet().emailAddress());
    }

    @And("Kullanıcı subject  kutusuna {string} girer")
    public void kullaniciSubjectKutusunaGirer(String arg0) {
        contactPage.subject_textBox.sendKeys(faker.lorem().word());
    }

    @And("Kullanıcı message kutusuna {string} girer.")
    public void kullaniciMessageKutusunaGirer(String arg0) {
        contactPage.message_textBox.sendKeys(faker.lorem().paragraph());
    }


    @And("Kullanıcı send message butonuna tıklar")
    public void kullaniciSendMessageButonunaTiklar() {
        Driver.clickWithJS(contactPage.sendMessage_Button);
    }


    @And("Kullanıcı bir saniye bekler")
    public void kullanıcıBirSaniyeBekler() throws InterruptedException {
        Thread.sleep(2000);
    }

    @And("Kullanıcı mesajın iletildiğine dair pop-up mesajını görüntüler.")
    public void kullaniciMesajinIletildigineDairPopUpMesajiniGörüntuler() {
        Assert.assertTrue(contactPage.successfully_alert_css.isDisplayed());
    }

    @And("Kullanıcı mesajın iletilemediğini doğrular.")
    public void kullanıcıMesajınIletilemediğiniDoğrular() {
        Assert.assertTrue(!contactPage.successfully_alert_css.isDisplayed());
    }
}