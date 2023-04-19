package stepdefinitions.UI_Tests.US15;

import io.cucumber.java.en.And;
import pages.Vice_DeanPage;
import utilities.ConfigReader;

public class TC20_Password {
    Vice_DeanPage vice_deanPage = new Vice_DeanPage();
    @And("Fatih student icin password olusturur")
    public void FatihStudentIcinPasswordOlusturur() {
        vice_deanPage.student_password.sendKeys(ConfigReader.getProperty("student_password"));
    }
}
