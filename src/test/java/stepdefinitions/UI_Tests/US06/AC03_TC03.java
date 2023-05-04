package stepdefinitions.UI_Tests.US06;

import io.cucumber.java.en.And;
import pages.DeanViceDeanPage;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class AC03_TC03 {
    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();

    @And("Nilufer Birth Place alanina tiklar")
    public void kullanici_birth_place_alanina_tiklar() {
        ReusableMethods.waitFor(1);
        deanViceDeanPage.Admin_Vice_Dean_BirthPlace.click();
        ReusableMethods.waitFor(2);

    }
    @And("Nilufer Surname alani altinda Required mesajini gorur")
    public void kullanici_surname_alani_altinda_required_mesajini_gorur() {
        assertEquals(8, deanViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);

    }
    @And("Nilufer Surname alanina valid bir {string} girer")
    public void niluferSurnameAlaninaValidBirGirer(String arg0) {
        deanViceDeanPage.Admin_Vice_Dean_Surname.sendKeys(arg0);
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Surname alani altinda hata mesaji goruntulenmemelidir")
    public void kullanici_surname_alani_altinda_hata_mesaji_goruntulenmemelidir() {
        assertEquals(7, deanViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);
    }


    @And("Nilufer Surname alanina Surname girmeyerek bos birakir")
    public void niluferSurnameAlaninaSurnameGirmeyerekBosBirakir() {
        deanViceDeanPage.Admin_Vice_Dean_Surname.click();
        ReusableMethods.waitFor(1);
    }
}
