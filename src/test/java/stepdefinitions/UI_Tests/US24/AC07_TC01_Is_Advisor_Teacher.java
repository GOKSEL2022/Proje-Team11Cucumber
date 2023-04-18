package stepdefinitions.UI_Tests.US24;

import io.cucumber.java.en.And;
import pages.TeacherPage;

public class AC07_TC01_Is_Advisor_Teacher {
    @And("Kuullanıcı  Is Advisor Teacher seçeneğini tıklamaz")
    public void kullanıcıIsAdvisorTeacherSeceneginiTıklamaz() {
        TeacherPage teacherPage = new TeacherPage();
        teacherPage.isAdvisorTeacher_checkBox_teacher.click();
    }
}
