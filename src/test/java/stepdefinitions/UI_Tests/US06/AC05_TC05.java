package stepdefinitions.UI_Tests.US06;

import io.cucumber.java.en.And;
import pages.DeanViceDeanPage;
import utilities.ReusableMethods;

public class AC05_TC05 {
    DeanViceDeanPage deanViceDeanPage = new DeanViceDeanPage();
    @And("Nilufer Gender alanini bos birakir")
    public void kullanici_gender_alanini_bos_birakir() {
        ReusableMethods.waitFor(2);

    }
    @And("Nilufer Submit butonuna tiklayamaz")
    public void kullanici_submit_butonuna_tiklayamaz() {
          deanViceDeanPage.Admin_Vice_Dean_Submit_Button.click();
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Phone alanina valid bir {string} girer")
    public void niluferPhoneAlaninaValidBirGirer(String arg0) {
        deanViceDeanPage.Admin_Vice_Dean_PhoneNumber.sendKeys(arg0);
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Date Of Birth alanina valid bir {string} girer")
    public void niluferDateOfBirthAlaninaValidBirGirer(String arg0) {
        deanViceDeanPage.Admin_Vice_Dean_Date_Of_Birth.sendKeys(arg0);
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Ssn alanina valid bir {string} girer")
    public void niluferSsnAlaninaValidBirGirer(String arg0) {
        deanViceDeanPage.Admin_Vice_Dean_Ssn.sendKeys(arg0);
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer User Name alanina valid bir {string} girer")
    public void niluferUserNameAlaninaValidBirGirer(String arg0) {
        deanViceDeanPage.Admin_Vice_Dean_Username.sendKeys(arg0);
        ReusableMethods.waitFor(2);
    }

    @And("Nilufer Password alanina valid bir {string} girer")
    public void niluferPasswordAlaninaValidBirGirer(String arg0) {
        deanViceDeanPage.Admin_Vice_Dean_Password.sendKeys(arg0);
        ReusableMethods.waitFor(2);
    }
}
