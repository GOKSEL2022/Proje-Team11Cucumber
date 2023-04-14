package stepdefinitions.UI_Tests.US02;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AdminManagementPage;
import pages.HomePage;
import pages.LoginPage;
import pages.US01_US02_Pages.GuestUserPage;
import utilities.Driver;

public class US02_TC02StepDefinitions {
    public static void adminLogin(){
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        homePage.login_Button_Home.click();
        loginPage.username_Box_Login.sendKeys("AdminB103");
        loginPage.password_Box_Login.sendKeys("12345678");
        loginPage.login_Button_Login.click();
    }

    AdminManagementPage adminManagementPage=new AdminManagementPage();
    GuestUserPage guestUserPage=new GuestUserPage();
    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();

    @When("Kullanici login olur")
    public void kullaniciLoginOlur() {
        adminLogin();

    }
    @And("Kullanici sayfanin sag üst kösesinde Menu butonunu görüntüler")
    public void kullaniciSayfaninSagÜstKösesindeMenuButonunuGörüntüler() {
        Assert.assertTrue(adminManagementPage.menu_Button_Menu.isDisplayed());
    }
    @And("Kullanici sayfanin sag üst kösesinde Menu butonunu tiklar")
    public void kullaniciSayfaninSagÜstKösesindeMenuButonunuTiklar() {
        adminManagementPage.menu_Button_Menu.click();
    }

    @And("Kullanici Main Menuyü görüntüler")
    public void kullaniciMainMenuyüGörüntüler() {
        Assert.assertTrue(adminManagementPage.main_Menu_Text_Menu.isDisplayed());

    }

    @And("Kullanici Guest User secenegini tiklar")
    public void kullaniciGuestUserSeceneginiTiklar() {
        Driver.clickWithJS(adminManagementPage.guest_User_Button_Menu);
    }

    @And("Kullanici Guest User List basligini görüntüler")
    public void kullaniciGuestUserListBasliginiGörüntüler() {
        Assert.assertTrue(guestUserPage.guest_User_List_Text_Guest_User.isDisplayed());
    }

    @And("Kullanici Name Surname altbasligini görüntüler")
    public void kullaniciNameSurnameAltbasliginiGörüntüler() {
        Assert.assertTrue(guestUserPage.name_Surname_Text_Guest_User.isDisplayed());
    }

    @And("Kullanici Phone Number altbasligini görüntüler")
    public void kullaniciPhoneNumberAltbasliginiGörüntüler() {
        Assert.assertTrue(guestUserPage.phone_Number_Text_Guest_User.isDisplayed());
    }

    @When("Kullanici Ssn altbasligini görüntüler")
    public void kullaniciSsnAltbasliginiGörüntüler() {
        Assert.assertTrue(guestUserPage.ssn_Text_Guest_User.isDisplayed());
    }

    @Then("Kullanici User Name altbasligini görüntüler")
    public void kullaniciUserNameAltbasliginiGörüntüler() {
        Assert.assertTrue(guestUserPage.user_Name_Text_Guest_User.isDisplayed());

    }

}
