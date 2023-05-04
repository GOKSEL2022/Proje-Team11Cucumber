package stepdefinitions.UI_Tests.US23;

import io.cucumber.java.en.And;
import pages.AdminViceDeanPage;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class AC03_TC03 {
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();

    @And("Nilufer Birth Place alanina tikla")
    public void birth_place_alanina_tikla() {
        adminViceDeanPage.Admin_Vice_Dean_BirthPlace.click();
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Surname alani altinda Required mesajini gor")
    public void surname_alani_altinda_required_mesajini_gor() {
        assertEquals(8, adminViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Surname alanina valid bir {string} gir")
    public void niluferSurnameAlaninaValidBirGir(String arg0) {
        adminViceDeanPage.Admin_Vice_Dean_Surname.sendKeys(arg0);
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Surname alani altinda hata mesaji goruntulenmemeli")
    public void surname_alani_altinda_hata_mesaji_goruntulenmemeli() {
        assertEquals(7, adminViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);
    }


    @And("Nilufer Surname alanina Surname girmeyerek bos birak")
    public void niluferSurnameAlaninaSurnameGirmeyerekBosBirak() {
        adminViceDeanPage.Admin_Vice_Dean_Surname.click();
        ReusableMethods.waitFor(2);
    }
}
