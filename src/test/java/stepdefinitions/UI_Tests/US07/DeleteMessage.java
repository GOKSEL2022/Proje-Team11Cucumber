package stepdefinitions.UI_Tests.US07;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DeanPage;

public class DeleteMessage {

    DeanPage deanPage = new DeanPage();
    @Then("rabia sayfada Contact message bölümünü dogrular.")
    public void rabiaSayfadaContactMessageBölümünüDogrular() {
        Assert.assertTrue(deanPage.contact_message_header.isDisplayed());
    }

    @Then("rabia sayfada delete butonu olduğunu dogrular.")
    public void rabiaSayfadaDeleteButonuOlduğunuDogrular() {
    }

    @Then("rabia mesajı siler.")
    public void rabiaMesajıSiler() {
    }

    @Then("rabia mesajın silindiğini doğrular.")
    public void rabiaMesajınSilindiğiniDoğrular() {
    }
}
