package stepdefinitions.UI_Tests.US13;

import io.cucumber.java.en.And;
import pages.TeacherPage;
import utilities.ReusableMethods;

public class AC11_TC01 {
    TeacherPage teacherPage = new TeacherPage();
    @And("Kullanıcı User Name textboxını boş bırakır.")
    public void kullanıcıUserNameTextboxınıBosBırakır() {
        teacherPage.username_box_teacher.sendKeys(" ");
        ReusableMethods.waitFor(1);

    }
}


