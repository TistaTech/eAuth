package net.serenity.bdd.junit.cucumber.steps;

import net.serenity.bdd.junit.cucumber.model.ComposeData;
import net.serenity.bdd.junit.cucumber.pages.AccountsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ComposeTestSteps extends ScenarioSteps {
	
	AccountsPage AP;
	
	@Step
	public void performCompose(ComposeData composeDataprovider) {
		AP.performCompose(composeDataprovider);
	}
	
	@Step
	public void verifySent() {
		AP.verifySent();
		
	}
	
	

}
