package stepdefinitions.UI_Tests.US23;

import io.cucumber.java.en.And;
import pages.AdminViceDeanPage;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class AC09_TC09 {
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();
    @And("Nilufer User Name alanina {string} girmeyerek bos birak")
    public void user_name_alanina_girmeyerek_bos_birak(String string) {
        adminViceDeanPage.Admin_Vice_Dean_Username.sendKeys(string);
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Password alanina tikla")
    public void password_alanina_tikla() {
        adminViceDeanPage.Admin_Vice_Dean_Password.click();
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer User Name alani altinda Required mesajini gor")
    public void user_name_alani_altinda_required_mesajini_gor() {
        assertEquals(8, adminViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer User Name alanina valid bir {string} gir")
    public void niluferUserNameAlaninaValidBirGir(String arg0) {
        adminViceDeanPage.Admin_Vice_Dean_Username.sendKeys(arg0);
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer User Name alani altinda hata mesaji goruntulenmemeli")
    public void user_name_alani_altinda_hata_mesaji_goruntulenmemeli() {
        assertEquals(7, adminViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);
    }

}
