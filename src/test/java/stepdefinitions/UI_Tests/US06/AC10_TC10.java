package stepdefinitions.UI_Tests.US06;

import io.cucumber.java.en.When;
import pages.DeanViceDeanPage;

import static org.junit.Assert.assertTrue;

public class AC10_TC10 {

    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();
    @When("Kullanici Password alanina {string} girmeyerek bos birakir")
    public void Kullanici_Password_alanina_girmeyerek_bos_birakir(String string) {
      deanViceDeanPage.Admin_Vice_Dean_Password.sendKeys(string);
    }
    @When("Kullanici Password alani altinda Required mesajini gorur")
    public void kullanici_password_alani_altinda_required_mesajini_gorur() {
              assertTrue(deanViceDeanPage.Admin_Vice_Dean_Password_Error_Message.isDisplayed());
    }
    @When("Kullanici Password alanina {string} olarak yedi karakter veri girer")
    public void kullanici_password_alanina_olarak_yedi_karakter_veri_girer(String string) {
        deanViceDeanPage.Admin_Vice_Dean_Password.sendKeys(string);
    }
    @When("Kullanici Password alani altinda Minimum {int} character mesajini gorur")
    public void kullanici_password_alani_altinda_minimum_character_mesajini_gorur(Integer int1) {
        assertTrue(deanViceDeanPage.Admin_Vice_Dean_Password_Error_Message.isDisplayed());
    }
}
