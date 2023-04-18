package stepdefinitions.UI_Tests.US24;

import io.cucumber.java.en.And;
import pages.TeacherPage;

public class AC06_TC01_Phone_Bos_Birakilir {
    @And("Kuullanıcı Phone textboxını boş bırakır")
    public void kullanıcıPhoneTextboxınıBosBırakır() {
        TeacherPage teacherPage = new TeacherPage();
        teacherPage.phoneNumber_box_teacher.sendKeys(" ");
    }
}
