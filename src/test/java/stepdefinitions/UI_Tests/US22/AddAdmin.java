package stepdefinitions.UI_Tests.US22;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AddAdminPage;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertTrue;
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddAdmin {

    HomePage homePage= new HomePage();
    AddAdminPage addAdminPage = new AddAdminPage();
    Faker faker = new Faker();
    Actions actions=new Actions(Driver.getDriver());
    int ssnNo1= Faker.instance().number().numberBetween(100,999);
    int ssnNo2=Faker.instance().number().numberBetween(10,99);
    int ssnNo3=Faker.instance().number().numberBetween(1000,9999);
    int phoneNo1= Faker.instance().number().numberBetween(100,999);

    int phoneNo2= Faker.instance().number().numberBetween(100,999);
    int phoneNo3 = Faker.instance().number().numberBetween(1000,9999);





    @Given("rabia {string} gider.")
    public void rabiaGider(String arg0) {
        Driver.getDriver().get(arg0);
    }

    @When("rabia admin olarak giris yapar.")
    public void rabiaAdminOlarakGirisYapar() {
        ReusableMethods.login("rabiaaa","12345678");

    }

    @When("rabia  Add Admin bölümünün oldugunu dogrular.")
    public void rabiaAddAdminBölümününOldugunuDogrular() {
        assertTrue(addAdminPage.add_Admin_Text.isDisplayed());
    }

    @And("rabia namee kutusuna tıklar.")
    public void rabiaNameeKutusunaTıklar() {
        addAdminPage.name_admin.click();
    }

    @And("rabia Namee kutusuna {string} girer.")
    public void rabiaNameeKutusunaGirer(String arg0) {
        addAdminPage.name_admin.sendKeys(arg0);
    }

    @And("rabia surnamee kutusuna {string} girer")
    public void rabiaSurnameeKutusunaGirer(String arg0) {
        addAdminPage.surname_admin.sendKeys(arg0);
    }

    @And("rabia surname kutusu altında required yazısının kaltıgını gorur.")
    public void rabiaSurnameKutusuAltındaRequiredYazısınınKaltıgınıGorur() {
        assertTrue(addAdminPage.required_surname.isDisplayed());

    }

    @And("rabia birthPLacee kutusuna {string} girer.")
    public void rabiaBirthPLaceeKutusunaGirer(String arg0) {
        addAdminPage.birthPlace_admin.sendKeys(faker.address().cityName());
    }

    @And("rabia gender secer.")
    public void rabiaGenderSecer() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.clickWithJS(addAdminPage.female_admin);
    }

    @And("rabia Date Of Birth kutusuna {string} gırer.")
    public void rabiaDateOfBirthKutusunaGırer(String arg0) {
        addAdminPage.birthDay_admin.sendKeys("12.05.2000");
    }

    @And("rabia Phone kutusuna {string} gırer")
    public void rabiaPhoneKutusunaGırer(String arg0) {
        addAdminPage.phoneNumber_admin.sendKeys(phoneNo1+"-"+phoneNo2+"-"+phoneNo3);
    }

    @And("rabia SSN kutusuna {string} gırer")
    public void rabiaSSNKutusunaGırer() {
        addAdminPage.ssn_admin.sendKeys(ssnNo1+"-"+ssnNo2+"-"+ssnNo3);

    }

    @And("rabia username kutusuna {string} gırer.")
    public void rabiaUsernameKutusunaGırer(String arg0) {
        addAdminPage.username_admin.sendKeys(faker.name().username());

    }

    @And("rabia Password kutusuna {string} gırer")
    public void rabiaPasswordKutusunaGırer(String arg0) {
        addAdminPage.password_admin.sendKeys(faker.internet().password(8,12));
    }

    @Then("Add Admin işlemi başarılı bir şekilde gerceklesir.")
    public void addAdminIslemiBasariliBirsekildeGerceklesir() {
        ReusableMethods.waitForVisibility(addAdminPage.saved_alert, 6);
        ReusableMethods.hover(addAdminPage.saved_alert);
        Assert.assertTrue(addAdminPage.saved_alert.isDisplayed());

    }

    @And("rabia submit butonuna tıklar.")
    public void rabiaSubmitButonunaTıklar() {
        try {
            Driver.clickWithJS(addAdminPage.submit_button_admin);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @And("rabia SSN kutusuna SSN gırer")
    public void rabiaSSNKutusunaSSNGırer() {
        addAdminPage.ssn_admin.sendKeys(ssnNo1+"-"+ssnNo2+"-"+ssnNo3);
    }

    @And("rabia birtPlace kutusu altında required yazısının kaltıgını gorur.")
    public void rabiaBirtPlaceKutusuAltındaRequiredYazısınınKaltıgınıGorur() {
        Assert.assertTrue(!addAdminPage.required_birthPlace.isDisplayed());
    }

    @And("rabia date of birth kutusu altında required yazısının kaltıgını gorur.")
    public void rabiaDateOfBirthKutusuAltındaRequiredYazısınınKaltıgınıGorur() {
        Assert.assertTrue(!addAdminPage.required_birthDay.isDisplayed());
    }

    @And("rabia phone kutusu altında required yazısının kaltıgını gorur.")
    public void rabiaPhoneKutusuAltındaRequiredYazısınınKaltıgınıGorur() {
        Assert.assertTrue(!addAdminPage.required_phone.isDisplayed());
    }

    @And("rabia ssn kutusu altında required yazısının kaltıgını gorur.")
    public void rabiaSsnKutusuAltındaRequiredYazısınınKaltıgınıGorur() {
        Assert.assertTrue(!addAdminPage.required_ssn.isDisplayed());
    }

    @And("rabia username kutusu altında required yazısının kaltıgını gorur.")
    public void rabiaUsernameKutusuAltındaRequiredYazısınınKaltıgınıGorur() {
        Assert.assertTrue(!addAdminPage.required_username.isDisplayed());
    }

    @And("rabia password kutusu altında required yazısının kaltıgını gorur.")
    public void rabiaPasswordKutusuAltındaRequiredYazısınınKaltıgınıGorur() {
        Assert.assertTrue(!addAdminPage.required_password.isDisplayed());
    }


    @And("rabia name kutusu altında required yazısının oldugunu gorur.")
    public void rabiaNameKutusuAltındaRequiredYazısınınOldugunuGorur() {
        Assert.assertTrue(addAdminPage.required_name.isDisplayed());
    }

    @And("rabia name kutusu altında required yazısının kaltıgını gorur.")
    public void rabiaNameKutusuAltındaRequiredYazısınınKaltıgınıGorur() {
        Assert.assertTrue(!addAdminPage.required_name.isDisplayed());
    }

    @And("rabia admin ekleme isleminin gerçeklesmediğini dogrular.")
    public void rabiaAdminEklemeIslemininGerceklesmediginiDogrular() {
        ReusableMethods.waitForVisibility(addAdminPage.gecmistariholmali_alert, 4);
        ReusableMethods.hover(addAdminPage.gecmistariholmali_alert);
        Assert.assertTrue(addAdminPage.gecmistariholmali_alert.isDisplayed());
    }


    @And("rabia surname kutusu altında required yazısının oldugunu gorur.")
    public void rabiaSurnameKutusuAltındaRequiredYazısınınOldugunuGorur() {
        // actions.sendKeys(Keys.ARROW_DOWN).perform();
        //Assert.assertTrue(addAdminPage.required_surname.isDisplayed());
        // ReusableMethods.waitForVisibility(addAdminPage.required_surname,5);
        Assert.assertEquals("Required", addAdminPage.required_surname_2.getText());
    }


    @And("rabia birtPlace kutusu altında required yazısının oldugunu gorur.")
    public void rabiaBirtPlaceKutusuAltındaRequiredYazısınınOldugunuGorur() {
        Assert.assertTrue(addAdminPage.required_birthPlace.isDisplayed());
    }

    @And("rabia gender olarak female secer.")
    public void rabiaGenderOlarakFemaleSecer() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.clickWithJS(addAdminPage.female_admin);
    }

    @And("rabia gender olarak male secer.")
    public void rabiaGenderOlarakMaleSecer() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.clickWithJS(addAdminPage.male_admin);
    }

    @And("rabia birthPLacee kutusuna space {string} girer.")
    public void rabiaBirthPLaceeKutusunaSpaceGirer(String arg0) {
        addAdminPage.birthPlace_admin.sendKeys(" ");
    }

    @And("rabia Date Of Birth kutusunu bos bırakır.")
    public void rabiaDateOfBirthKutusunuBosBırakır() {
        addAdminPage.birthDay_admin.sendKeys("");
    }

    @Then("rabia date of birth kutusu altında required yazısının oldugunu gorur.")
    public void rabiaDateOfBirthKutusuAltındaRequiredYazısınınOldugunuGorur() {
        Assert.assertTrue(addAdminPage.required_birthDay.isDisplayed());
    }


    @And("rabia Date Of Birth kutusuna bir gün sonrasını \\(ileri tarih) girer.")
    public void rabiaDateOfBirthKutusunaBirGünSonrasınıIleriTarihGirer() {
        LocalDate birGunSonrasi = LocalDate.now().plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String tarih = birGunSonrasi.format(formatter);
        addAdminPage.birthDay_admin.sendKeys(formatter.format(birGunSonrasi));
    }

    @Then("rabia {string} mesajını gorur.")
    public void rabiaMesajınıGorur(String arg0) {
        ReusableMethods.waitForVisibility(addAdminPage.gecmistariholmali_alert, 4);
        ReusableMethods.hover(addAdminPage.gecmistariholmali_alert);
        Assert.assertTrue(addAdminPage.gecmistariholmali_alert.isDisplayed());
    }

    @And("rabia Date Of Birth kutusuna icinde bulundugu gunun tarihini girer.")
    public void rabiaDateOfBirthKutusunaIcindeBulunduguGununTarihiniGirer() {
        LocalDate bugununTarihi = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String tarih = bugununTarihi.format(formatter);
        addAdminPage.birthDay_admin.sendKeys(formatter.format(bugununTarihi));
    }



    @And("rabia Date Of Birth kutusuna birgün öncesinin tarihini\\(geçmiş tarih) girer.")
    public void rabiaDateOfBirthKutusunaBirgünÖncesininTarihiniGeçmişTarihGirer() {
        LocalDate yesterday = LocalDate.now().minusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String tarih = yesterday.format(formatter);
        addAdminPage.birthDay_admin.sendKeys(formatter.format(yesterday));
    }

    @And("rabia Date Of Birth kutusuna gecerli bir tarih girer.")
    public void rabiaDateOfBirthKutusunaGecerliBirTarihGirer() {
        addAdminPage.birthDay_admin.sendKeys("12.05.2005");
    }


    @And("rabia Phone kutusuna oniki rakamdan olusan deger gırer")
    public void rabiaPhoneKutusunaOnikiRakamdanOlusanDegerGırer() {
        addAdminPage.phoneNumber_admin.sendKeys("123456789123");
    }

    @And("rabia Phone kutusuna onbir rakamdan olusan deger gırer")
    public void rabiaPhoneKutusunaOnbirRakamdanOlusanDegerGırer() {
        addAdminPage.phoneNumber_admin.sendKeys("12345678912");
    }

    @And("rabia Phone kutusuna onüç rakamdan olusan deger gırer")
    public void rabiaPhoneKutusunaOnüçRakamdanOlusanDegerGırer() {
        addAdminPage.phoneNumber_admin.sendKeys("1234567891234");
    }


    @And("rabia Phone kutusuna daha önce sistemde ekli olan bir deger gırer")
    public void rabiaPhoneKutusunaDahaÖnceSistemdeEkliOlanBirDegerGırer() {
        addAdminPage.phoneNumber_admin.sendKeys("530-695-4588");

    }

    @Then("Add Admin işlemin başarılı bir şekilde gerceklestigini dogrular.")
    public void addAdminIşleminBaşarılıBirŞekildeGerceklestiginiDogrular() {
        ReusableMethods.waitForVisibility(addAdminPage.saved_alert, 4);
        ReusableMethods.hover(addAdminPage.saved_alert);
        Assert.assertEquals("Admin Saved", addAdminPage.saved_alert.getText());
    }

    @And("rabia SSN kutusuna daha önceden kayıtlı {string} gırer")
    public void rabiaSSNKutusunaDahaÖncedenKayıtlıGırer(String arg0) {
        addAdminPage.ssn_admin.sendKeys(arg0);
    }

    @And("rabia SSN kutusuna invalid deger {string} gırer")
    public void rabiaSSNKutusunaInvalidDegerGırer(String arg0) {
        addAdminPage.ssn_admin.sendKeys(arg0);
    }

    @And("rabia ssn kutusu altında required yazısının görünür oldugunu dogrular.")
    public void rabiaSsnKutusuAltındaRequiredYazısınınGörünürOldugunuDogrular() {
        Assert.assertTrue(addAdminPage.required_ssn.isDisplayed());
    }

    @And("rabia username kutusu altında required yazısının görünür olduğunu dogrular")
    public void rabiaUsernameKutusuAltındaRequiredYazısınınGörünürOlduğunuDogrular() {
        Assert.assertTrue(addAdminPage.required_username.isDisplayed());
    }

    @Then("rabia admin ekleme isleminin gerçeklesmediğini gösteren uyarı mesajı alır.")
    public void rabiaAdminEklemeIslemininGerçeklesmediğiniGösterenUyarıMesajıAlır() {
        Assert.assertTrue(addAdminPage.username_already_register_alert.isDisplayed());
    }

    @And("rabia username kutusunu bos bırakır")
    public void rabiaUsernameKutusunuBosBırakır() {
        addAdminPage.username_admin.sendKeys("");
    }

    @And("rabia username kutusuna önceden kayıtlı {string} gırer.")
    public void rabiaUsernameKutusunaÖncedenKayıtlıGırer(String arg0) {
        addAdminPage.username_admin.sendKeys(arg0);
    }

    @And("rabia Password kutusuna invalid deger {string} gırer")
    public void rabiaPasswordKutusunaInvalidDegerGırer(String arg0) {
        addAdminPage.password_admin.sendKeys(arg0);
    }

    @And("rabia password kutusu altında uyarı mesajı gördügünü dogrular")
    public void rabiaPasswordKutusuAltındaUyarıMesajıGördügünüDogrular() {
        addAdminPage.min8_character.isDisplayed();
    }



    @And("rabia Password kutusuna dokuz karakter {string} gırer")
    public void rabiaPasswordKutusunaDokuzKarakterGırer(String arg0) {
        addAdminPage.password_admin.sendKeys(arg0);

    }

    @And("rabia password kutusu altında required yazısının gorunur oldugunu dogrular")
    public void rabiaPasswordKutusuAltındaRequiredYazısınınGorunurOldugunuDogrular() {
        Assert.assertTrue(addAdminPage.required_password.isDisplayed());
    }

    @Then("rabia gender secenegi altında required yazısını gorur.")
    public void rabiaGenderSecenegiAltındaRequiredYazısınıGorur() {
        Assert.assertTrue(addAdminPage.required_ssn.isDisplayed());

    }


    @Then("rabia please enter valid phone number uyarısı aldıgını dogrular.")
    public void rabiaPleaseEnterValidPhoneNumberUyarısıAldıgınıDogrular() {
        ReusableMethods.waitForVisibility(addAdminPage.eror_validphonenumber_alert, 6);
        ReusableMethods.hover(addAdminPage.eror_validphonenumber_alert);
        Assert.assertTrue(addAdminPage.eror_validphonenumber_alert.isDisplayed());
    }

    @And("rabia phone kutusu altında Minimum {int} character \\(XXX-XXX-XXXX) yazısının görünür oldugunu dogrular")
    public void rabiaPhoneKutusuAltındaMinimumCharacterXXXXXXXXXXYazısınınGörünürOldugunuDogrular(int arg0) {
        Assert.assertTrue(addAdminPage.min12_character.isDisplayed());
    }

    @And("rabia Phone kutusuna \\( - karakteri bulunmadan) on rakamdan oluşan bir deger gırer")
    public void rabiaPhoneKutusunaKarakteriBulunmadanOnRakamdanOluşanBirDegerGırer() {
        addAdminPage.phoneNumber_admin.sendKeys("1234567891");
    }


    @Then("rabia{string} uyarısı alır")
    public void rabiaUyarısıAlır(String arg0) {
        ReusableMethods.waitForVisibility(addAdminPage.eror_phonenumber_alert, 6);
        ReusableMethods.hover(addAdminPage.eror_phonenumber_alert);
        Assert.assertTrue(addAdminPage.eror_phonenumber_alert.isDisplayed());
    }

    @Then("rabia {string} uyarısını aldıgını dogrular")
    public void rabiaUyarısınıAldıgınıDogrular(String arg0) {
        ReusableMethods.waitForVisibility(addAdminPage.ssn_already_register, 6);
        ReusableMethods.hover(addAdminPage.ssn_already_register);
        Assert.assertTrue(addAdminPage.ssn_already_register.isDisplayed());
    }

    @Then("rabia Please enter valid SSN number uyarısını gorur")
    public void rabiaPleaseEnterValidSSNNumberUyarısınıGorur() {
        ReusableMethods.waitForVisibility(addAdminPage.ssn_entervalid, 6);
        ReusableMethods.hover(addAdminPage.ssn_entervalid);
        Assert.assertTrue(addAdminPage.ssn_entervalid.isDisplayed());
    }

    @Then("rabia {string} uyarısını gorur")
    public void rabiaUyarısınıGorur(String arg0) {
        ReusableMethods.waitForVisibility(addAdminPage.min11_character, 6);
        ReusableMethods.hover(addAdminPage.min11_character);
        Assert.assertTrue(addAdminPage.min11_character.isDisplayed());
    }

    @Then("rabia Error: User with username AdminB{int} already register uyarısını gorur")
    public void rabiaErrorUserWithUsernameAdminBAlreadyRegisterUyarısınıGorur(int arg0) {
        ReusableMethods.waitForVisibility(addAdminPage.username_already_register_alert, 6);
        ReusableMethods.hover(addAdminPage.username_already_register_alert);
        Assert.assertTrue(addAdminPage.username_already_register_alert.isDisplayed());
    }

    @Then("rabia geçmiş tarih olmalı uyarı yazısını gorur")
    public void rabiaGeçmişTarihOlmalıUyarıYazısınıGorur() {
        ReusableMethods.waitForVisibility(addAdminPage.gecmistariholmali_alert, 6);
        ReusableMethods.hover(addAdminPage.gecmistariholmali_alert);
        Assert.assertTrue(addAdminPage.gecmistariholmali_alert.isDisplayed());
    }
}
