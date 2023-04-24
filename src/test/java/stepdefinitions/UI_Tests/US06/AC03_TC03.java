package stepdefinitions.UI_Tests.US06;

import io.cucumber.java.en.And;
import pages.DeanViceDeanPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AC03_TC03 {
    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();
    @And("Nilufer Surname alanina {string} girmeyerek bos birakir")
    public void kullanici_surname_alanina_girmeyerek_bos_birakir(String string) {
      deanViceDeanPage.Admin_Vice_Dean_Surname.sendKeys(string);
    }
    @And("Nilufer Birth Place alanina tiklar")
    public void kullanici_birth_place_alanina_tiklar() {
        deanViceDeanPage.Admin_Vice_Dean_BirthPlace.click();

    }
    @And("Nilufer Surname alani altinda Required mesajini gorur")
    public void kullanici_surname_alani_altinda_required_mesajini_gorur() {
        assertTrue(deanViceDeanPage.Admin_Vice_Dean_Surname_Error_Message.isDisplayed());

    }
    @And("Nilufer Surname alanina valid bir {string} girer")
    public void niluferSurnameAlaninaValidBirGirer(String arg0) {
        deanViceDeanPage.Admin_Vice_Dean_Surname.sendKeys(arg0);
    }
    @And("Nilufer Surname alani altinda hata mesaji goruntulenmemelidir")
    public void kullanici_surname_alani_altinda_hata_mesaji_goruntulenmemelidir() {
        assertFalse(deanViceDeanPage.Admin_Vice_Dean_Surname_Error_Message.isDisplayed());
    }


}
