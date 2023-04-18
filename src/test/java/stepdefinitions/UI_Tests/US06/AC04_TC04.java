package stepdefinitions.UI_Tests.US06;

import io.cucumber.java.en.When;
import pages.DeanViceDeanPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AC04_TC04 {
    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();
    @When("Kullanici Birth Place alanina {string} girmeyerek bos birakir")
    public void kullanici_birth_place_alanina_girmeyerek_bos_birakir(String string) {
      deanViceDeanPage.Admin_Vice_Dean_BirthPlace.sendKeys(string);
    }
    @When("Kullanici Gender alanina tiklar")
    public void kullanici_gender_alanina_tiklar() {
        deanViceDeanPage.Admin_Vice_Dean_Female_Radio_Button.click();

    }
    @When("Kullanici Birth Place alani altinda Required mesajini gorur")
    public void kullanici_birth_place_alani_altinda_required_mesajini_gorur() {
        assertTrue(deanViceDeanPage.Admin_Vice_Dean_BirthPlace_Error_Message.isDisplayed());

    }
    @When("Kullanici Birth Place alani altinda hata mesaji goruntulenmemelidir")
    public void kullanici_birth_place_alani_altinda_hata_mesaji_goruntulenmemelidir() {
        assertFalse(deanViceDeanPage.Admin_Vice_Dean_BirthPlace_Error_Message.isDisplayed());
    }
}