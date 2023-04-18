package stepdefinitions.UI_Tests.US06;

import io.cucumber.java.en.When;
import pages.US06_Pages.DeanViceDeanPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AC08_TC08 {
    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();
    @When("Kullanici Ssn alanina {string} girmeyerek bos birakir")
    public void kullanici_ssn_alanina_girmeyerek_bos_birakir(String string) {
       deanViceDeanPage.Admin_Vice_Dean_Ssn.sendKeys(string);
    }
    @When("Kullanici User Name alanina tiklar")
    public void kullanici_user_name_alanina_tiklar() {
       deanViceDeanPage.Admin_Vice_Dean_Username.click();
    }
    @When("Kullanici Ssn alani altinda Required mesajini gorur")
    public void kullanici_ssn_alani_altinda_required_mesajini_gorur() {
        assertTrue(deanViceDeanPage.Admin_Vice_Dean_Ssn_Error_Message.isDisplayed());

    }
    @When("Kullanici Ssn alani altinda hata mesaji goruntulenmemelidir")
    public void kullanici_ssn_alani_altinda_hata_mesaji_goruntulenmemelidir() {
        assertFalse(deanViceDeanPage.Admin_Vice_Dean_Ssn_Error_Message.isDisplayed());
    }
}
