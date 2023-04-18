package stepdefinitions.UI_Tests.US13;
import io.cucumber.java.en.And;
import pages.ViceDeanTeacherPage;
import utilities.ReusableMethods;

public class AC02_TC01 {
    ViceDeanTeacherPage viceDeanTeacherPage = new ViceDeanTeacherPage();
    @And("Kullanıcı Name textboxını boş bırakır.")
    public void kullanıcıNameTextboxınıBosBırakır(String string) {

        viceDeanTeacherPage.vice_name_box_teacher.click();
        ReusableMethods.waitFor(1);

    }
}


