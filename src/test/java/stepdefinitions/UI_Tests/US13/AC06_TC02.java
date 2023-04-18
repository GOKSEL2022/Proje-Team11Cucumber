package stepdefinitions.UI_Tests.US13;

import io.cucumber.java.en.And;
import pages.TeacherPage;

public class AC06_TC02 {
    @And("Kullanıcı Phone textboxına geçersiz değer girer.")
    public void kullanıcıPhoneTextboxınaGecersizDegerGirer() {
        TeacherPage teacherPage = new TeacherPage();
        teacherPage.phoneNumber_box_teacher.sendKeys("asc-321-!qw2");
    }
}


