package stepdefinitions.UI_Tests.US03;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ContactPage;


public class AC02_MailBoxCheck {

    ContactPage contactPage = new ContactPage();
    Faker faker = new Faker();

    @Then("Kullanıcı Email kutusuna tıklar.")
    public void kullaniciEmailKutusunaTiklar() {
        contactPage.yourEmail_textBox.click();
    }

    @And("Kullanıcı mail kutusuna invalid değer olarak {string} girer")
    public void kullaniciMailKutusunaInvalidDegerOlarakGirer(String arg0) {
        contactPage.yourEmail_textBox.sendKeys(faker.name().lastName()+"@"+faker.name().lastName());
    }

    @And("Kullanıcı mesajın iletilmediğini doğrular.")
    public void kullaniciMesajinIletilmediginiDogrular() {
        Assert.assertTrue(contactPage.mail_alert.isDisplayed());
     // Assert.assertTrue(!contactPage.successfully_alert_css.isDisplayed());
    }



    @And("Kullanıcı mail kutusuna valid değer olarak {string} girer")
    public void kullaniciMailKutusunaValidDegerOlarakGirer(String arg0) {
        contactPage.yourEmail_textBox.sendKeys(faker.internet().emailAddress());
    }

    @And("Kullanıcı mail kutusuna invalid değer olarak testmailcom girer")
    public void kullanıcıMailKutusunaInvalidDeğerOlarakTestmailcomGirer() {
        contactPage.yourEmail_textBox.sendKeys("testmailcom");
    }



    @And("Kullanıcı mail kutusuna invalid olarak testmail.com girer")
    public void kullanıcıMailKutusunaInvalidOlarakTestmailComGirer() {
        contactPage.yourEmail_textBox.sendKeys("testmail.com");
    }

    @And("Kullanıcı mesajın iletilmediğinii doğrular.")
    public void kullanıcıMesajınIletilmediğiniiDoğrular() {
        Assert.assertTrue(!contactPage.successfully_alert_css.isDisplayed());
    }
}
