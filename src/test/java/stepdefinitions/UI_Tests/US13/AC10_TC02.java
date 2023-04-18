package stepdefinitions.UI_Tests.US13;

import io.cucumber.java.en.And;
import pages.TeacherPage;
import pages.ViceDeanTeacherPage;
import utilities.ReusableMethods;

public class AC10_TC02 {
    ViceDeanTeacherPage viceDeanTeacherPage = new ViceDeanTeacherPage();
    @And("Kullanıcı Ssn textboxına geçersiz değer girer.")
    public void kullanıcıSsnTextboxınaGecersizDegerGirer() {
        viceDeanTeacherPage.vice_ssn_box_teacher.sendKeys("abc-456-!^+SS");
        ReusableMethods.waitFor(1);
    }
}


