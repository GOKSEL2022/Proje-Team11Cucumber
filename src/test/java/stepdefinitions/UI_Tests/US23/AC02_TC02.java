package stepdefinitions.UI_Tests.US23;

import io.cucumber.java.en.And;
import pages.AdminViceDeanPage;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class AC02_TC02 {
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();

    @And("Nilufer Surname alanina tikla")
    public void Nilufer_kullanici_surname_alanina_tiklar() {
        adminViceDeanPage.Admin_Vice_Dean_Surname.click();
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Name alani altinda Required mesajini gor")
    public void Nilufer_kullanici_name_alani_altinda_required_mesajini_gorur() {
        assertEquals(8, adminViceDeanPage.requiredAbsente_text_studentInfo.size());
    }
    @And("Nilufer Name alanina valid bir {string} gir")
    public void niluferNameAlaninaValidBirGirer(String arg0) {
        adminViceDeanPage.Admin_Vice_Dean_Name.sendKeys(arg0);
    }
    @And("Nilufer Name alani altinda hata mesaji goruntulenmemeli")
    public void Nilufer_kullanici_name_alani_altinda_hata_mesaji_goruntulenmemelidir() {
        assertEquals(7, adminViceDeanPage.requiredAbsente_text_studentInfo.size());
    }


    @And("Nilufer Name alanina Name girmeyerek bos birak")
    public void niluferNameAlaninaNameGirmeyerekBosBirakir() {
        adminViceDeanPage.Admin_Vice_Dean_Name.click();
    }
}
