package stepdefinitions.UI_Tests.US22;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AddAdminPage;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginAsAdmin {

    AddAdminPage addAdminPage = new AddAdminPage();

    @When("rabia Login linkine tıklar.")
    public void rabiaLoginLinkineTıklar() {
        addAdminPage.login_Link.click();

    }
    @And("rabia user name kutusuna tıklar.")
    public void rabiaUserNameKutusunaTıklar() {
        addAdminPage.username_Box_Login.click();
    }



    @And("rabia password kutusuna tıklar.")
    public void rabiaPasswordKutusunaTıklar() {
        addAdminPage.password_Box_Login.click();
    }



    @And("rabia login butonuna tıklar.")
    public void rabiaLoginButonunaTıklar() {
        addAdminPage.login_Button.click();
    }

    @Then("rabia Admin Management sayfasına erişir.")
    public void rabiaAdminManagementSayfasınaErişir() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("admin-management"));
    }


    @And("rabia user name kutusuna admin username girer.")
    public void rabiaUserNameKutusunaAdminUsernameGirer() {
        addAdminPage.username_admin.sendKeys(ConfigReader.getProperty("admin_username"));
    }

    @And("rabia password kutusuna admin sifre girer.")
    public void rabiaPasswordKutusunaAdminSifreGirer() {
        addAdminPage.password_admin.sendKeys(ConfigReader.getProperty("admin_password"));
    }
}
