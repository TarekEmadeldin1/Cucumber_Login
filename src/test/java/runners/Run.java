package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/featurefile/Feature1.feature",
        glue = "src/test/java/stepdeifinitions/Steps.java"
)

public class Run {
}
