package stepdefinitions.UI_Tests.US06;

import io.cucumber.java.en.And;
import pages.DeanViceDeanPage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AC10_TC10 {

    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();
    @And("Nilufer Password alanina {string} girmeyerek bos birakir")
    public void Kullanici_Password_alanina_girmeyerek_bos_birakir(String string) {
      deanViceDeanPage.Admin_Vice_Dean_Password.sendKeys(string);
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Password alani altinda Required mesajini gorur")
    public void kullanici_password_alani_altinda_required_mesajini_gorur() {
        assertEquals(1, deanViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);
    }

}
