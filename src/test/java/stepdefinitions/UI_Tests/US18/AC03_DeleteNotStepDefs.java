package stepdefinitions.UI_Tests.US18;

import io.cucumber.java.en.And;
import pages.StudentInfoPage;
import utilities.ReusableMethods;

public class AC03_DeleteNotStepDefs {
    StudentInfoPage studentInfoPage = new StudentInfoPage();
    @And("kullanici delete buton a tiklar")
    public void kullaniciDeleteButonATiklar() {
        studentInfoPage.deleteButton_studentInfo.click();

    }

    @And("kullanici ogrencinin not bilgisinin silindigini gorur\\(popup cikar)")
    public void kullaniciOgrencininNotBilgisininSilindiginiGorurPopupCikar() {
        ReusableMethods.verifyElementDisplayed(studentInfoPage.delete_alert_studentInfo);

    }
}
