package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepDefinition.Hooks;

public class SelectHotel {
	
	public SelectHotel()
	{
		PageFactory.initElements(Hooks.driver, this);
		
	}

	@FindBy(id="radiobutton_0")
	private WebElement rbselecthotel;
	
	@FindBy (id="continue")
	private WebElement btnContinue;
	
	@FindBy (id="cancel")
	private WebElement btnCancel;

	public WebElement getRbselecthotel() {
		return rbselecthotel;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}
	
	
	
}
