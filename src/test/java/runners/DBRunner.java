package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        tags = "@DBTest",
        glue = {"stepdefinitions","hooks"},
        features = "./src/test/resources/features"


)



public class DBRunner {

}
