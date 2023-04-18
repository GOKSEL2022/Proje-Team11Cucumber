package stepdefinitions.UI_Tests.US13;

import io.cucumber.java.en.And;
import pages.TeacherPage;

public class AC04_TC01 {
    TeacherPage teacherPage = new TeacherPage();
    @And("Kullanıcı Birth Place textboxını boş bırakır")
    public void kullanıcıBirthPlaceTextboxınıBosBırakır() {
        teacherPage.birthPlace_box_teacher.sendKeys(" ");
    }

    @And("Kullanıcı Password textboxına geçerli bir deger girer")
    public void kullanıcıPasswordTextboxınaGecerliBirDegerGirer() {
        teacherPage.password_box_teacher.sendKeys("12345678");
    }
}


