package stepdefinitions.UI_Tests.US24;

import io.cucumber.java.en.And;
import pages.TeacherPage;
import utilities.ReusableMethods;

public class AC12_TC01_Password {
    TeacherPage teacherPage = new TeacherPage();
    @And("Kuullanıcı Password textboxını boş bırakır.")
    public void kullanıcıPasswordTextboxınıBosBırakır() {
        teacherPage.password_box_teacher.sendKeys(" ");
        ReusableMethods.waitFor(1);
    }
}
