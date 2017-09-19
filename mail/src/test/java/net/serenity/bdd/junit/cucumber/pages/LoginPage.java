package net.serenity.bdd.junit.cucumber.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenity.bdd.junit.cucumber.model.LoginData;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends GenericPageObject {
	
	@FindBy(id = "cred_sign_in_button")
	private WebElementFacade LoginButton;
	
	@FindBy(id = "cred_userid_inputtext")
	private WebElementFacade LoginUserField;
	
	@FindBy(id = "cred_password_inputtext")
	private WebElementFacade LoginPasswordField;
	
	@FindBy(css = "span.ms-Icon--outlook")
	private WebElementFacade MailIcon;
	
	public void openHomePage_PO() {
		open();
		getDriver().manage().window().maximize();
	}
	
	public void performLogin(LoginData dp) throws InterruptedException{
		LoginUserField.sendKeys(dp.getUserName());
		LoginPasswordField.sendKeys(dp.getPassword());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.elementToBeClickable(LoginButton));
		LoginButton.click();
		Thread.sleep(5000);
		MailIcon.click();
	}

}
