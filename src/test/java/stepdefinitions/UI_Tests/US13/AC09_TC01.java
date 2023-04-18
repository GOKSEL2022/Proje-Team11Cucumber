package stepdefinitions.UI_Tests.US13;

import io.cucumber.java.en.And;
import pages.TeacherPage;

public class AC09_TC01 {
    TeacherPage teacherPage = new TeacherPage();
    @And("Kullanıcı Gender seçeneklerinden seçim yapar.")
    public void kullanıcıGenderSeceneklerindenSecimYapar() {
        teacherPage.male_checkBox_teacher.click();
    }

    @And("Kullanıcı Date of Birth kutusunu boş bırakır.")
    public void kullanıcıDateOfBirthKutusunuBosBırakır() {
        teacherPage.birthDay_box_teacher.sendKeys(" ");
    }
}

