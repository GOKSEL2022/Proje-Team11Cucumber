package stepdefinitions.UI_Tests.US23;

import io.cucumber.java.en.When;
import pages.AdminViceDeanPage;

import static org.junit.Assert.assertTrue;

public class AC10_TC10 {
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();
    @When("Nilufer Password alanina {string} girmeyerek bos birak")
    public void Password_alanina_girmeyerek_bos_birakir(String string) {
        adminViceDeanPage.Admin_Vice_Dean_Password.sendKeys(string);
    }
    @When("Nilufer Password alani altinda Required mesajini gor")
    public void password_alani_altinda_required_mesajini_gor() {
        assertTrue(adminViceDeanPage.Admin_Vice_Dean_Password_Error_Message.isDisplayed());
    }
    @When("Nilufer Password alanina {string} olarak yedi karakter veri gir")
    public void password_alanina_olarak_yedi_karakter_veri_gir(String string) {
        adminViceDeanPage.Admin_Vice_Dean_Password.sendKeys(string);
    }
    @When("Nilufer Password alani altinda Minimum {int} character mesajini gor")
    public void password_alani_altinda_minimum_character_mesajini_gor(Integer int1) {
        assertTrue(adminViceDeanPage.Admin_Vice_Dean_Password_Error_Message.isDisplayed());
    }
}