package stepdefinitions.UI_Tests.US13;

import io.cucumber.java.en.And;
import pages.TeacherPage;

public class AC05_TC02 {
    @And("Kullanıcı Email textboxina gecersiz deger girer.")
    public void kullanıcıEmailTextboxinaGecersizDegerGirer() {
        TeacherPage teacherPage = new TeacherPage();
        teacherPage.email_box_teacher.sendKeys("mertdogan123");
    }
}


