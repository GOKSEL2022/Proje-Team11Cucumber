package stepdefinitions.UI_Tests.US06;

import io.cucumber.java.en.And;
import pages.DeanViceDeanPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AC07_TC07 {
    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();
    @And("Nilufer Phone alanina {string} girmeyerek bos birakir")
    public void kullanici_phone_alanina_girmeyerek_bos_birakir(String string) {
       deanViceDeanPage.Admin_Vice_Dean_PhoneNumber.sendKeys(string);
    }
    @And("Nilufer Ssn alanina tiklar")
    public void kullanici_ssn_alanina_tiklar() {
         deanViceDeanPage.Admin_Vice_Dean_Ssn.click();
    }
    @And("Nilufer Phone alani altinda Required mesajini gorur")
    public void kullanici_phone_alani_altinda_required_mesajini_gorur() {
         assertTrue(deanViceDeanPage.Admin_Vice_Dean_PhoneNumber_Error_Message.isDisplayed());
    }
    @And("Nilufer Phone alani altinda hata mesaji goruntulenmemelidir")
    public void kullanici_phone_alani_altinda_hata_mesaji_goruntulenmemelidir() {
        assertFalse(deanViceDeanPage.Admin_Vice_Dean_PhoneNumber_Error_Message.isDisplayed());
    }
}
