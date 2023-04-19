package stepdefinitions.UI_Tests.US23;

import io.cucumber.java.en.When;
import pages.AdminViceDeanPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AC03_TC03 {
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();
    @When("Nilufer Surname alanina {string} girmeyerek bos birak")
    public void surname_alanina_girmeyerek_bos_birak(String string) {
        adminViceDeanPage.Admin_Vice_Dean_Surname.sendKeys(string);
    }
    @When("Nilufer Birth Place alanina tikla")
    public void birth_place_alanina_tikla() {
        adminViceDeanPage.Admin_Vice_Dean_BirthPlace.click();
    }
    @When("Nilufer Surname alani altinda Required mesajini gor")
    public void surname_alani_altinda_required_mesajini_gor() {
        assertTrue(adminViceDeanPage.Admin_Vice_Dean_Surname_Error_Message.isDisplayed());
    }
    @When("Nilufer Surname alani altinda hata mesaji goruntulenmemeli")
    public void surname_alani_altinda_hata_mesaji_goruntulenmemeli() {
        assertFalse(adminViceDeanPage.Admin_Vice_Dean_Surname_Error_Message.isDisplayed());
    }
}
