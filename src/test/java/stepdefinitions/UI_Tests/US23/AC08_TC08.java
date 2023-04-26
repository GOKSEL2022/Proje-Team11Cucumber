package stepdefinitions.UI_Tests.US23;

import io.cucumber.java.en.And;
import pages.AdminViceDeanPage;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class AC08_TC08 {
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();
    @And("Nilufer Ssn alanina {string} girmeyerek bos birak")
    public void ssn_alanina_girmeyerek_bos_birak(String string) {
        adminViceDeanPage.Admin_Vice_Dean_Ssn.sendKeys(string);
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer User Name alanina tikla")
    public void user_name_alanina_tikla() {
        adminViceDeanPage.Admin_Vice_Dean_Username.click();
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Ssn alani altinda Required mesajini gor")
    public void ssn_alani_altinda_required_mesajini_gor() {
        assertEquals(8, adminViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Ssn alani altinda hata mesaji goruntulenmemeli")
    public void ssn_alani_altinda_hata_mesaji_goruntulenmemeli() {
        assertEquals(7, adminViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);
    }

}
