import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.cucumber.CucumberWithSerenityRuntime;

import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
@CucumberOptions(  monochrome = true,
        features = "src/test/resources/features/",
        format = { "pretty","html: cucumber-html-reports",
                "json: cucumber-html-reports/cucumber.json" },
        dryRun = false )

public class CukesRunner {
}