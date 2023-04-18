package stepdefinitions.UI_Tests.US13;

import io.cucumber.java.en.And;
import org.openqa.selenium.support.PageFactory;
import pages.TeacherPage;
import pages.ViceDeanTeacherPage;
import utilities.ReusableMethods;

import javax.swing.*;
import java.awt.*;

public class AC10_TC01 {
    ViceDeanTeacherPage viceDeanTeacherPage = new ViceDeanTeacherPage();

    @And("Kullanıcı Date of Birth kutusuna geçerli bir değer girer.")
    public void kullanıcıDateOfBirthKutusunaGecerliBirDegerGirer() {
        viceDeanTeacherPage.vice_birthDay_box_teacher.sendKeys("22.04.1996");
        ReusableMethods.waitFor(4);
    }

    @And("Kullanıcı Ssn textboxınu boş bırakır.")
    public void kullanıcıSsnTextboxınuBosBırakır() {

        viceDeanTeacherPage.vice_ssn_box_teacher.sendKeys(" ");

        ReusableMethods.waitFor(3);
    }
}


