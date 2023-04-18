package stepdefinitions.UI_Tests.US24;

import io.cucumber.java.en.And;
import pages.TeacherPage;
import utilities.ReusableMethods;

public class AC10_TC02_Ssn_Gecersiz_Deger {
    TeacherPage teacherPage = new TeacherPage();
    @And("Kuullanıcı Ssn textboxına geçersiz değer girer.")
    public void kullanıcıSsnTextboxınaGecersizDegerGirer() {
        teacherPage.ssn_box_teacher.sendKeys("abc-456-!^+SS");
        ReusableMethods.waitFor(1);

    }
}
