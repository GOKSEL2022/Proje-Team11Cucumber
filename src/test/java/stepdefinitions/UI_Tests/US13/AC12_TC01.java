package stepdefinitions.UI_Tests.US13;

import io.cucumber.java.en.And;
import pages.TeacherPage;
import utilities.ReusableMethods;

public class AC12_TC01 {
    TeacherPage teacherPage = new TeacherPage();
    @And("Kullanıcı Password textboxını boş bırakır.")
    public void kullanıcıPasswordTextboxınıBosBırakır() {
        teacherPage.password_box_teacher.sendKeys(" ");
        ReusableMethods.waitFor(1);
    }
}


