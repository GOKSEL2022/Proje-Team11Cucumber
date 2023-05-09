package stepdefinitions.UI_Tests.US01;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegisterPage;

public class US01_TC15_DateOfBirthGecersizTarihStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    int gun= Faker.instance().number().numberBetween(1,29);
    int ay= Faker.instance().number().numberBetween(1,12);
    int yil= Faker.instance().number().numberBetween(1900,1915);
    @And("Goksel Date Of Birt {string} girer.")
    public void GokselDateOfBirtGirer(String string) {
        registerPage.dateOfBirth_Box_Register.sendKeys(gun+"."+ay+"."+yil);
    }
    @Then("Goksel Register olmadıgını goruntuler")
    public void GokselRegisterOlmadıgınıgoruntuler() {
        Assert.assertFalse(!registerPage.alert_Register.isDisplayed());
    }
}
