package stepdefinitions.UI_Tests.US03;


import io.cucumber.java.en.And;
import pages.ContactPage;

public class AC04_MessageBoxCheck {
    ContactPage contactPage = new ContactPage();

    @And("Kullanıcı message kutusunu bos birakir.")
    public void kullaniciMessageKutusunuBosBirakir() {
        contactPage.message_textBox.sendKeys("");
    }
}
