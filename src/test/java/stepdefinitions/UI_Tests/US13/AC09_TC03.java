package stepdefinitions.UI_Tests.US13;

import io.cucumber.java.en.And;
import pages.TeacherPage;
import utilities.ReusableMethods;

public class AC09_TC03 {
    TeacherPage teacherPage = new TeacherPage();
    @And("Kullanıcı Date of Birth kutusuna geçersiz farkli değer girilir.")
    public void kullanıcıDateOfBirthKutusunaGecersizFarkliDegerGirilir() {
        teacherPage.birthDay_box_teacher.sendKeys("6.05.9999");
        ReusableMethods.waitFor(1);
    }
}


