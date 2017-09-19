package net.serenity.bdd.junit.cucumber.pages;


import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenity.bdd.junit.cucumber.model.ComposeData;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountsPage extends GenericPageObject {
	
	@FindBy(css = "button[autoid = '_fce_1']")
	private WebElementFacade composeButton;
	
	@FindBy(xpath = "(//input[@autoid = '_fp_5'])[1]")
	private WebElementFacade toField;
	
	@FindBy(css = "input[autoid = '_mcp_c']")
	private WebElementFacade subject;
	
	@FindBy(xpath = "(//div[@role = 'textbox'])[3]")
	private WebElementFacade body;
	
	@FindBy(css = "button[title = 'Send']")
	private WebElementFacade sendButton;
	
	public void isInboxPresent() {
	    Set<String> handles = getDriver().getWindowHandles();
	    
	    for (String handle : handles) {
			getDriver().switchTo().window(handle);
			if(getDriver().getTitle().equalsIgnoreCase("Mail - mmetoff@tistatech.com")) {
				break;
			}
		}
		
		waitForAnyTextToAppear("Outlook");
		
	}

	public void performCompose(ComposeData composeDataprovider) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.elementToBeClickable(composeButton));
		composeButton.click();
		toField.click();
		toField.sendKeys(composeDataprovider.getToAddress());
		subject.click();
		subject.sendKeys(composeDataprovider.getSubject());
		body.click();
		body.sendKeys(composeDataprovider.getBody());
		sendButton.click();
		
	}

	public void verifySent() {
		System.out.println("Verified");
		
	}
	
}
