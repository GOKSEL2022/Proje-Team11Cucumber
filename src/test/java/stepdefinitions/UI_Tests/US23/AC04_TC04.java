package stepdefinitions.UI_Tests.US23;

import io.cucumber.java.en.And;
import pages.AdminViceDeanPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AC04_TC04 {
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();
    @And("Nilufer Birth Place alanina {string} girmeyerek bos birak")
    public void birth_place_alanina_girmeyerek_bos_birak(String string) {
        adminViceDeanPage.Admin_Vice_Dean_BirthPlace.sendKeys(string);
    }
    @And("Nilufer Gender alanina tikla")
    public void gender_alanina_tikla() {
        adminViceDeanPage.Admin_Vice_Dean_Female_Radio_Button.click();
    }
    @And("Nilufer Birth Place alani altinda Required mesajini gor")
    public void birth_place_alani_altinda_required_mesajini_gor() {
        assertTrue(adminViceDeanPage.Admin_Vice_Dean_BirthPlace_Error_Message.isDisplayed());
    }
    @And("Nilufer Birth Place alanina valid bir {string} gir")
    public void niluferBirthPlaceAlaninaValidBirGir(String arg0) {
        adminViceDeanPage.Admin_Vice_Dean_BirthPlace.sendKeys(arg0);
    }
    @And("Nilufer Birth Place alani altinda hata mesaji goruntulenmemeli")
    public void birth_place_alani_altinda_hata_mesaji_goruntulenmemeli() {
        assertFalse(adminViceDeanPage.Admin_Vice_Dean_BirthPlace_Error_Message.isDisplayed());
    }

}