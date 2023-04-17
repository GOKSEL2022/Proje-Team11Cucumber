package stepdefinitions.UI_Tests.US07;

import io.cucumber.java.en.And;
import pages.AddAdminPage;
import pages.DeanPage;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginAsDean {

    AddAdminPage addAdminPage = new AddAdminPage();
    DeanPage deanPage = new DeanPage();
    @And("Kullanıcı user name kutusuna dean username girer.")
    public void kullanıcıUserNameKutusunaDeanUsernameGirer() {
        addAdminPage.username_admin.sendKeys(ConfigReader.getProperty("dean_username"));

    }

    @And("Kullanıcı password kutusuna dean sifre girer.")
    public void kullanıcıPasswordKutusunaDeanSifreGirer() {
        addAdminPage.password_admin.sendKeys(ConfigReader.getProperty("dean_password"));
    }

    @And("Kullanıcı sayfayı kapatır.")
    public void kullanıcıSayfayıKapatır() {
        Driver.closeDriver();
    }
}
