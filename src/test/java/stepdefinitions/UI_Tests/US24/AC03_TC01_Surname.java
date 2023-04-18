package stepdefinitions.UI_Tests.US24;

import io.cucumber.java.en.And;
import pages.ViceDeanTeacherPage;

public class AC03_TC01_Surname {
    ViceDeanTeacherPage viceDeanTeacherPage = new ViceDeanTeacherPage();
    @And("Kuullanıcı  Surname textboxını boş bırakır.")
    public void kuullanıcıSurnameTextboxınıBosBırakır() {
        viceDeanTeacherPage.vice_surname_box_teacher.sendKeys(" ");
    }
}
