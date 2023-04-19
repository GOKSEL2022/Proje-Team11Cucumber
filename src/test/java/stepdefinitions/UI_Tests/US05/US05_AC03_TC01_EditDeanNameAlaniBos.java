package stepdefinitions.UI_Tests.US05;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.Admin_ManagementPage;
import pages.DeanManagementPage;
import pages.EditDeanPage;
import utilities.Driver;

public class US05_AC03_TC01_EditDeanNameAlaniBos {
    

    public static void withActionsEditTextBox(WebElement element, String text) {
    }

    Actions actions = new Actions(Driver.getDriver());
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Admin_ManagementPage admin_managementPage = new Admin_ManagementPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    EditDeanPage editDeanPage = new EditDeanPage();
    int ssnNo1 = Faker.instance().number().numberBetween(100,999);
    int ssnNo2= Faker.instance().number().numberBetween(10,99);
    int ssnNo3 = Faker.instance().number().numberBetween(1000,9999);
    int phoneNo1= Faker.instance().number().numberBetween(100,999);
    int phoneNo2= Faker.instance().number().numberBetween(100,999);
    int phoneNo3 = Faker.instance().number().numberBetween(1000,9999);
    Faker faker = new Faker();

    @And("Alı Dean List alanindaki Edit butonuna tiklar")
    public void AlıDeanListAlanindakiEditButonunaTiklar() throws InterruptedException {

        //editDeanPage.edit_Button_Team_Hasan.click();
        Driver.clickWithJS(editDeanPage.edit_Button_Team_Hasan);
        Thread.sleep(1000);
        Assert.assertTrue(editDeanPage.edit_Button_Team_Hasan.isDisplayed());
        Thread.sleep(1000);

    }

    @And("Alı Edit Dean bolumunun acildigini gorur")
    public void AlıEditDeanBolumununAcildiginiGorur() throws InterruptedException {
        Assert.assertTrue(editDeanPage.text_Edit_Dean.isDisplayed());
        Thread.sleep(1000);
    }

        @And("Alı Name alanini siler.")
        public void AlıNameAlaniniSiler (){

                Actions actions = new Actions(Driver.getDriver());  //TEXTBOXSILME
                actions.click(editDeanPage.name_Edit_Dean);
                actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
                actions.sendKeys(Keys.BACK_SPACE).perform();
                editDeanPage.name_Edit_Dean.sendKeys("sevilay");
            }
    // Driver.waitAndSendText(editDeanPage.name_Edit_Dean,"name");
    // while(!editDeanPage.name_Edit_Dean.getAttribute("value").equals("")){
    //     editDeanPage.name_Edit_Dean.sendKeys(Keys.BACK_SPACE);
    // }
    //     editDeanPage.name_Edit_Dean.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    //  editDeanPage.name_Edit_Dean.sendKeys("123");



        @Then("Alı Edit Dean alaninda name textboxinin altinda Required uyari mesajini gorur kaydi gorulur")
        public void AlıEditDeanAlanindaNameTextboxininAltindaRequiredUyariMesajiniGorurKaydiGorulur () {
            Assert.assertTrue(editDeanPage.Required_edit_Dean_Name.isDisplayed());


        }

    @And("Genderalanindan female checkboxina tiklar.")
    public void genderalanindanFemaleCheckboxinaTiklar() {
       Driver.clickWithJS(editDeanPage.female_Checkbox_Edit_Dean);
    }

    @And("Alı password {string} alanina gecerli sifre girer")
    public void AlıPasswordAlaninaGecerliSifreGirer(String arg0) {
        editDeanPage.password_Edit_Dean.sendKeys(arg0);

    }

    @When("Alı Edit Dean alanindaki Submit butonuna tiklar")
    public void AlıEditDeanAlanindakiSubmitButonunaTiklar() {
        Driver.clickWithJS(editDeanPage.submit_Button_Edit_Dean);
    }


}
