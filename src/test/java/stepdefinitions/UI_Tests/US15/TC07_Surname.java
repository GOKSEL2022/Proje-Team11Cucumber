package stepdefinitions.UI_Tests.US15;

import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import pages.Vice_DeanPage;
import utilities.ConfigReader;

public class TC07_Surname {
    Vice_DeanPage vice_deanPage = new Vice_DeanPage();
    @And("Kullanici surname alanina gecerli bir isim girer")
    public void kullaniciSurnameAlaninaGecerliBirIsimGirer() {

        vice_deanPage.student_surname.sendKeys(ConfigReader.getProperty("student_surname"));

    }
}
