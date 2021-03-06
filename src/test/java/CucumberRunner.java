import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"}, glue = {"autotests.steps"},
        plugin = {"pretty",
                "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"})
public class CucumberRunner {
}