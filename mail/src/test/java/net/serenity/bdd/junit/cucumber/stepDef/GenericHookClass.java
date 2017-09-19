package net.serenity.bdd.junit.cucumber.stepDef;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import net.serenitybdd.core.Serenity;

import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class GenericHookClass extends GenericDeclarationClass {

	@Before
	public void beforeTest(Scenario scenario) throws FileNotFoundException, IOException {

		for (String s : scenario.getSourceTagNames()) {
			System.out.println("Tag:" + s);
		}
		prop = new Properties();
		prop.load(new FileInputStream(Configpath));

		// FirefoxProfile myprofile = new
		// ProfilesIni().getProfile("serenitybdd");
		// myprofile.setPreference("network.proxy.type", 5);
		// myprofile.setPreference("browser.cache.disk.enable", false);
		// myprofile.setPreference("browser.cache.memory.enable", false);
		// myprofile.setPreference("browser.cache.offline.enable", false);
		// myprofile.setPreference("network.http.use-cache", false);
		// myprofile.setPreference("http.response.timeout", 30);
		// myprofile.setPreference("dom.max_script_run_time", 30);
		// myprofile.setPreference("network.http.connection-timeout", 10);
		// myprofile.setPreference("network.http.connection-retry-timeout", 10);
		// Serenity.useFirefoxProfile(myprofile);
	}

}
