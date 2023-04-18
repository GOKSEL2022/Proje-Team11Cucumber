package stepdefinitions.UI_Tests.US15;

import io.cucumber.java.en.And;
import pages.Vice_DeanPage;
import utilities.ConfigReader;

public class TC12_phone_gecersiznumber {
    Vice_DeanPage vice_deanPage = new Vice_DeanPage();
    @And("Kullanici phone alanina gecersiz bir numara yazar")
    public void kullaniciPhoneAlaninaGecersizBirNumaraYazar() {

        vice_deanPage.student_phone_number.sendKeys(ConfigReader.getProperty("student_phone_gecersiz"));

    }

}
