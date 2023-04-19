package stepdefinitions.UI_Tests.US02;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AdminManagementPage;
import pages.HomePage;
import pages.GuestUserPage;

public class US02_TC03StepDefinitions {
    HomePage homePage=new HomePage();
    AdminManagementPage adminManagementPage=new AdminManagementPage();
    GuestUserPage guestUserPage=new GuestUserPage();
    @And("Goksel sil butonlarini goruntuler")
    public void GokselkullaniciSilButonlarinigoruntuler() {
       Assert.assertTrue(guestUserPage.first_Delete_Button_Guest_User.isDisplayed());
    }
    @And("Goksel sil butonlarindan ilkine tiklar")
    public void GokselkullaniciSilButonlarindanIlkineTiklar() {
        guestUserPage.first_Delete_Button_Guest_User.click();
    }
    @When("Kullanici Guest User deleted Successful alertini goruntuler")
    public void GokselkullaniciGuestUserDeletedSuccessfulAlertinigoruntuler() {
        Assert.assertTrue(guestUserPage.alert_Guest_User.isDisplayed());
    }

    @When("Goksel Guest User deleted Successful alertini goruntuler")
    public void gokselGuestUserDeletedSuccessfulAlertinigoruntuler() {
    }
}
