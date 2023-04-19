package stepdefinitions.UI_Tests.US03;


import io.cucumber.java.en.And;
import pages.ContactPage;

public class AC04_MessageBoxCheck {
    ContactPage contactPage = new ContactPage();

    @And("rabia message kutusunu bos birakir.")
    public void rabiaMessageKutusunuBosBirakir() {
        contactPage.message_textBox.sendKeys("");
    }
}
