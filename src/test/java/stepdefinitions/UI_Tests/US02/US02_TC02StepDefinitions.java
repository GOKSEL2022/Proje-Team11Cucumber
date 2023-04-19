package stepdefinitions.UI_Tests.US02;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AdminManagementPage;
import pages.HomePage;
import pages.LoginPage;
import pages.GuestUserPage;
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

    @When("Goksel login olur")
    public void GokselLoginOlur() {
        adminLogin();

    }
    @And("Goksel sayfanin sag üst kösesinde Menu butonunu görüntüler")
    public void GokselSayfaninSagÜstKösesindeMenuButonunuGörüntüler() {
        Assert.assertTrue(adminManagementPage.menu_Button_Menu.isDisplayed());
    }
    @And("Goksel sayfanin sag üst kösesinde Menu butonunu tiklar")
    public void GokselSayfaninSagÜstKösesindeMenuButonunuTiklar() {
        adminManagementPage.menu_Button_Menu.click();
    }

    @And("Goksel Main Menuyü görüntüler")
    public void GokselMainMenuyüGörüntüler() {
        Assert.assertTrue(adminManagementPage.main_Menu_Text_Menu.isDisplayed());

    }
    @And("Goksel Guest User secenegini tiklar")
    public void GokselGuestUserSeceneginiTiklar() {
        Driver.clickWithJS(adminManagementPage.guest_User_Button_Menu);
    }

    @And("Goksel Guest User List basligini görüntüler")
    public void GokselGuestUserListBasliginiGörüntüler() {
        Assert.assertTrue(guestUserPage.guest_User_List_Text_Guest_User.isDisplayed());
    }
    @And("Goksel Name Surname altbasligini görüntüler")
    public void GokselNameSurnameAltbasliginiGörüntüler() {
        Assert.assertTrue(guestUserPage.name_Surname_Text_Guest_User.isDisplayed());
    }
    @And("Goksel Phone Number altbasligini görüntüler")
    public void GokselPhoneNumberAltbasliginiGörüntüler() {
        Assert.assertTrue(guestUserPage.phone_Number_Text_Guest_User.isDisplayed());
    }
    @When("Goksel Ssn altbasligini görüntüler")
    public void GokselSsnAltbasliginiGörüntüler() {
        Assert.assertTrue(guestUserPage.ssn_Text_Guest_User.isDisplayed());
    }
    @Then("Goksel User Name altbasligini görüntüler")
    public void GokselUserNameAltbasliginiGörüntüler() {
        Assert.assertTrue(guestUserPage.user_Name_Text_Guest_User.isDisplayed());
    }

    @And("Goksel bir sn bekler")
    public void gokselBirSnBekler() {

    }
}
