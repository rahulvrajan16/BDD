package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue={"step/definitions"}, monochrome = true,
        plugin = {"pretty","html:target/HtmlReports/HtmlReport.html",
                  "junit:target/JunitReports/report",
                  "json:target/JsonReports/JsonReport.json"},
        tags ="@Smoke"
)
@Slf4j
public class TestRunner {
}
