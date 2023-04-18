package stepdefinitions.UI_Tests.US24;

import io.cucumber.java.en.And;
import pages.TeacherPage;

public class AC05_TC02_Email_Gecersiz_Deger {
    @And("Kuullanıcı Email textboxına geçersiz değer girer.")
    public void kullanıcıEmailTextboxınaGecersizDegerGirer() {
        TeacherPage teacherPage = new TeacherPage();
        teacherPage.email_box_teacher.sendKeys("mertdogan123");
    }
}
