package stepdefinitions.UI_Tests.US23;

import io.cucumber.java.en.And;
import pages.AdminViceDeanPage;
import utilities.ReusableMethods;

public class AC05_TC05 {
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();
    @And("Nilufer Gender alanini bos birak")
    public void gender_alanini_bos_birak() {

    }
    @And("Nilufer Submit butonuna tiklayama")
    public void submit_butonuna_tiklayama() {
        adminViceDeanPage.Admin_Vice_Dean_Submit_Button.click();
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Ssn alanina valid bir {string} gir")
    public void niluferSsnAlaninaValidBirGir(String arg0) {
        adminViceDeanPage.Admin_Vice_Dean_Ssn.sendKeys(arg0);
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Password alanina valid bir {string} gir")
    public void niluferPasswordAlaninaValidBirGir(String arg0) {
        adminViceDeanPage.Admin_Vice_Dean_Password.sendKeys(arg0);
        ReusableMethods.waitFor(2);
    }
}