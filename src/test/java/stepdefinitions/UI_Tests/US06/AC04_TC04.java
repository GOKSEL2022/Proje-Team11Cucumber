package stepdefinitions.UI_Tests.US06;

import io.cucumber.java.en.And;
import pages.DeanViceDeanPage;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class AC04_TC04 {
    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();

    @And("Nilufer Gender alanina tiklar")
    public void kullanici_gender_alanina_tiklar() {
        deanViceDeanPage.Admin_Vice_Dean_Female_Radio_Button.click();
        ReusableMethods.waitFor(2);

    }
    @And("Nilufer Birth Place alani altinda Required mesajini gorur")
    public void kullanici_birth_place_alani_altinda_required_mesajini_gorur() {
        assertEquals(8, deanViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);

    }
    @And("Nilufer Birth Place alanina valid bir {string} girer")
    public void niluferBirthPlaceAlaninaValidBirGirer(String arg0) {
        deanViceDeanPage.Admin_Vice_Dean_BirthPlace.sendKeys(arg0);
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Birth Place alani altinda hata mesaji goruntulenmemelidir")
    public void kullanici_birth_place_alani_altinda_hata_mesaji_goruntulenmemelidir() {
        assertEquals(7, deanViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);
    }


    @And("Nilufer Birth Place alanina Birth Place girmeyerek bos birakir")
    public void niluferBirthPlaceAlaninaBirthPlaceGirmeyerekBosBirakir() {
        deanViceDeanPage.Admin_Vice_Dean_BirthPlace.click();
        ReusableMethods.waitFor(2);
    }
}
