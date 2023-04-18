package stepdefinitions.UI_Tests.US06;

import io.cucumber.java.en.When;
import pages.DeanViceDeanPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AC03_TC03 {
    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();
    @When("Kullanici Surname alanina {string} girmeyerek bos birakir")
    public void kullanici_surname_alanina_girmeyerek_bos_birakir(String string) {
      deanViceDeanPage.Admin_Vice_Dean_Surname.sendKeys(string);
    }
    @When("Kullanici Birth Place alanina tiklar")
    public void kullanici_birth_place_alanina_tiklar() {
        deanViceDeanPage.Admin_Vice_Dean_BirthPlace.click();

    }
    @When("Kullanici Surname alani altinda Required mesajini gorur")
    public void kullanici_surname_alani_altinda_required_mesajini_gorur() {
        assertTrue(deanViceDeanPage.Admin_Vice_Dean_Surname_Error_Message.isDisplayed());

    }
    @When("Kullanici Surname alani altinda hata mesaji goruntulenmemelidir")
    public void kullanici_surname_alani_altinda_hata_mesaji_goruntulenmemelidir() {
        assertFalse(deanViceDeanPage.Admin_Vice_Dean_Surname_Error_Message.isDisplayed());
    }
}
