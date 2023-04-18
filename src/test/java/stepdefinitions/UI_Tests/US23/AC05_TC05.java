package stepdefinitions.UI_Tests.US23;

import io.cucumber.java.en.When;
import pages.AdminViceDeanPage;

public class AC05_TC05 {
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();
    @When("Nilufer Gender alanini bos birak")
    public void gender_alanini_bos_birak() {

    }
    @When("Nilufer Submit butonuna tiklayama")
    public void submit_butonuna_tiklayama() {
        adminViceDeanPage.Admin_Vice_Dean_Submit_Button.click();
    }
}