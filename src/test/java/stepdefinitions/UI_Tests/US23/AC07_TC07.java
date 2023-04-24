package stepdefinitions.UI_Tests.US23;

import io.cucumber.java.en.And;
import pages.AdminViceDeanPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AC07_TC07 {
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();
    @And("Nilufer Phone alanina {string} girmeyerek bos birak")
    public void phone_alanina_girmeyerek_bos_birak(String string) {
        adminViceDeanPage.Admin_Vice_Dean_PhoneNumber.sendKeys(string);
    }
    @And("Nilufer Ssn alanina tikla")
    public void ssn_alanina_tikla() {
        adminViceDeanPage.Admin_Vice_Dean_Ssn.click();
    }
    @And("Nilufer Phone alani altinda Required mesajini gor")
    public void phone_alani_altinda_required_mesajini_gor() {
        assertTrue(adminViceDeanPage.Admin_Vice_Dean_PhoneNumber_Error_Message.isDisplayed());
    }
    @And("Nilufer Phone alanina valid bir {string} gir")
    public void niluferPhoneAlaninaValidBirGir(String arg0) {
        adminViceDeanPage.Admin_Vice_Dean_PhoneNumber.sendKeys(arg0);
    }
    @And("Nilufer Phone alani altinda hata mesaji goruntulenmemeli")
    public void phone_alani_altinda_hata_mesaji_goruntulenmemeli() {
        assertFalse(adminViceDeanPage.Admin_Vice_Dean_PhoneNumber_Error_Message.isDisplayed());
    }

}