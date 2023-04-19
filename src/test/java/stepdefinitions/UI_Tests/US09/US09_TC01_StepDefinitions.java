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


    @And("MDogan menu butonuna tiklar")
    public void MDoganMenuButonunaTiklar() {
        adminManagementPage.menu_button_adminmanagement.click();

    }

    @And("MDogan Lesson Managamente tiklar")
    public void MDoganLessonManagamenteTiklar() {
        adminManagementPage.lessonManagament.click();

    }

    @Then("MDogan eklenen Lesson lari gorur")
    public void MDoganEklenenLessonLariGorur() {
        Assert.assertTrue(adminManagementPage.lessonManagament.isDisplayed());

    }



}