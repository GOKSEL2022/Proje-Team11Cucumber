package stepdefinitions.UI_Tests.US15;

import io.cucumber.java.en.And;
import pages.Vice_DeanPage;
import utilities.ConfigReader;

public class TC09_gecersizemail {
    Vice_DeanPage vice_deanPage = new Vice_DeanPage();
    @And("Fatih gecersiz bir mail adresi girer")
    public void FatihGecersizBirMailAdresiGirer() {
        vice_deanPage.student_email.sendKeys(ConfigReader.getProperty("student_gecersizemail"));

    }
}
