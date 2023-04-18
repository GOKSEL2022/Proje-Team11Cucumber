package stepdefinitions.UI_Tests.US13;

import io.cucumber.java.en.And;
import pages.TeacherPage;
import utilities.ReusableMethods;

public class AC09_TC02 {
    TeacherPage teacherPage = new TeacherPage();
    @And("Kullanıcı Date of Birth kutusuna geçersiz değer girilir.")
    public void kullanıcıDateOfBirthKutusunaGecersizDegerGirilir() {
        teacherPage.birthDay_box_teacher.sendKeys("06.05.0001");
        ReusableMethods.waitFor(1);
    }
}


