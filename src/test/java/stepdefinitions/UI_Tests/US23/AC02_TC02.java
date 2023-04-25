package stepdefinitions.UI_Tests.US23;

import io.cucumber.java.en.And;
import pages.AdminViceDeanPage;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class AC02_TC02 {
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();
    @And("Nilufer Name alanina {string} girmeyerek bos birak")
    public void name_alanina_girmeyerek_bos_birak(String string) {
        adminViceDeanPage.Admin_Vice_Dean_Name.sendKeys(string);
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Surname alanina tikla")
    public void surname_alanina_tikla() {
        adminViceDeanPage.Admin_Vice_Dean_Surname.click();
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Name alani altinda Required mesajini gor")
    public void name_alani_altinda_required_mesajini_gor() {
        ReusableMethods.waitFor(5);
        assertEquals(8, adminViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(5);
    }
    @And("Nilufer Name alanina valid bir {string} gir")
    public void niluferNameAlaninaValidBirGir(String arg0) {
        adminViceDeanPage.Admin_Vice_Dean_Name.sendKeys(arg0);
    }
    @And("Nilufer Name alani altinda hata mesaji goruntulenmemeli")
    public void name_alani_altinda_hata_mesaji_goruntulenmemeli() {
        ReusableMethods.waitFor(5);
        assertEquals(7, adminViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(5);
    }


}
