package stepdefinitions.UI_Tests.US24;

import io.cucumber.java.en.And;
import pages.TeacherPage;
import utilities.ReusableMethods;

public class AC10_TC01_Ssn_Bos_Birakilir {
    TeacherPage teacherPage = new TeacherPage();
    @And("Kuullanıcı Date of Birth kutusuna geçerli bir değer girer.")
    public void kullanıcıDateOfBirthKutusunaGecerliBirDegerGirer() {
        teacherPage.birthDay_box_teacher.sendKeys("22.04.1996");
        ReusableMethods.waitFor(1);
    }

    @And("Kuullanıcı Ssn textboxınu boş bırakır.")
    public void kullanıcıSsnTextboxınuBosBırakır() {
        teacherPage.ssn_box_teacher.sendKeys(" ");
        ReusableMethods.waitFor(1);
    }
}
