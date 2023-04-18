package stepdefinitions.UI_Tests.US13;

import io.cucumber.java.en.And;
import pages.ViceDeanTeacherPage;

public class AC03_TC01_Surname_Bos {
    ViceDeanTeacherPage viceDeanTeacherPage = new ViceDeanTeacherPage();
    @And("Kullanıcı  Surname textboxını boş bırakır.")
    public void kullanıcıSurnameTextboxınıBosBırakır(String string) {

        viceDeanTeacherPage.vice_surname_box_teacher.sendKeys(" ");

    }
}
