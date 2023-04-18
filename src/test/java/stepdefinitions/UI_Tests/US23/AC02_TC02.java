package stepdefinitions.UI_Tests.US23;

import io.cucumber.java.en.When;
import pages.AdminViceDeanPage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AC02_TC02 {
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();
    @When("Name alanina {string} girmeyerek bos birak")
    public void name_alanina_girmeyerek_bos_birak(String string) {
        adminViceDeanPage.Admin_Vice_Dean_Name.sendKeys(string);
    }
    @When("Surname alanina tikla")
    public void surname_alanina_tikla() {
        adminViceDeanPage.Admin_Vice_Dean_Surname.click();
    }
    @When("Name alani altinda Required mesajini gor")
    public void name_alani_altinda_required_mesajini_gor() {
        ReusableMethods.waitFor(5);
        assertTrue(adminViceDeanPage.Admin_Vice_Dean_Name_Error_Message.isDisplayed());
        ReusableMethods.waitFor(5);
    }
    @When("Name alani altinda hata mesaji goruntulenmemeli")
    public void name_alani_altinda_hata_mesaji_goruntulenmemeli() {
        ReusableMethods.waitFor(5);
        assertFalse(adminViceDeanPage.Admin_Vice_Dean_Name_Error_Message.isDisplayed());
        ReusableMethods.waitFor(5);
    }


}
