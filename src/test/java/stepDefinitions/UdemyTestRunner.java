package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",
glue= {"stepDefinitions"},
monochrome=true, plugin= {"pretty", "junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json", "html:target/HtmlReport"},
tags= "@SmokeTest1")

public class UdemyTestRunner {

}
