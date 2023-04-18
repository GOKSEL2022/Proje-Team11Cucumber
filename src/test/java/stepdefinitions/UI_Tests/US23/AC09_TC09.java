package stepdefinitions.UI_Tests.US23;

import io.cucumber.java.en.When;
import pages.AdminViceDeanPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AC09_TC09 {
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();
    @When("User Name alanina {string} girmeyerek bos birak")
    public void user_name_alanina_girmeyerek_bos_birak(String string) {
        adminViceDeanPage.Admin_Vice_Dean_Username.sendKeys(string);
    }
    @When("Password alanina tikla")
    public void password_alanina_tikla() {
        adminViceDeanPage.Admin_Vice_Dean_Password.click();
    }
    @When("User Name alani altinda Required mesajini gor")
    public void user_name_alani_altinda_required_mesajini_gor() {
        assertTrue(adminViceDeanPage.Admin_Vice_Dean_Username_Error_Message.isDisplayed());
    }
    @When("User Name alani altinda hata mesaji goruntulenmemeli")
    public void user_name_alani_altinda_hata_mesaji_goruntulenmemeli() {
        assertFalse(adminViceDeanPage.Admin_Vice_Dean_Username_Error_Message.isDisplayed());
    }
}
