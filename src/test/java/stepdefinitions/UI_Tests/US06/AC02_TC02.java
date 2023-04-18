package stepdefinitions.UI_Tests.US06;

import io.cucumber.java.en.When;
import pages.DeanViceDeanPage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AC02_TC02 {
    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();
    @When("Nilufer Name alanina {string} girmeyerek bos birakir")
    public void Nilufer_kullanici_name_alanina_girmeyerek_bos_birakir(String string) {
       deanViceDeanPage.Admin_Vice_Dean_Name.sendKeys(string);
    }
    @When("Nilufer Surname alanina tiklar")
    public void Nilufer_kullanici_surname_alanina_tiklar() {
       deanViceDeanPage.Admin_Vice_Dean_Surname.click();
    }

    @When("Nilufer Name alani altinda Required mesajini gorur")
    public void Nilufer_kullanici_name_alani_altinda_required_mesajini_gorur() {
        ReusableMethods.waitFor(5);
        assertTrue(deanViceDeanPage.Admin_Vice_Dean_Name_Error_Message.isDisplayed());
        ReusableMethods.waitFor(5);
    }

    @When("Nilufer Name alani altinda hata mesaji goruntulenmemelidir")
    public void Nilufer_kullanici_name_alani_altinda_hata_mesaji_goruntulenmemelidir() {
        ReusableMethods.waitFor(5);
      assertFalse(deanViceDeanPage.Admin_Vice_Dean_Name_Error_Message.isDisplayed());
        ReusableMethods.waitFor(5);
    }
}
