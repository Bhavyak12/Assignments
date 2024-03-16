package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/featurefile/FlipKart.feature"},
        glue={"StepDefinition"},
        tags="@SC02"
)
public class RunnerFlipKart {
}
