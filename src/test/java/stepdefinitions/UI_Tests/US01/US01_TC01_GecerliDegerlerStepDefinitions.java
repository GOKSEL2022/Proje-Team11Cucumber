package stepdefinitions.UI_Tests.US01;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US01_TC01_GecerliDegerlerStepDefinitions {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    int ssnNo1 = Faker.instance().number().numberBetween(100, 999);
    int ssnNo2 = Faker.instance().number().numberBetween(10, 99);
    int ssnNo3 = Faker.instance().number().numberBetween(1000, 9999);
    int phoneNo1 = Faker.instance().number().numberBetween(100, 999);
    int phoneNo2 = Faker.instance().number().numberBetween(100, 999);
    int phoneNo3 = Faker.instance().number().numberBetween(1000, 9999);
    int password = Faker.instance().number().numberBetween(10000000, 99999999);
    int gun = Faker.instance().number().numberBetween(1, 29);
    int ay = Faker.instance().number().numberBetween(1, 12);
    int yil = Faker.instance().number().numberBetween(1940, 2000);

    @Given("Goksel {string} gider")
    public void GokselGider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschools"));
    }

    @Then("Goksel anasayfanın acildigini goruntuler")
    public void GokselAnasayfanınAcildiginiGoruntuler() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("http://139.59.159.36:3000/"));
    }
    @And("Goksel bir sn bekler")
    public void GokselBirSnBekler() throws InterruptedException {
        Thread.sleep(1000);
    }
    @And("Goksel Register butonunun sayfada yer aldigini goruntuler")
    public void GokselRegisterButonununSayfadaYerAldiginiGoruntuler() {
        Assert.assertTrue(homePage.register_Button_Home.isDisplayed());
    }
    @And("Goksel Register butonuna tiklar")
    public void GokselRegisterButonunaTiklar() {
        homePage.register_Button_Home.click();
    }

    @And("Goksel Register menusunun altinda doldurulacak alanlari goruntuler")
    public void GokselRegisterMenusununAltindaDoldurulacakAlanlariGoruntuler() {
        Assert.assertTrue(registerPage.name_Box_Register.isDisplayed());
    }
    @And("Goksel zorunlu alanlarin altinda Required yazisini  goruntuler")
    public void GokselZorunluAlanlarinAltindaRequiredYazisiniGoruntuler() {
        registerPage.name_Box_Register.click();
        registerPage.register_Text_Register.click();
        Assert.assertTrue(registerPage.required_Text_Name_Register.isDisplayed());
    }
    @And("Goksel Name {string} girer")
    public void GokselNameGirer(String string) {
        registerPage.name_Box_Register.sendKeys(faker.name().firstName());
        //registerPage.name_Box_Register.sendKeys(string);
    }
    @And("Goksel Name textboxinin altindaki Required yazisinin kalktigini  goruntuler")
    public void GokselNameTextboxininAltindakiRequiredYazisininKalktiginiGoruntuler() {
        Assert.assertTrue(!registerPage.required_Text_Name_Register.isDisplayed());
    }
    @And("Goksel Surname {string}  girer")
    public void GokselSurnameGirer(String string) {
        registerPage.surname_Box_Register.sendKeys(faker.name().lastName());
        //registerPage.surname_Box_Register.sendKeys(string);
    }
    @And("Goksel Surname textboxinin altindaki required yazisinin kalktigini  goruntuler")
    public void GokselSurnameTextboxininAltindakiRequiredYazisininKalktiginiGoruntuler() {
        Assert.assertTrue(!registerPage.required_Text_Surname_Register.isDisplayed());
    }
    @And("Goksel Birth Place {string} girer")
    public void GokselBirthPlaceGirer(String string) {
        registerPage.birthPlace_Box_Register.sendKeys(faker.address().city());
        //registerPage.birthPlace_Box_Register.sendKeys(string);
    }
    @And("Goksel Birth Place textboxinin altindaki required yazisinin kalktigini  goruntuler")
    public void GokselBirthPlaceTextboxininAltindakiRequiredYazisininKalktiginiGoruntuler() {
        Assert.assertTrue(!registerPage.required_Text_BirthPlace_Register.isDisplayed());
    }
    @And("Goksel Phone {string} girer")
    public void GokselPhoneGirer(String string) {
        //registerPage.phoneNumber_Box_Register.sendKeys(string);
        registerPage.phoneNumber_Box_Register.sendKeys(phoneNo1+"-"+phoneNo2+"-"+phoneNo3);
    }
    @And("Goksel Phone textboxinin altindaki required yazisinin kalktigini  goruntuler")
    public void GokselPhoneTextboxininAltindakiRequiredYazisininKalktiginiGoruntuler() {
        Assert.assertTrue(!registerPage.required_Text_Phone_Register.isDisplayed());
    }
    @And("Goksel Gender alanindan Male chexboxini tiklar")
    public void GokselGenderAlanindanMaleChexboxiniTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.clickWithJS(registerPage.male_Checkbox_Register);
    }
    @And("Goksel Date Of Birt {string} girer")
    public void GokselDateOfBirtGirer(String string) {
        registerPage.dateOfBirth_Box_Register.sendKeys(gun+"."+ay+"."+yil);
        //registerPage.dateOfBirth_Box_Register.sendKeys(string);
    }
    @And("Goksel Date Of Birt textboxinin altindaki required yazisinin kalktigini  goruntuler")
    public void GokselDateOfBirtTextboxininAltindakiRequiredYazisininKalktiginiGoruntuler() {
       Assert.assertTrue(!registerPage.required_Text_DateOfBirth_Register.isDisplayed());
    }
    @And("Goksel Ssn {string} girer")
    public void GokselSsnGirer(String string) {
        //registerPage.ssn_Box_Register.sendKeys(string);
        registerPage.ssn_Box_Register.sendKeys(ssnNo1+"-"+ssnNo2+"-"+ssnNo3);
    }
    @And("Goksel Ssn textboxinin altindaki required yazisinin kalktigini  goruntuler")
    public void GokselSsnTextboxininAltindakiRequiredYazisininKalktiginiGoruntuler() {
        Assert.assertTrue(!registerPage.required_Text_Ssn_Register.isDisplayed());
    }
    @And("Goksel User Name {string} girer")
    public void GokselUserNameGirer(String string) {
       registerPage.username_Box_Register.sendKeys(faker.name().firstName());
       //registerPage.username_Box_Register.sendKeys(string);
    }
    @And("Goksel User Name textboxinin altindaki required yazisinin kalktigini  goruntuler")
    public void GokselUserNameTextboxininAltindakiRequiredYazisininKalktiginiGoruntuler() {
        Assert.assertTrue(!registerPage.required_Text_UserName_Register.isDisplayed());
    }
    @And("Goksel Password {string} girer ve Register_Register butonunu tiklar")
    public void GokselPasswordGirerVeRegister_RegisterButonunuTiklar(String password) {
        registerPage.password_Box_Register.sendKeys(password,Keys.TAB,Keys.ENTER);
    }
    @Then("Goksel Register isleminin basarili oldugunu gösteren popupı goruntuler")
    public void gokselRegisterIslemininBasariliOldugunuGösterenPopupıGoruntuler() {
        //ReusableMethods.waitForVisibility(registerPage.alert_Register,5);
        Assert.assertTrue(registerPage.alert_Register.isDisplayed());
    }
}
