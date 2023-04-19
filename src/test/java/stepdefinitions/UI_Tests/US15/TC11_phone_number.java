package stepdefinitions.UI_Tests.US15;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import pages.Vice_DeanPage;


public class TC11_phone_number {
    Vice_DeanPage vice_deanPage = new Vice_DeanPage();

    Faker faker = new Faker();

    @And("Fatih phone alanina gecerli bir phone numarasi girer")
    public void FatihPhoneAlaninaGecerliBirPhoneNumarasiGirer() {
        int phoneNo1= Faker.instance().number().numberBetween(100,999);

        int phoneNo2= Faker.instance().number().numberBetween(100,999);
        int phoneNo3 = Faker.instance().number().numberBetween(1000,9999);



      vice_deanPage.student_phone_number.sendKeys(phoneNo1+"-"+phoneNo2+"-"+phoneNo3);
    }
}
