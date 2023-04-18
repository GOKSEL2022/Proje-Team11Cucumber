package stepdefinitions.UI_Tests.US06;

import io.cucumber.java.en.When;
import pages.US06_Pages.DeanViceDeanPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AC07_TC07 {
    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();
    @When("Kullanici Phone alanina {string} girmeyerek bos birakir")
    public void kullanici_phone_alanina_girmeyerek_bos_birakir(String string) {
       deanViceDeanPage.Admin_Vice_Dean_PhoneNumber.sendKeys(string);
    }
    @When("Kullanici Ssn alanina tiklar")
    public void kullanici_ssn_alanina_tiklar() {
         deanViceDeanPage.Admin_Vice_Dean_Ssn.click();
    }
    @When("Kullanici Phone alani altinda Required mesajini gorur")
    public void kullanici_phone_alani_altinda_required_mesajini_gorur() {
         assertTrue(deanViceDeanPage.Admin_Vice_Dean_PhoneNumber_Error_Message.isDisplayed());
    }
    @When("Kullanici Phone alani altinda hata mesaji goruntulenmemelidir")
    public void kullanici_phone_alani_altinda_hata_mesaji_goruntulenmemelidir() {
        assertFalse(deanViceDeanPage.Admin_Vice_Dean_PhoneNumber_Error_Message.isDisplayed());
    }
}
