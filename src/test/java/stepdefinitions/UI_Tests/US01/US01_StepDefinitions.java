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
import utilities.Driver;

public class US01_StepDefinitions {
    HomePage homePage=new HomePage();
    RegisterPage registerPage=new RegisterPage();
    Faker faker=new Faker();
    Actions actions=new Actions(Driver.getDriver());
    int ssnNo1 = Faker.instance().number().numberBetween(100,999);
    int ssnNo2= Faker.instance().number().numberBetween(10,99);
    int ssnNo3 = Faker.instance().number().numberBetween(1000,9999);
    int phoneNo1= Faker.instance().number().numberBetween(100,999);

    int phoneNo2= Faker.instance().number().numberBetween(100,999);
    int phoneNo3 = Faker.instance().number().numberBetween(1000,9999);


    @Given("Kullanici {string} gider")
    public void kullaniciGider(String string) {
        Driver.getDriver().get(string);
    }

    @Then("Kullanici anasayfanın acildigini goruntuler")
    public void kullaniciAnasayfanınAcildiginiGoruntuler() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("managementonschools"));
    }
    @And("Kullanici bir sn bekler")
    public void kullaniciBirSnBekler() throws InterruptedException {
        Thread.sleep(1000);
    }

    @And("Kullanici Register butonunun sayfada yer aldigini goruntuler")
    public void kullaniciRegisterButonununSayfadaYerAldiginiGoruntuler() {
        Assert.assertTrue(homePage.register_Button_Home.isDisplayed());
    }

    @And("Kullanici Register butonuna tiklar")
    public void kullaniciRegisterButonunaTiklar() {
        homePage.register_Button_Home.click();
    }

    @And("Kullanici Register menusunun altinda doldurulacak alanlari goruntuler")
    public void kullaniciRegisterMenusununAltindaDoldurulacakAlanlariGoruntuler() {
        Assert.assertTrue(registerPage.name_Box_Register.isDisplayed());
    }
    @And("Kullanici zorunlu alanlarin altinda Required yazisini  goruntuler")
    public void kullaniciZorunluAlanlarinAltindaRequiredYazisiniGoruntuler() {
        registerPage.name_Box_Register.click();
        registerPage.register_Text_Register.click();
        Assert.assertTrue(registerPage.required_Text_Name_Register.isDisplayed());
    }

    @And("Kullanici Name {string} girer")
    public void kullaniciNameGirer(String string) {
        registerPage.name_Box_Register.sendKeys(string);
    }

    @And("Kullanici Name textboxinin altindaki Required yazisinin kalktigini  goruntuler")
    public void kullaniciNameTextboxininAltindakiRequiredYazisininKalktiginiGoruntuler() {
        Assert.assertFalse(registerPage.required_Text_Name_Register.isDisplayed());
    }

    @And("Kullanici Surname {string}  girer")
    public void kullaniciSurnameGirer(String string) {
        //registerPage.surname_Box_Register.sendKeys(faker.name().firstName());
        registerPage.surname_Box_Register.sendKeys(string);
    }
    @And("Kullanici Surname textboxinin altindaki required yazisinin kalktigini  goruntuler")
    public void kullaniciSurnameTextboxininAltindakiRequiredYazisininKalktiginiGoruntuler() {
        Assert.assertFalse(registerPage.required_Text_Surname_Register.isDisplayed());

    }

    @And("Kullanici Birth Place {string} girer")
    public void kullaniciBirthPlaceGirer(String string) {
        //registerPage.birthPlace_Box_Register.sendKeys(faker.name().lastName());
        registerPage.birthPlace_Box_Register.sendKeys(string);
    }
    @And("Kullanici Birth Place textboxinin altindaki required yazisinin kalktigini  goruntuler")
    public void kullaniciBirthPlaceTextboxininAltindakiRequiredYazisininKalktiginiGoruntuler() {
        Assert.assertFalse(registerPage.required_Text_BirthPlace_Register.isDisplayed());
    }

    @And("Kullanici Phone {string} girer")
    public void kullaniciPhoneGirer(String string) {
        //registerPage.phoneNumber_Box_Register.sendKeys(string);
        registerPage.phoneNumber_Box_Register.sendKeys(phoneNo1+"-"+phoneNo2+"-"+phoneNo3);
    }
    @And("Kullanici Phone textboxinin altindaki required yazisinin kalktigini  goruntuler")
    public void kullaniciPhoneTextboxininAltindakiRequiredYazisininKalktiginiGoruntuler() {
        Assert.assertFalse(registerPage.required_Text_Phone_Register.isDisplayed());
    }

    @And("Kullanici Gender alanindan Male chexboxini tiklar")
    public void kullaniciGenderAlanindanMaleChexboxiniTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.clickWithJS(registerPage.male_Checkbox_Register);
    }

    @And("Kullanici Date Of Birt {string} girer")
    public void kullaniciDateOfBirtGirer(String string) {
        registerPage.dateOfBirth_Box_Register.sendKeys(string);
    }
    @And("Kullanici Date Of Birt textboxinin altindaki required yazisinin kalktigini  goruntuler")
    public void kullaniciDateOfBirtTextboxininAltindakiRequiredYazisininKalktiginiGoruntuler() {
       Assert.assertFalse(registerPage.required_Text_DateOfBirth_Register.isDisplayed());
    }

    @And("Kullanici Ssn {string} girer")
    public void kullaniciSsnGirer(String string) {
        //registerPage.ssn_Box_Register.sendKeys(string);
        registerPage.ssn_Box_Register.sendKeys(ssnNo1+"-"+ssnNo2+"-"+ssnNo3);
    }
    @And("Kullanici Ssn textboxinin altindaki required yazisinin kalktigini  goruntuler")
    public void kullaniciSsnTextboxininAltindakiRequiredYazisininKalktiginiGoruntuler() {
        Assert.assertFalse(registerPage.required_Text_Ssn_Register.isDisplayed());
    }

    @And("Kullanici User Name {string} girer")
    public void kullaniciUserNameGirer(String string) {
        registerPage.username_Box_Register.sendKeys(faker.name().firstName());
        //registerPage.username_Box_Register.sendKeys(string);
    }
    @And("Kullanici User Name textboxinin altindaki required yazisinin kalktigini  goruntuler")
    public void kullaniciUserNameTextboxininAltindakiRequiredYazisininKalktiginiGoruntuler() {
        Assert.assertFalse(registerPage.required_Text_UserName_Register.isDisplayed());
    }

    @And("Kullanici Password {string} girer ve Register_Register butonunu tiklar")
    public void kullaniciPasswordGirerVeRegister_RegisterButonunuTiklar(String string) {
        registerPage.password_Box_Register.sendKeys(string, Keys.TAB,Keys.ENTER);
    }

    @Then("Kullanici Register isleminin basarili oldugunu gösteren popupı görüntüler")
    public void kullaniciRegisterIslemininBasariliOldugunuGösterenPopupıGörüntüler() {
        Assert.assertTrue(registerPage.alert_Register.isDisplayed());
    }
}
