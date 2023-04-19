package stepdefinitions.UI_Tests.US15;

import io.cucumber.java.en.And;
import pages.Vice_DeanPage;

public class TC14_gender_male {
    Vice_DeanPage vice_deanPage = new Vice_DeanPage();
    @And("Fatih male butonuna tiklar")
    public void FatihMaleButonunaTiklar() {
        vice_deanPage.student_male.click();


    }
}
