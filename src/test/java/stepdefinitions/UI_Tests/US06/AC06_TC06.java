package stepdefinitions.UI_Tests.US06;

import io.cucumber.java.en.And;
import pages.DeanViceDeanPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AC06_TC06 {
    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();
    @And("Nilufer Date Of Birth alanina {string} girmeyerek bos birakir")
    public void kullanici_date_of_birth_alanina_girmeyerek_bos_birakir(String string) {
       deanViceDeanPage.Admin_Vice_Dean_Date_Of_Birth.sendKeys(string);
    }
    @And("Nilufer Phone alanina tiklar")
    public void kullanici_phone_alanina_tiklar() {
      deanViceDeanPage.Admin_Vice_Dean_PhoneNumber.click();
    }
    @And("Nilufer Date Of Birth alani altinda Required mesajini gorur")
    public void kullanici_date_of_birth_alani_altinda_required_mesajini_gorur() {
       assertTrue(deanViceDeanPage.Admin_Vice_Dean_BirthPlace_Error_Message.isDisplayed());
    }
    @And("Nilufer Date Of Birth alani altinda hata mesaji goruntulenmemelidir")
    public void kullanici_date_of_birth_alani_altinda_hata_mesaji_goruntulenmemelidir() {
        assertFalse(deanViceDeanPage.Admin_Vice_Dean_BirthPlace_Error_Message.isDisplayed());
    }
}
