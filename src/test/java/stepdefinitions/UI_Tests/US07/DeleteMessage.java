package stepdefinitions.UI_Tests.US07;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DeanPage;

public class DeleteMessage {

    DeanPage deanPage = new DeanPage();
    @Then("Kullanıcı sayfada Contact message bölümünü dogrular.")
    public void kullanıcıSayfadaContactMessageBölümünüDogrular() {
        Assert.assertTrue(deanPage.contact_message_header.isDisplayed());
    }

    @Then("Kullanıcı sayfada delete butonu olduğunu dogrular.")
    public void kullanıcıSayfadaDeleteButonuOlduğunuDogrular() {
    }

    @Then("Kullanıcı mesajı siler.")
    public void kullanıcıMesajıSiler() {
    }

    @Then("Kullanıcı mesajın silindiğini doğrular.")
    public void kullanıcıMesajınSilindiğiniDoğrular() {
    }
}
