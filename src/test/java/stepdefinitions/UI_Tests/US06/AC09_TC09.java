package stepdefinitions.UI_Tests.US06;

import io.cucumber.java.en.And;
import pages.DeanViceDeanPage;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class AC09_TC09 {
    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();
    @And("Nilufer User Name alanina {string} girmeyerek bos birakir")
    public void kullanici_user_name_alanina_girmeyerek_bos_birakir(String string) {
          deanViceDeanPage.Admin_Vice_Dean_Username.sendKeys(string);
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer Password alanina tiklar")
    public void kullanici_password_alanina_tiklar() {
         deanViceDeanPage.Admin_Vice_Dean_Password.click();
        ReusableMethods.waitFor(2);
    }
    @And("Nilufer User Name alani altinda Required mesajini gorur")
    public void kullanici_user_name_alani_altinda_required_mesajini_gorur() {
        assertEquals(8, deanViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);

    }
    @And("Nilufer User Name alani altinda hata mesaji goruntulenmemelidir")
    public void kullanici_user_name_alani_altinda_hata_mesaji_goruntulenmemelidir() {
        assertEquals(7, deanViceDeanPage.requiredAbsente_text_studentInfo.size());
        ReusableMethods.waitFor(2);
    }
}
