package stepdefinitions.UI_Tests.US15;

import io.cucumber.java.en.And;
import pages.Vice_DeanPage;

public class TC15_dateofbirth {
    Vice_DeanPage vice_deanPage = new Vice_DeanPage();
    @And("Fatih date of birth alanina gecerli bir tarih girer")
    public void FatihDateOfBirthAlaninaGecerliBirTarihGirer() {

        vice_deanPage.stufent_birtday.sendKeys("12011986");
    }
}
