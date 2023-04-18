package stepdefinitions.UI_Tests.US13;

import io.cucumber.java.en.And;
import pages.TeacherPage;

public class AC06_TC01 {
    @And("Kullanıcı Phone textboxını boş bırakır")
    public void kullanıcıPhoneTextboxınıBosBırakır() {
        TeacherPage teacherPage = new TeacherPage();
        teacherPage.phoneNumber_box_teacher.sendKeys(" ");
    }
}


