package stepdefinitions.UI_Tests.US24;

import io.cucumber.java.en.And;
import pages.TeacherPage;
import utilities.ReusableMethods;

public class AC09_TC02_Date_of_Birth_Gecersiz_Deger {
    TeacherPage teacherPage = new TeacherPage();
    @And("Kuullanıcı Date of Birth kutusuna geçersiz değer girilir.")
    public void kullanıcıDateOfBirthKutusunaGecersizDegerGirilir() {
        teacherPage.birthDay_box_teacher.sendKeys("06.05.0001");
        ReusableMethods.waitFor(1);
    }
}
