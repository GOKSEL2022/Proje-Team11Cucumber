package stepdefinitions.UI_Tests.US06;

import io.cucumber.java.en.When;
import pages.DeanViceDeanPage;

public class AC05_TC05 {
    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();
    @When("Nilufer Gender alanini bos birakir")
    public void kullanici_gender_alanini_bos_birakir() {

    }
    @When("Nilufer Submit butonuna tiklayamaz")
    public void kullanici_submit_butonuna_tiklayamaz() {
          deanViceDeanPage.Admin_Vice_Dean_Submit_Button.click();
    }
}
