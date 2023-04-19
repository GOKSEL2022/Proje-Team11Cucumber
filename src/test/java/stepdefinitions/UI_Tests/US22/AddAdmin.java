package stepdefinitions.UI_Tests.US22;

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





    @Given("Kullanıcı {string} gider.")
    public void kullanıcıGider(String arg0) {
        Driver.getDriver().get(arg0);
    }

    @When("Kullanıcı admin olarak giris yapar.")
    public void kullanıcıAdminOlarakGirisYapar() {
        ReusableMethods.login("rabiaaa","12345678");

    }

    @When("Kullanıcı  Add Admin bölümünün oldugunu dogrular.")
    public void kullanıcıAddAdminBölümününOldugunuDogrular() {
        assertTrue(addAdminPage.add_Admin_Text.isDisplayed());
    }

    @And("Kullanıcı namee kutusuna tıklar.")
    public void kullanıcıNameeKutusunaTıklar() {
        addAdminPage.name_admin.click();
    }

    @And("Kullanıcı Namee kutusuna {string} girer.")
    public void kullanıcıNameeKutusunaGirer(String arg0) {
        addAdminPage.name_admin.sendKeys(arg0);
    }

    @And("Kullanıcı surnamee kutusuna {string} girer")
    public void kullanıcıSurnameeKutusunaGirer(String arg0) {
        addAdminPage.surname_admin.sendKeys(arg0);
    }

    @And("Kullanıcı surname kutusu altında required yazısının kaltıgını gorur.")
    public void kullanıcıSurnameKutusuAltındaRequiredYazısınınKaltıgınıGorur() {
        assertTrue(addAdminPage.required_surname.isDisplayed());

    }

    @And("Kullanıcı birthPLacee kutusuna {string} girer.")
    public void kullanıcıBirthPLaceeKutusunaGirer(String arg0) {
        addAdminPage.birthPlace_admin.sendKeys(faker.address().cityName());
    }

    @And("Kullanıcı gender secer.")
    public void kullanıcıGenderSecer() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.clickWithJS(addAdminPage.female_admin);
    }

    @And("Kullanıcı Date Of Birth kutusuna {string} gırer.")
    public void kullanıcıDateOfBirthKutusunaGırer(String arg0) {
        addAdminPage.birthDay_admin.sendKeys("12.05.2000");
    }

    @And("Kullanıcı Phone kutusuna {string} gırer")
    public void kullanıcıPhoneKutusunaGırer(String arg0) {
        addAdminPage.phoneNumber_admin.sendKeys(phoneNo1+"-"+phoneNo2+"-"+phoneNo3);
    }

    @And("Kullanıcı SSN kutusuna {string} gırer")
    public void kullanıcıSSNKutusunaGırer() {
        addAdminPage.ssn_admin.sendKeys(ssnNo1+"-"+ssnNo2+"-"+ssnNo3);

    }

    @And("Kullanıcı username kutusuna {string} gırer.")
    public void kullanıcıUsernameKutusunaGırer(String arg0) {
        addAdminPage.username_admin.sendKeys(faker.name().username());

    }

    @And("Kullanıcı Password kutusuna {string} gırer")
    public void kullanıcıPasswordKutusunaGırer(String arg0) {
        addAdminPage.password_admin.sendKeys(faker.internet().password(8,12));
    }

    @Then("Add Admin işlemi başarılı bir şekilde gerceklesir.")
    public void addAdminIslemiBasariliBirsekildeGerceklesir() {
        ReusableMethods.waitForVisibility(addAdminPage.saved_alert, 6);
        ReusableMethods.hover(addAdminPage.saved_alert);
        Assert.assertTrue(addAdminPage.saved_alert.isDisplayed());

    }

    @And("Kullanıcı submit butonuna tıklar.")
    public void kullanıcıSubmitButonunaTıklar() {
        try {
            Driver.clickWithJS(addAdminPage.submit_button_admin);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @And("Kullanıcı SSN kutusuna SSN gırer")
    public void kullanıcıSSNKutusunaSSNGırer() {
        addAdminPage.ssn_admin.sendKeys(ssnNo1+"-"+ssnNo2+"-"+ssnNo3);
    }

    @And("Kullanıcı birtPlace kutusu altında required yazısının kaltıgını gorur.")
    public void kullanıcıBirtPlaceKutusuAltındaRequiredYazısınınKaltıgınıGorur() {
        Assert.assertTrue(!addAdminPage.required_birthPlace.isDisplayed());
    }

    @And("Kullanıcı date of birth kutusu altında required yazısının kaltıgını gorur.")
    public void kullanıcıDateOfBirthKutusuAltındaRequiredYazısınınKaltıgınıGorur() {
        Assert.assertTrue(!addAdminPage.required_birthDay.isDisplayed());
    }

    @And("Kullanıcı phone kutusu altında required yazısının kaltıgını gorur.")
    public void kullanıcıPhoneKutusuAltındaRequiredYazısınınKaltıgınıGorur() {
        Assert.assertTrue(!addAdminPage.required_phone.isDisplayed());
    }

    @And("Kullanıcı ssn kutusu altında required yazısının kaltıgını gorur.")
    public void kullanıcıSsnKutusuAltındaRequiredYazısınınKaltıgınıGorur() {
        Assert.assertTrue(!addAdminPage.required_ssn.isDisplayed());
    }

    @And("Kullanıcı username kutusu altında required yazısının kaltıgını gorur.")
    public void kullanıcıUsernameKutusuAltındaRequiredYazısınınKaltıgınıGorur() {
        Assert.assertTrue(!addAdminPage.required_username.isDisplayed());
    }

    @And("Kullanıcı password kutusu altında required yazısının kaltıgını gorur.")
    public void kullanıcıPasswordKutusuAltındaRequiredYazısınınKaltıgınıGorur() {
        Assert.assertTrue(!addAdminPage.required_password.isDisplayed());
    }


    @And("Kullanıcı name kutusu altında required yazısının oldugunu gorur.")
    public void kullanıcıNameKutusuAltındaRequiredYazısınınOldugunuGorur() {
        Assert.assertTrue(addAdminPage.required_name.isDisplayed());
    }

    @And("Kullanıcı name kutusu altında required yazısının kaltıgını gorur.")
    public void kullanıcıNameKutusuAltındaRequiredYazısınınKaltıgınıGorur() {
        Assert.assertTrue(!addAdminPage.required_name.isDisplayed());
    }

    @And("Kullanıcı admin ekleme isleminin gerçeklesmediğini dogrular.")
    public void rabiaAdminEklemeIslemininGerceklesmediginiDogrular() {
        ReusableMethods.waitForVisibility(addAdminPage.gecmistariholmali_alert, 4);
        ReusableMethods.hover(addAdminPage.gecmistariholmali_alert);
        Assert.assertTrue(addAdminPage.gecmistariholmali_alert.isDisplayed());
    }


    @And("Kullanıcı surname kutusu altında required yazısının oldugunu gorur.")
    public void kullanıcıSurnameKutusuAltındaRequiredYazısınınOldugunuGorur() {
        // actions.sendKeys(Keys.ARROW_DOWN).perform();
        //Assert.assertTrue(addAdminPage.required_surname.isDisplayed());
        // ReusableMethods.waitForVisibility(addAdminPage.required_surname,5);
        Assert.assertEquals("Required", addAdminPage.required_surname_2.getText());
    }


    @And("Kullanıcı birtPlace kutusu altında required yazısının oldugunu gorur.")
    public void kullanıcıBirtPlaceKutusuAltındaRequiredYazısınınOldugunuGorur() {
        Assert.assertTrue(addAdminPage.required_birthPlace.isDisplayed());
    }

    @And("Kullanıcı gender olarak female secer.")
    public void kullanıcıGenderOlarakFemaleSecer() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.clickWithJS(addAdminPage.female_admin);
    }

    @And("Kullanıcı gender olarak male secer.")
    public void kullanıcıGenderOlarakMaleSecer() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.clickWithJS(addAdminPage.male_admin);
    }

    @And("Kullanıcı birthPLacee kutusuna space {string} girer.")
    public void kullanıcıBirthPLaceeKutusunaSpaceGirer(String arg0) {
        addAdminPage.birthPlace_admin.sendKeys(" ");
    }

    @And("Kullanıcı Date Of Birth kutusunu bos bırakır.")
    public void kullanıcıDateOfBirthKutusunuBosBırakır() {
        addAdminPage.birthDay_admin.sendKeys("");
    }

    @Then("Kullanıcı date of birth kutusu altında required yazısının oldugunu gorur.")
    public void kullanıcıDateOfBirthKutusuAltındaRequiredYazısınınOldugunuGorur() {
        Assert.assertTrue(addAdminPage.required_birthDay.isDisplayed());
    }


    @And("Kullanıcı Date Of Birth kutusuna bir gün sonrasını \\(ileri tarih) girer.")
    public void kullanıcıDateOfBirthKutusunaBirGünSonrasınıIleriTarihGirer() {
        LocalDate birGunSonrasi = LocalDate.now().plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String tarih = birGunSonrasi.format(formatter);
        addAdminPage.birthDay_admin.sendKeys(formatter.format(birGunSonrasi));
    }

    @Then("Kullanıcı {string} mesajını gorur.")
    public void kullanıcıMesajınıGorur(String arg0) {
        ReusableMethods.waitForVisibility(addAdminPage.gecmistariholmali_alert, 4);
        ReusableMethods.hover(addAdminPage.gecmistariholmali_alert);
        Assert.assertTrue(addAdminPage.gecmistariholmali_alert.isDisplayed());
    }

    @And("Kullanıcı Date Of Birth kutusuna icinde bulundugu gunun tarihini girer.")
    public void kullanıcıDateOfBirthKutusunaIcindeBulunduguGununTarihiniGirer() {
        LocalDate bugununTarihi = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String tarih = bugununTarihi.format(formatter);
        addAdminPage.birthDay_admin.sendKeys(formatter.format(bugununTarihi));
    }



    @And("Kullanıcı Date Of Birth kutusuna birgün öncesinin tarihini\\(geçmiş tarih) girer.")
    public void kullanıcıDateOfBirthKutusunaBirgünÖncesininTarihiniGeçmişTarihGirer() {
        LocalDate yesterday = LocalDate.now().minusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String tarih = yesterday.format(formatter);
        addAdminPage.birthDay_admin.sendKeys(formatter.format(yesterday));
    }

    @And("Kullanıcı Date Of Birth kutusuna gecerli bir tarih girer.")
    public void kullanıcıDateOfBirthKutusunaGecerliBirTarihGirer() {
        addAdminPage.birthDay_admin.sendKeys("12.05.2005");
    }


    @And("Kullanıcı Phone kutusuna oniki rakamdan olusan deger gırer")
    public void kullanıcıPhoneKutusunaOnikiRakamdanOlusanDegerGırer() {
        addAdminPage.phoneNumber_admin.sendKeys("123456789123");
    }

    @And("Kullanıcı Phone kutusuna onbir rakamdan olusan deger gırer")
    public void kullanıcıPhoneKutusunaOnbirRakamdanOlusanDegerGırer() {
        addAdminPage.phoneNumber_admin.sendKeys("12345678912");
    }

    @And("Kullanıcı Phone kutusuna onüç rakamdan olusan deger gırer")
    public void kullanıcıPhoneKutusunaOnüçRakamdanOlusanDegerGırer() {
        addAdminPage.phoneNumber_admin.sendKeys("1234567891234");
    }


    @And("Kullanıcı Phone kutusuna daha önce sistemde ekli olan bir deger gırer")
    public void kullanıcıPhoneKutusunaDahaÖnceSistemdeEkliOlanBirDegerGırer() {
        addAdminPage.phoneNumber_admin.sendKeys("530-695-4588");

    }

    @Then("Add Admin işlemin başarılı bir şekilde gerceklestigini dogrular.")
    public void addAdminIşleminBaşarılıBirŞekildeGerceklestiginiDogrular() {
        ReusableMethods.waitForVisibility(addAdminPage.saved_alert, 4);
        ReusableMethods.hover(addAdminPage.saved_alert);
        Assert.assertEquals("Admin Saved", addAdminPage.saved_alert.getText());
    }

    @And("Kullanıcı SSN kutusuna daha önceden kayıtlı {string} gırer")
    public void kullanıcıSSNKutusunaDahaÖncedenKayıtlıGırer(String arg0) {
        addAdminPage.ssn_admin.sendKeys(arg0);
    }

    @And("Kullanıcı SSN kutusuna invalid deger {string} gırer")
    public void kullanıcıSSNKutusunaInvalidDegerGırer(String arg0) {
        addAdminPage.ssn_admin.sendKeys(arg0);
    }

    @And("Kullanıcı ssn kutusu altında required yazısının görünür oldugunu dogrular.")
    public void kullanıcıSsnKutusuAltındaRequiredYazısınınGörünürOldugunuDogrular() {
        Assert.assertTrue(addAdminPage.required_ssn.isDisplayed());
    }

    @And("Kullanıcı username kutusu altında required yazısının görünür olduğunu dogrular")
    public void kullanıcıUsernameKutusuAltındaRequiredYazısınınGörünürOlduğunuDogrular() {
        Assert.assertTrue(addAdminPage.required_username.isDisplayed());
    }

    @Then("Kullanıcı admin ekleme isleminin gerçeklesmediğini gösteren uyarı mesajı alır.")
    public void kullanıcıAdminEklemeIslemininGerçeklesmediğiniGösterenUyarıMesajıAlır() {
        Assert.assertTrue(addAdminPage.username_already_register_alert.isDisplayed());
    }

    @And("Kullanıcı username kutusunu bos bırakır")
    public void kullanıcıUsernameKutusunuBosBırakır() {
        addAdminPage.username_admin.sendKeys("");
    }

    @And("Kullanıcı username kutusuna önceden kayıtlı {string} gırer.")
    public void kullanıcıUsernameKutusunaÖncedenKayıtlıGırer(String arg0) {
        addAdminPage.username_admin.sendKeys(arg0);
    }

    @And("Kullanıcı Password kutusuna invalid deger {string} gırer")
    public void kullanıcıPasswordKutusunaInvalidDegerGırer(String arg0) {
        addAdminPage.password_admin.sendKeys(arg0);
    }

    @And("Kullanıcı password kutusu altında uyarı mesajı gördügünü dogrular")
    public void kullanıcıPasswordKutusuAltındaUyarıMesajıGördügünüDogrular() {
        addAdminPage.min8_character.isDisplayed();
    }



    @And("Kullanıcı Password kutusuna dokuz karakter {string} gırer")
    public void kullanıcıPasswordKutusunaDokuzKarakterGırer(String arg0) {
        addAdminPage.password_admin.sendKeys(arg0);

    }

    @And("Kullanıcı password kutusu altında required yazısının gorunur oldugunu dogrular")
    public void kullanıcıPasswordKutusuAltındaRequiredYazısınınGorunurOldugunuDogrular() {
        Assert.assertTrue(addAdminPage.required_password.isDisplayed());
    }

    @Then("Kullanıcı gender secenegi altında required yazısını gorur.")
    public void kullanıcıGenderSecenegiAltındaRequiredYazısınıGorur() {
        Assert.assertTrue(addAdminPage.required_ssn.isDisplayed());

    }


    @Then("Kullanıcı please enter valid phone number uyarısı aldıgını dogrular.")
    public void kullanıcıPleaseEnterValidPhoneNumberUyarısıAldıgınıDogrular() {
        ReusableMethods.waitForVisibility(addAdminPage.eror_validphonenumber_alert, 6);
        ReusableMethods.hover(addAdminPage.eror_validphonenumber_alert);
        Assert.assertTrue(addAdminPage.eror_validphonenumber_alert.isDisplayed());
    }

    @And("Kullanıcı phone kutusu altında Minimum {int} character \\(XXX-XXX-XXXX) yazısının görünür oldugunu dogrular")
    public void kullanıcıPhoneKutusuAltındaMinimumCharacterXXXXXXXXXXYazısınınGörünürOldugunuDogrular(int arg0) {
        Assert.assertTrue(addAdminPage.min12_character.isDisplayed());
    }

    @And("Kullanıcı Phone kutusuna \\( - karakteri bulunmadan) on rakamdan oluşan bir deger gırer")
    public void kullanıcıPhoneKutusunaKarakteriBulunmadanOnRakamdanOluşanBirDegerGırer() {
        addAdminPage.phoneNumber_admin.sendKeys("1234567891");
    }


    @Then("Kullanıcı{string} uyarısı alır")
    public void kullanıcıUyarısıAlır(String arg0) {
        ReusableMethods.waitForVisibility(addAdminPage.eror_phonenumber_alert, 6);
        ReusableMethods.hover(addAdminPage.eror_phonenumber_alert);
        Assert.assertTrue(addAdminPage.eror_phonenumber_alert.isDisplayed());
    }

    @Then("Kullanıcı {string} uyarısını aldıgını dogrular")
    public void kullanıcıUyarısınıAldıgınıDogrular(String arg0) {
        ReusableMethods.waitForVisibility(addAdminPage.ssn_already_register, 6);
        ReusableMethods.hover(addAdminPage.ssn_already_register);
        Assert.assertTrue(addAdminPage.ssn_already_register.isDisplayed());
    }

    @Then("Kullanıcı Please enter valid SSN number uyarısını gorur")
    public void kullanıcıPleaseEnterValidSSNNumberUyarısınıGorur() {
        ReusableMethods.waitForVisibility(addAdminPage.ssn_entervalid, 6);
        ReusableMethods.hover(addAdminPage.ssn_entervalid);
        Assert.assertTrue(addAdminPage.ssn_entervalid.isDisplayed());
    }

    @Then("Kullanıcı {string} uyarısını gorur")
    public void kullanıcıUyarısınıGorur(String arg0) {
        ReusableMethods.waitForVisibility(addAdminPage.min11_character, 6);
        ReusableMethods.hover(addAdminPage.min11_character);
        Assert.assertTrue(addAdminPage.min11_character.isDisplayed());
    }

    @Then("Kullanıcı Error: User with username AdminB{int} already register uyarısını gorur")
    public void kullanıcıErrorUserWithUsernameAdminBAlreadyRegisterUyarısınıGorur(int arg0) {
        ReusableMethods.waitForVisibility(addAdminPage.username_already_register_alert, 6);
        ReusableMethods.hover(addAdminPage.username_already_register_alert);
        Assert.assertTrue(addAdminPage.username_already_register_alert.isDisplayed());
    }

    @Then("Kullanıcı geçmiş tarih olmalı uyarı yazısını gorur")
    public void kullanıcıGeçmişTarihOlmalıUyarıYazısınıGorur() {
        ReusableMethods.waitForVisibility(addAdminPage.gecmistariholmali_alert, 6);
        ReusableMethods.hover(addAdminPage.gecmistariholmali_alert);
        Assert.assertTrue(addAdminPage.gecmistariholmali_alert.isDisplayed());
    }
}
