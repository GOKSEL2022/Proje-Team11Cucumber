package stepdefinitions.UI_Tests.US13;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.TeacherPage;
import pages.ViceDeanTeacherPage;
import utilities.ReusableMethods;

public class AC01_TC02 {
    ViceDeanTeacherPage viceDeanTeacherPage = new ViceDeanTeacherPage();
    @Then("Kullanıcı açılan listeden belirtilen dersi seçmez.")
    public void kullanıcıAcılanListedenBelirtilenDersiSecmez() {

        viceDeanTeacherPage.vice_dean_chooseLessons_dropBox_teacher.click();
        ReusableMethods.waitFor(1);
    }
}


