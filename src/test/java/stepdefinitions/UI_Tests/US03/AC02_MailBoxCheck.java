package stepdefinitions.UI_Tests.US03;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ContactPage;


public class AC02_MailBoxCheck {

    ContactPage contactPage = new ContactPage();
    Faker faker = new Faker();

    @Then("rabia Email kutusuna tıklar.")
    public void rabiaEmailKutusunaTiklar() {
        contactPage.yourEmail_textBox.click();
    }

    @And("rabia mail kutusuna invalid değer olarak {string} girer")
    public void rabiaMailKutusunaInvalidDegerOlarakGirer(String arg0) {
        contactPage.yourEmail_textBox.sendKeys(faker.name().lastName()+"@"+faker.name().lastName());
    }

    @And("rabia mesajın iletilmediğini doğrular.")
    public void rabiaMesajinIletilmediginiDogrular() {
        Assert.assertTrue(contactPage.mail_alert.isDisplayed());
     // Assert.assertTrue(!contactPage.successfully_alert_css.isDisplayed());
    }



    @And("rabia mail kutusuna valid değer olarak {string} girer")
    public void rabiaMailKutusunaValidDegerOlarakGirer(String arg0) {
        contactPage.yourEmail_textBox.sendKeys(faker.internet().emailAddress());
    }

    @And("rabia mail kutusuna invalid değer olarak testmailcom girer")
    public void rabiaMailKutusunaInvalidDeğerOlarakTestmailcomGirer() {
        contactPage.yourEmail_textBox.sendKeys("testmailcom");
    }



    @And("rabia mail kutusuna invalid olarak testmail.com girer")
    public void rabiaMailKutusunaInvalidOlarakTestmailComGirer() {
        contactPage.yourEmail_textBox.sendKeys("testmail.com");
    }

    @And("rabia mesajın iletilmediğinii doğrular.")
    public void rabiaMesajınIletilmediğiniiDoğrular() {
        Assert.assertTrue(!contactPage.successfully_alert_css.isDisplayed());
    }
}
