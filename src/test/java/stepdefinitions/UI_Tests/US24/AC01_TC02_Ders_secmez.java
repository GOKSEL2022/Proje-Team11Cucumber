package stepdefinitions.UI_Tests.US24;

import io.cucumber.java.en.And;
import pages.TeacherPage;
import pages.ViceDeanTeacherPage;

public class AC01_TC02_Ders_secmez {
   TeacherPage teacherPage = new TeacherPage();
    @And("Kuullanıcı açılan listeden belirtilen dersi seçmez.")
    public void kuullanıcıAcılanListedenBelirtilenDersiSecmez() {
        teacherPage.chooseLessons_dropBox_teacher.click();
    }

    @And("Kuullanıcı  Surname textboxına geçerli bir değer girer")
    public void kuullanıcıSurnameTextboxınaGecerliBirDegerGirer(String string) {
        teacherPage.surname_box_teacher.sendKeys("dogan");
    }
}
