package stepdefinitions.UI_Tests.US25;

import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.Vice_DeanPage;
import utilities.ConfigReader;

public class Admin_Login {

    Vice_DeanPage vice_deanPage = new Vice_DeanPage();
    LoginPage loginPage = new LoginPage();


    @When("Fatih admin User Name bilgisini girer")
    public void Fatih_admin_user_name_bilgisini_girer() {

        loginPage.username_Box_Login.sendKeys(ConfigReader.getProperty("admin_username"));
    }
    @When("Fatih  admin en az sekiz karakterli bir Password bilgisini girer")
    public void Fatih_admin_en_az_sekiz_karakterli_bir_password_bilgisini_girer() {

        loginPage.password_Box_Login.sendKeys(ConfigReader.getProperty("admin_password"));
    }

}
