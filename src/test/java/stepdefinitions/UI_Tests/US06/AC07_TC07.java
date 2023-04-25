package stepdefinitions.UI_Tests.US06;

import io.cucumber.java.en.And;
import pages.DeanViceDeanPage;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class AC07_TC07 {
    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();
    @And("Nilufer Phone alanina {string} girmeyerek bos birakir")
    public void kullanici_phone_alanina_girmeyerek_bos_birakir(String string) {
       deanViceDeanPage.Admin_Vice_Dean_PhoneNumber.sendKeys(string);
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Ssn alanina tiklar")
    public void kullanici_ssn_alanina_tiklar() {
         deanViceDeanPage.Admin_Vice_Dean_Ssn.click();
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Phone alani altinda Required mesajini gorur")
    public void kullanici_phone_alani_altinda_required_mesajini_gorur() {
        assertEquals(8, deanViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Phone alani altinda hata mesaji goruntulenmemelidir")
    public void kullanici_phone_alani_altinda_hata_mesaji_goruntulenmemelidir() {
        assertEquals(7, deanViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);
    }
}
