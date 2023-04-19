package stepdefinitions.UI_Tests.US15;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import pages.Vice_DeanPage;
import utilities.ConfigReader;

public class TC16_ssn {

    Vice_DeanPage vice_deanPage = new Vice_DeanPage();
    Faker faker = new Faker();
    @And("Fatih ssn alanina gecerli formatta bir numara girer")
    public void FatihSsnAlaninaGecerliFormattaBirNumaraGirer() {

        int ssnNo1 = Faker.instance().number().numberBetween(100,999);
        int ssnNo2= Faker.instance().number().numberBetween(10,99);
        int ssnNo3 = Faker.instance().number().numberBetween(1000,9999);
        vice_deanPage.student_ssn.sendKeys(ssnNo1+"-"+ssnNo2+"-"+ssnNo3);

    }
}
