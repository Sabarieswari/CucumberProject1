package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepDefinition.Hooks;

public class BookHotel {
	
	public BookHotel()
	
	{
		PageFactory.initElements(Hooks.driver, this);
	}

	@FindBy (id="first_name")
	private WebElement txtFname;
	
	@FindBy (id="last_name")
	private WebElement txtLname; 
	
	@FindBy (id="address")
	private WebElement txtAddress; 

	@FindBy (id="cc_num")
	private WebElement txtCard; 

	@FindBy (id="cc_type")
	private WebElement ddCardtype; 
	
	@FindBy (id="cc_exp_month")
	private WebElement ddMonth;
	
	@FindBy (id="cc_exp_year")
	private WebElement ddYear;
	
	@FindBy (id="cc_cvv")
	private WebElement txtCVV;
	
	@FindBy (id="book_now")
	private WebElement btnBookNow;
	
	@FindBy (id="cancel")
	private WebElement btncancel;
	
	public WebElement getTxtFname() {
		return txtFname;
	}

	public WebElement getTxtLname() {
		return txtLname;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCard() {
		return txtCard;
	}

	public WebElement getDdCardtype() {
		return ddCardtype;
	}

	public WebElement getDdMonth() {
		return ddMonth;
	}

	public WebElement getDdYear() {
		return ddYear;
	}

	public WebElement getTxtCVV() {
		return txtCVV;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public WebElement getBtncancel() {
		return btncancel;
	}

	
	
}
