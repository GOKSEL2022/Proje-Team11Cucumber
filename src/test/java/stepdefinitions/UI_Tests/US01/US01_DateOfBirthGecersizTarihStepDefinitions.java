package stepdefinitions.UI_Tests.US01;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegisterPage;

public class US01_DateOfBirthGecersizTarihStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    int gun= Faker.instance().number().numberBetween(1,29);
    int ay= Faker.instance().number().numberBetween(1,12);
    int yil= Faker.instance().number().numberBetween(1900,1915);
    @And("Kullanici Date Of Birt {string} girer.")
    public void kullaniciDateOfBirtGirer(String string) {
        registerPage.dateOfBirth_Box_Register.sendKeys(gun+"."+ay+"."+yil);
    }
    @Then("Kullanici Register olmadıgını görüntüler")
    public void kullaniciRegisterOlmadıgınıGörüntüler() {
        Assert.assertTrue(!registerPage.alert_Register.isDisplayed());
    }
}
