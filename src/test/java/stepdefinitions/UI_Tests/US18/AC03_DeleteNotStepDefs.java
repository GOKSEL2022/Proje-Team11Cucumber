package stepdefinitions.UI_Tests.US18;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.StudentInfoPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class AC03_DeleteNotStepDefs {
    StudentInfoPage studentInfoPage = new StudentInfoPage();
    @And("kullanici delete buton a tiklar")
    public void kullaniciDeleteButonATiklar() {
        studentInfoPage.deleteButton_studentInfo.click();

    }

    @And("kullanici ogrencinin not bilgisinin silindigini gorur\\(popup cikar)")
    public void kullaniciOgrencininNotBilgisininSilindiginiGorurPopupCikar() {
        try {
            Assert.assertTrue( studentInfoPage.delete_alert_text_studentInfo.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail("Element not found: " + studentInfoPage.delete_alert_text_studentInfo);
        }
        ReusableMethods.waitFor(1);


    }
}
