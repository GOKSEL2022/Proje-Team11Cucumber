package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import static base_urls.ManagementonSchoolsBaseUrl.*;


public class Hooks {


    @Before("@admin")
    public void beforeApiAdmin() {
        System.out.println("Before Method for admin");
        schoolsetupAdmin();
    }

    @Before("@teacher")
    public void beforeApiTeacher() {
        System.out.println("Before Method for teacher");
        schoolsetupTeacher();
    }

    @Before("@dean")
    public void beforeApiDean() {
        System.out.println("Before Method for  dean");
        schoolsetupDean();
    }

    @Before("@vicedean")
    public void beforeApiViceDean() {
        System.out.println("Before Method for vicedean");
        schoolsetupViceDean();
    }

    @Before("@student")
    public void beforeApiStudent() {
        System.out.println("Before Method for student");
        schoolsetupStudent();
    }


    @After
    public void tearDownScenarios(Scenario scenario) {
        System.out.println("After Metotu");
        //      Eger bir Scenario FAIL ederse, ekran goruntusunu al ve rapora ekle
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            //                     ekran goruntusu    file tipi                  ekran goruntusunun adi
            scenario.attach(failedScreenshot, "image/png", "failed_scenario_" + scenario.getName());
            Driver.closeDriver();
        }
    }
}




