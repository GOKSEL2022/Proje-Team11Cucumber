package stepdefinitions.UI_Tests.US13;

import io.cucumber.java.en.And;
import pages.TeacherPage;

public class AC07_TC01 {
    @And("Kullanıcı  Is Advisor Teacher seçeneğini tıklamaz")
    public void kullanıcıIsAdvisorTeacherSeceneginiTıklamaz() {
        TeacherPage teacherPage = new TeacherPage();
        teacherPage.isAdvisorTeacher_checkBox_teacher.click();
    }
}


