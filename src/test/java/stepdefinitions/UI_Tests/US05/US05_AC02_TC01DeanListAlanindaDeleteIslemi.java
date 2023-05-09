package stepdefinitions.UI_Tests.US05;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.Admin_ManagementPage;
import pages.DeanManagementPage;
import pages.EditDeanPage;
import utilities.Driver;
import utilities.ReusableMethods;


import java.io.IOException;
import java.time.LocalDateTime;

public class US05_AC02_TC01DeanListAlanindaDeleteIslemi {
    EditDeanPage editDeanPage = new EditDeanPage();
    int ssnNo1 = Faker.instance().number().numberBetween(100,999);
    int ssnNo2= Faker.instance().number().numberBetween(10,99);
    int ssnNo3 = Faker.instance().number().numberBetween(1000,9999);

    int phoneNo1= Faker.instance().number().numberBetween(100,999);

    int phoneNo2= Faker.instance().number().numberBetween(100,999);
    int phoneNo3 = Faker.instance().number().numberBetween(1000,9999);

    Faker faker = new Faker();

    Actions actions = new Actions(Driver.getDriver());

    @Then("Ali Delete butonunun olmadıgını dogrular")
    public void AlıDeleteButonununOlmadiginiDogrular() throws IOException {

        //Assert.assertFalse("Delete",false);
        Assert.assertFalse(editDeanPage.delete_Buton.isDisplayed());
        LocalDateTime currentTime =  LocalDateTime.now();
        ReusableMethods.getScreenshot("FAIL");




    }
}
