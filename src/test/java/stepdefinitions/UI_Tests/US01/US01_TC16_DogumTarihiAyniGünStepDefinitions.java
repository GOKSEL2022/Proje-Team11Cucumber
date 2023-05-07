package stepdefinitions.UI_Tests.US01;

import io.cucumber.java.en.And;
import pages.RegisterPage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class US01_TC16_DogumTarihiAyniGünStepDefinitions {
    RegisterPage registerPage=new RegisterPage();

    @And("Goksel Date Of Birt {string} ayni gün girer")
    public void gokselDateOfBirtAyniGünGirer(String string) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = dtf1.format(currentDate);
        registerPage.dateOfBirth_Box_Register.sendKeys(formattedDate+"");
    }
}
