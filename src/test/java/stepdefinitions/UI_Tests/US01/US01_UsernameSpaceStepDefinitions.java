package stepdefinitions.UI_Tests.US01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegisterPage;

public class US01_UsernameSpaceStepDefinitions {
    RegisterPage registerPage=new RegisterPage();
    @And("Goksel User Name {string} girer.")
    public void GokselUserNameGirer(String string) {
        registerPage.username_Box_Register.sendKeys(Keys.SPACE,Keys.SPACE,Keys.SPACE);
    }
}
