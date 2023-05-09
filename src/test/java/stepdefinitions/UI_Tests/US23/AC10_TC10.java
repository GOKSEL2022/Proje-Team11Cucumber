package stepdefinitions.UI_Tests.US23;

import io.cucumber.java.en.And;
import pages.AdminViceDeanPage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AC10_TC10 {
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();
    @And("Nilufer Password alanina {string} girmeyerek bos birak")
    public void Password_alanina_girmeyerek_bos_birakir(String string) {
        adminViceDeanPage.Admin_Vice_Dean_Password.sendKeys(string);
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Password alani altinda Required mesajini gor")
    public void password_alani_altinda_required_mesajini_gor() {
        assertEquals(1, adminViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);
    }
}