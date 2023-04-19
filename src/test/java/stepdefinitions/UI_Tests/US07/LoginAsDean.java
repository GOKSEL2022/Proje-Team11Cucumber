package stepdefinitions.UI_Tests.US07;

import io.cucumber.java.en.And;
import pages.AddAdminPage;
import pages.DeanPage;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginAsDean {

    AddAdminPage addAdminPage = new AddAdminPage();
    DeanPage deanPage = new DeanPage();
    @And("rabia user name kutusuna dean username girer.")
    public void rabiaUserNameKutusunaDeanUsernameGirer() {
        addAdminPage.username_admin.sendKeys(ConfigReader.getProperty("dean_username"));

    }

    @And("rabia password kutusuna dean sifre girer.")
    public void rabiaPasswordKutusunaDeanSifreGirer() {
        addAdminPage.password_admin.sendKeys(ConfigReader.getProperty("dean_password"));
    }

    @And("rabia sayfayı kapatır.")
    public void rabiaSayfayıKapatır() {
        Driver.closeDriver();
    }
}
