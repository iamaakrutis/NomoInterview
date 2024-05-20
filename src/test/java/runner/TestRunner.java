package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Feature" //folder name
		,glue = {"stepDefinition"}//pkg name for step definition
		,plugin = {"pretty", "html:target/cucumber-reports"} // Plugins for reporting
		,dryRun = false
		)

public class TestRunner {
	
}
