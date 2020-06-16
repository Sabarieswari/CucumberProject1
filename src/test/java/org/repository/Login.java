package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepDefinition.Hooks;

public class Login {
	
	public Login()
	{
		PageFactory.initElements(Hooks.driver, this);
	}
	
	@FindBy (id="username")
	private WebElement txtUsername;
	
	@FindBy (id="password")
	private WebElement txtPassword;
	
	@FindBy (id="login")
	private WebElement btnlogin;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	

}
