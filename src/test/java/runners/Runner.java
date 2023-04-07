package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:src/test/resources/reports/g1g2g3g4.html"},
        features = "src/test/resources/features",
        glue = "src/test/java/tests/UI_Tests",
        tags = "@managementonschools ",
        dryRun = false

)
public class Runner {

}
