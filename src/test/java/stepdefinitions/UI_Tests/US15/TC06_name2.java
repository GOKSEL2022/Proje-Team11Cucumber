package stepdefinitions.UI_Tests.US15;

import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import pages.Vice_DeanPage;
import utilities.ConfigReader;

import static org.junit.Assert.assertFalse;

public class TC06_name2 {
    Vice_DeanPage vice_deanPage = new Vice_DeanPage();
    @And("Fatih name alanina noktalama isareti girer")
    public void FatihNameAlaninaNoktalamaIsaretiGirer() {
        vice_deanPage.student_name.sendKeys(ConfigReader.getProperty("student_name_fake"));

    }

    @And("Fatih Required yazisinin kalkmadigini dogrular")
    public void FatihRequiredYazisininKalkmadiginiDogrular() {
        assertFalse(vice_deanPage.required1.isDisplayed());

    }
}
