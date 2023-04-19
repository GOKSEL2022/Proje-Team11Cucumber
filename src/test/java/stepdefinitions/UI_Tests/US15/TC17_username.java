package stepdefinitions.UI_Tests.US15;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import pages.Vice_DeanPage;
import utilities.ConfigReader;

public class TC17_username {
    Vice_DeanPage vice_deanPage = new Vice_DeanPage();
    Faker faker = new Faker();
    @And("Fatih ogrenci username girer")
    public void FatihOgrenciUsernameGirer() {
        vice_deanPage.student_username.sendKeys(faker.name().username());


    }
}
