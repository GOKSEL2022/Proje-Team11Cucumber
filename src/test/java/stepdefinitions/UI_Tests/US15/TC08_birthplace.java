package stepdefinitions.UI_Tests.US15;

import io.cucumber.java.en.And;
import pages.Vice_DeanPage;
import utilities.ConfigReader;

public class TC08_birthplace {
    Vice_DeanPage vice_deanPage = new Vice_DeanPage();
    @And("Kullanici birt place alanina gecerli bir sehir ismi girer")
    public void kullaniciBirtPlaceAlaninaGecerliBirSehirIsmiGirer() {

        vice_deanPage.student_birthplace.sendKeys(ConfigReader.getProperty("student_birthplace"));
    }
}
