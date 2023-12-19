package co.com.sanangel.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/AddProducts.feature",
        glue = "co.com.sanangel.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class SanangelRunner {
}
