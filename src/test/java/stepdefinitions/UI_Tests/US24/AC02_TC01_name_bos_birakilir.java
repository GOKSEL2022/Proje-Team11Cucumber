package stepdefinitions.UI_Tests.US24;

import io.cucumber.java.en.And;
import org.apache.poi.ss.formula.functions.T;
import pages.TeacherPage;
import utilities.ReusableMethods;

public class AC02_TC01_name_bos_birakilir {
    TeacherPage teacherPage = new TeacherPage();
    @And("Kuullanıcı Name textboxını boş bırakır.")
    public void kullanıcıNameTextboxınıBosBırakır() {
        teacherPage.name_box_teacher.sendKeys(" ");
        ReusableMethods.waitFor(1);

    }
}
