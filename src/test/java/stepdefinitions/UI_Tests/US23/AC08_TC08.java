package stepdefinitions.UI_Tests.US23;

import io.cucumber.java.en.And;
import pages.AdminViceDeanPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AC08_TC08 {
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();
    @And("Nilufer Ssn alanina {string} girmeyerek bos birak")
    public void ssn_alanina_girmeyerek_bos_birak(String string) {
        adminViceDeanPage.Admin_Vice_Dean_Ssn.sendKeys(string);
    }
    @And("Nilufer User Name alanina tikla")
    public void user_name_alanina_tikla() {
        adminViceDeanPage.Admin_Vice_Dean_Username.click();
    }
    @And("Nilufer Ssn alani altinda Required mesajini gor")
    public void ssn_alani_altinda_required_mesajini_gor() {
        assertTrue(adminViceDeanPage.Admin_Vice_Dean_Ssn_Error_Message.isDisplayed());
    }
    @And("Nilufer Ssn alanina valid bir {string} gir")
    public void niluferSsnAlaninaValidBirGir(String arg0) {
        adminViceDeanPage.Admin_Vice_Dean_Ssn.sendKeys(arg0);
    }
    @And("Nilufer Ssn alani altinda hata mesaji goruntulenmemeli")
    public void ssn_alani_altinda_hata_mesaji_goruntulenmemeli() {
        assertFalse(adminViceDeanPage.Admin_Vice_Dean_Ssn_Error_Message.isDisplayed());
    }

}
