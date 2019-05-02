package ebanking.cucumber_bank;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/features"}
		,glue = {"stepdefinitions"}
		,dryRun = false
		,monochrome = true
		,plugin = {"pretty", "html:target/html", "json:target/json/report.json", "junit:target/xml/report.xml"})

public class TestRunner {

}
