package stepdefinitions.UI_Tests.US15;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import pages.Vice_DeanPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class TC_Submit {

    Vice_DeanPage vice_deanPage = new Vice_DeanPage();
    @And("Kullanici submit butonuna tiklar")
    public void kullaniciSubmitButonunaTiklar() throws IOException {


        ReusableMethods.clickByJS(vice_deanPage.student_submit);
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshotElement("fth",vice_deanPage.student_saved_successfully);

        System.out.println(vice_deanPage.student_saved_successfully.getText());

        try {
            Assert.assertTrue( vice_deanPage.student_saved_successfully.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail("Element not found: " + vice_deanPage.student_saved_successfully);
        }
        ReusableMethods.waitFor(1);




    }
}
