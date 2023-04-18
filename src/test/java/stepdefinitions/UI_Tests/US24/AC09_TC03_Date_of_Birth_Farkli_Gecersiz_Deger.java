package stepdefinitions.UI_Tests.US24;

import io.cucumber.java.en.And;
import pages.TeacherPage;
import utilities.ReusableMethods;

public class AC09_TC03_Date_of_Birth_Farkli_Gecersiz_Deger {
    TeacherPage teacherPage = new TeacherPage();
    @And("Kuullanıcı Date of Birth kutusuna geçersiz farkli değer girilir.")
    public void kullanıcıDateOfBirthKutusunaGecersizFarkliDegerGirilir() {
        teacherPage.birthDay_box_teacher.sendKeys("6.05.9999");
        ReusableMethods.waitFor(1);
    }
}
