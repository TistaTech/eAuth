package net.serenity.bdd.junit.cucumber.steps;

import net.serenity.bdd.junit.cucumber.model.LoginData;
import net.serenity.bdd.junit.cucumber.pages.AccountsPage;
import net.serenity.bdd.junit.cucumber.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginTestSteps extends ScenarioSteps {
	
	LoginPage LP;
	AccountsPage AP;
	
	@Step
	public void openHomePage() {
		LP.openHomePage_PO();
	}
	
	@Step
	public void performLogin(LoginData dp) throws InterruptedException {
		LP.performLogin(dp);
	}
	
	@Step
	public void isInboxPresent() {
		AP.isInboxPresent(); 
	}

}
