package stepdefinitions.UI_Tests.US06;

import io.cucumber.java.en.When;
import pages.US06_Pages.DeanViceDeanPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AC09_TC09 {
    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();
    @When("Kullanici User Name alanina {string} girmeyerek bos birakir")
    public void kullanici_user_name_alanina_girmeyerek_bos_birakir(String string) {
          deanViceDeanPage.Admin_Vice_Dean_Username.sendKeys(string);
    }
    @When("Kullanici Password alanina tiklar")
    public void kullanici_password_alanina_tiklar() {
         deanViceDeanPage.Admin_Vice_Dean_Password.click();
    }
    @When("Kullanici User Name alani altinda Required mesajini gorur")
    public void kullanici_user_name_alani_altinda_required_mesajini_gorur() {
        assertTrue(deanViceDeanPage.Admin_Vice_Dean_Username_Error_Message.isDisplayed());

    }
    @When("Kullanici User Name alani altinda hata mesaji goruntulenmemelidir")
    public void kullanici_user_name_alani_altinda_hata_mesaji_goruntulenmemelidir() {
        assertFalse(deanViceDeanPage.Admin_Vice_Dean_Username_Error_Message.isDisplayed());
    }
}
