package stepdefinitions.UI_Tests.US06;

import io.cucumber.java.en.And;
import pages.DeanViceDeanPage;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class AC08_TC08 {
    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();

    @And("Nilufer User Name alanina tiklar")
    public void kullanici_user_name_alanina_tiklar() {
       deanViceDeanPage.Admin_Vice_Dean_Username.click();
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Ssn alani altinda Required mesajini gorur")
    public void kullanici_ssn_alani_altinda_required_mesajini_gorur() {
        assertEquals(8, deanViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);

    }
    @And("Nilufer Ssn alani altinda hata mesaji goruntulenmemelidir")
    public void kullanici_ssn_alani_altinda_hata_mesaji_goruntulenmemelidir() {
        assertEquals(7, deanViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Ssn alanina Ssn girmeyerek bos birakir")
    public void niluferSsnAlaninaSsnGirmeyerekBosBirakir() {
        deanViceDeanPage.Admin_Vice_Dean_Ssn.click();
        ReusableMethods.waitFor(2);
    }
}
