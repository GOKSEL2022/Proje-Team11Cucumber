package stepdefinitions.UI_Tests.US09;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AdminManagementPage;
import pages.HomePage;
import pages.US08_Pages.ViceDeanLessonPage;

public class US09_TC01_StepDefinitions {
    ViceDeanLessonPage viceDeanLessonPage = new ViceDeanLessonPage();
    AdminManagementPage adminManagementPage = new AdminManagementPage();
    HomePage homePage = new HomePage();


    @And("Kullanici menu butonuna tiklar")
    public void kullaniciMenuButonunaTiklar() {
        adminManagementPage.menu_button_adminmanagement.click();

    }

    @And("Kullanici Lesson Managamente tiklar")
    public void kullaniciLessonManagamenteTiklar() {
        adminManagementPage.lessonManagament.click();

    }

    @Then("Kullanici eklenen Lesson lari gorur")
    public void kullaniciEklenenLessonLariGorur() {
        Assert.assertTrue(viceDeanLessonPage.lessonAdd.isDisplayed());

    }



}