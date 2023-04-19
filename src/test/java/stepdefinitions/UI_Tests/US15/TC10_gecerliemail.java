package stepdefinitions.UI_Tests.US15;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import pages.Vice_DeanPage;
import utilities.ConfigReader;

public class TC10_gecerliemail {
    Vice_DeanPage vice_deanPage = new Vice_DeanPage();
    Faker faker =new Faker();
    @And("Fatih email alanina gecerli bir adres girer")
    public void FatihEmailAlaninaGecerliBirAdresGirer() {
        vice_deanPage.student_email.sendKeys(faker.internet().emailAddress());

    }
}
