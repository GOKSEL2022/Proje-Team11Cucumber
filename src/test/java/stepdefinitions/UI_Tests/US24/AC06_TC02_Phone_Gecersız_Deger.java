package stepdefinitions.UI_Tests.US24;

import io.cucumber.java.en.And;
import pages.TeacherPage;

public class AC06_TC02_Phone_Gecersız_Deger {
    @And("Kuullanıcı Phone textboxına geçersiz değer girer.")
    public void kullanıcıPhoneTextboxınaGecersizDegerGirer() {
        TeacherPage teacherPage = new TeacherPage();
        teacherPage.phoneNumber_box_teacher.sendKeys("asc-321-!qw2");
    }
}
