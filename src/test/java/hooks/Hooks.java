package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @Before
    public void setUpScenarios(){
        System.out.println("Befor Method");
    }
    @After
    public void tearDownScenarios(Scenario scenario){
        System.out.println("After Method");
//          Eger bir scenario fail ederse, ekran goruntusunu al ve rapora ekle
        if (scenario.isFailed()){
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            //               ekran goruntusu        file tipi(uzantisi)        ekran goruntusunun adi
            scenario.attach(failedScreenshot, "image/png","failed_scenario"+scenario.getName());
            Driver.closeDriver();
        }

    }
}
