package stepdefinitions.UI_Tests.US23;

import io.cucumber.java.en.And;
import pages.AdminViceDeanPage;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class AC06_TC06 {
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();
    @And("Nilufer Date Of Birth alanina {string} girmeyerek bos birak")
    public void date_of_birth_alanina_girmeyerek_bos_birak(String string) {
        adminViceDeanPage.Admin_Vice_Dean_Date_Of_Birth.sendKeys(string);
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Phone alanina tikla")
    public void phone_alanina_tikla() {
        adminViceDeanPage.Admin_Vice_Dean_PhoneNumber.click();
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Date Of Birth alani altinda Required mesajini gor")
    public void date_of_birth_alani_altinda_required_mesajini_gor() {
        assertEquals(8, adminViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Date Of Birth alanina valid bir {string} gir")
    public void niluferDateOfBirthAlaninaValidBirGir(String arg0) {
        adminViceDeanPage.Admin_Vice_Dean_Date_Of_Birth.sendKeys(arg0);
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Date Of Birth alani altinda hata mesaji goruntulenmemeli")
    public void niluferDateOfBirthAlaniAltindaHataMesajiGoruntulenmemeli() {

        assertEquals(7, adminViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);
    }
}