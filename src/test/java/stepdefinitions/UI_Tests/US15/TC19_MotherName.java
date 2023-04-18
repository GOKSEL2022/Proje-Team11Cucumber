package stepdefinitions.UI_Tests.US15;

import io.cucumber.java.en.And;
import pages.Vice_DeanPage;
import utilities.ConfigReader;

public class TC19_MotherName {
    Vice_DeanPage vice_deanPage = new Vice_DeanPage();
    @And("Kullanici mothername alanina bir isim girer")
    public void kullaniciMothernameAlaninaBirIsimGirer() {
        vice_deanPage.student_mothername.sendKeys(ConfigReader.getProperty("student_mothername"));
    }
}
