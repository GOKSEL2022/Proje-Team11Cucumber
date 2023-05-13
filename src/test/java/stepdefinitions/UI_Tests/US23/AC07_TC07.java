package stepdefinitions.UI_Tests.US23;

import io.cucumber.java.en.And;
import pages.AdminViceDeanPage;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class AC07_TC07 {
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();
    @And("Nilufer Ssn alanina tikla")
    public void ssn_alanina_tikla() {
        adminViceDeanPage.Admin_Vice_Dean_Ssn.click();
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Phone alani altinda Required mesajini gor")
    public void phone_alani_altinda_required_mesajini_gor() {
        assertEquals(8, adminViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Phone alanina valid bir {string} gir")
    public void niluferPhoneAlaninaValidBirGir(String arg0) {
        adminViceDeanPage.Admin_Vice_Dean_PhoneNumber.sendKeys(arg0);
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Phone alani altinda hata mesaji goruntulenmemeli")
    public void phone_alani_altinda_hata_mesaji_goruntulenmemeli() {
        assertEquals(7, adminViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Phone alanina Phone girmeyerek bos birak")
    public void niluferPhoneAlaninaPhoneGirmeyerekBosBirak() {
        adminViceDeanPage.Admin_Vice_Dean_PhoneNumber.click();
        ReusableMethods.waitFor(2);
    }
}