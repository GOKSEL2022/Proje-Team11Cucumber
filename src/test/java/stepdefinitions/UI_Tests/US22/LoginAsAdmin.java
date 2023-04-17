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

    @When("Kullanıcı Login linkine tıklar.")
    public void kullanıcıLoginLinkineTıklar() {
        addAdminPage.login_Link.click();

    }
    @And("Kullanıcı user name kutusuna tıklar.")
    public void kullanıcıUserNameKutusunaTıklar() {
        addAdminPage.username_Box_Login.click();
    }



    @And("Kullanıcı password kutusuna tıklar.")
    public void kullanıcıPasswordKutusunaTıklar() {
        addAdminPage.password_Box_Login.click();
    }



    @And("Kullanıcı login butonuna tıklar.")
    public void kullanıcıLoginButonunaTıklar() {
        addAdminPage.login_Button.click();
    }

    @Then("Kullanıcı Admin Management sayfasına erişir.")
    public void kullanıcıAdminManagementSayfasınaErişir() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("admin-management"));
    }


    @And("Kullanıcı user name kutusuna admin username girer.")
    public void kullanıcıUserNameKutusunaAdminUsernameGirer() {
        addAdminPage.username_admin.sendKeys(ConfigReader.getProperty("admin_username"));
    }

    @And("Kullanıcı password kutusuna admin sifre girer.")
    public void kullanıcıPasswordKutusunaAdminSifreGirer() {
        addAdminPage.password_admin.sendKeys(ConfigReader.getProperty("admin_password"));
    }
}
