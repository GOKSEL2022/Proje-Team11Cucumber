package stepdefinitions.UI_Tests.US24;

import io.cucumber.java.en.And;
import pages.TeacherPage;

public class AC09_TC01_Date_of_Birth {
    TeacherPage teacherPage = new TeacherPage();
    @And("Kuullanıcı Gender seçeneklerinden seçim yapar.")
    public void kullanıcıGenderSeceneklerindenSecimYapar() {
        teacherPage.male_checkBox_teacher.click();
    }

    @And("Kuullanıcı Date of Birth kutusunu boş bırakır.")
    public void kullanıcıDateOfBirthKutusunuBosBırakır() {
        teacherPage.birthDay_box_teacher.sendKeys(" ");
    }
}
