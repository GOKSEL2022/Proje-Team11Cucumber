package stepdefinitions.UI_Tests.US18;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.StudentInfoPage;

import utilities.ReusableMethods;

public class AC03_DeleteNotStepDefs {
    StudentInfoPage studentInfoPage = new StudentInfoPage();
    @And("kullanici55 delete buton a tiklar")
    public void kullanici55DeleteButonATiklar() {
        studentInfoPage.deleteButton_studentInfo.click();

    }

    @And("kullanici55 ogrencinin not bilgisinin silindigini gorur\\(popup cikar)")
    public void kullanici55OgrencininNotBilgisininSilindiginiGorurPopupCikar() {
        try {
            Assert.assertTrue( studentInfoPage.delete_alert_text_studentInfo.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail("Element not found: " + studentInfoPage.delete_alert_text_studentInfo);
        }
        ReusableMethods.waitFor(1);


    }
}
