package stepdefinitions.UI_Tests.US15;

import io.cucumber.java.en.And;
import pages.Vice_DeanPage;
import utilities.ConfigReader;

public class TC18_fathername {
    Vice_DeanPage vice_deanPage = new Vice_DeanPage();
    @And("Fatih fathername alanina bir isim girer")
    public void FatihFathernameAlaninaBirIsimGirer() {
        vice_deanPage.student_fathername.sendKeys(ConfigReader.getProperty("student_fathername"));

    }
}
