package stepdefinitions.UI_Tests.US06;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.DeanViceDeanPage;
import pages.RegisterPage;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class AC02_TC02 {
    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();

    @And("Nilufer Surname alanina tiklar")
    public void Nilufer_kullanici_surname_alanina_tiklar() {
       deanViceDeanPage.Admin_Vice_Dean_Surname.click();
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Name alani altinda Required mesajini gorur")
    public void Nilufer_kullanici_name_alani_altinda_required_mesajini_gorur() {
      assertEquals(8, deanViceDeanPage.requiredAbsente_text_studentInfo.size());
    }
    @And("Nilufer Name alanina valid bir {string} girer")
    public void niluferNameAlaninaValidBirGirer(String arg0) {
        deanViceDeanPage.Admin_Vice_Dean_Name.sendKeys(arg0);
    }
    @And("Nilufer Name alani altinda hata mesaji goruntulenmemelidir")
    public void Nilufer_kullanici_name_alani_altinda_hata_mesaji_goruntulenmemelidir() {
        assertEquals(7, deanViceDeanPage.requiredAbsente_text_studentInfo.size());
    }


    @And("Nilufer Name alanina Name girmeyerek bos birakir")
    public void niluferNameAlaninaNameGirmeyerekBosBirakir() {
        deanViceDeanPage.Admin_Vice_Dean_Name.click();
    }
}
