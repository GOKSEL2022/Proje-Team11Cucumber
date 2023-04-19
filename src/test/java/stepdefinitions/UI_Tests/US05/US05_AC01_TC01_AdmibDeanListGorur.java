package stepdefinitions.UI_Tests.US05;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.Admin_ManagementPage;
import pages.DeanManagementPage;
import pages.EditDeanPage;

public class US05_AC01_TC01_AdmibDeanListGorur {
    
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Admin_ManagementPage admin_managementPage = new Admin_ManagementPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    EditDeanPage editDeanPage = new EditDeanPage();

    @Then("Alı Dean List alaninin goruldugunu dogrular")
    public void AlıDeanListAlanininGoruldugunuDogrular() {
        Assert.assertTrue(deanManagementPage.text_Dean_List.isDisplayed());
        System.out.println(deanManagementPage.text_Dean_List.getText());

        Assert.assertTrue(editDeanPage.header_Name_Surname.isDisplayed());
        System.out.println(editDeanPage.header_Name_Surname.getText());

        Assert.assertTrue(editDeanPage.header_Gender.isDisplayed());
        System.out.println(editDeanPage.header_Gender.getText());

        Assert.assertTrue(editDeanPage.header_Phone_Number.isDisplayed());
        System.out.println(editDeanPage.header_Phone_Number.getText());

        Assert.assertTrue(editDeanPage.header_Ssn.isDisplayed());
        System.out.println(editDeanPage.header_Ssn.getText());

        Assert.assertTrue(editDeanPage.header_User_Name.isDisplayed());
        System.out.println(editDeanPage.header_User_Name.getText());


    }
}
