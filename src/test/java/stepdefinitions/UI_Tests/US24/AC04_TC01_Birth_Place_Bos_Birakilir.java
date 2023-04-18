package stepdefinitions.UI_Tests.US24;

import io.cucumber.java.en.And;
import pages.TeacherPage;

public class AC04_TC01_Birth_Place_Bos_Birakilir {
    TeacherPage teacherPage = new TeacherPage();
    @And("Kuullanıcı Birth Place textboxını boş bırakır")
    public void kullanıcıBirthPlaceTextboxınıBosBırakır() {
        teacherPage.birthPlace_box_teacher.sendKeys(" ");
    }
}
