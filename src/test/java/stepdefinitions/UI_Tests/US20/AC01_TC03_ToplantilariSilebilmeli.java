package stepdefinitions.UI_Tests.US20;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.MainMenuPage;
import utilities.ReusableMethods;

public class AC01_TC03_ToplantilariSilebilmeli {

    HomePage homePage =new HomePage();
    LoginPage loginpage = new LoginPage();
    MainMenuPage mainMenuPage = new MainMenuPage();


    @When("kullanici olusturmus oldugu meet listesindeki silme butonunu tiklar")
    public void kullanici_olusturmus_oldugu_meet_listesindeki_silme_butonunu_tiklar() {
        ReusableMethods.clickByJS(mainMenuPage.sil_button);
    }
    @Then("kullanici meet update successfulll yazisini gormelidir")
    public void kullanici_meet_update_successfulll_yazisini_gormelidir() {

    }



    }

