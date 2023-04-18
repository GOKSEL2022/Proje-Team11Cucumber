package stepdefinitions.UI_Tests.US13;

import io.cucumber.java.en.And;
import pages.TeacherPage;

public class AC05_TC01 {
    TeacherPage teacherPage = new TeacherPage();
    @And("Kullanıcı Email textboxını boş bırakır.")
    public void kullanıcıEmailTextboxınıBosBırakır() {
        teacherPage.email_box_teacher.sendKeys(" ");
    }
}


