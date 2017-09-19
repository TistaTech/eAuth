package net.serenity.bdd.junit.cucumber.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenity.bdd.junit.cucumber.model.ComposeData;
import net.serenity.bdd.junit.cucumber.steps.ComposeTestSteps;
import net.thucydides.core.annotations.Steps;

public class ComposeTestStepDef extends GenericDeclarationClass {
	
	ComposeData composeDataprovider = new ComposeData();
	
	@Steps
	ComposeTestSteps composeTS;
	
	@Given("^I have all Test Data \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" for Compose Scenario$")
	public void i_have_all_Test_Data_for_Compose_Scenario(String userName, String password, String toAddress, String subject, String body) {
	    composeDataprovider.setAll(userName, password, toAddress, subject, body);
	}
	
	@When("^I compose an email to \"([^\"]*)\"$")
	public void i_compose_an_email_to(String arg1) {
	    composeTS.performCompose(composeDataprovider);
	}

	@Then("^I should see a successful mail sent$")
	public void i_should_see_a_successful_mail_sent() {
	    composeTS.verifySent();
	}
	
}
