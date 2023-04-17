package stepdefinitions.UI_Tests.US02;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AdminManagementPage;
import pages.HomePage;
import pages.US01_US02_Pages.GuestUserPage;

public class US02_TC03StepDefinitions {
    HomePage homePage=new HomePage();
    AdminManagementPage adminManagementPage=new AdminManagementPage();
    GuestUserPage guestUserPage=new GuestUserPage();
    @And("Kullanici sil butonlarini görüntüler")
    public void kullaniciSilButonlariniGörüntüler() {
       Assert.assertTrue(guestUserPage.first_Delete_Button_Guest_User.isDisplayed());
    }
    @And("Kullanici sil butonlarindan ilkine tiklar")
    public void kullaniciSilButonlarindanIlkineTiklar() {
        guestUserPage.first_Delete_Button_Guest_User.click();
    }
    @When("Kullanici Guest User deleted Successful alertini görüntüler")
    public void kullaniciGuestUserDeletedSuccessfulAlertiniGörüntüler() {
        Assert.assertTrue(guestUserPage.alert_Guest_User.isDisplayed());
    }
}
