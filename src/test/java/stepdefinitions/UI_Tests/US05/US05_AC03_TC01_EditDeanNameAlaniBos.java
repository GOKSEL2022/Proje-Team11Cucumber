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

    EditDeanPage editDeanPage = new EditDeanPage();
    int ssnNo1 = Faker.instance().number().numberBetween(100, 999);
    int ssnNo2 = Faker.instance().number().numberBetween(10, 99);
    int ssnNo3 = Faker.instance().number().numberBetween(1000, 9999);
    int phoneNo1 = Faker.instance().number().numberBetween(100, 999);
    int phoneNo2 = Faker.instance().number().numberBetween(100, 999);
    int phoneNo3 = Faker.instance().number().numberBetween(1000, 9999);
    Faker faker = new Faker();

    @And("Ali Dean List alanindaki Edit butonuna tiklar")
    public void AlıDeanListAlanindakiEditButonunaTiklar() throws InterruptedException {

        //editDeanPage.edit_Button_Team_Hasan.click();
        Driver.clickWithJS(editDeanPage.edit_Button_Team_Hasan);
        Thread.sleep(1000);
        Assert.assertTrue(editDeanPage.edit_Button_Team_Hasan.isDisplayed());
        Thread.sleep(1000);

    }

    @And("Ali Edit Dean bolumunun acildigini gorur")
    public void AlıEditDeanBolumununAcildiginiGorur() throws InterruptedException {
        Assert.assertTrue(editDeanPage.text_Edit_Dean.isDisplayed());
        Thread.sleep(1000);
    }

    @And("Ali Name alanini siler.")
    public void AlıNameAlaniniSiler() throws InterruptedException {

                  Actions actions = new Actions(Driver.getDriver());  //TEXTBOXSILME
                 actions.click(editDeanPage.name_Edit_Dean);
                 actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
                 actions.sendKeys(Keys.BACK_SPACE).perform();
                 editDeanPage.name_Edit_Dean.sendKeys("");
                 Thread.sleep(2000);
    }
    // Driver.waitAndSendText(editDeanPage.name_Edit_Dean,"name");
    // while(!editDeanPage.name_Edit_Dean.getAttribute("value").equals("")){
    //     editDeanPage.name_Edit_Dean.sendKeys(Keys.BACK_SPACE);
    // }editDeanPage.name_Edit_Dean.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
    //     editDeanPage.name_Edit_Dean.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    //  editDeanPage.name_Edit_Dean.sendKeys("123");


    @And("Ali Edit Dean alaninda name textboxinin altinda Required uyari mesajini gorur kaydi gorulur")
    public void AlıEditDeanAlanindaNameTextboxininAltindaRequiredUyariMesajiniGorurKaydiGorulur() throws InterruptedException {
        Assert.assertTrue(editDeanPage.Required_edit_Dean_Name.isDisplayed());
        Thread.sleep(1000);
    }


    @And("Genderalanindan female checkboxina tiklar.")
    public void genderalanindanFemaleCheckboxinaTiklar() throws InterruptedException {
        Driver.clickWithJS(editDeanPage.female_Checkbox_Edit_Dean);
        Thread.sleep(1000);

    }

    @And("Ali password {string} alanina gecerli sifre girer")
    public void AlıPasswordAlaninaGecerliSifreGirer(String arg0) throws InterruptedException {
        editDeanPage.password_Edit_Dean.sendKeys(arg0);
        Thread.sleep(1000);

    }

    @Then("Ali Edit Dean alanindaki Submit butonuna tiklar")
    public void AlıEditDeanAlanindakiSubmitButonunaTiklar() throws InterruptedException {
        Driver.clickWithJS(editDeanPage.submit_Button_Edit_Dean);
        Thread.sleep(1000);
    }

    }



