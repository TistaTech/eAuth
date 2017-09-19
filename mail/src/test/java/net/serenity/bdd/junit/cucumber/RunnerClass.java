package net.serenity.bdd.junit.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/Compose", 
		plugin = {"pretty","html:target/cucumber", "json:target/json/cucumber.json"},
		dryRun = false
		)

public class RunnerClass {

}
