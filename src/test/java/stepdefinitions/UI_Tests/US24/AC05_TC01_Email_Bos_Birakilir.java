package stepdefinitions.UI_Tests.US24;

import io.cucumber.java.en.And;
import pages.TeacherPage;

public class AC05_TC01_Email_Bos_Birakilir {
    TeacherPage teacherPage = new TeacherPage();
    @And("Kuullanıcı Email textboxını boş bırakır.")
    public void kullanıcıEmailTextboxınıBosBırakır() {
        teacherPage.email_box_teacher.sendKeys(" ");
    }
}
