package stepdefinitions.UI_Tests.US23;

import io.cucumber.java.en.And;
import pages.AdminViceDeanPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AC06_TC06 {
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();
    @And("Nilufer Date Of Birth alanina {string} girmeyerek bos birak")
    public void date_of_birth_alanina_girmeyerek_bos_birak(String string) {
        adminViceDeanPage.Admin_Vice_Dean_Date_Of_Birth.sendKeys(string);
    }
    @And("Nilufer Phone alanina tikla")
    public void phone_alanina_tikla() {
        adminViceDeanPage.Admin_Vice_Dean_PhoneNumber.click();
    }
    @And("Nilufer Date Of Birth alani altinda Required mesajini gor")
    public void date_of_birth_alani_altinda_required_mesajini_gor() {
        assertTrue(adminViceDeanPage.Admin_Vice_Dean_BirthPlace_Error_Message.isDisplayed());
    }
    @And("Nilufer Date Of Birth alanina valid bir {string} gir")
    public void niluferDateOfBirthAlaninaValidBirGir(String arg0) {
        adminViceDeanPage.Admin_Vice_Dean_Date_Of_Birth.sendKeys(arg0);
    }
    @And("Nilufer Date Of Birth alani altinda hata mesaji goruntulenmemeli")
    public void niluferDateOfBirthAlaniAltindaHataMesajiGoruntulenmemeli() {

        assertFalse(adminViceDeanPage.Admin_Vice_Dean_BirthPlace_Error_Message.isDisplayed());
    }
}