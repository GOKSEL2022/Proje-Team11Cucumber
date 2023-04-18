package stepdefinitions.UI_Tests.US24;

import io.cucumber.java.en.And;
import pages.TeacherPage;
import utilities.ReusableMethods;

public class AC08_TC01_Gender {
    @And("Kuullanıcı Gender seçeneklerinden seçim yapmaz.")
    public void kullanıcıGenderSeceneklerindenSecimYapmaz() {
        TeacherPage teacherPage = new TeacherPage();
        teacherPage.male_checkBox_teacher.click();
        ReusableMethods.waitFor(1);
        teacherPage.male_checkBox_teacher.click();
        ReusableMethods.waitFor(1);
    }
}
