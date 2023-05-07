package stepdefinitions.UI_Tests.US02;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GuestUserPage;

public class US02_TC03_StepDefinitions {
    GuestUserPage guestUserPage=new GuestUserPage();
    @And("Goksel sil butonlarini görüntüler")
    public void gokselSilButonlariniGörüntüler() {
       Assert.assertTrue(guestUserPage.first_Delete_Button_Guest_User.isDisplayed());
    }
    @And("Goksel sil butonlarindan ilkine tiklar")
    public void GokselkullaniciSilButonlarindanIlkineTiklar() {
        guestUserPage.first_Delete_Button_Guest_User.click();
    }
    @When("Goksel Guest User deleted Successful alertini görüntüler")
    public void gokselGuestUserDeletedSuccessfulAlertiniGörüntüler() {
        Assert.assertTrue(guestUserPage.alert_Guest_User.isDisplayed());
    }


}
