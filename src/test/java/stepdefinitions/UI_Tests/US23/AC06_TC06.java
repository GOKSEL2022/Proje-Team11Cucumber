package stepdefinitions.UI_Tests.US23;

import io.cucumber.java.en.When;
import pages.US23_Pages.AdminViceDeanPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AC06_TC06 {
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();
    @When("Date Of Birth alanina {string} girmeyerek bos birak")
    public void date_of_birth_alanina_girmeyerek_bos_birak(String string) {
        adminViceDeanPage.Admin_Vice_Dean_Date_Of_Birth.sendKeys(string);
    }
    @When("Phone alanina tikla")
    public void phone_alanina_tikla() {
        adminViceDeanPage.Admin_Vice_Dean_PhoneNumber.click();
    }
    @When("Date Of Birth alani altinda Required mesajini gor")
    public void date_of_birth_alani_altinda_required_mesajini_gor() {
        assertTrue(adminViceDeanPage.Admin_Vice_Dean_BirthPlace_Error_Message.isDisplayed());
    }
    @When("Date Of Birth alani altinda hata mesaji goruntulenmemeli")
    public void date_of_birth_alani_altinda_hata_mesaji_goruntulenmemeli() {
        assertFalse(adminViceDeanPage.Admin_Vice_Dean_BirthPlace_Error_Message.isDisplayed());
    }
}