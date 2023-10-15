package Runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Feature"},
        glue = {"StepDefinitions"},
        monochrome = true,
        plugin = {"pretty", "html:target/HTMLReport.html",
                "json:target/JsonReport.json",
                "junit:target/JunitReport.xml"}
)
public class TestRunner {

}
